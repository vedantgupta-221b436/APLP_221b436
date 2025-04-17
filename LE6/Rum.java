class Rum extends Decorator
{
    Rum(Offering offering)
    {
        this.offering=offering;
    }
    String getname()
    {
        return offering.getname()+" Rum";
    }
    int getprice()
    {
        return offering.getprice() + 70;
    }
}