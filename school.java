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

}