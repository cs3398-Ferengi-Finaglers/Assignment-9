
package carcraft;

public class AirScoop implements CarOptions
{
        public String AirScoop;


        @Override
        public String GetDescription()
        {
        	AirScoop = " AirScoop";
            return " with " + AirScoop;
        }
}