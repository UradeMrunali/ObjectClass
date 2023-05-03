class A
{	
}
class B extends A
{	
}
public class Test {
 public static void main(String[] args) {
	 A a = new B();      //upcasting
	 B b = (B) new A();  //downcasting
	 
Object o = new A();
// object class reference can hold data of any type	 
	 Object d=101; //int type
	 int w=(int) d; //downcasting
	 
	 d="hii";      //String type
	 d=20.47;      //float type 
 }
}
