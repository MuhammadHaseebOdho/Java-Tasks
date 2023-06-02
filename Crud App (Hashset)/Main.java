
import java.util.HashSet;
import java.util.Scanner;

public class Main {

    Scanner sc=new Scanner(System.in);
    HashSet<Student> studentsData = new HashSet<>();

    public void options(){
        int options;
        boolean chk=true;

        do{
            System.out.println("1- Add Student " +
                    "\n2- Update Student " +
                    "\n3- Get Student " +
                    "\n4- Delete Student " +
                    "\n5- Get All Students"+
                    "\n6- Exit"
            );
            System.out.print("Choice:");
            options=sc.nextInt();
            System.out.println("--------------------");
            switch (options){
                case 1:
                    addStudent();
                    break;
                case 2:
                    updateStudent();
                    break;
                case 3:
                    getStudent();
                    break;
                case 4:
                    deleteStudent();
                    break;
                case 5:
                    getAllStudents();
                    break;
                case 6:
                    System.out.println("Thank You.");
                    chk=false;
                    sc.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid Option");
            }
        }while (chk);
    }

    public void getStudent() {
        System.out.println("Enter The Id of Student you want To Get");
        int temp_get_id=sc.nextInt();
        int loopIndex=0;
        for(Student students: studentsData){
            if(temp_get_id==students.getId()){
                System.out.println("ID: "+students.getId()
                        +"\nName: "+students.getName()
                        +"\nRoll Number: "+students.getRollNumber()
                        +"\nAGE: "+students.getAge());
                break;
            } else if (temp_get_id !=students.getId() && studentsData.size()-1==loopIndex ) {
                System.out.println("Student does not exist");

            }
            loopIndex++;
        }

    }
    public void deleteStudent(){
        System.out.println("Enter The Id of Student you want To delete");
        int del_temp_id=sc.nextInt();
        int loopIndex=0;
        for(Student students: studentsData){
            if(del_temp_id==students.getId()){
                studentsData.remove(students);
                System.out.println("Student Removed Successfully");
                break;
            } else if (del_temp_id !=students.getId() && studentsData.size()-1==loopIndex ) {
                System.out.println("Student does not exist");

            }
            loopIndex++;
        }
    }


    public void getAllStudents(){
        for(Student students: studentsData){
            System.out.println("----------------------------");
            System.out.println("ID: "+students.getId()
                    +"\nName: "+students.getName()
                    +"\nRoll Number: "+students.getRollNumber()
                    +"\nAGE: "+students.getAge());
            System.out.println("----------------------------");
        }

    }

    public void addStudent(){
        Student student=new Student();
        System.out.println("Enter ID of Student:");
        student.setId(sc.nextInt());
        System.out.println("Enter Name of Student:");
        sc.nextLine();
        student.setName(sc.nextLine());
        System.out.println("Enter Roll Number of Student:");
        student.setRollNumber(sc.nextLine());
        System.out.println("Enter Age of Student");
        student.setAge(sc.nextInt());
        studentsData.add(student);

    }

    public void updateStudent(){
        System.out.println("Enter ID of Student whose data you want update");
        int temp_id= sc.nextInt();
        int loopIndex=0;
        for(Student students: studentsData){
            if(students.getId()==temp_id){
                System.out.println("Enter Name of Student:");
                sc.nextLine();
                students.setName(sc.nextLine());
                System.out.println("Enter Roll Number of Student:");
                students.setRollNumber(sc.nextLine());
                System.out.println("Enter Age of Student");
                students.setAge(sc.nextInt());
                System.out.println("Data Updated Successfully");

                break;
            }else if (students.getId() != temp_id && studentsData.size()-1==loopIndex ) {
                System.out.println("Student Does not Exist");

            }
            loopIndex++;
        }

    }
    public static void main(String[] args) {
        Main main=new Main();
        main.options();

    }
}