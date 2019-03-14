
package carcraft;

public class SportWheels extends CarOptions
{
        public String SportWheels = "Sport Wheels";
        public SportWheels(ICar icar)
        {
            super(icar);
        }

        @Override
        public void GetDescription()
        {
            super.GetDescription();;
            System.out.print( " with " + SportWheels);
        }
}
