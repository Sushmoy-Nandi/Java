class Ractangle{

    public double length;
    public double breadth;

    public double area(){
        return length*breadth;
    }
    public double perimeter(){
        return 2*(length+breadth);
    }
    public boolean isSquare(){
        if(length==breadth){
            return true;
        }
        else{
            return false;
        }
    }

}

public class myRactangle {
    public static void main(String[] args) {
        Ractangle r1= new Ractangle();
        r1.length=2;
        r1.breadth=2;

        System.out.println("Area: "+ r1.area());
        System.out.println("Perimeter: "+ r1.perimeter());
        System.out.println("Is it Square ?\nAns: "+ r1.isSquare());

    }
    
}
