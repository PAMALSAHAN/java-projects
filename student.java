/**
 * student
 * this is used to make the student object
 */
public class student {
    private int id;
    private String name;
    private int fees;
    private int grade;
    private int feespaid;
    private int feestotal;
 
    // this is constructor filling students information
    public student(int id, String name,int grade){

        this.feespaid=0;
        this.feestotal=30000;
        this.id=id;
        this.name=name;
        this.grade=grade;
        
    }

    // function to to set the grade of the student
    public void setGrade(int grade) {
        this.grade=grade;
        
    }

    //function to set the fees
    public void updateFees(int fees) {
        feespaid=feespaid+fees;
    }
}