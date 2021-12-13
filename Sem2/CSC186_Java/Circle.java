public class Circle{
    /** properties/field/attributes*/
    private double radius;
    
    /** constructor*/
    //default constructor
    Circle(){
        radius = 1;
    }
    //normal/parametrize constructor
    Circle(double rad){
        radius = rad;
    }
    
    /** method*/
    //1. Accessor/Retriever/Get
    public double getRadius(){
        return radius;
    }
    
    //2. Mutator/Set/Storer
    public void setRadius(double rad){
        radius = rad;
    }
    
    //3. Display/toString()/Printer
    public String toString(){
        return "Nilai Radius adalah : " + radius + "; Keluasan Circle is : " + findArea();
    }
    
    //4. Process method
    public double findArea(){
        return 3.142 * radius * radius;
    }
}