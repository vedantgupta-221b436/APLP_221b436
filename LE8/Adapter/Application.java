
public class Application
{

public static void main(String args[])
{
    Crow crow=new IndianCrow();
    Swan crowadapter=new CrowAdapter(crow);
    client (crowadapter);

}
public static void client (Swan swan)
{
    swan.eat();
    swan.swim();
    swan.sing();
}
}

