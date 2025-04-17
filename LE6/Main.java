
public class Main
{
	public static void main(String[] args) {
	
	    Offering obj=new Tea();
	    Icecream ice=new Icecream(obj);
	    Rum rum =new Rum(ice);
	    Gin gin=new Gin(rum);
	    
	    
	    System.out.println(gin.getname());
	    System.out.println(gin.getprice());
	    
	}
}
