package ex10;


class Animal{
	int num =10;
}
class Dog extends Animal{
	int num = 20;
}
public class Extends02 {

	public static void main(String[] args) {
		Dog d1 = new Dog(); //heap�޸𸮿� (d1->)DogŬ����,AnimalŬ���� ����
		System.out.println(d1.num); //DogŬ������ num�� ���´�.
		
		Animal d2 = new Dog(); //heap�޸𸮿� DogŬ����,(d2->)AnimalŬ���� ����
		System.out.println(d2.num); //�����Ͱ� AnimalŬ�����ϱ� 10�� ���´�.
	}

}
