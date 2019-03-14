//Karen's work:
package carcraft;

public class PaintColor extends CarOptions
{
        public String color = "blue";
        
        public PaintColor(ICar icar)
        {
            super(icar);
        }

        @Override
        public void GetDescription()
        {
            super.GetDescription();
            System.out.print("Car now is painted a " + color + " color.\n");
        }
}