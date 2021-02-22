import java.util.*;

public class Course {

    // A) stores students taking the course
    ArrayList<Object> StuEnrolled = new ArrayList<Object>();

    private String Course_name;

    // B) only accepts the course name.
    public Course(String Cn){
        this.Course_name=Cn;

    }
    //C) accepts student param
    public void addStudent(Student student){

       StuEnrolled.add(student);

    }

    //average the test scores
    // divide the sum of all the test scores/StuEnrolled.size()

    //D) average
    public Double average (){

        Double average;
        Student.average();
        return Student.average();

    }

    //E) prints all the students
    public  Object roll (){
        for (Object array : StuEnrolled){

            System.out.println(array);
        }

            return (StuEnrolled);
    }

}
