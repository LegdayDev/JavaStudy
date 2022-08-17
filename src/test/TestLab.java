package test;


class 코치{
	private 선수 person;
	
	public 코치() {
		this.person = new 선수();
	}
	
	public void drinkWater() {
		this.person.drink();
	}
}
class 선수{
	public void drink() {System.out.println("물마시기");}
}
public class TestLab {

	public static void main(String[] args) {
	
	}

}
