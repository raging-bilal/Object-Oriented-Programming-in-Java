class Cylinder2 {
    int radius;
    int height;

    public Cylinder2(int radius, int height){
        this.radius=radius;
        this.height=height;

        System.out.println("Radius: "+this.radius);
        System.out.println("Height: "+this.height);
    }

    public void setRadius(int radius){
        this.radius=radius;
    }


    public void setHeight(int height){
        this.height=height;
    }
 
}

public class Ch9psQ3 {
    public static void main(String[] args) {
        Cylinder2 c = new Cylinder2(12,20);   

    }

}
