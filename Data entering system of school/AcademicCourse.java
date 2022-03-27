/**
 * Write a description of class AcademicCourse here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

public class AcademicCourse extends course
{
    private String lectureName;
    private String level;
    private String credit;
    private String startingDate;
    private String completionDate;
    private int numberofAssesment;
    private boolean isregistered;

    public AcademicCourse(String courseID,String coursename,int duration,String level,String credit,int numberofAssesment){
        super(courseID,coursename,duration);
        this.level=level;
        this.credit=credit;
        this.numberofAssesment=numberofAssesment;
        this.lectureName="";
        this.startingDate="";
        this.completionDate="";
        this.isregistered=false;   

    }
    public String getlectureName(){
        return lectureName;
    }

    public String getlevel(){
        return level;
    }

    public String getcredit(){
        return credit;
    }

    public String getstartingDate(){
        return startingDate; 
    }

    public String getcompletionDate(){
        return completionDate;
    }

    public int getnumberofAssesment(){
        return numberofAssesment;
    }

    public boolean isregestered(){
        return isregistered;
    }

    public void setnumberofassesment(int newnumberofAssesments){
        this.numberofAssesment = newnumberofAssesments;

    }

    public void register(String leaderName,String lectureName,String startingdate,String completiondate){
        if(this.isregistered==true){
            System.out.println("Academic course is already registered");
            System.out.println("lecture name"+getlectureName());
            System.out.println("starting date"+getstartingDate());
        }
        else{
            super.setCourseLeader(leaderName);
            this.lectureName=lectureName;
            this.startingDate=startingDate;
            this.completionDate=completionDate;
            this.isregistered=true;
            System.out.println("the course has been registered sucessfully");
        }
    }

    public void display(){
        super.display();
        if(isregistered==true){
            System.out.println("lecture Name:"+ getlectureName());
            System.out.println("level:" + getlevel());
            System.out.println("credit:"+ getcredit());
            System.out.println("starting Date: "+ getstartingDate());
            System.out.println("complection Date: " + getcompletionDate());
            System.out.println("No of Assesments: "+ getnumberofAssesment());    
        }
    }
}