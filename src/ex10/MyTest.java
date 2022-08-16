package ex10;
abstract class Unit{
	abstract void unitAttack(int a);
	abstract int power();
	abstract void print();
}
class Zealot extends Unit{
	int power = 5;
	int hp = 100;
	public int power() {return power;}
	public void unitAttack(int a) {hp-=a;}
	public void print() {
		 System.out.println("Zealot�� hp �� " + hp);
	}
}
class Dragoon extends Unit {
	int power = 10;
	int hp = 100;
	public int power() {return power;}
	public void unitAttack(int a) {hp-=a;}
	public void print() {
		 System.out.println("Dragoon�� hp �� " + hp);
	}
}
class River extends Unit{
	int power = 50;
	int hp = 100;
	public int power() {return power;}
	public void unitAttack(int a) {hp-=a;}
	public void print() {
		 System.out.println("River�� hp �� " + hp);
	}
}
public class MyTest {
	static void attack(Unit a, Unit b) {
		b.unitAttack(a.power());
		b.print();
	}
	
	public static void main(String[] args) {
		Unit z1 = new Zealot();
		Unit d1 = new Dragoon();
		Unit r1 = new River();

		System.out.println("������ ����� ����");
		attack(z1,d1);
		System.out.println();
		
		System.out.println("������ ���� ����");
		attack(z1,r1);
		System.out.println();
		
		System.out.println("����� ������ ����");
		attack(d1,z1);
		System.out.println();
		
		System.out.println("����� ������ ����");
		attack(d1,r1);
		System.out.println();
		
		System.out.println("������ ������ ����");
		attack(r1,z1);
		System.out.println();
		
		System.out.println("������ ����� ����");
		attack(r1,d1);

	}
}
