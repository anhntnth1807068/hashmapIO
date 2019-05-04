package entity;

public class ThongTinBang {
    private String day;
    private String id;
    private String title;
    private int viewcount;

    public ThongTinBang() {
    }

    public ThongTinBang(String day, String id, String title, int viewcount) {
        this.day = day;
        this.id = id;
        this.title = title;
        this.viewcount = viewcount;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getViewcount() {
        return viewcount;
    }

    public void setViewcount(int viewcount) {
        this.viewcount = viewcount;
    }
}