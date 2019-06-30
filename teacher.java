/**
 * teacher
 */
public class teacher {
    private String name;
    private int salary;
    private int id;
    private int salaryEarned;


    public teacher(int id ,String name,int salary){

        this.id=id;
        this.name=name;
        this.salary=salary;
        this.salaryEarned=0;
    }

   

    public String getName(){
        return this.name;
    }

    public int getSalary(){
        return this.salary;    
    }

    public int getid(){
        return this.id;
    }

    public void receiveSalary(int salary){
        salaryEarned+=salary;
        school.updateTotalMoneySpend(salary);

    }

    public String toString(){
        return "name of the teacher is :"+name + " and "+"toal money earned is :"+salaryEarned;
    }

   
}