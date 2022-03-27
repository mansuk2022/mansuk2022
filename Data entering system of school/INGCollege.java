
/**
 * Write a description of class INGCollege here.
 *
 * @author (your name)
 * @version (a version number or a Date)
 */
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.Color;
import java.awt.Font;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
public class INGCollege
{
    private JFrame INGCollege;
    private JPanel panel1, panel2;
    private JLabel lblcourseID, lblcourseName, lblduration, lbllevel, lblcredit, lblnoofAssessment, lblcourseLeader, lbllecturerName ,lblstartDate,lblcompletionDate,lblprerequisite,lblinstructorName,lblexamDate;
    private JTextField txtACcourseID, txtACcourseName, txtACduration, txtAClevel, txtACcredit, txtACnoofAssessment, txtACcourseLeader, txtAClecturerName ,txtACstartDate,txtACcompletionDate,txtACcourseIDfield;
    private JTextField NonAcademictxtCourseID,NonAcademictxtCourseName,NonAcademictxtDuration,NonAcademictxtPrerequisite,NonAcademictxtCourseLeader,NonAcademictxtStartingDate,NonAcademictxtCompletionDate,NonAcademictxtInstructorName,NonAcademictxtExamDate,NonAcademictxtRemoveCourse,NonAcademictxtCourseIDfield;
    private JButton btnAddAcademicCourse, btnRegisterAcademicCourse,btnDisplayAcademicCourse,btnClearAcademicCourse,btnAddNonAcademicCourse,btnremoveNonAcademicCourse,btnregisterNonAcademicCourse,btnDisplayNonAcademicCourse,btnClearNonAcademicCourse;

    ArrayList<course> courses = new ArrayList<course>();
    public INGCollege(){
        initialFrame();
        myFrameA();
        myFrameB();
    }

    public String getCourseID(){
        return txtACcourseID.getText();
    }

    public String getCourseName(){
        return txtACcourseName.getText();
    }

    public int getDuration(){
        String duration = txtACduration.getText(); 
        int durationNum =-1;
        try{
            durationNum = Integer.parseInt(duration);

        }catch(NumberFormatException nfe){
            JOptionPane.showMessageDialog(INGCollege,"Incorrect value for duration.\nPlease add numeric value","Invalid Input",0);

        }
        return durationNum;

    }

    public String getLevel(){
        return txtAClevel.getText();
    }

    public String getCredit(){
        return txtACcredit.getText();

    }

    public int getnoofAssessment(){
        String noofAssessment = txtACnoofAssessment.getText(); 
        int noofAssessmentNum =-1;
        try{
            noofAssessmentNum = Integer.parseInt(noofAssessment);

        }catch(NumberFormatException nfe){
            JOptionPane.showMessageDialog(INGCollege,"Incorrect value for number of Assessment.\nPlease add numeric value","Invalid Input",0);

        }
        return noofAssessmentNum;

    }

    public String getCourseLeader(){
        return txtACcourseLeader.getText();

    }

    public String getLecturerName(){
        return txtAClecturerName.getText();
    }

    public String getStartDate(){
        return txtACstartDate.getText();
    }

    public String getCompletionDate(){
        return txtACcompletionDate.getText();
    }

    public String getCourseIDfield(){
        return txtACcourseIDfield.getText();
    }

    public String getNonAcademicCourseID(){
        return NonAcademictxtCourseID.getText();
    }

    public String getNonAcademicCourseIDfield(){
        return NonAcademictxtCourseIDfield.getText();
    }

    public String getNonAcademicCoureName(){
        return NonAcademictxtCourseName.getText();
    }

    public int getNonAcademicDuration(){
        String duration = NonAcademictxtDuration.getText();
        int durationNum = -1;
        try{
            durationNum = Integer.parseInt(duration);
        }
        catch(NumberFormatException nfe){
            JOptionPane.showMessageDialog(INGCollege,"Please enter integer value in duration field","Invalid Input",0);
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return durationNum;
    }

    public String getNonAcademicPrerequisite(){
        return NonAcademictxtPrerequisite.getText();
    }

    public String getNonAcademicCourseLeader(){
        return NonAcademictxtCourseLeader.getText();
    }

    public String getNonAcademicInstructorName(){
        return NonAcademictxtInstructorName.getText();
    }

    public String getNonAcademicStartDate(){
        return NonAcademictxtStartingDate.getText();
    }

    public String getNonAcademicCompletionDate(){
        return NonAcademictxtCompletionDate.getText();
    }

    public String getNonAcademicExamDate(){
        return NonAcademictxtExamDate.getText();
    }   

    public String getNonAcademicRemoveCourse(){
        return NonAcademictxtRemoveCourse.getText();
    }

    public void initialFrame(){
        INGCollege = new JFrame("GUI");
        INGCollege.setLayout(null);
        INGCollege.setSize(900,750);
        INGCollege.setResizable(false);
        INGCollege.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        panel1 = new JPanel();
        INGCollege.add(panel1);
        panel1.setBounds(0,0,440,700);
        panel1.setLayout(null);
        panel1.setBorder(BorderFactory.createTitledBorder("Academic Course"));

        panel2 = new JPanel();
        INGCollege.add(panel2);
        panel2.setBounds(440,0,440,700);
        panel2.setLayout(null);
        panel2.setBorder(BorderFactory.createTitledBorder("Non Academic Course"));
    }

    public void myFrameA(){
        lblcourseID= new JLabel("Course ID");
        lblcourseID.setBounds(40,30,150,25);
        panel1.add(lblcourseID);

        txtACcourseID = new JTextField();
        txtACcourseID.setBounds(240,30,150,25);
        panel1.add(txtACcourseID);

        lblcourseName = new JLabel("Course Name");
        lblcourseName.setBounds(40,60,150,25);
        panel1.add(lblcourseName);

        txtACcourseName = new JTextField();
        txtACcourseName.setBounds(240,60,150,25);
        panel1.add(txtACcourseName);

        lblduration = new JLabel("Duration");
        lblduration.setBounds(40,90,150,25);
        panel1.add(lblduration);

        txtACduration = new JTextField();
        txtACduration.setBounds(240,90,150,25);
        panel1.add(txtACduration);

        btnAddAcademicCourse = new JButton("Add");
        btnAddAcademicCourse.setBounds(150,210,120,25);
        panel1.add(btnAddAcademicCourse);
        btnAddAcademicCourse.setBackground(Color.GRAY);
        btnAddAcademicCourse.setForeground(Color.BLACK);
        btnAddAcademicCourse.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent ae){
                    addAcademicCourse();
                }
            });

        lbllevel = new JLabel("Level");
        lbllevel.setBounds(40,120,150,25);
        panel1.add(lbllevel);

        txtAClevel  = new JTextField();
        txtAClevel.setBounds(240,120,150,25);
        panel1.add(txtAClevel);

        lblcredit = new JLabel("Credit");
        lblcredit.setBounds(40,150,150,25);
        panel1.add(lblcredit);

        txtACcredit  = new JTextField();
        txtACcredit.setBounds(240,150,150,25);
        panel1.add(txtACcredit);

        lblnoofAssessment = new JLabel("Number Of Assessment");
        lblnoofAssessment.setBounds(40,180,150,25);
        panel1.add(lblnoofAssessment);

        txtACnoofAssessment  = new JTextField();
        txtACnoofAssessment.setBounds(240,180,150,25);
        panel1.add(txtACnoofAssessment);

        btnRegisterAcademicCourse = new JButton("Register");
        btnRegisterAcademicCourse.setBounds(150,420,120,25);
        btnRegisterAcademicCourse.setBackground(Color.GRAY);
        btnRegisterAcademicCourse.setForeground(Color.BLACK);
        panel1.add(btnRegisterAcademicCourse);
        btnRegisterAcademicCourse.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent ae){
                    RegisterAcdemicCourse();
                }
            });

        btnDisplayAcademicCourse = new JButton("Display");
        btnDisplayAcademicCourse.setBounds(240,500,120,25);
        btnDisplayAcademicCourse.setBackground(Color.GRAY);
        btnDisplayAcademicCourse.setForeground(Color.BLACK);
        panel1.add(btnDisplayAcademicCourse);
        btnDisplayAcademicCourse.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent ae){
                    displayAcademic();
                }
            });

        lblcourseID = new JLabel("Course ID");
        lblcourseID.setBounds(40,270,150,25);
        panel1.add(lblcourseID);

        txtACcourseIDfield = new JTextField();
        txtACcourseIDfield.setBounds(240,270,150,25);
        panel1.add(txtACcourseIDfield);

        lblcourseLeader = new JLabel("Course Leader");
        lblcourseLeader.setBounds(40,300,150,25);
        panel1.add(lblcourseLeader);

        txtACcourseLeader = new JTextField();
        txtACcourseLeader.setBounds(240,300,150,25);
        panel1.add(txtACcourseLeader);

        lbllecturerName = new JLabel("Lecturer Name");
        lbllecturerName.setBounds(40,330,150,25);
        panel1.add(lbllecturerName);

        txtAClecturerName = new JTextField();
        txtAClecturerName.setBounds(240,330,150,25);
        panel1.add(txtAClecturerName);

        lblstartDate = new JLabel("Starting Date");
        lblstartDate.setBounds(40,360,150,25);
        panel1.add(lblstartDate);

        txtACstartDate = new JTextField();
        txtACstartDate.setBounds(240,360,150,25);
        panel1.add(txtACstartDate);

        lblcompletionDate = new JLabel("Completion Date");
        lblcompletionDate.setBounds(40,390,150,25);
        panel1.add(lblcompletionDate);

        txtACcompletionDate = new JTextField();
        txtACcompletionDate.setBounds(240,390,150,25);
        panel1.add(txtACcompletionDate);

        btnClearAcademicCourse = new JButton("Clear");
        btnClearAcademicCourse.setBounds(40,500,120,25);
        btnClearAcademicCourse.setBackground(Color.GRAY);
        btnClearAcademicCourse.setForeground(Color.BLACK);
        panel1.add(btnClearAcademicCourse);
        btnClearAcademicCourse.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent ae){
                    ClearAcademicCourse();
                }
            });
    }

    public void myFrameB(){
        lblcourseID = new JLabel("Course ID");
        lblcourseID.setBounds(40,30,150,25);
        panel2.add(lblcourseID);

        NonAcademictxtCourseID = new JTextField();
        NonAcademictxtCourseID.setBounds(240,30,150,25);
        panel2.add(NonAcademictxtCourseID);

        lblcourseName = new JLabel("Course Name");
        lblcourseName.setBounds(40,60,150,25);
        panel2.add(lblcourseName);

        NonAcademictxtCourseName = new JTextField();
        NonAcademictxtCourseName.setBounds(240,60,150,25);
        panel2.add(NonAcademictxtCourseName);

        lblduration = new JLabel("Duration");
        lblduration.setBounds(40,90,150,25);
        panel2.add(lblduration);

        NonAcademictxtDuration = new JTextField();
        NonAcademictxtDuration.setBounds(240,90,150,25);
        panel2.add(NonAcademictxtDuration);

        lblprerequisite = new JLabel("Prerequisite");
        lblprerequisite.setBounds(40,120,150,25);
        panel2.add(lblprerequisite);

        NonAcademictxtPrerequisite = new JTextField();
        NonAcademictxtPrerequisite.setBounds(240,120,150,25);
        panel2.add(NonAcademictxtPrerequisite);

        btnAddNonAcademicCourse = new JButton("Add");
        btnAddNonAcademicCourse.setBounds(150,150,120,25);
        btnAddNonAcademicCourse.setBackground(Color.GRAY);
        btnAddNonAcademicCourse.setForeground(Color.BLACK);
        panel2.add(btnAddNonAcademicCourse);
        btnAddNonAcademicCourse.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent ae){
                    addNonAcademicCourse();
                }
            });

        lblcourseID = new JLabel("Course ID");
        lblcourseID.setBounds(40,210,150,25);
        panel2.add(lblcourseID);

        NonAcademictxtCourseIDfield = new JTextField();
        NonAcademictxtCourseIDfield.setBounds(240,210,150,25);
        panel2.add(NonAcademictxtCourseIDfield);

        lblcourseLeader = new JLabel("Course Leader");
        lblcourseLeader.setBounds(40,240,150,25);
        panel2.add(lblcourseLeader);

        NonAcademictxtCourseLeader = new JTextField();
        NonAcademictxtCourseLeader.setBounds(240,240,150,25);
        panel2.add(NonAcademictxtCourseLeader);

        lblinstructorName = new JLabel("Instructor");
        lblinstructorName.setBounds(40,270,150,25);
        panel2.add(lblinstructorName);

        NonAcademictxtInstructorName = new JTextField();
        NonAcademictxtInstructorName.setBounds(240,270,150,25);
        panel2.add(NonAcademictxtInstructorName);

        lblstartDate = new JLabel("Start Date");
        lblstartDate.setBounds(40,300,150,25);
        panel2.add(lblstartDate);

        NonAcademictxtStartingDate = new JTextField();
        NonAcademictxtStartingDate.setBounds(240,300,150,25);
        panel2.add(NonAcademictxtStartingDate);

        lblcompletionDate = new JLabel("Completion Date");
        lblcompletionDate.setBounds(40,330,150,25);
        panel2.add(lblcompletionDate);

        NonAcademictxtCompletionDate = new JTextField();
        NonAcademictxtCompletionDate.setBounds(240,330,150,25);
        panel2.add(NonAcademictxtCompletionDate);

        lblexamDate = new JLabel("Exam Date");
        lblexamDate.setBounds(40,360,150,25);
        panel2.add(lblexamDate);

        NonAcademictxtExamDate = new JTextField();
        NonAcademictxtExamDate.setBounds(240,360,150,25);
        panel2.add(NonAcademictxtExamDate);

        btnregisterNonAcademicCourse = new JButton("Register");
        btnregisterNonAcademicCourse.setBounds(150,390,120,25);
        btnregisterNonAcademicCourse.setBackground(Color.GRAY);
        btnregisterNonAcademicCourse.setForeground(Color.BLACK);
        panel2.add(btnregisterNonAcademicCourse);
        btnregisterNonAcademicCourse.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent ae){
                    registerNonAcademicCourse();
                }
            });

        lblcourseID = new JLabel("Course ID");
        lblcourseID.setBounds(40,420,150,25);
        panel2.add(lblcourseID);

        NonAcademictxtRemoveCourse = new JTextField();
        NonAcademictxtRemoveCourse.setBounds(240,420,150,25);
        panel2.add(NonAcademictxtRemoveCourse);

        btnremoveNonAcademicCourse = new JButton("Remove");
        btnremoveNonAcademicCourse.setBounds(150,480,120,25);
        btnremoveNonAcademicCourse.setBackground(Color.GRAY);
        btnremoveNonAcademicCourse.setForeground(Color.BLACK);
        panel2.add(btnremoveNonAcademicCourse);
        btnremoveNonAcademicCourse.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent ae){
                    removeNonAcademicCourse();
                }
            });

        btnDisplayNonAcademicCourse = new JButton("Display");
        btnDisplayNonAcademicCourse.setBounds(40,550,120,25);
        btnDisplayNonAcademicCourse.setBackground(Color.GRAY);
        btnDisplayNonAcademicCourse.setForeground(Color.BLACK);
        panel2.add(btnDisplayNonAcademicCourse);
        btnDisplayAcademicCourse.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent ae){
                    displayNonAcademic();
                }
            });

        btnClearNonAcademicCourse = new JButton("Clear");
        btnClearNonAcademicCourse.setBounds(240,550,120,25);
        btnClearNonAcademicCourse.setBackground(Color.GRAY);
        btnClearNonAcademicCourse.setForeground(Color.BLACK);
        panel2.add(btnClearNonAcademicCourse);
        btnClearNonAcademicCourse.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent ae){
                    clearNonAcademic();
                }
            });

    }

    public void addAcademicCourse(){
        String courseID = this.getCourseID();
        String courseName = this.getCourseName();
        int duration = this.getDuration();
        String level = this.getLevel();
        String credit = this.getCredit();
        int noofAssessment = this.getnoofAssessment();
        boolean flag = false;

        if(courseID.equals("") || courseName.equals("") || duration ==0 || level.equals("") || credit.equals("") || noofAssessment ==-1){
            JOptionPane.showMessageDialog(INGCollege,"The fields are empty.\nPlease fill the required data","Empty Field",2);
            return;
        }else{
            if(courses.isEmpty()){
                flag = true;
            }
            else{
                for(course cos : courses){ 
                    if(cos.getCourseID().equals(courseID)){ 
                        JOptionPane.showMessageDialog(INGCollege,"The CourseID data is already added","Repeated Data",2);
                        return;
                    }else{
                        flag = true;
                    }
                }
            }
            if(flag == true){
                courses.add(new AcademicCourse(courseID,courseName,duration,level,credit,noofAssessment));
                String message = "CourseID : " + courseID + "\nCourse Name : " + courseName + "\nDuration : " + duration + "\nLevel : " + level + "\nCredit : " + credit + "\nNumber ofAssessment : " + noofAssessment;
                JOptionPane.showMessageDialog(INGCollege,message,"Data Added",1);
                return;
            }
        }

    }

    public void RegisterAcdemicCourse(){
        String courseID = this.getCourseIDfield();
        String courseLeader = this.getCourseLeader();
        String lecturerName = this.getLecturerName();
        String startingDate= this.getStartDate();
        String completionDate = this.getCompletionDate();
        boolean flag = false;

        if(courseID.equals("") || courseLeader.equals("") || lecturerName.equals("") || startingDate.equals("") || completionDate.equals("")){
            JOptionPane.showMessageDialog(INGCollege,"The fields are empty.\nPlease fill the required data","Empty Field",2);
            return;
        }else{
            if(courses.isEmpty()){
                flag = true;
            }
            else{
                for(course cos : courses){  //Course obj : arrayList / AcademicCourse & NonAcademicCourse XX
                    if(cos instanceof AcademicCourse)
                    {
                        if(cos.getCourseID().equals(courseID)){ // Java Python
                            AcademicCourse ac = (AcademicCourse) cos;
                            if(ac.isregestered() == true){
                                JOptionPane.showMessageDialog(INGCollege,"The Course is already registered.","Appoint",1);
                                return;
                            }else{
                                ac.register(courseLeader, lecturerName, startingDate, completionDate);
                                String message = "courseID : " + courseID + "\ncourseLeader : " + courseLeader +"\nlecturerName : " + lecturerName + "\nstartingDate : " + startingDate + "\ncompletionDate : " +completionDate;
                                JOptionPane.showMessageDialog(INGCollege,message,"Data Added",1);
                                return;
                            }
                        }
                        else{
                            flag = true;
                        }
                    }

                }
                if(flag = true){
                    JOptionPane.showMessageDialog(INGCollege,"The course doesnot exists.\nPlease add the course data","Register",2);
                    return;
                }
            }
        }
    }

    public void displayAcademic(){
        int count = 0;
        if(courses.isEmpty()){
            count = 0;
        }else{
            for(course cos : courses){ 
                if(cos instanceof AcademicCourse){
                    AcademicCourse ac = (AcademicCourse) cos;
                    ac.display();
                    count++;
                }
            }
        }
        if(count <= 0){
            JOptionPane.showMessageDialog(INGCollege,"The add AcademicCourse to display.","Display",1);
            return;
        }
    }

    public void ClearAcademicCourse(){
        txtACcourseName.setText("");
        txtACduration.setText("");
        txtAClevel.setText("");
        txtACcredit.setText("");
        txtACnoofAssessment.setText("");
        txtACcourseLeader.setText("");
        txtAClecturerName.setText("");
        txtACstartDate.setText("");
        txtACcompletionDate.setText("");
        txtACcourseIDfield.setText("");
        txtACcourseID.setText("");
    }

    public void clearNonAcademic(){
        NonAcademictxtCourseID.setText("");
        NonAcademictxtCourseName.setText("");
        NonAcademictxtDuration.setText("");
        NonAcademictxtPrerequisite.setText("");
        NonAcademictxtCourseLeader.setText("");
        NonAcademictxtStartingDate.setText("");
        NonAcademictxtCompletionDate.setText("");
        NonAcademictxtInstructorName.setText("");
        NonAcademictxtExamDate.setText("");
        NonAcademictxtRemoveCourse.setText("");
        NonAcademictxtCourseIDfield.setText("");

    }

    public void addNonAcademicCourse(){
        String courseID = this.getNonAcademicCourseID();
        String courseName = this.getNonAcademicCoureName();
        int duration = this.getNonAcademicDuration();
        String prerequisite = this.getNonAcademicPrerequisite();
        boolean flag = false;

        if(courseID.equals("") || courseName.equals("") || duration ==-1 || prerequisite.equals("")){
            JOptionPane.showMessageDialog(INGCollege,"The fields are empty.\nPlease fill the required data","Empty Field",2);
        }else{
            if(courses.isEmpty()){
                flag = true;
            }
            else{
                for(course cos : courses){ 
                    if(cos.getCourseID().equals(courseID)){ 
                        JOptionPane.showMessageDialog(INGCollege,"The CourseID data is already added","Repeated Data",2);
                        return;
                    }else{
                        flag = true;
                    }
                }
            }
            if(flag == true){
                courses.add(new NonAcademicCourse(courseID,courseName,duration,prerequisite));
                String message = "CourseID : " + courseID + "\nCourse Name : " + courseName + "\nDuration : " + duration + "\nprerequisite :" +prerequisite;
                JOptionPane.showMessageDialog(INGCollege,message,"Data Added",1);
            }
        }
    }

    public void registerNonAcademicCourse(){
        String courseID = this.getNonAcademicCourseIDfield();
        String courseLeader = this.getNonAcademicCourseLeader();
        String instructorName = this.getNonAcademicInstructorName();
        String startingDate= this.getNonAcademicStartDate();
        String completionDate = this.getNonAcademicCompletionDate();
        String examDate = this.getNonAcademicExamDate();
        boolean flag = false;

        if(courseID.equals("") || courseLeader.equals("") || instructorName.equals("") || startingDate.equals("") || completionDate.equals("") || examDate.equals("")){
            JOptionPane.showMessageDialog(INGCollege,"The fields are empty.\nPlease fill the required data","Empty Field",2);
            return;
        }else{
            if(courses.isEmpty()){
                JOptionPane.showMessageDialog(INGCollege,"The course doesnot exists.\nPlease add the course data","Incorrect Input",2);
                return;
            }
            else{
                for(course cos : courses){  //Course obj : arrayList / AcademicCourse & NonAcademicCourse XX
                    if(cos instanceof NonAcademicCourse)
                    {
                        if(cos.getCourseID().equals(courseID)){ // Java Python
                            NonAcademicCourse nac = (NonAcademicCourse) cos;
                            if(nac.getisRegistered() == true){
                                JOptionPane.showMessageDialog(INGCollege,"The Course is already registered.","Appoint",1);
                                return;
                            }else{
                                nac.register(courseLeader, instructorName, startingDate, completionDate,examDate);
                                String message = "courseID : " + courseID + "\nCourse Leader :"+courseLeader +"\nInstructor Name : " + instructorName + "\nstartingDate : " + startingDate + "\ncompletionDate : " +completionDate +"\nExam Date :"+examDate;
                                JOptionPane.showMessageDialog(INGCollege,message,"Data Added",1);
                                return;
                            }
                        }
                        else{
                            flag = true;
                        }
                    }
                }
                if(flag==true){
                    JOptionPane.showMessageDialog(INGCollege,"The course doesnot exists.\nPlease add the course data","Register",2);
                    return;
                }
            }
        }
    }

    public void displayNonAcademic(){
        int count = 0;
        if(courses.isEmpty()){
            count = 0;
        }
        else{
            for(course NAC : courses){
                if(NAC instanceof NonAcademicCourse){
                    NonAcademicCourse nac = (NonAcademicCourse)NAC;
                    nac.display();
                    count++;
                }
            }
        }
        if(count<=0){
            JOptionPane.showMessageDialog(INGCollege,"Add course to display","Display",1);
            return;
        }
    }

    public void removeNonAcademicCourse(){
        String courseID = getNonAcademicRemoveCourse();
        if(courseID.equals("")){
            JOptionPane.showMessageDialog(INGCollege,"The enter course for which you want to Remove.","Remove",1);
            return;
        }else{
            if(courses.isEmpty()){
                JOptionPane.showMessageDialog(INGCollege,"The add course to remove.","removed",1);
                return;
            }else{
                for(course cos:courses){// Java Python C++ | Python
                    if(cos. getCourseID().equals(courseID)){
                        if(cos instanceof NonAcademicCourse){
                            NonAcademicCourse nac = (NonAcademicCourse) cos;
                            if(nac.getisRemoved() == false){
                                nac.removed();
                                JOptionPane.showMessageDialog(INGCollege,"The course is Removed","Removed",1);
                                return;
                            }else{
                                JOptionPane.showMessageDialog(INGCollege,"The course is already Removed","Removed",1);
                                return;
                            }
                        }

                    }
                    else{
                        JOptionPane.showMessageDialog(INGCollege,"The entire Course cannot be Removed as it doesn't exits.","Can't Remove",1);
                        return;
                    }
                }

            }
        }
    }

    public static void main(String [] args){
        new INGCollege().INGCollege.setVisible(true);

    }
}