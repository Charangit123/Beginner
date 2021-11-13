package practicePrrogram;

public class DataType {
	static  byte vn;
	static float y=34.09f;
	static boolean it;
	static char r;
	public static void main(String[] args) {
		
System.out.println("Default value "	 +vn);
vn=5;

System.out.println("Actual value " +vn);
System.out.println("Size " + (Byte.SIZE/8) + " bytes");
System.out.println("Min Value " +Byte.MIN_VALUE);
System.out.println("Max Value " +Byte.MAX_VALUE);
	//interger
System.out.println("			Default value "	 +vn);
vn=34;

System.out.println("Actual value " +vn);
System.out.println("Size " + (Integer.SIZE/8) + " bytes");
System.out.println("Min Value " +Integer.MIN_VALUE);
System.out.println("Max Value " +Integer.MAX_VALUE);
//float

System.out.println("			Default value "	 +y);


System.out.println("Actual value " +y);
System.out.println("Size " + (Float.SIZE/8) + " bytes");
System.out.println("Min Value " +Float.MIN_VALUE);
System.out.println("Max Value " +Float.MAX_VALUE);
//boolean

System.out.println("			Default value "	 +it);
it= true;

System.out.println("Actual value " +it);
//char
	System.out.println("			Default value "	 +r);
r='D';

	System.out.println("Actual value " +r);
}
	}
