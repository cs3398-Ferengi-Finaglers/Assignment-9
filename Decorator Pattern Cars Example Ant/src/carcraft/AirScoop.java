
package carcraft;

public class AirScoop extends CarOptions
{
        public String AirScoop;
        public AirScoop(ICar icar)
        {
            super(icar);
        }

        @Override
        public String GetDescription()
        {
        	AirScoop = " AirScoop";
            return " with " + AirScoop;
        }
}