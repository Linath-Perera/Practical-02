import p1.*;
import p1.p3.*;
//import p2.class2;
//import p2.class3;
import p2.*; //import all the classes under the package p2tree
class App
{
	public static void main(String[] ar)
	{
		MyClass mc=new MyClass();
		mc.display();
		
		class2 c2=new class2();
		c2.display();
		
		class3 c3=new class3();
		c3.display();
		
		class4 c4=new class4();
		c4.display();
	}
}