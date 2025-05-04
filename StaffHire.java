/**
 * Write a description of class StaffHire.
 * 
 * This class has 8 attributes as shown below.
 * Vacancy Number - a whole number
 * Designation Type -a string
 * Job Type    - a string
 * StaffName    - a string
 * JoiningDate    - a string
 * Qualification - a string
 * AppointedBy    - a string
 * Joined    - a boolean (true or false)
 * 
 * This class will contain getter, setter and display method
 * This has a subclass known as FullTimeStaffHire which has 2 attributes
 * This has another subclass known as PartTimeStaffHire which has 4 attributes
 * 
 * @author (Kavin Ravikumar)
 * @version (1.0)
 */
public class StaffHire
{
    // instance variables
    private int vacancyNumber = 0;
    private String designationType = null;
    private String jobType = null;
    private String staffName = null;
    private String joiningDate = null;
    private String qualification = null;
    private String appointedBy = null;
    private boolean joined = true;

    /**
     * Constructor for objects of class StaffHire
     */
    public StaffHire(int vNum, 
                     String dType, 
                     String jType, 
                     String sName, 
                     String jDate,
                     String Qualif,
                     String aBy,
                     boolean jD
                )
    {
        // initialise instance variables
        this.vacancyNumber = vNum;
        this.designationType = dType;
        this.jobType = jType;
        this.staffName = sName;
        this.joiningDate = jDate;
        this.qualification = Qualif;
        this.appointedBy = aBy;
        this.joined = jD;
    }

    // StaffHire Get Methods
    public int getvacancyNumber()
    {
        return this.vacancyNumber; 
    }
    
    public void setvacancyNumber(int vNum)
    {
        this.vacancyNumber = vNum; 
    }
    
    public String getdesignationType()
    {
        return this.designationType; 
    }
    
    public void setdesignationType(String dType)
    {
        this.designationType = dType; 
    }
    
    public String getjobType()
    {
        return this.jobType; 
    }
    
    public void setjobType(String jType)
    {
        this.jobType = jType; 
    }
    
    public String getstaffName()
    {
        return this.staffName; 
    }
    
    public void setstaffName(String sName)
    {
        this.staffName = sName; 
    }
    
    public String getjoiningDate()
    {
        return this.joiningDate; 
    }
    
    public void setjoiningDate(String jDate)
    {
        this.joiningDate = jDate; 
    }
    
    public String getqualification()
    {
        return this.qualification; 
    }
    
    public void setqualification(String Qualif)
    {
        this.qualification = Qualif; 
    }
    
    public String getappointedBy()
    {
        return this.appointedBy; 
    }
    
    public void setappointedBy(String aBy)
    {
        this.appointedBy = aBy; 
    }
    
    public boolean getjoined()
    {
        return this.joined; 
    }
    
    public void setjoined(boolean jD)
    {
        this.joined = jD; 
    }
    
    public void displayStaffDetails()
    {
        System.out.println(" Vacancy Number          : " + Integer.toString(this.vacancyNumber));
        System.out.println(" Designation Type        : " + this.designationType );
        System.out.println(" Job Type                : " + this.jobType );
        System.out.println(" Staff Name              : " + this.staffName );
        System.out.println(" Joining Date            : " + this.joiningDate );
        System.out.println(" Qualification           : " + this.qualification);
        System.out.println(" Appointed By            : " + this.appointedBy );
        System.out.println(" Joined                  : " + Boolean.toString(this.joined));
     }
}
