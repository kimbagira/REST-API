package DAO;

import models.Department;
import models.User;

import java.util.List;
public interface DepartmentDao {
    void add(Department department);
    List<Department> getAll();
    Department findById(int id);
    List<User> getAllUserByDepartment(int UserId);
    void update(int id, String description, String number_of_workers);
    void deleteById(int id);
    void clearAll();
}
