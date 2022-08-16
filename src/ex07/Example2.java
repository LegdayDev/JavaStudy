package ex07;

class Date{
	private int year;
	private int month;
	private int day;
	
	Date(int y, int m, int d){
		year = y;
		month = m;
		day = d;
	}
	public void print1() {
		System.out.println(year+"."+month+"."+day);
	}
	public void print2() {
		String []monthString = 
			{"January","February","March","April","May","June","July","August","September","October","November","December"};
		for(int i=0;i<12;i++) {
			if(i+1==month)
				System.out.println(monthString[i]+" "+day+", "+year);
		}
	}
}
public class Example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date userDate = new Date(2022,8,22);
		
		userDate.print1();
		userDate.print2();

	}

}
