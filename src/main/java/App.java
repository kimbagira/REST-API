import java.util.List;
import java.util.Map;
import java.util.HashMap;

import DAO.*;

import models.Department;
import models.News;
import models.User;
import org.sql2o.Sql2o;
import spark.ModelAndView;
import spark.template.handlebars.HandlebarsTemplateEngine;
//import spark.template.handlebars.HandlebarsTemplateEngine;

import static spark.Spark.*;


public class App{
    private static Sql2o sql2o;

    public static void main(String[] args){

        sql2oDepartmentDao departmentDao = new sql2oDepartmentDao(sql2o);
        sql2oNewsDao sql2oNewsDao;
        sql2oUserDao sql2oUserDao;
        sql2oUserDao userDao=new sql2oUserDao(sql2o);
        sql2oNewsDao newsDao=new sql2oNewsDao(sql2o);
        ProcessBuilder process = new ProcessBuilder();
        Integer port;
        if (process.environment().get("PORT") != null) {
            port = Integer.parseInt(process.environment().get("PORT"));
        } else {
            port = 4567;
        }
        setPort(port);

        staticFileLocation("/public");
        String layout = "/layout.hbs";

        get("/", (request, respond) ->{
            Map<String, Object> model = new HashMap<String, Object>();
            model.put("templates", "user.hbs");
            return new ModelAndView(model, "user.hbs");
        }, new HandlebarsTemplateEngine());

        get("/details", (request, respond) ->{
            Map<String, Object> model = new HashMap<String, Object>();
            return new ModelAndView(model, "details.hbs");
        }, new HandlebarsTemplateEngine ());
        post("/details", (request, respond) ->{
            Map<String, Object> model = new HashMap<String, Object>();
            String employee_name = request.queryParams("employee_name");
            String position = request.queryParams("position");
            String role = request.queryParams("role");
            model.put("employee_name",employee_name);
            model.put("position",position);
            model.put("role",role);
            User newUser = new User(employee_name,position,role);
//            userDao.add(newUser);
            return new ModelAndView(model, "details.hbs");
        }, new  HandlebarsTemplateEngine());



        get("/department", (request, respond) ->{
            Map<String, Object> model = new HashMap<String, Object>();
//            List<Department> department= departmentDao.getAll();
            model.put("department", "department.hbs");
            return new ModelAndView(model, "department.hbs");
        }, new HandlebarsTemplateEngine ());
        get("/details1", (request, respond) ->{
            Map<String, Object> model = new HashMap<String, Object>();
            return new ModelAndView(model, "details1.hbs");
        }, new HandlebarsTemplateEngine ());
        post("/department", (request, respond) ->{
            Map<String, Object> model = new HashMap<String, Object>();
            String description = request.queryParams("description");
            int number_of_workers = Integer.parseInt(request.queryParams("number_of_workers"));
            model.put("description",description);
            model.put("number_of_workers",number_of_workers);
            return new ModelAndView(model, "details1.hbs");
        }, new  HandlebarsTemplateEngine());




        get("/news", (request, respond) ->{
            Map<String, Object> model = new HashMap<String, Object>();
            return new ModelAndView(model, "news.hbs");
        }, new HandlebarsTemplateEngine ());

        get("/details2", (request, respond) ->{
            Map<String, Object> model = new HashMap<String, Object>();
            List<News> news=newsDao.getAll();
            model.put("news", news);
            return new ModelAndView(model, "details2.hbs");
        }, new HandlebarsTemplateEngine ());

        post("/news", (request, respond) ->{
            Map<String, Object> model = new HashMap<String, Object>();
            String title = request.queryParams("title");
            String content = request.queryParams("content");
            model.put("title",title);
            model.put("content",content);
            News newNews = new News(title, content);
            return new ModelAndView(model, "details2.hbs");
        }, new  HandlebarsTemplateEngine());

    }
}
