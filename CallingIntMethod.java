class Employee3
{
    int id;
    String name;
    int salary;

    public void printDetails(){
        System.out.println("The name is: "+ name);
        System.out.println("The id is: "+ id);
        
    }
    public int getSalary(){
        return salary;
    }
}

public class CallingIntMethod{
    public static void main(String[] args) {

        System.out.println("This is my custom class!");

        Employee3 Harry=new Employee3();
        Employee3 John=new Employee3();
        

        Harry.id=5;
        Harry.name="Code With Harry";
        Harry.salary=50000;


        John.id=10;
        John.name="John Khandelwal";
        John.salary=26000;

   
        Harry.printDetails();
        John.printDetails();

        System.out.println("Salary of Harry: "+Harry.getSalary());
        System.out.println("Salary of John: "+John.getSalary());
        
    }
}