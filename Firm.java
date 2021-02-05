//  Firm.java       Author: Lewis/Loftus
//
//  Demonstrates polymorphism via inheritance.
//********************************************************************

public class Firm
{

    //This is pretty much done you just have to modify the driver class to get out all the functionality implemented.
    //-----------------------------------------------------------------
    //  Creates a staff of employees for a firm and pays them.
    //-----------------------------------------------------------------
    public static void main(String[] args)
    {
        Staff personnel = new Staff();

        Employee jannet = new Employee("name","addr","phone","12",98.00);

        Hourly bob = new Hourly("Bob","regina","222","111111111",14.85);

        Executive Jospeh = new Executive("Joseph Ogunnupe","150 sandalwood","232","222222222",109.78);

        System.out.println(Jospeh.vacationDays());
        System.out.println(bob.vacationDays());
        System.out.println(jannet.vacationDays());
        personnel.payday();

    }
}


