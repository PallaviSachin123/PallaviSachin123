package interfaceStudy;

public class Circle implements Area {

	public static void main(String[] args) {
		Area a;
		a = new Circle();
		a.calcArea();
	}

	@Override
	public void calcArea() {
		float r =2.5f;
		float area = PI * r * r;
		System.out.println("Area of Circle is = "+area);
		
	}

}
