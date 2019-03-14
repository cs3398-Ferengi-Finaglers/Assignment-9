
package carcraft;

public class PaintColor implements CarOptions
{
        public String Color = "blue";


        @Override
        public String GetDescription()
        {
            return " with " + Color + " color";
        }
}