package mycar;

public class Main {
    public static void main(String[] args) {
        ICar car1 = new BasicCar(); //car # 1 is a basic car
        car1.GetDescription();
        System.out.println("\n");
        ICar car2 = new PaintColor(new BasicCar()); // car #2 is a basic car painted
        car2.GetDescription();
        System.out.println("\n");
        ICar car3 = new SuperCharger(new BasicCar()); // car #3 is a basic car with a super charger
        car3.GetDescription();
        System.out.println("\n");
        ICar car4 = new AirScoop(new BasicCar()); // car #4 is a basic car with an air scoop
        car4.GetDescription();
        System.out.println("\n");
        ICar car5 = new SportWheels(new BasicCar()); // car #5 is a basic car with sport wheels
        car5.GetDescription();
        System.out.println("\n");
        ICar car6 = new PaintColor(new AirScoop(new BasicCar())); // car #6 is a basic car painted and wih an air scoop
        car6.GetDescription();
    }
}
