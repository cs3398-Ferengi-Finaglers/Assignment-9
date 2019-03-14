package mycar;

public class SuperCharger extends CarOptions {
    public SuperCharger(ICar myCar){
        super(myCar);
    }
    public void GetDescription(){
        super.GetDescription();
        System.out.println("With an Addition of a Supercharger");
    }
}
