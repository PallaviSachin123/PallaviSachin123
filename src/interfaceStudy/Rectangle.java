package interfaceStudy;

public class Rectangle implements Area {
	

	public static void main(String[] args) {
		Area a;
		a = new Rectangle();
		a.calcArea();
		// TODO Auto-generated method stub

	}

	@Override
	public void calcArea() {
		int l = 20;
		int b = 10;
		int area = l*b;
		System.out.println("Area of Rectangle is = "+area);
	}

}
