import java.util.*;


// okay so you are nearly done! The only thing that is left to do is part b and part c, overloading the constructor
public class StudentDriver {

    public static void main(String[] args){
    Scanner scan = new Scanner(System.in);

    Student Tim = new Student("tim","rogers","121 nunya road","4700 Keele Street Toronto, ON",55.5,33.5,67.5);
    Student Deborah = new Student("Deborah","Racheed","21 toba Cres","330 General mill street", 100.00,55.67,44.55);


    //Testing out the average which works Great!
    System.out.println(Tim.average(10.00,10.00,10.00));

    //Testing out the getter Which works great!!
        System.out.println(Deborah.getTestScore(1));

     //Testing out the setter Which works Great!!
   Deborah.setTestScore(1,0.0);
   System.out.println(Deborah.getTestScore(1));

   //Testing out the toString
    System.out.println(Tim.toString());
    System.out.print(Deborah.toString());



    }
}
