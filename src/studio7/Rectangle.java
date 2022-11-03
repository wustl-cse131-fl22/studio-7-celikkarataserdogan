package studio7;

public class Rectangle {
	
	private double length;
	private double width;
	private boolean isSquare;



	public Rectangle(double l, double w) {
		
		this.length = l;
		this.width = w;
		
		this.isSquare = false;
		
	}
	
	public double Area() {
		return this.length * this.width;
	}
	
	public double Perimeter() {
		return 2 * this.length + 2 * this.width;
	}
	
	public boolean IsSquare() {
		return length == width;
	}
	

	public static void main(String[] args) {

		Rectangle rec1 = new Rectangle(5.0, 6.0);
		System.out.println(rec1.Area());
		
		Rectangle rec2 = new Rectangle(9.0, 10.0);		

		System.out.println(rec1.Area());
		System.out.println(rec2.Area());
		
		System.out.println(rec1.Perimeter());
		System.out.println(rec2.Perimeter());

	}

}
