class Employee2{
    String name;
    int age;

    Employee2(){
        System.out.println("I am a Constructor without parameters! ");
        
    }

    public void printDetails(){
        System.out.println("My name is: "+ name + " and age is: "+ age);
        
    }
}


public class Constructor01 {
    public static void main(String[] args) {
        Employee2 e2=new Employee2();

        e2.name="Khushnood Bilal";
        e2.age=23;

        e2.printDetails();
        
        
    }
    
}
