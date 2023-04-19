package Problema_2;

public class Local implements Serializable {
    private int id;
    private String name;
    private String category;
    private String schedule;

    public Local(int id, String name, String category, String schedule) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.schedule = schedule;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getSchedule() {
        return schedule;
    }

    public void setSchedule(String schedule) {
        this.schedule = schedule;
    }
}