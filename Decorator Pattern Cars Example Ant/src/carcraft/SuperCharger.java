
package carcraft;

public class SuperCharger extends CarOptions  {

	public String SuperCharger;
        public SuperCharger(ICar icar)
        {
            super(icar);
        }

    @Override
    public void GetDescription()
  	{
    	SuperCharger = "Supercharger";
        System.out.print( " with " + SuperCharger + "\n");
  	}
}

