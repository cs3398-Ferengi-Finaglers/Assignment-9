
package carcraft;

public class SportWheels extends CarOptions
{
        public String SportWheels;
        public SportWheels(ICar icar)
        {
            super(icar);
        }

        @Override
        public void GetDescription()
        {
        	SportWheels = "SportWheels";
            System.out.print( " with " + SportWheels);
        }
}