public class Student{
    private String name;
    private int id;
    private String rollNumber;
    private String email;
    private int age;




   // Student obj=new Student();

    public Student(int id, String name, String rollnum, int age) {
        this.id=id;
        this.name=name;
        this.rollNumber =rollnum;
        this.age=age;

    }

    Student(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int  getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(String rollNumber) {
        this.rollNumber = rollNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

