
public class Main
{
	public static void main(String[] args) {
    Mother m1= new Child();
    m1.show();
    Child ch= new Child();
    ch.show();
	}
}

//result without making show function static 
//from Child
//from child 

//result after making show fn of mother class static 
//error: show() in Child cannot override show() in Mother
//     void show()
//          ^
//   overridden method is static
// 1 error

//result after making show fn of child static
//Child.java:3: error: show() in Child cannot override show() in Mother
//   public static void show()
//                       ^
//   overriding method is static
// 1 error

//result after making show fn of mother and child class static
// from Mother
// from child