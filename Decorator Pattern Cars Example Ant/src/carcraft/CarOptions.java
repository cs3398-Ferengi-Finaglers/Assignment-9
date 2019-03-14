
package carcraft;

abstract class CarOptions implements ICar
{
    ICar icar;
    public CarOptions(ICar icar)
    {
        this.icar = icar;
    }

    @Override
    public String GetDescription()
    {
        return this.icar.GetDescription();
    }
}