package ex09;

class Date{
	private int year;
	private String month;
	private int day;
	
	public Date() {
		month = "1¿ù";
		day = 1;
		year = 2009;
	}
	public Date(int year, String month, int day) {	setDate(year, month, day);}
	public Date(int year) {	setDate(year, "1¿ù", 1);}
	
	public void setDate(int year, String month, int day) {
		this.year = year;
		this.month = month;
		this.day = day;
	}
	@Override
	public String toString() {
		return "Date [year=" + year + ", month=" + month + ", day=" + day + "]";
	}
	
}
public class DateTest {

	public static void main(String[] args) {
		Date date1 = new Date(2009, "3¿ù", 2);
		Date date2 = new Date(2010);
		Date date3 = new Date();
		
		System.out.println(date1.toString());
		System.out.println(date2.toString());
		System.out.println(date3.toString());
	}

}
