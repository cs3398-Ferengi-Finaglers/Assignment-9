
package carcraft;

public class AirScoop extends CarOptions
{
        public String AirScoop = "Air Scoop";
        public AirScoop(ICar icar)
        {
            super(icar);
        }

        @Override
        public void GetDescription()
        {
            super.GetDescription();
            System.out.print( " with a super cool " + AirScoop + "\n");
        }
}
