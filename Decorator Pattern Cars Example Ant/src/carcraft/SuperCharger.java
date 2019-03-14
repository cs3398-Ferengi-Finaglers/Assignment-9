
package carcraft;

public class SuperCharger extends CarOptions  {

	public String SuperCharger;
        public SuperCharger(ICar icar)
        {
            super(icar);
        }

    @Override
    public String GetDescription()
  	{
    	SuperCharger = "Supercharger";
        return " with " + SuperCharger;
  	}
}

