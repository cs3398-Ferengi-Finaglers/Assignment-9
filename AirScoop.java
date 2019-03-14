package mycar;

public class AirScoop extends CarOptions {
    public AirScoop(ICar myCar){
        super(myCar);
    }
    public void GetDescription(){
        super.GetDescription();
        System.out.println("With an Addition of AirScoop");
    }
}