//FullTimeStaffHire
/**
 * Write a description of class FullTimeStaffHire here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class FullTimeStaffHire extends StaffHire
{
    // Defining FulltimeStaffHire Attributes
    private double  salary = 0.0;
    private int     weeklyFractionalHours = 0;
    private boolean staffJoined=false;

    //Constructor for objects of class FullTimeStaffHire
    public FullTimeStaffHire(int    vNum, 
                    String  dType,
                    String  jType,
                    String  sName,
                    String  jDate, 
                    String  Qualif,
                    String  aBy,
                    boolean jD,
                    double slry,
                    int    wFHrs
                    )
    {
          super(vNum,dType,jType,sName,jDate,Qualif,aBy,jD);
          this.staffJoined = jD;
          this.salary=slry;
          this.weeklyFractionalHours = wFHrs;
     }
    
    //FullTimeStaffHire get methods
    public double getsalary()
    {
        return this.salary;
    }
    
     public int getweeklyFractionalHours()
    {
         return this.weeklyFractionalHours;
    }

    //FullTimeStaffHire set methods
    public void setsalary(double salry)
    {
        if (this.staffJoined == true) {
            this.salary = salry;
        }
        else 
        {
            System.out.println ("The salary cannot be set, since staff hasn't joined yet");
        }
    }
    
     public void setweeklyFractionalHours(int wFH)
    {
        this.weeklyFractionalHours = wFH;
    }
    
    public void displayFullStaffHireDetails()
    {
            System.out.println(" *************************************************************");
            System.out.println(" Full Time Staff Details                                      "); 
            System.out.println(" *************************************************************"); 
            super.displayStaffDetails();
            if (this.salary > 0) {
                System.out.println(" Salary                  : " + Double.toString(this.salary));   
                System.out.println(" Weekly Fractional Hours : " + Integer.toString(this.weeklyFractionalHours));      
            }
            System.out.println(" *************************************************************");
    }
    
 }