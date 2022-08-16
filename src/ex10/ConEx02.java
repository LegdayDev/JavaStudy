package ex10;

class ÇÜ¹÷{
	String name;
	
	public ÇÜ¹÷() {
	}
	public ÇÜ¹÷(String name) {
		this.name = name;
	}
}

class ´õºíÄ¡ÁîÇÜ¹÷ extends ÇÜ¹÷{
	
	public ´õºíÄ¡ÁîÇÜ¹÷(String name) {
		super(name);
	}
	public ´õºíÄ¡ÁîÇÜ¹÷() {
		super("");
	}
}
public class ConEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		´õºíÄ¡ÁîÇÜ¹÷ s = new ´õºíÄ¡ÁîÇÜ¹÷("´õºíÄ¡Áî");
		System.out.println(s.name);
		
		´õºíÄ¡ÁîÇÜ¹÷ h = new ´õºíÄ¡ÁîÇÜ¹÷();
		System.out.println(h.name);
	}

}
