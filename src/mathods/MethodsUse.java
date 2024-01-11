package mathods;

public class MethodsUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodsUse mu = new MethodsUse();
		mu.a();
		b();
		mu.c(50, 6, "India");
		
		}
	//S
	public static void b() {
		System.out.println("===============================");
		System.out.println("Method b() is Static Method Without parameter");
		System.out.println("===============================");
		
	}
	//NS
	public void c(int runs, int over,String team) {
		System.out.println("===============================");
		
		System.out.println("Method c() is Non Static Method Without parameter");
		System.out.println("My Runs = "+runs);
		System.out.println("Over = "+over);
		System.out.println("My team name is = "+team);
		System.out.println("===============================");
			
	}
	public void a() {
		System.out.println("===============================");
		
		System.out.println("Method a() is Non Static Method Without parameter");
		System.out.println("===============================");
		
	}
}
