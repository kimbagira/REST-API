package DAO;
import models.User;
import java.util.List;

public interface UserDao {
    //create
    void add(User user);
    //void addUserToDepartment(User User, Department department);

    //read
    List<User> getAll();
    // List<Department> getAllDepartmentForAUser(int id);

    //update
    //omit for now

    //delete
    void deleteById(int id);
    void clearAll();
}
