
package carcraft;

public class SuperCharger extends CarOptions  {

	public String SuperCharger "Super Charger";
        public SuperCharger(ICar icar)
        {
            super(icar);
        }

    @Override
    public void GetDescription()
  	{
    	super.GetDescription();
        System.out.print( " with " + SuperCharger + "\n");
  	}
}

