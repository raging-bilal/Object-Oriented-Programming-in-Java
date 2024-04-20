class Employee2{
    int id;
    String name;

    public void printDetails(){
        System.out.println("The name is: "+ name);
        System.out.println("The id is: "+ id);
        
    }
}

public class CreatingTwoObject{
    public static void main(String[] args) {

        System.out.println("This is my custom class!");

        Employee2 Harry=new Employee2();
        Employee2 John=new Employee2();
        

        Harry.id=5;
        Harry.name="Code With Harry";


        John.id=10;
        John.name="John Khandelwal";

        // System.out.println(Harry.id);
        // System.out.println(Harry.name);

        Harry.printDetails();
        John.printDetails();
        
    }
}