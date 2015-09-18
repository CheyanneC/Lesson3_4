import hsa.*;
import BreezySwing.Format;

public class PowerCharts 
{
    static int exp; //allow for the int to be used outside of the main method
    
    public static void main(String[] args) 
    {
        Console c = new Console();

        while(true)
        {
            c.print("Enter an exponent value between 0 and 10: "); //collect users number
            exp = c.readInt();
            
            if(exp >= 0 && exp <= 10) break; //only break the loop is the exponent is between 0 and 10
        }
        
        c.print("\n");
        c.print(Format.justify('c', "X", 5)); //print the columns first
        c.println(Format.justify('c', "2^X", 10));
        c.print(Format.justify('c', "---", 5));
        c.println(Format.justify('c', "----", 10));
        
        for(int x = 0; x <= exp; x ++) //start the loop at 0 and go until the users number
        {
            c.print(Format.justify('c', x , 5)); //the 0 to whatever number in 1st column
            c.println(Format.justify('c', raiseIntPower(x), 10)); //then print the answer
            //recieve the answer to x^exp from rasieIntPower method
        }        
    }
    
    static private int raiseIntPower (int x) //recieve number being used
    {
        int total = 0;
        
        for(int n = 0; n <= exp; n++)
        {
            total = (int) Math.pow(exp, x); //x^exp
        } 

        return total; //return the answer
    
    }
}

