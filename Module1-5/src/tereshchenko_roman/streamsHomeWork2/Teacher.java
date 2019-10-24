package tereshchenko_roman.streamsHomeWork2;

public class Teacher {

    public Teacher(String name, Subject subject) {
        this.name = name;
        this.subject = subject;
    }

    private String name;
    private Subject subject;
    private int age;

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", subject=" + subject +
                '}';
    }
}
