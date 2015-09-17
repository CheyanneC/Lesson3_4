import TurtleGraphics.*;
import hsa.*;

public class SalaryTable 
{
    public static void main(String[] args) 
    {
        Console c = new Console();
        
        double old = 0, raise = 40000, pay = 40000;
        
        c.println(old + "\t" + raise + "\t" + pay);
        
        for(int x = 0; x <= 8; x ++)
        {
            old = pay;
            raise = pay * 0.03;
            pay = pay + raise;
            
            c.print("\n");
            c.println(old + "\t" + raise + "\t" + pay);
        }
    }
}
