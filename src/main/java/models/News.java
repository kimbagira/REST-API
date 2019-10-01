package models;

public class News {
    private String title;
    private String content;
    private int id;
    private int userId;

    public News(String title, String content) {
        this.title = title;
        this.content = content;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public int getId() {
        return id;
    }
    public int getUserId() {
        return userId;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setId(int id) {
        this.id = id;
    }
    public void setUserId(int userId) {
        this.userId = userId;
    }
    public News(String title, String content, int id) {
        this.title = title;
        this.content = content;
        this.id = id;
    }

}
