import hsa.*;
import BreezySwing.Format;

public class PopGrowth 
{
    public static void main(String[] args) 
    {
        Console c = new Console();
        
        double pop, growth, newpop = 140000;
        int year;
        
        pop = 140000;
        
        //c.println("YEAR\tPOPULATION\t\tGROWTH\t\tNEW POPULATION\n");
        
        c.print(Format.justify('c', "YEAR", 6));
        c.print(Format.justify('c', "POPULATION", 20));
        c.print(Format.justify('c', "GROWTH", 20));
        c.println(Format.justify('c', "NEW POPULATION\n", 20));
        
        for(year = 2015; year <= 2115; year += 10)
        {
            c.print(Format.justify('c', year, 6));
            c.print(Format.justify('c', pop, 20, 0));
            growth = pop * 0.03;
            newpop += growth;
            c.print(Format.justify('c', growth, 20, 0));
            c.println(Format.justify('c', newpop, 20, 0));
            pop = newpop;
        }
    }
}
