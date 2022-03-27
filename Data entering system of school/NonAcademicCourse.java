/**
 * Write a description of class NonAcademicCourse here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class NonAcademicCourse extends course
{
    private String instructorName;
    private String startDate;
    private String completionDate;
    private String examDate;
    private String prerequisite;
    private boolean isRegistered;
    private boolean isRemoved;

    public NonAcademicCourse(String courseID,String coursename,int duration,String Prerequisite){
        super(courseID,coursename,duration);
        this.prerequisite=prerequisite;
        this.startDate="";
        this.completionDate="";
        this.examDate="";
        this.isRegistered=false;
        this.isRemoved=false;

    }
    public String getInstructorName(){
        return instructorName;
    }

    public String getStartDate(){
        return startDate;
    }

    public String getCompletionDate(){
        return completionDate;
    }

    public String getExamDate(){
        return examDate;
    }

    public String getPrerequisite(){
        return prerequisite;
    }

    public boolean getisRegistered(){
        return isRegistered;
    }

    public boolean getisRemoved(){
        return isRemoved;
    }

    public void setInstructorName(String newInstructor){
        if(this.isRegistered==false){
            this.instructorName=newInstructor;
        }
        else{
            System.out.println("Non-Academic course is already registered");
        }
    }

    public void register(String courseLeader,String instructorName,String startDate,String completionDate,String examDate){
        if (this.isRegistered==false){
            setCourseLeader(courseLeader);
            this.setInstructorName(instructorName);
            this.startDate=startDate;
            this.completionDate=completionDate;
            this.examDate =examDate;
            isRegistered=true;

        }
        else{
            System.out.println("the course is already registered");
        }
    }

    public void removed(){
        if(this.isRemoved==true){
            System.out.println("the non-academic course is already removed");
        }
        else{
            super.setCourseLeader("");
            instructorName="";
            startDate="";
            completionDate="";
            examDate="";
            isRegistered=false;
            isRemoved=true;

        }
    }

    public void display(){
        super.display();
        if(isRegistered==true){
            System.out.println("Instructor name" + getInstructorName());
            System.out.println("Starting date" + getStartDate());
            System.out.println("Completion Date"+ getCompletionDate());
            System.out.println("Exam Date"+ getExamDate());

        }else{
            System.out.println("NonAcademicCourse is not registered");}

    }
}
