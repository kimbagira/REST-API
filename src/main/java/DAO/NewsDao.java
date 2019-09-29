package DAO;

public interface NewsDao {
    //create
    void add (News news);
    // void addNewsToDepartment(News news, Department department)

    //read
    List<News> getAll();
    News findById(int id);
    // List<Department> getAllDepartmentForANews(int newsId);

    //update
    void update(int id, String title, String content);

    //delete
    void deleteById(int id);
    void clearAll();
}
