package pojo;

public class Company {

    public int id = 0;
    public String name = null;
    public int year = 0;
//    private boolean active;

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

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

//    public void setActive(boolean active) {
//        this.active = active;
//    }
//
//    public boolean isActive() {
//        return active;
//    }

    @Override
    public String toString() {
        return "Company{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", year=" + year +
                '}';
    }
}
