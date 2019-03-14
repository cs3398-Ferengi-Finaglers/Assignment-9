
package carcraft;

public class BasicCar implements ICar {

    public BasicCar() {
		System.out.print("BasicCar is built!\n");
	}

    @Override
    public void GetDescription() {
        System.out.print("This is a Basic Car description.\n");
    }
}

