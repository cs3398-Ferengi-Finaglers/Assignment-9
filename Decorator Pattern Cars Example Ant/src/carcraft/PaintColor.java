
package carcraft;

public class PaintColor extends CarOptions
{
        public String Color;


        @Override
        public String GetDescription()
        {
            return super.GetDescription() + " with " + Color + " color";
        }
}