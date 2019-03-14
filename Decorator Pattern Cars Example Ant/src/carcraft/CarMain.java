
package carcraft;


public class CarMain {

	public static void main(String[] args) {

		System.out.print("Starting:  Creating Cars without Decorator Pattern:\n");
                ICar car = new BasicCar();
                car.GetDescription();
		//System.out.println("Make a Supercharged Basic Car:");
		//ICar carWithSuperCharger = new CarWithSuperCharger();
		//System.out.println("Done. " + carWithSuperCharger.GetDescription());
		
		//System.out.println("\nMake a Painted Supercharged Basic Car:");
	//	ICar paintedCarWithSuperCharger = new PaintedCarWithSuperCharger("Blue");
		
		//System.out.println("Done. " + paintedCarWithSuperCharger.GetDescription());
                System.out.print("\nNow:  Creating Cars with Decorator Pattern:\n");
                //Karen's addition:
                ICar paintedCar = new PaintColor(new BasicCar());
                paintedCar.GetDescription();
	}

}

