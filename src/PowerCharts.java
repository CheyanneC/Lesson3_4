import hsa.*;
import BreezySwing.Format;

public class PowerCharts 
{
    public static void main(String[] args) 
    {
        Console c = new Console();
        
        int exp;
        
        while(true)
        {
            c.print("Enter an exponent value between 0 and 10: ");
            exp = c.readInt();
            
            if(exp >= 0 && exp <= 10) break;
        }
        
        c.print(Format.justify('c', "X", 5));
        c.print(Format.justify('c', "2^X", 10));
        
        for(int x = 0; x <= exp; x ++)
        {
            
        }
    }
}
