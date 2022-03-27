/**
 * Write a description of class course here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class course
{
    private String courseID;
    private String courseName;
    private String courseLeader;
    private int duration;

    public course (String courseID,String courseName,int duration){
        this. courseID=courseID;
        this. courseName=courseName;
        this. courseLeader="";
        this. duration=duration;

    }

    public String getCourseID(){
        return courseID;
    }

    public String getCourseName(){
        return courseName;
    }

    public String getCourseLeader(){
        return courseLeader;

    }

    public int getDuration(){
        return duration;

    }

    public void setCourseLeader(String newCourseLeader){
        this.courseLeader=newCourseLeader;

    }

    public void display(){
        System.out.println("courseID:"+getCourseID());
        System.out.println("coursename:"+getCourseName());
        System.out.println("duration:"+getDuration());


        if(this.courseLeader!=""){ 
            System.out.println("courseleader:"+ this.courseLeader);

        }

    }

}