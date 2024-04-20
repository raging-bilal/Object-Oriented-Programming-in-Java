class Employee{
    int id;
    String name;

    public void printDetails(){
        System.out.println("The name is: "+ name);
        System.out.println("The id is: "+ id);
        
    }
}

public class customClassMethodCall{
    public static void main(String[] args) {

        System.out.println("This is my custom class!");

        Employee Harry=new Employee();
        

        Harry.id=5;
        Harry.name="Code With Harry";

        // System.out.println(Harry.id);
        // System.out.println(Harry.name);

        Harry.printDetails();
        
    }
}