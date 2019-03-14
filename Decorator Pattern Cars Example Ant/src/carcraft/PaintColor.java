
package carcraft;

public class PaintColor extends CarOptions
{
        public String Color = "blue";
        
        public PaintColor(ICar icar)
        {
            super(icar);
        }

        @Override
        public String GetDescription()
        {
            super.GetDescription();
            return "Car now is " + Color + " color";
        }
}