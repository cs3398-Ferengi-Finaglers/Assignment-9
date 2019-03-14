package mycar;

public class PaintColor extends CarOptions {
    public PaintColor(ICar myCar){
        super(myCar);
    }
    public void GetDescription(){
        super.GetDescription();
        System.out.println("With an Addition of Color");
    }
}