import BreezySwing.Format;
import hsa.*;

public class SalaryTable 
{
    public static void main(String[] args) 
    {
        Console c = new Console();
        
        double old = 0, raise = 40000, pay = 40000; //start the numbers its amount
        
        c.print(Format.justify('c', "YEAR", 6)); //declare the columns
        c.print(Format.justify('r', "OLD SALARY", 20));
        c.print(Format.justify('r', "RAISE", 20));
        c.println(Format.justify('r', "NEW SALARY\n", 20));
        
        for(int year = 0; year <= 9; year ++)
        {
            c.print(Format.justify('c', (year + 1), 6)); //print the year
            
            old = pay; //collect the old salary
            
            c.print(Format.justify('r', old, 20, 2)); //print old salary
            
            raise = pay * 0.03; //find out the raise
            
            c.print(Format.justify('r', raise, 20, 2)); //print raise
            
            pay += raise; //find out new salary
            
            c.println(Format.justify('r', pay, 20, 2)); //print salary
            //repeat until all 10 years are done
        }
    }
}
