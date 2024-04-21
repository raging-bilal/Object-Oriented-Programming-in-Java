class Cylinder{
    int radius;
    int height;


    public void setRadius(int radius){
        this.radius=radius;
    }

    public int getRadius(){
        return radius;
    }


    public void setHeight(int height){
        this.height=height;
    }

    public int getHeight(){
        return height;
    }

}


public class Ch9psQ1 {
    public static void main(String[] args) {
        Cylinder c=new Cylinder();

        c.setRadius(5);
        c.setHeight(8);


        System.out.println(c.getRadius());
        System.out.println(c.getHeight());
    }
    
}
