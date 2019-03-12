
package carcraft;

public class AirScoop extends CarOptions
{
        public String AirScoop;


        @Override
        public String GetDescription()
        {
            return super.GetDescription() + " with " + AirScoop;
        }
}