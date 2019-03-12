
package carcraft;

public class PaintColor extends CarOptions
{
        public String SportWheels;


        @Override
        public String GetDescription()
        {
            return super.GetDescription() + " with " + SportWheels;
        }
}