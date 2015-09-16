import hsa.*;

public class EmployeePay 
{
    public static void main(String[] args) 
    {
        Console c = new Console();
        
        int eh[] = new int[5]; //employee's hours
        
        for(int x = 0; x <= 4; x ++)
        {
            while(true)
            {
                c.print("Enter Employee Number " + (x+1) + " hours: ");
                eh[x] = c.readInt(); //read in the hours
                
                if(eh[x] >= 1 && eh[x] <= 70) break; //if between 1 and 70 go on to next employee
            }
        }
        
        c.print("\n");
        
        double reg, over, total;
        
        for(int x = 0; x <= 4; x ++)
        {
            if(eh[x] >= 44) //if they have worked enough to recieve over time (44 hours)
            {
                reg = 43 * 15; //they automatically get their regular pay to be 43 hours by $15
                over = (eh[x] - 43) * 22.5; //calculate how much of their time is considered overtime
                //then multiply by 22.5 (time and a half)
                total = reg + over; //total pay is regular and overtime
                
                c.println("Regular pay of Employee " + (x + 1) + ": $" + reg + "0"); //output pays
                c.println("Over time pay of Employee " + (x + 1) + ": $" + over + "0");
                c.println("Total pay of Employee " + (x + 1) + ": $" + total + "0");
                c.print("\n");
            }
            
            else //if they don't recieve overtime
            {
                reg = eh[x] * 15; //calculate their actual pay
                over = 0; //they don't receive any overtime
                total = reg + over;
                
                c.println("Regular pay of Employee " + (x + 1) + ": $" + reg + "0"); //and output the pay
                c.println("Over time pay of Employee " + (x + 1) + ": $" + over + "0");
                c.println("Total pay of Employee " + (x + 1) + ": $" + total + "0");
                c.print("\n");
            }
        }
    }
    
}
