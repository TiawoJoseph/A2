//********************************************************************
//  Student.java       Author: Lewis/Loftus
//
//  Represents a college student.
//********************************************************************

public class Student
{
    private String firstName, lastName;
    private String homeAddress, schoolAddress;
    private Double test1, test2, test3; // A) test scores in each object


    //-----------------------------------------------------------------
    //  Constructor: Sets up this student with the specified values.
    //-----------------------------------------------------------------
    public Student(String first, String last, String home,
                   String school,Double mark1, Double mark2, Double mark3)
    {
        firstName = first;
        lastName = last;
        homeAddress = home;
        schoolAddress = school;
        test1 = mark1;
        test2 = mark2;
        test3 = mark3;
    }
    //C) overload the method
//    public Student (String first, String last, String home, String school, Double m1, Double m2, Double m3){
//        firstName = first;
//        lastName = last;
//        homeAddress = home;
//        schoolAddress = school;
//        test1=0.0;
//        test2=0.0;
//        test3 =0.0;
//        test1 = m1;
//        test2 = m2;
//        test3 = m3;
//
//    }

    //-----------------------------------------------------------------
    //  Returns a string description of this Student object.
    //-----------------------------------------------------------------

    public String toString()
    {
        String result;

        result = firstName + " " + lastName + "\n";
        result += "Home Address:\n" + homeAddress + "\n";
        result += "School Address:\n" + schoolAddress +"\n";
        // G) modify to string to add in the test scores and avgs
        result += "Test scores [1,2, & 3]: \n" +test1 +", "+ test2 +", "+test3 +"\n";
        result+="Test Scores Average: \n"+average(test1,test2,test3);
        return result;
    }

    public void setTestScore(int TestNumber, Double score){
        if (TestNumber ==1 ){
             this.test1=score;
        }
        else if (TestNumber ==2 ){
            this.test2=score;
        }
        else{
            this.test3=score;
        }


    }

    public Double getTestScore (int Testno){


        if (Testno ==1 ){
          return test1;
        }
        else if (Testno ==2 ){
          return test2;
        }
        else{
          return test3;
        }


    }

    // f) computes and returns the avg test score
    public Double average(Double T1,Double T2,Double T3 ){
        Double avg;
        test1=T1;
        test2= T2;
        test3=T3;

        avg= ((T1+T2+T3)/3);

        return avg;
    }

}
