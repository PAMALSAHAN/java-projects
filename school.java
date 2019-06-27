import com.sun.xml.internal.bind.v2.schemagen.xmlschema.List;
import java.util.List;

/**
 * school
 */
public class school {

    private List <teacher> teachers;
    private List <student> strudents;
    private int totalMoneyEarned;
    private int totalMoneySpend;

   //set constructor 
   public school(List <teacher> teachers , List<student> students ){
       this.teachers=teachers;
       this.students=students;
        totalMoneyEarned=0;
        totalMoneySpend=0;
   }

   public List<teacher> getTeachers(){
       return teachers;
   }
   public void addTeachers(teacher teachers){
        teachers.add(teachers);
   }
   public List<student> getStudents(){
    return students;
   }
    public void addStudents(student students){
            this.students=students;
    }
    public int getTotalMoneyEarned(){
        return totalMoneyEarned;
    }
    public int getTotalMoneySpend(){
        return totalMoneySpend;
    }
    public void updateTotalMoneyEarned(int moneyEarned){
        totalMoneyEarned+=moneyEarned;
    }
    pubic void updateTotalMoneySpend(int moneySpend){
        totalMoneySpend-=moneySpend;
    }


}

}