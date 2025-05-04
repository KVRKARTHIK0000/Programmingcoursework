/**
 * Write a description of class PartTimeStaffHire.
 * 
 * This class PartTimeStaffHire inherits the super class StaffHire
 * This class has 4 attributes as shown below.
 * WorkingHour  - a whole number
 * WagesPerHour - a double Integer
 * Shifts       - a String
 * Terminated   - a boolean true or false
 * 
 * This class will contain getter, setter and display method
 * 
 * constructor will take 11 attributes including 8 attributes of the Staff Hire
 * 
 * @author (Kavin Ravikumar)
 * @version (1.0)
 */
public class PartTimeStaffHire extends StaffHire
{
    // Defining PartTimeStaffHire Attributes
    private int     workingHour = 0;
    private double  wagesPerHour = 0.0;
    private String  shifts = null;
    private boolean terminated = false;

    // Constructor for objects of class PartTimeStaffHire 
    // Constuctor will call the Staff Hire constructor by passing the required parameters
    public PartTimeStaffHire(int    vNum, 
                    String  dType,
                    String  jType,
                    String  sName,
                    String  jDate, 
                    String  qualif,
                    String  aBy,
                    boolean jD,
                    int     wHour,
                    double  wPerHour,
                    String  sTs
                    )
    {         
              super(vNum,dType,jType,sName,jDate,qualif,aBy,jD);
              this.workingHour = wHour;
              this.wagesPerHour = wPerHour;
              this.shifts = sTs;
              this.terminated = false;
     }
    
    //PartTimeStaffHire get methods
    public int getworkingHour()
    {
        return this.workingHour;
    }
    
    public double getwagesPerHour()
    {
         return this.wagesPerHour;
    }

    public String getshifts()
    {
        return this.shifts;
    }
    
    public Boolean getterminate()
    {
        return this.terminated;
    }

    //PartTimeStaffHire set methods
    public void setworkingHour(int wH)
    {
       this.workingHour = wH;
    }
    
    public void setwagesPerHour(double wPH)
    {
       this.wagesPerHour = wPH;
    }

    public void setshifts(String sTs)
    {
        this.shifts = sTs;
    }
    
    public void setterminate(Boolean blnTerm)
    {
        this.terminated = blnTerm;
    }
    
    //display method to output the Part time Staff Hire Details
    public void displayPartTimeStaffHireDetails()
    {
        System.out.println(" *************************************************************");
        System.out.println(" Part Time Staff Details                                      "); 
        System.out.println(" *************************************************************"); 
        super.displayStaffDetails();
        //if the working hours is set
        if (this.workingHour > 0) {
            System.out.println(" Wages Per Hour          : " + Double.toString(this.wagesPerHour));                     
            System.out.println(" Working Hours           : " + Integer.toString(this.workingHour) );  
            System.out.println(" Income Per Day          : " + Double.toString((this.workingHour * this.wagesPerHour)));
        }
        System.out.println(" Shifts                  : " + this.shifts);  
        System.out.println(" Terminated              : " + Boolean.toString(this.terminated)); 
        System.out.println(" *************************************************************");
    }
}