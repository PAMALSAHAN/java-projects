/**
 * main
 */
public class main {

    public static void main(String[] args) {
        teacher pamal =new teacher(1,"pamal",500);
        teacher nuwan=new teacher(2,"nuwan",300);
        teacher asiri=new teacher(3, "asiri", 400);

        List<teacher> teacherList=new ArrayList<>();
        teacherList.add(pamal);
        teacherList.add(nuwan);
        teacherList.add(asiri);
         

        student sahan =new student(1, "sahan", 4);
        student madupa=new student(2, "madupa", 5);
        student akitha=new student(3, "akitha", 6);

        List<student> studentList=new ArrayList<>();
        studentList.add(sahan);
        studentList.add(madupa);
        studentList.add(akitha);
         
        school acc=new school(teacherList,studentList);
        System.out.println("acc earned :"+acc.getTotalMoneyEarned());

        sahan.payFees(5000);
        System.out.println("acc has earned"+acc.getTotalMoneyEarned());
        madupa.payFees(4000);
        System.out.println("acc has earned"+acc.getTotalMoneyEarned());

        nuwan.receiveSalary(nuwan.getSalary());
        
        System.out.println(pamal); //toString method we use for this 
        System.out.println(sahan); //toString method describe the object

        teacher chamath=new teacher(6,"chamath", 4000);
        acc.addTeachers(chamath); //this is how to add teachers

    }
}