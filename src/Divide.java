import hsa.*;

public class Divide 
{
    public static void main(String[] args) 
    {
        Console c = new Console();
        
        int num1, num2;
        
        c.print("Enter number 1: "); //ask for user's numbers
        num1 = c.readInt();
        c.print("Enter number 2: ");
        num2 = c.readInt();
        
        int div, rem; //division and remainder
        
        if(num1 > num2) //if num1 is bigger withdraw num2 from it
        {
            div = num1/num2;
            rem = num1 % num2;
        }
        else //else (num2 bigger) withdraw num1 from num2
        {
            div = num2/ num1;
            rem = num2%num1;
        }
        
        c.print("\nThe quotient is " + div); //print the answers
        c.print("\nThe remainder is " + rem);
    }
    
}
