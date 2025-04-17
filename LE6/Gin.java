class Gin extends Decorator
{
    Gin(Offering offering)
    {
        this.offering=offering;
    }
    String getname()
    {
        return offering.getname()+" Gin";
    }
    int getprice()
    {
        return offering.getprice() + 50;
    }
}