import java.util.*;
// this is complete the only thing that you need to do is print out the average for the course
public class CourseDriver {

public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        //Course constructor works!
        Course ITEC_2610 = new Course("ITEC 2610");

        Student Tim = new Student("tim","rogers","121 nunya road","4700 Keele Street Toronto, ON",55.5,33.5,67.5);
        Student Georgia= new Student("Georgia","Rangler","121 upurass road","4700 Kean Street Toronto, ON",65.7,73.5,97.5);

        //testing out the add
        ITEC_2610.addStudent(Tim);
        ITEC_2610.addStudent(Georgia);

        //testing out the rill
    System.out.println("THESE ARE ALL THE STUDENTS IN THIS COURSE:");
        ITEC_2610.roll();
    System.out.println("THIS IS THE OVERALL COURSE AVERAGE");
        ITEC_2610.average();

}
}

