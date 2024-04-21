class Employee{

    int salary;
    String name;

    public int getSalary(){
        return salary;
    }

    public void setName(String name){
        this.name=name;
    }

    public String getName(){
        return name;
    }
}

public class ch8psQ1{
    public static void main(String[] args) {
        Employee happy=new Employee();

        happy.salary=150000;

        happy.setName("Happy Singh");
        System.out.println(happy.getName());

        System.out.println(happy.getSalary());
        
    }
}