
package carcraft;

public class AirScoop extends CarOptions
{
        public String AirScoop;
        public AirScoop(ICar icar)
        {
            super(icar);
        }

        @Override
        public void GetDescription()
        {
        	AirScoop = " AirScoop";
            System.out.print( " with a super cool " + AirScoop);
        }
}
