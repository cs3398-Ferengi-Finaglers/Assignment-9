
package carcraft;


public class CarMain {

	public static void main(String[] args) {

		System.out.print("Starting:  Creating Cars without Decorator Pattern:\n");
                //Karen's addition:
                ICar car = new BasicCar();
                car.GetDescription();

                System.out.print("\nNow:  Creating Cars with Decorator Pattern:\n");
                //Karen's addition:
                ICar paintedCar = new PaintColor(new BasicCar());
                paintedCar.GetDescription();
	}

}

