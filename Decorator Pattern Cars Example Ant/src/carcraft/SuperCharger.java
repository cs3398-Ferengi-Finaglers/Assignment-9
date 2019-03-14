
package carcraft;

public class SuperCharger implements CarOptions  {

	public String SuperCharger;

    @Override
    public String GetDescription()
  	{
    	SuperCharger = "Supercharger";
        return " with " + SuperCharger;
  	}
}

