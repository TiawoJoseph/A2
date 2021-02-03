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

    public Double average (){
       Double total=156.8;

       //FOR EACH STUDENT OBJECT GET THE Score FOR EACH TEST AND ADD IT TO THE TOTAL. THEN DIVIDE THE TOTAL BY THE TOTAL #
        //OF STUDENT OBJECTS IN THE ARRAY LIST

        for(int i=0; i<StuEnrolled.size();i++){
          System.out.println(StuEnrolled.get(i));

        }

        Double average = total/StuEnrolled.size();
        return average;

    }

    //E) prints all the students
    public  Object roll (){
        for (Object array : StuEnrolled){

            System.out.print(array);
        }

            return (StuEnrolled);
    }

}
