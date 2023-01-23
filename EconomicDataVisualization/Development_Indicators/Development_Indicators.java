package Development_Indicators;

interface indicator{
    void setvalue(double val);
    void setyear(int year);

    int getyear();
    double getvalue();
}
public abstract class Development_Indicators implements indicator{
    protected double value;
    protected int year;

    @Override
    public double getvalue(){
        return this.value;
    }
    @Override
    public int getyear(){
        return this.year;
    }


}