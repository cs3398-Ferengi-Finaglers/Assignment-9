
package carcraft;

public class SportWheels implements CarOptions
{
        public String SportWheels;


        @Override
        public String GetDescription()
        {
        	SportWheels = "SportWheels";
            return " with " + SportWheels;
        }
}