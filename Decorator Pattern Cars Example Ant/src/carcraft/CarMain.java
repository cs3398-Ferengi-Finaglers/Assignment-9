
package carcraft;


public class CarMain {

	public static void main(String[] args) {

		System.out.print("Starting:  Creating Cars without Decorator Pattern:\n\n");
                //Karen's addition:
                ICar car = new BasicCar();
                car.GetDescription();

                System.out.print("\n===========================================\n");
                System.out.print("Now:  Creating Cars with Decorator Pattern:\n\n");
                //Karen's addition:
                ICar paintedCar = new PaintColor(new BasicCar());
                paintedCar.GetDescription();
                System.out.print("\n");
                ICar paintedAndSuperChargedCar = new PaintColor(new SuperCharger(new BasicCar()));
                paintedAndSuperChargedCar.GetDescription();
                
	}

}

