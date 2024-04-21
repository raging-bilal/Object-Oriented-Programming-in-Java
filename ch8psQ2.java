class CellPhone{
    public void ring(){
        System.out.println("CellPhone is Ringing...");
    }

    public void vibrate(){
        System.out.println("CellPhone is Vibrating...");
    }


    public void call(){
        System.out.println("CellPhone is Calling...");
    }


}


public class ch8psQ2 {
    public static void main(String[] args) {
        CellPhone c=new CellPhone();

        c.ring();
        c.vibrate();
        c.call();
        
    }
    
}
