//Calling static methods from difference class
package mathods;

public class CallMethodFromDiffClass {

	public static void main(String[] args) {
		demo();
		demo1();
		CallMethodFromDiffClass1.sample();
		CallMethodFromDiffClass1.sample1();
		
	}
	public static void demo() {
		System.out.println("This demo() method is from class CallMethodFromDiffClass");
	}
	public static void demo1() {
		System.out.println("This demo1() method is from class CallMethodFromDiffClass");
	}

}
