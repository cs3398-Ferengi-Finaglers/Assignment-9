package mycar;

public class CarOptions implements ICar {
    private ICar car;
    public CarOptions(ICar myCar){
        car = myCar;
    }
    @Override
    public void GetDescription(){
        car.GetDescription();
    }
}
