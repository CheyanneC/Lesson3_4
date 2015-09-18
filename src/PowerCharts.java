import hsa.*;
import BreezySwing.Format;

public class PowerCharts 
{
    static int exp;
    
    public static void main(String[] args) 
    {
        Console c = new Console();

        while(true)
        {
            c.print("Enter an exponent value between 0 and 10: ");
            exp = c.readInt();
            
            if(exp >= 0 && exp <= 10) break;
        }
        
        c.print("\n");
        c.print(Format.justify('c', "X", 5));
        c.println(Format.justify('c', "2^X", 10));
        c.print(Format.justify('c', "---", 5));
        c.println(Format.justify('c', "----", 10));
        
        
        int ans = 0;
        
        for(int x = 0; x <= exp; x ++)
        {
            c.print(Format.justify('c', x , 5));
            c.println(Format.justify('c', raiseIntPower(x), 10));
        }        
    }
    
    static private int raiseIntPower (int x)
    {
        int total = 0;
        
        for(int n = 0; n <= exp; n++)
        {
            total = (int) Math.pow(exp, x);
        } 

        return total; 
    
    }
}

