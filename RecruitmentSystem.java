/**
 * Write a description of class RecruitmentSystem here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusListener;
import java.awt.event.FocusEvent;
import java.util.ArrayList; 
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.Date;
import java.text.DateFormat;
import java.awt.*;

public class RecruitmentSystem
{
    // JFrame controls
    private JFrame jfrmRecSys;
    private JPanel jplStaffHire;
    private JPanel jplFPStaffHire;
    private JPanel jplbtnStaffHire;
    
   // JLabel controls
    private JLabel jlblVacancyNumber;
    private JLabel jlblDesignation;
    private JLabel jlblJobType;
    private JLabel jlblJoiningDate;
    private JLabel jlblStaffName;
    private JLabel jlblAppointedBy;
    private JLabel jlblQualification;
    private JLabel jlblSalary;
    private JLabel jlblWeeklyFractionalHours;
    private JLabel jlblJoined;
    private JLabel jlblWorkingHours;
    private JLabel jlblWagesPerHour;
    private JLabel jlblShifts;   
    private JLabel jlblIncomePerDay;
    private JLabel jlblDisplayNumber;
    private JLabel jlblTerimnate;
 
    // JTextField controls
    private JTextField jtxtVacancyNumber;
    private JTextField jtxtDesignation;
    private JTextField jtxtJobType;
    private JTextField jtxtJoiningDate;
    private JTextField jtxtStaffName;
    private JTextField jtxtAppointedBy;
    private JTextField jtxtQualification;
    private JTextField jtxtSalary;
    private JTextField jtxtWeeklyFractionalHours;
    private JTextField jtxtWorkingHours;
    private JTextField jtxtWagesPerHour;
    private JTextField jtxtIncomePerDay;
    private JTextField jtxtShifts;
    private JTextField jtxtDisplayNumber;

    // JCheckBox contrls
    private JCheckBox  jchkJoined;
    private JCheckBox  jchkTerminate;
    
    // JButton controls
    private JButton    jbtnAddFullTimeStaff;
    private JButton    jbtnAddPartTimeStaff;
    private JButton    jbtnAddSalary;
    private JButton    jbtnAddWorkingShifts;
    private JButton    jbtnTerminate;
    private JButton    jbtnDisplayNumber;
    private JButton    jbtnClear;
    private JButton    jbtnDisplayAll;
    
    // JLabel ArrayList & Full/Part Time Staff Hire variables
    private ArrayList<Object> StaffHireDetails;
    private FullTimeStaffHire FTStaffHire;
    private PartTimeStaffHire PTStaffHire;
       
    
    public static void main (String[] param)
    {
        RecruitmentSystem rSystem = new RecruitmentSystem();
        rSystem.drawRecSysGUI();
        rSystem.StaffHireDetails = new ArrayList<Object>();
    }
    //Constructor for objects of class RecruitmentSystem
    public RecruitmentSystem()
    {
    }
    
    public void drawRecSysGUI()
    {
        //Define the RecruitmentSystem Frame/Window
        jfrmRecSys = new JFrame();
        jfrmRecSys.setTitle("RecruitmentSystem");
        jfrmRecSys.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        jfrmRecSys.setSize(2500,3000);
        jfrmRecSys.setLocationRelativeTo(null);
        jfrmRecSys.setLayout(new BorderLayout(10,10));
        jfrmRecSys.setResizable(false);
        
        //Define the RecruitmentSystem Panels - North
        JPanel jplStaffHire = new JPanel();
        jplStaffHire.setLayout(new GridLayout(10,4,20,10));
        
         //Define the RecruitmentSystem Panels - Center
        JPanel jplFPStaffHire = new JPanel();
        jplFPStaffHire.setLayout(new GridLayout(5,4,20,10));
        
         //Define the RecruitmentSystem Panels - South
        JPanel jplbtnStaffHire = new JPanel();
        jplbtnStaffHire.setLayout(new GridLayout(2,4,20,10));
        
        // Create the individual input GUI Components
        // Vacancy Number - Label & TextField with FocusListener
        jlblVacancyNumber = new JLabel("Vacancy Number :");
        jlblVacancyNumber.setFont(new Font("Calibri", Font.BOLD, 20));
        jtxtVacancyNumber = new JTextField();
        jtxtVacancyNumber.setFont(new Font("Calibri", Font.BOLD, 20));
        jtxtVacancyNumber.setText("0");
         
        jlblDesignation = new JLabel("Designation :");
        jlblDesignation.setFont(new Font("Calibri", Font.BOLD, 20));
        jtxtDesignation = new JTextField();
        jtxtDesignation.setFont(new Font("Calibri", Font.BOLD, 20));

        jlblJobType = new JLabel("Job Type :");
        jlblJobType.setFont(new Font("Calibri", Font.BOLD, 20));
        jtxtJobType = new JTextField();
        jtxtJobType.setFont(new Font("Calibri", Font.BOLD, 20));

        jlblStaffName = new JLabel("Staff Name : ");
        jlblStaffName.setFont(new Font("Calibri", Font.BOLD, 20));
        jtxtStaffName = new JTextField();
        jtxtStaffName.setFont(new Font("Calibri", Font.BOLD, 20));
                
        jlblAppointedBy = new JLabel("Appointed By : ");
        jlblAppointedBy.setFont(new Font("Calibri", Font.BOLD, 20));
        jtxtAppointedBy = new JTextField();
        jtxtAppointedBy.setFont(new Font("Calibri", Font.BOLD, 20));
        
        jlblJoiningDate = new JLabel("Joining Date (dd/mm/yyyy) :");
        jlblJoiningDate.setFont(new Font("Calibri", Font.BOLD, 20));
        jtxtJoiningDate = new JTextField();
        jtxtJoiningDate.setFont(new Font("Calibri", Font.BOLD, 20));
        
        jlblQualification = new JLabel("Qualification : ");
        jlblQualification.setFont(new Font("Calibri", Font.BOLD, 20));
        jtxtQualification = new JTextField();
        jtxtQualification.setFont(new Font("Calibri", Font.BOLD, 20));
        
        jlblSalary = new JLabel("Salary :");
        jlblSalary.setFont(new Font("Calibri", Font.BOLD, 20));
        jtxtSalary = new JTextField();
        jtxtSalary.setFont(new Font("Calibri", Font.BOLD, 20));
        jtxtSalary.setText("0.0");

        jlblWeeklyFractionalHours = new JLabel("Weekly Fractional Hours (>= 36 or <= 40) : ");
        jlblWeeklyFractionalHours.setFont(new Font("Calibri", Font.BOLD, 20));
        jtxtWeeklyFractionalHours = new JTextField();
        jtxtWeeklyFractionalHours.setFont(new Font("Calibri", Font.BOLD, 20));
        jtxtWeeklyFractionalHours.setText("0");
        
        jlblJoined = new JLabel("Joined : ");
        jlblJoined.setFont(new Font("Calibri", Font.BOLD, 20));
        
        jlblWorkingHours = new JLabel("Working Hours ( >= 1 or <= 14 ) :");
        jlblWorkingHours.setFont(new Font("Calibri", Font.BOLD, 20));
        jtxtWorkingHours = new JTextField();
        jtxtWorkingHours.setFont(new Font("Calibri", Font.BOLD, 20));
        jtxtWorkingHours.setText("0");
        
        jlblWagesPerHour = new JLabel("Wages Per Hour :");
        jlblWagesPerHour.setFont(new Font("Calibri", Font.BOLD, 20));
        jtxtWagesPerHour = new JTextField();
        jtxtWagesPerHour.setFont(new Font("Calibri", Font.BOLD, 20));
        jtxtWagesPerHour.setText("0.0");
        
        jlblIncomePerDay = new JLabel("Income Per Day  :");
        jlblIncomePerDay.setFont(new Font("Calibri", Font.BOLD, 20));
        jtxtIncomePerDay = new JTextField();
        jtxtIncomePerDay.setFont(new Font("Calibri", Font.BOLD, 20));
        jtxtIncomePerDay.setText("0.0");
        jtxtIncomePerDay.setEnabled(false);
        
        jlblShifts = new JLabel("Shifts (Morning / Day / Evening) :");
        jlblShifts.setFont(new Font("Calibri", Font.BOLD, 20));
        jtxtShifts = new JTextField();
        jtxtShifts.setFont(new Font("Calibri", Font.BOLD, 20));
 
        jlblDisplayNumber = new JLabel("Display Number :");
        jlblDisplayNumber.setFont(new Font("Calibri", Font.BOLD, 20));
        jtxtDisplayNumber = new JTextField();
        jtxtDisplayNumber.setFont(new Font("Calibri", Font.BOLD, 20));
        jtxtDisplayNumber.setText("-1");
        
        jlblTerimnate = new JLabel("Terminate :");
        jlblTerimnate.setFont(new Font("Calibri", Font.BOLD, 20));
        
        jchkJoined = new JCheckBox();
        jchkTerminate = new JCheckBox();
        
        // Buttons & ActionListeners
        jbtnAddFullTimeStaff = new JButton("Add FullTime Staff");
        jbtnAddFullTimeStaff.setFont(new Font("Calibri", Font.BOLD, 20));
        jbtnAddFullTimeStaff.addActionListener(new ActionListener() {
            @Override public void actionPerformed(ActionEvent evt) { AddFullTimeStaff(); } });

        jbtnAddPartTimeStaff = new JButton("Add PartTime Staff");
        jbtnAddPartTimeStaff.setFont(new Font("Calibri", Font.BOLD, 20));
        jbtnAddPartTimeStaff.addActionListener(new ActionListener() {
            @Override public void actionPerformed(ActionEvent evt) { AddPartTimeStaff(); } });

        jbtnAddSalary = new JButton("Add Salary");
        jbtnAddSalary.setFont(new Font("Calibri", Font.BOLD, 20));
        jbtnAddSalary.addActionListener(new ActionListener() {
            @Override public void actionPerformed(ActionEvent evt) { SetSalaryFullTimeStaff(); } });

        jbtnAddWorkingShifts = new JButton("Add Working Shifts");
        jbtnAddWorkingShifts.setFont(new Font("Calibri", Font.BOLD, 20));
        jbtnAddWorkingShifts.addActionListener(new ActionListener() {
            @Override public void actionPerformed(ActionEvent evt) { SetWorkingShiftsPartTimeStaff(); } });
        
        jbtnTerminate = new JButton("Terminate");
        jbtnTerminate.setFont(new Font("Calibri", Font.BOLD, 20));
        jbtnTerminate.addActionListener(new ActionListener() {
            @Override public void actionPerformed(ActionEvent evt) { TerminatePartTimeStaff(); } });
        
        jbtnDisplayNumber = new JButton("Display Number");
        jbtnDisplayNumber.setFont(new Font("Calibri", Font.BOLD, 20));
        jbtnDisplayNumber.addActionListener(new ActionListener() {
            @Override public void actionPerformed(ActionEvent evt) { DisplayNumber(); } });
            
        jbtnClear = new JButton("Clear");
        jbtnClear.setFont(new Font("Calibri", Font.BOLD, 20));
        jbtnClear.addActionListener(new ActionListener() {
            @Override public void actionPerformed(ActionEvent evt) { ClearFields();}});

        jbtnDisplayAll = new JButton("Display All");
        jbtnDisplayAll.setFont(new Font("Calibri", Font.BOLD, 20));
        jbtnDisplayAll.addActionListener(new ActionListener() {
            @Override public void actionPerformed(ActionEvent evt) { DisplayAll();}});

            
        // Add the GUI Components to the respective Panels - StaffHire
        jplStaffHire.add(jlblVacancyNumber);
        jplStaffHire.add(jtxtVacancyNumber);
        jplStaffHire.add(jlblDesignation);
        jplStaffHire.add(jtxtDesignation);
        jplStaffHire.add(jlblJobType);
        jplStaffHire.add(jtxtJobType);
        jplStaffHire.add(jlblJoiningDate);
        jplStaffHire.add(jtxtJoiningDate);
        jplStaffHire.add(jlblStaffName);
        jplStaffHire.add(jtxtStaffName);
        jplStaffHire.add(jlblAppointedBy);
        jplStaffHire.add(jtxtAppointedBy);
        jplStaffHire.add(jlblQualification);
        jplStaffHire.add(jtxtQualification);
        jplStaffHire.add(jlblSalary);
        jplStaffHire.add(jtxtSalary);
        jplStaffHire.add(jlblWeeklyFractionalHours);
        jplStaffHire.add(jtxtWeeklyFractionalHours);
        jplStaffHire.add(jlblJoined);
        jplStaffHire.add(jchkJoined);
        
         // Add the GUI Components to the respective Panels - FPStaffHire
        jplFPStaffHire.add(jlblWorkingHours);
        jplFPStaffHire.add(jtxtWorkingHours);
        jplFPStaffHire.add(jlblWagesPerHour);
        jplFPStaffHire.add(jtxtWagesPerHour);
        jplFPStaffHire.add(jlblIncomePerDay);
        jplFPStaffHire.add(jtxtIncomePerDay);
        jplFPStaffHire.add(jlblShifts);
        jplFPStaffHire.add(jtxtShifts);
        jplFPStaffHire.add(jlblTerimnate);
        jplFPStaffHire.add(jchkTerminate);
        
         // Add the GUI Components to the respective Panels - Buttons
        jplbtnStaffHire.add(jbtnAddFullTimeStaff);
        jplbtnStaffHire.add(jbtnAddPartTimeStaff);
        jplbtnStaffHire.add(jbtnAddSalary);
        jplbtnStaffHire.add(jbtnAddWorkingShifts);
        jplbtnStaffHire.add(jbtnTerminate);
        jplbtnStaffHire.add(jbtnClear);
        jplbtnStaffHire.add(jlblDisplayNumber);
        jplbtnStaffHire.add(jtxtDisplayNumber);
        jplbtnStaffHire.add(jbtnDisplayNumber);
        jplbtnStaffHire.add(jbtnDisplayAll);
        
         // Add Panels to the Frame
        jfrmRecSys.add(jplStaffHire,BorderLayout.NORTH);
        jfrmRecSys.add(jplFPStaffHire, BorderLayout.CENTER);
        jfrmRecSys.add(jplbtnStaffHire,BorderLayout.SOUTH);
        
        //Frame Pack and Visible
        jfrmRecSys.pack();
        jfrmRecSys.setVisible(true);
        
    }
    
    public void AddFullTimeStaff()
    {
        //Validate the inputs
        Boolean blnJoined;
        if (ValidVNumber() && ValidDesign() && ValidJobType() && ValidJDate() && ValidStaffName() &&  ValidAppBy() && ValidQuali() &&  ValidSalary() && ValidWFHours() ) 
        {       
            if (jchkJoined.isSelected() == true)
            {
                blnJoined = true;
            }
            else 
            {
                blnJoined = false;
            }
            try
            {
                this.FTStaffHire = new FullTimeStaffHire(
                    Integer.parseInt(jtxtVacancyNumber.getText()),
                    jtxtDesignation.getText(),
                    jtxtJobType.getText(),
                    jtxtStaffName.getText(),
                    jtxtJoiningDate.getText(),
                    jtxtQualification.getText(),
                    jtxtAppointedBy.getText(),
                    blnJoined,
                    Double.parseDouble(jtxtSalary.getText()),
                    Integer.parseInt(this.jtxtWeeklyFractionalHours.getText())
                    );
                StaffHireDetails.add(this.FTStaffHire);
                JOptionPane.showMessageDialog(this.jfrmRecSys, "Full Time Staff Hire Details Successfully Added.", "Full Time Staff Hire", JOptionPane.INFORMATION_MESSAGE);     
                jtxtDisplayNumber.setText(jtxtVacancyNumber.getText());
                ClearFields();
            }
            catch(Exception e) 
            {
                JOptionPane.showMessageDialog(this.jfrmRecSys, e.getMessage(), "Application Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
    
    public void AddPartTimeStaff()
    {
        Boolean blnJoined;
        //Validate the inputs
        if (ValidVNumber() && ValidDesign() && ValidJobType() && ValidJDate() && ValidStaffName()  &&  ValidAppBy() && ValidQuali() && ValidWHours() && ValidWPHour() && ValidShifts()) 
        {     
            if (jchkJoined.isSelected() == true)
            {
                blnJoined = true;
            }
            else 
            {
                blnJoined = false;
            }
            try
            {
                this.PTStaffHire = new PartTimeStaffHire(
                    Integer.parseInt(jtxtVacancyNumber.getText()),
                    jtxtDesignation.getText(),
                    jtxtJobType.getText(),
                    jtxtStaffName.getText(),
                    jtxtJoiningDate.getText(),
                    jtxtQualification.getText(),
                    jtxtAppointedBy.getText(),
                    blnJoined,
                    Integer.parseInt(jtxtWorkingHours.getText()),
                    Double.parseDouble(jtxtWagesPerHour.getText()),
                    jtxtShifts.getText()
                );
                StaffHireDetails.add(this.PTStaffHire);      
                jtxtIncomePerDay.setText(Double.toString(Integer.parseInt(jtxtWorkingHours.getText()) * Double.parseDouble(jtxtWagesPerHour.getText())));
                JOptionPane.showMessageDialog(this.jfrmRecSys, "Part Time Staff Hire Details Successfully Added.", "Part Time Staff Hire", JOptionPane.INFORMATION_MESSAGE);    
                jtxtDisplayNumber.setText(jtxtVacancyNumber.getText());
                ClearFields();
            }
            catch(Exception e) 
            {
                JOptionPane.showMessageDialog(this.jfrmRecSys, e.getMessage(), "Application Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
    

     public void SetSalaryFullTimeStaff()
     {
      Boolean blnSuccess   = false;
        try 
        {
            int     intVNum     = Integer.parseInt(this.jtxtVacancyNumber.getText());
            String  strStaffName = this.jtxtStaffName.getText();   
            if (intVNum > 0 && ValidStaffName())
            {
                for (int ctr = 0; ctr < StaffHireDetails.size(); ctr++) 
                {
                    if ( StaffHireDetails.get(ctr) instanceof FullTimeStaffHire)
                    {   
                        try
                        {    
                            FullTimeStaffHire FTHire = (FullTimeStaffHire)StaffHireDetails.get(ctr);
                            int     intFVNum   = FTHire.getvacancyNumber();
                            String  strFSN     = FTHire.getstaffName();
                            String  strJobType = FTHire.getjobType();
                            if (intVNum == intFVNum)
                            {
                                strJobType  = strJobType.toUpperCase();
                                System.out.println("strJobType.toUpperCase() : " + strJobType);
                                if (strJobType  ==  "PERMANENT")
                                {   
                                    JOptionPane.showMessageDialog(this.jfrmRecSys, "Salary can be only to a Permanent staff", "Invalid Staff Job Type", JOptionPane.ERROR_MESSAGE);
                                    blnSuccess = false;
                                    break;
                                }
                                else
                                {   Boolean blnJoined = FTHire.getjoined();
                                    if (blnJoined)
                                    {
                                        Double Salary = Double.parseDouble(this.jtxtSalary.getText());
                                        FTHire.setsalary(Salary);
                                        blnSuccess = true;
                                        break;
                                    }
                                    else 
                                    {
                                        JOptionPane.showMessageDialog(this.jfrmRecSys, "Unable to set the Salary as the Staff is yet to join", "Error", JOptionPane.ERROR_MESSAGE);
                                        blnSuccess = false;
                                        break;
                                    }
                                }
                            }
                            else
                            {
                                blnSuccess = false;
                            }
                        }
                    catch (ClassCastException e)
                        {
                            JOptionPane.showMessageDialog(this.jfrmRecSys, e.getMessage(), "Application Error", JOptionPane.ERROR_MESSAGE);
                            blnSuccess = false;
                            break;
                        }
                    }
                    else 
                    {
                            blnSuccess   = false;
                    }
                }
            }
            if (blnSuccess) 
            {       
                JOptionPane.showMessageDialog(this.jfrmRecSys, "The Salary is set successfully", "Success", JOptionPane.INFORMATION_MESSAGE);
            }
            else
            {
                JOptionPane.showMessageDialog(this.jfrmRecSys, "Error in Adding/Modifing the salary. Check the required information is present", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } 
        catch(NumberFormatException e) 
        {
                JOptionPane.showMessageDialog(this.jfrmRecSys, "Enter a Valid Integer number", "Invalid Vacancy Number", JOptionPane.ERROR_MESSAGE);
                this.jtxtVacancyNumber.requestFocus();
                blnSuccess   = false;
        }
     } 
    
    public void SetWorkingShiftsPartTimeStaff()
    {
        Boolean blnSuccess   = false;
        try {
                int    intVNum      = Integer.parseInt(this.jtxtVacancyNumber.getText());
                String strStaffName = this.jtxtStaffName.getText();   
                String strShitfs    = this.jtxtShifts.getText();
                if (intVNum > 0 && ValidStaffName() & ValidShifts() )
                {
                    for (int ctr = 0; ctr < StaffHireDetails.size(); ctr++) 
                    {
                        if (StaffHireDetails.get(ctr) instanceof PartTimeStaffHire)
                        {
                            try
                            {
                                PartTimeStaffHire PTSHire = (PartTimeStaffHire)StaffHireDetails.get(ctr);
                                int    intFVNum = PTSHire.getvacancyNumber();
                                String strFSN   = PTSHire.getstaffName();
                                String strJobType = PTSHire.getjobType();
                                if (intVNum == intFVNum)
                                {
                                    if (strJobType == "Permament")
                                    {  
                                        JOptionPane.showMessageDialog(this.jfrmRecSys, "Shift cannot be set on a Permanent Staff.", "Error", JOptionPane.ERROR_MESSAGE);
                                        blnSuccess = false;
                                        break; 
                                    }
                                    else
                                    {
                                        PTSHire.setshifts(strShitfs);
                                        blnSuccess = true;
                                        break;
                                    } 
                                }
                                else
                                {
                                    blnSuccess = false;   
                                }
    
                            }
                            catch (ClassCastException e)
                            {
                                JOptionPane.showMessageDialog(this.jfrmRecSys, e.getMessage(), "Application Error", JOptionPane.ERROR_MESSAGE);
                                blnSuccess = false;
                                break;
                            }                 
                        }
                        else 
                        {
                            blnSuccess   = false;
                        }
                    }
                }
                if (blnSuccess) 
                {       
                    JOptionPane.showMessageDialog(this.jfrmRecSys, "The Shift is set successfully", "Success", JOptionPane.INFORMATION_MESSAGE);
                }
                else
                {
                    JOptionPane.showMessageDialog(this.jfrmRecSys, "Error in Adding/Modifing the Shift - Check the correct vacacny number is entered", "Error", JOptionPane.ERROR_MESSAGE);
                }
            } 
            catch(NumberFormatException e) 
            {
                JOptionPane.showMessageDialog(this.jfrmRecSys, "Enter a Valid Integer number", "Invalid Vacancy Number", JOptionPane.ERROR_MESSAGE);
                this.jtxtVacancyNumber.requestFocus();
                blnSuccess   = false;
            }
    }
    
   public void TerminatePartTimeStaff()
   {
        Boolean blnSuccess = false;
        Boolean blnTerminate;
        int intctr = 0;
        try 
        {
                int intVNum = Integer.parseInt(this.jtxtVacancyNumber.getText());
                if (jchkTerminate.isSelected() == false || intVNum <=0 )
                {
                    JOptionPane.showMessageDialog(this.jfrmRecSys, "The terminate option was not selected or Invalid Vacancy Number entered", "Unable to Terrminate", JOptionPane.ERROR_MESSAGE);                        
                }
                else
                {
                    blnTerminate = true;
                    for (int ctr = 0; ctr < StaffHireDetails.size(); ctr++) 
                    {
                        if (StaffHireDetails.get(ctr) instanceof PartTimeStaffHire)
                        {
                            try
                            {
                                PartTimeStaffHire PTSH = (PartTimeStaffHire)StaffHireDetails.get(ctr);
                                int     intFVNum = PTSH.getvacancyNumber();
                                Boolean blnTerm  = PTSH.getterminate();
                                if ( intVNum == intFVNum )
                                {
                                    if (blnTerminate  != blnTerm  )
                                    {
                                        PTSH.setstaffName("");
                                        PTSH.setjoiningDate("");
                                        PTSH.setqualification("");
                                        PTSH.setappointedBy("");
                                        PTSH.setjoined(false);
                                        PTSH.setterminate(true);
                                        JOptionPane.showMessageDialog(this.jfrmRecSys, "The staff is terminated successfully", "Success", JOptionPane.INFORMATION_MESSAGE);
                                        blnSuccess = true;
                                        break;
                                    }
                                    else if (blnTerminate  == blnTerm  )
                                    {
                                        JOptionPane.showMessageDialog(this.jfrmRecSys, "The staff is already terminated ", "Unable to Terrminate", JOptionPane.ERROR_MESSAGE);
                                        blnSuccess = false;
                                        break;
                                    }
                                }
                                else
                                {
                                    blnSuccess = false;
                                }
                            }
                            catch (ClassCastException e)
                            {
                                JOptionPane.showMessageDialog(this.jfrmRecSys, e.getMessage(), "Application Error", JOptionPane.ERROR_MESSAGE);
                                blnSuccess = false;
                                break;
                            }                 
                        }
                        intctr = intctr++;
                    }
                    if (intctr >= 0 && blnSuccess == false)
                    {
                       JOptionPane.showMessageDialog(this.jfrmRecSys, "No Staff with Vacancy Number is found to be Terminate", "Unable to Terrminate", JOptionPane.ERROR_MESSAGE);                        
                    }
                }
 
        } catch(NumberFormatException e) 
        {
            JOptionPane.showMessageDialog(this.jfrmRecSys, "Enter a Valid Integer number", "Invalid Vacancy Number", JOptionPane.ERROR_MESSAGE);
            this.jtxtVacancyNumber.requestFocus();
            blnSuccess   = false;
        }
    }
        
    public void DisplayNumber()
    {
        Boolean blnStaffFound = false;
        //int DisplayNum = ValidDNumber(Integer.parseInt(jtxtDisplayNumber.getText()));
        try
        {
            int DisplayNum = Integer.parseInt(jtxtDisplayNumber.getText());
            int intVnum = 0;
            if ( DisplayNum != -1) 
            {
                for (int ctr = 0; ctr < StaffHireDetails.size(); ctr++) 
                {
                    if ( StaffHireDetails.get(ctr) instanceof PartTimeStaffHire )
                    {
                        try
                        {
                            PartTimeStaffHire PTSH = (PartTimeStaffHire)StaffHireDetails.get(ctr);
                            intVnum = PTSH.getvacancyNumber();
                            if (intVnum == DisplayNum)
                            {
                                jtxtVacancyNumber.setText(Integer.toString(intVnum));
                                jtxtDesignation.setText(PTSH.getdesignationType());
                jtxtJobType.setText(PTSH.getjobType());
                                jtxtJoiningDate.setText(PTSH.getjoiningDate());
                                jtxtStaffName.setText(PTSH.getstaffName());
                                jtxtAppointedBy.setText(PTSH.getappointedBy());
                                jtxtQualification.setText(PTSH.getqualification());
                                jchkJoined.setSelected(PTSH.getjoined());    
                                jtxtWorkingHours.setText(Integer.toString(PTSH.getworkingHour()));
                                jtxtWagesPerHour.setText(Double.toString(PTSH.getwagesPerHour()));
                                jtxtShifts.setText(PTSH.getshifts());
                                jtxtIncomePerDay.setText(Double.toString(PTSH.getworkingHour() * PTSH.getwagesPerHour()));
                                blnStaffFound = true;
                                break;
                            }
                        }
                        catch (ClassCastException e)
                        {
                            JOptionPane.showMessageDialog(this.jfrmRecSys, e.getMessage(), "Application Error", JOptionPane.ERROR_MESSAGE);
                            blnStaffFound = false;
                        }
                    }
                    else if ( StaffHireDetails.get(ctr) instanceof FullTimeStaffHire )
                    {
                        try
                        {
                            FullTimeStaffHire FTSH = (FullTimeStaffHire)StaffHireDetails.get(ctr);
                            intVnum = FTSH.getvacancyNumber();
                            if (intVnum == DisplayNum)
                            {
                                jtxtVacancyNumber.setText(Integer.toString(intVnum));
                                jtxtDesignation.setText(FTSH.getdesignationType());
                                jtxtJobType.setText(FTSH.getjobType());
                                jtxtJoiningDate.setText(FTSH.getjoiningDate());
                                jtxtStaffName.setText(FTSH.getstaffName());
                                jtxtAppointedBy.setText(FTSH.getappointedBy());
                                jtxtQualification.setText(FTSH.getqualification());
                                jchkJoined.setSelected(FTSH.getjoined());    
                                jtxtSalary.setText(Double.toString(FTSH.getsalary()));
                                jtxtWeeklyFractionalHours.setText(Integer.toString(FTSH.getweeklyFractionalHours()));
                                blnStaffFound = true;
                                break;
                            }
                        }
                        catch (ClassCastException e)
                        {
                            JOptionPane.showMessageDialog(this.jfrmRecSys, e.getMessage(), "Application Error", JOptionPane.ERROR_MESSAGE);
                            blnStaffFound = false;
                        }                   
                    }
                }
                if (!blnStaffFound) 
                {       
                    JOptionPane.showMessageDialog(this.jfrmRecSys, "The requested stafff details not found!", "Incorrect Display Number", JOptionPane.ERROR_MESSAGE);
                    jtxtDisplayNumber.requestFocus();
                }                
            }
            else
            {
                JOptionPane.showMessageDialog(this.jfrmRecSys, "Enter a Valid Integer number", "Invalid Display Number", JOptionPane.ERROR_MESSAGE);
                this.jtxtDisplayNumber.requestFocus();         
            }
        }
        catch(NumberFormatException e) 
        {
            JOptionPane.showMessageDialog(this.jfrmRecSys, "Enter a Valid Integer number", "Invalid Display Number", JOptionPane.ERROR_MESSAGE);
            this.jtxtDisplayNumber.requestFocus();
        }
    }
    
    public void ClearFields()
    {
        jtxtVacancyNumber.setText("0");
        jtxtDesignation.setText("");
        jtxtJobType.setText("");
        jtxtJoiningDate.setText("");
        jtxtStaffName.setText("");
        jtxtAppointedBy.setText("");
        jtxtQualification.setText("");
        jtxtSalary.setText("0.0");
        jtxtWeeklyFractionalHours.setText("0");
        jtxtWorkingHours.setText("0");
        jtxtWagesPerHour.setText("0.0");
        jtxtShifts.setText("");
        jchkJoined.setSelected(false);
        jchkTerminate.setSelected(false);
        jtxtDisplayNumber.setText(Integer.toString(StaffHireDetails.size()));
    }
    
    public boolean ValidJobType() 
    {
        String strJobType = this.jtxtJobType.getText().trim();
        if (strJobType.isEmpty()) 
        {
            JOptionPane.showMessageDialog(this.jfrmRecSys, "Enter a valid Job Type - Permanent / Temporary / Contract" , "Invalid Job Type", JOptionPane.ERROR_MESSAGE);
            this.jtxtJobType.requestFocus();
            return false;
        } else 
        {
          switch(strJobType.toUpperCase()) 
          {
              case "PERMANENT": 
                  return true;
              case "TEMPORARY":
                  return true;
              case "CONTRACT": 
                  return true;
              default:
                  JOptionPane.showMessageDialog(this.jfrmRecSys, "Enter a valid Job Type - Permament / Temporary / Contract" , "Invalid Job Type", JOptionPane.ERROR_MESSAGE);
                  this.jtxtJobType.requestFocus();
                  return false;                 
          }
        }
    }
    
    public boolean ValidWFHours()
    {
           
           try {
               int intWFH = Integer.parseInt(this.jtxtWeeklyFractionalHours.getText());  
               if ( intWFH < 36.0 || intWFH > 40.0) 
               {
                   JOptionPane.showMessageDialog(this.jfrmRecSys, "Enter a Valid Week Fractional Hours greater than or equal to 36.0 and less than or equal to 40.0 !", "Invalid Weekly Fractional Hours", JOptionPane.ERROR_MESSAGE);
                   this.jtxtWeeklyFractionalHours.requestFocus();
                   return false;
               }   
               else 
               {          
                   return true;
               }
            }
            catch(NumberFormatException e) {
                JOptionPane.showMessageDialog(this.jfrmRecSys, "Enter a Valid Integer number!", "Invalid Weekly Fractional Hours", JOptionPane.ERROR_MESSAGE);
                this.jtxtWeeklyFractionalHours.requestFocus();
                return false;
            }
    }
    
    public boolean ValidWHours()
    {
           try 
           {
                int intWHours =  Integer.parseInt(this.jtxtWorkingHours.getText());
                if ( intWHours < 1 || intWHours > 14 )
                {
                 JOptionPane.showMessageDialog(this.jfrmRecSys, "Workhing hour is >=1 or <=14!", "Invalid Working Hours", JOptionPane.ERROR_MESSAGE);
                 this.jtxtWorkingHours.requestFocus();
                 return false; 
                }
                else 
                {
                 return true;
                }
            } catch(NumberFormatException e) 
            {
                JOptionPane.showMessageDialog(this.jfrmRecSys, "Enter a Valid Integer number!", "Invalid Working Hours", JOptionPane.ERROR_MESSAGE);
                this.jtxtWorkingHours.requestFocus();
                return false;
            }
    }
    
    public boolean ValidVNumber()
    {
        boolean rtnvalue = true;
        try {
                int vNum = Integer.parseInt(this.jtxtVacancyNumber.getText());
                if (vNum <= 0) {
                    JOptionPane.showMessageDialog(this.jfrmRecSys, "Enter a Valid Integer number greater than ZERO", "Invalid Vacancy Number", JOptionPane.ERROR_MESSAGE);
                    this.jtxtVacancyNumber.requestFocus();
                    rtnvalue = false;
                }
                else 
                {
                    for (int ctr = 0; ctr < StaffHireDetails.size(); ctr++) 
                    {
                        if (StaffHireDetails.get(ctr) instanceof FullTimeStaffHire)
                        {
                            try
                            {
                                FullTimeStaffHire FTSH = (FullTimeStaffHire)StaffHireDetails.get(ctr);
                                if (vNum == FTSH.getvacancyNumber()) 
                                {
                                    JOptionPane.showMessageDialog(this.jfrmRecSys, "The Vacancy Number already exist.", "Invalid Vacancy Number", JOptionPane.ERROR_MESSAGE);
                                    this.jtxtVacancyNumber.requestFocus();
                                    rtnvalue = false; 
                                    break;
                                }                                
                            }
                            catch (ClassCastException e)
                            {
                                JOptionPane.showMessageDialog(this.jfrmRecSys, e.getMessage(), "Application Error", JOptionPane.ERROR_MESSAGE);
                                rtnvalue = false; 
                                break;
                            }       

                        }
                        else if (StaffHireDetails.get(ctr) instanceof PartTimeStaffHire)
                        {
                            try
                            {
                                PartTimeStaffHire PTSH = (PartTimeStaffHire)StaffHireDetails.get(ctr);
                                if (vNum == PTSH.getvacancyNumber()) 
                                {
                                    JOptionPane.showMessageDialog(this.jfrmRecSys, "The Vacancy Number already exist.", "Invalid Vacancy Number", JOptionPane.ERROR_MESSAGE);
                                    this.jtxtVacancyNumber.requestFocus();
                                    rtnvalue = false;
                                    break;
                                }                                
                            }
                            catch (ClassCastException e)
                            {
                                JOptionPane.showMessageDialog(this.jfrmRecSys, e.getMessage(), "Application Error", JOptionPane.ERROR_MESSAGE);
                                rtnvalue = false; 
                                break;
                            }       
                        }
                    }
                }
            } 
            catch(NumberFormatException e) 
            {
                JOptionPane.showMessageDialog(this.jfrmRecSys, "Enter a Valid Integer number", "Invalid Vacancy Number", JOptionPane.ERROR_MESSAGE);
                this.jtxtVacancyNumber.requestFocus();
                rtnvalue = false;
            }
        return rtnvalue;
    }
    
    public boolean ValidJDate() 
    {
          SimpleDateFormat dateFormat = new SimpleDateFormat("dd/mm/yyyy");
          dateFormat.setLenient(true);
          
          try {
                String strJDate = this.jtxtJoiningDate.getText().trim();
                if (strJDate.length() < 10) 
                {
                    JOptionPane.showMessageDialog(this.jfrmRecSys, "An invalid date is entered. Valid format is dd/mm/yyyy", "Invalid Joining Date", JOptionPane.ERROR_MESSAGE); 
                    this.jtxtJoiningDate.requestFocus();
                    return false;
                }
                else 
                {
                    Date   JDate = dateFormat.parse(this.jtxtJoiningDate.getText().trim());
                    return true;
                }
          } catch (ParseException pe) {
                JOptionPane.showMessageDialog(this.jfrmRecSys, "Enter a Valid Date in dd/mm/yyyy", "Invalid Joining Date", JOptionPane.ERROR_MESSAGE);
                this.jtxtJoiningDate.requestFocus();
                return false;
          }
    }  
    
    public boolean ValidDesign() 
    {
        if (this.jtxtDesignation.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this.jfrmRecSys, "Enter a valid Designation", "Invalid Designation", JOptionPane.ERROR_MESSAGE);
            this.jtxtDesignation.requestFocus();
            return false;      
        }
        else {
            return true;
        }
    } 
    
    public boolean ValidStaffName() 
    {
        if (this.jtxtStaffName.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this.jfrmRecSys, "Enter a valid Staff Name", "Invalid Staff Name", JOptionPane.ERROR_MESSAGE);
            this.jtxtStaffName.requestFocus();
            return false;
        }
        else {
            return true;
        }
    }   
    
    public boolean ValidAppBy() 
    {
        if (this.jtxtAppointedBy.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this.jfrmRecSys, "Enter a valid Appointed", "Invalid Appointed By", JOptionPane.ERROR_MESSAGE);
            this.jtxtAppointedBy.requestFocus();
            return false;
        }
        else {
            return true;
        }
    }   
    
    public boolean ValidQuali() 
    {
        if (this.jtxtQualification.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this.jfrmRecSys, "Enter a valid Qualifaction", "Invalid Qualifaction", JOptionPane.ERROR_MESSAGE);
            this.jtxtQualification.requestFocus();
            return false;
        }
        else {
            return true;
        }
    }   

    public boolean ValidSalary()
    {
           try {
                Double dlbSalary = Double.parseDouble(this.jtxtSalary.getText());
                if (dlbSalary <= 0) {
                    JOptionPane.showMessageDialog(this.jfrmRecSys, "Enter a Valid Integer number greater than ZERO", "Invalid Salary", JOptionPane.ERROR_MESSAGE);
                    this.jtxtSalary.requestFocus();
                    return false;
                }
                else {
                    return true;
                }
            }
            catch(NumberFormatException e) {
                JOptionPane.showMessageDialog(this.jfrmRecSys, "Enter a Valid Salary", "Invalid Salary", JOptionPane.ERROR_MESSAGE);
                this.jtxtSalary.requestFocus();
                return false;
            }
    }   
    
    public boolean ValidWPHour()
    {
           try {
                Double dblWPH = Double.parseDouble(this.jtxtWagesPerHour.getText());
                if (dblWPH <= 0) {
                    JOptionPane.showMessageDialog(this.jfrmRecSys, "Enter a Valid Integer number greater than ZERO", "Invalid Wages Per Hour", JOptionPane.ERROR_MESSAGE);
                    this.jtxtWagesPerHour.requestFocus();
                    return false;
                }
                else {
                    return true;
                }
            }
            catch(NumberFormatException e) {
                JOptionPane.showMessageDialog(this.jfrmRecSys, "Enter a Valid Wages Per Hour", "Invalid Wages Per Hour", JOptionPane.ERROR_MESSAGE);
                this.jtxtWagesPerHour.requestFocus();
                return false;
            }
    } 
    
    public int ValidDNumber(int DisplayNum)
    {
           try {
                if (DisplayNum <= 0) {
                    JOptionPane.showMessageDialog(this.jfrmRecSys, "Enter a Valid Integer number greater than ZERO", "Invalid Display Number", JOptionPane.ERROR_MESSAGE);
                    this.jtxtDisplayNumber.requestFocus();
                    return -1;
                }
                else if ( DisplayNum > StaffHireDetails.size()) {
                    JOptionPane.showMessageDialog(this.jfrmRecSys, "Enter a valid range of staff number", "Invalid staff Number range", JOptionPane.ERROR_MESSAGE);
                    this.jtxtDisplayNumber.requestFocus();
                    return -1;
                }
                else
                {
                    return DisplayNum;
                }
            }
            catch(NumberFormatException e) {
                JOptionPane.showMessageDialog(this.jfrmRecSys, "Enter a Valid Integer number", "Invalid Display Number", JOptionPane.ERROR_MESSAGE);
                this.jtxtDisplayNumber.requestFocus();
                return -1;
            }
    }
    
    public boolean ValidShifts() 
    {
        String strShitfs = this.jtxtShifts.getText().trim();
        if (strShitfs.isEmpty()) 
        {
            JOptionPane.showMessageDialog(this.jfrmRecSys, "Enter a valid Shifts - Morning / Day / Evening" , "Invalid Shifts", JOptionPane.ERROR_MESSAGE);
            this.jtxtShifts.requestFocus();
            return false;
        } else 
        {
          switch(strShitfs.toUpperCase()) 
          {
              case "MORNING":
                  return true;
              case "DAY":
                  return true;
              case "EVENING": 
                  return true;
              default:
                  JOptionPane.showMessageDialog(this.jfrmRecSys, "Enter a valid Shifts - Morning / Day / Evening" , "Invalid Shifts", JOptionPane.ERROR_MESSAGE);
                  this.jtxtShifts.requestFocus();
                  return false;                 
          }
        }
    }
    
    public void  DisplayAll()
    {
       for (int ctr = 0; ctr < StaffHireDetails.size(); ctr++) 
       {
           try
           {
                if ( StaffHireDetails.get(ctr) instanceof PartTimeStaffHire )
                {
                    try
                    {
                        PartTimeStaffHire PTSH = (PartTimeStaffHire)StaffHireDetails.get(ctr);
                        PTSH.displayPartTimeStaffHireDetails();
                    }
                    catch (ClassCastException e)
                    {
                        JOptionPane.showMessageDialog(this.jfrmRecSys, e.getMessage(), "Application Error", JOptionPane.ERROR_MESSAGE);
                    }
                    
                }
                else if ( StaffHireDetails.get(ctr) instanceof FullTimeStaffHire )
                {
                    try
                    {
                        FullTimeStaffHire FTSH = (FullTimeStaffHire)StaffHireDetails.get(ctr);
                        FTSH.displayFullStaffHireDetails();
                    }
                    catch (ClassCastException e)
                    {
                         JOptionPane.showMessageDialog(this.jfrmRecSys, e.getMessage(), "Application Error", JOptionPane.ERROR_MESSAGE);
                    }                   
               }
            }
            catch(Exception e) 
            {
                JOptionPane.showMessageDialog(this.jfrmRecSys, e.getMessage(), "Application Error", JOptionPane.ERROR_MESSAGE);
            }
        }    
    }

}



