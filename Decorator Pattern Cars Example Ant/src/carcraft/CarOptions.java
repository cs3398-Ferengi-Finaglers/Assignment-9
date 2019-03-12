
package carcraft;

public class CarOptions extends ICar
{

        @Override
        public String GetDescription()
        {
            return super.GetDescription() + " with " + Color + " color";
        }
}