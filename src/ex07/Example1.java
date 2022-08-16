package ex07;

class Rectangle{
	private double width;
	private double height;
	
	Rectangle(double w, double h){
		width = w;
		height=h;
	}
	public double area(){
		return width*height;
	}
	public double perimeter() {
		return (width*2)+(height*2);
	}
	@Override
	public String toString() {
		return "Rectangle [width=" + width + ", height=" + height + "]";
	}
	
}
public class Example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle rect = new Rectangle(10,20);
		
		System.out.println(rect.toString());
		System.out.println("사각형의 넓이는 : "+rect.area());
		System.out.println("사각형의 둘레는 : "+rect.perimeter());
	}

}
