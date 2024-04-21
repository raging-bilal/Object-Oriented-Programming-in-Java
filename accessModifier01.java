class Employee1{
    private String name;
    private int id;

    public void setName(String name){
        this.name=name;
    }

    public String getName(){
        return name;

    }

    public void setID(int id){
        this.id=id;
    }

    public int getID(){
        return id;
    }
}

public class accessModifier01 {
    public static void main(String[] args) {
        Employee1 e =new Employee1();

        e.setName("Khushnood Bilal");
        e.setID(114);

        System.out.println(e.getName());
        System.out.println(e.getID());

    }
    
}
