
package carcraft;

public class PaintColor extends CarOptions
{
        public String AirScoop;


        @Override
        public String GetDescription()
        {
            return super.GetDescription() + " with " + AirScoop;
        }
}