public class Student implements java.io.Serializable{
    private long id;
    private String name;

    public Student() {
        return;
    }

    public void setid(long id) {this.id = id;}

    public long getid() { return id;}

    public void setName(String name) { this.name = name;}

    public String getName() { return name; }
}