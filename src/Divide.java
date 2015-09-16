import hsa.*;

public class Divide 
{
    public static void main(String[] args) 
    {
        Console c = new Console();
        
        int num1, num2;
        
        c.print("Enter number 1: ");
        num1 = c.readInt();
        c.print("Enter number 2: ");
        num2 = c.readInt();
        
        int div, rem;
        
        if(num1 > num2)
        {
            div = num1/num2;
            rem = num1 % num2;
        }
        else
        {
            div = num2/ num1;
            rem = num2%num1;
        }
        
        c.print("\nThe quotient is " + div);
        c.print("\nThe remainder is " + rem);
    }
    
}
