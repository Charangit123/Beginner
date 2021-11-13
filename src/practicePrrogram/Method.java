package practicePrrogram;

public class Method {

	public static void main(String[] args) {
sayHello();
sayHello();
method2();
sayHello();
taxi("uber");
sayHello();
int y= add(2,3);
System.out.println(y);

	}
public static void sayHello() {
System.out.println("Saicharan");	
} ;
public static void method2() {
	
	System.out.println("test2");
}
// with parAMETRS
public static void taxi(String name) {
	System.out.println("call "+name);
}
//WITH parametrs and return type
public static int add(int i,int j) {
	int k=i+j;
	return k;

}
}
