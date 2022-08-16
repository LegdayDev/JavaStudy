package ex07;
class ComplexNum{
	private int real;
	private int imag;
	public int getReal() {
		return real;
	}
	public void setReal(int real) {
		this.real = real;
	}
	public int getImag() {
		return imag;
	}
	public void setImag(int imag) {
		this.imag = imag;
	}
	public void print() {
		System.out.println(real+"+"+imag+"i");
	}
}
public class Example3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ComplexNum cn = new ComplexNum();
		
		cn.setImag(3);
		cn.setReal(4);
		
		cn.print();
	}
}
