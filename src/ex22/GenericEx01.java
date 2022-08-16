package ex22;


class Box<T>{
	T data;
	public T getData() { return data;}
}

public class GenericEx01 {
	
	static Box getData(int num) {
		if(num==1) {
			return new Box<>();
		}else {
			return new Box<>();
		}
	}
	
	public static void main(String[] args) {

		Box<String> box1 = new Box<>();
		Box<Integer> box2 = new Box<>();
		
		box1.data="¤¾¤·";
		box2.data=2;
		
		System.out.println(box1.getData());
		System.out.println(box2.getData());
	}

}
