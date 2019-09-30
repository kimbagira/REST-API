package DAO;

import models.News;

import java.util.List;

public interface NewsDao {
    void add (News news);
    List<News> getAll();
    List<News> getAllNewsByUser(int UserId);
    List<News> getAllNewsByDepartment(int UserId);
    void deleteById(int id);
    void clearAll();
}
