package mycar;

public class SportWheels extends CarOptions {
    public SportWheels(ICar myCar) {
        super(myCar);
    }

    public void GetDescription() {
        super.GetDescription();
        System.out.println("With an Addition of Sport Wheels");
    }
}