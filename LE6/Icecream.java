class Icecream extends Decorator
{
    Icecream(Offering offering)
    {
        this.offering=offering;
    }
    String getname()
    {
        return offering.getname() + " Icecream";
    }
    int getprice()
    {
        return offering.getprice() + 30;
    }
}