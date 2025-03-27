abstract class Beverage
{
    protected void pour(int qty)
    {
     System.out.println("pour "+qty+" ml of "+this.getClass().getName());
    }
    protected abstract void addCondiment();
    protected void stir(){}
    protected void serve()
    {
        System.out.println("serve through waiter");
    }
    public void templateMethod(int qty)
    {
        pour(qty);
        addCondiment();
        stir();
        serve();
    }
    
}
