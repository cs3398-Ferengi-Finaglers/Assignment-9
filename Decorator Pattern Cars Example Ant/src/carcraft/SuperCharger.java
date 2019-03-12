
package carcraft;

public class SuperCharger extends CarOptions  {

	public String SuperCharger;

    @Override
    public String GetDescription()
  	{
        return super.GetDescription() + " with " + SuperCharger;
  	}
}

