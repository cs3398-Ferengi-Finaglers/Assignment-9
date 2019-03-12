
package carcraft;

public class SportWheels extends CarOptions
{
        public String SportWheels;


        @Override
        public String GetDescription()
        {
            return super.GetDescription() + " with " + SportWheels;
        }
}