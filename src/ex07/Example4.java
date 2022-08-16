package ex07;

class Movie{
	private String title; //영화제목
	private double rate; //평점
	private String prod; //감독이름
	private int year; //발표연도
	
	Movie(String t, double r, String p, int y){
		title=t;
		rate=r;
		prod=p;
		year=y;
	}
	
	public void print() {
		System.out.println("영화 제목 : "+title);
		System.out.println("영화 평점 : "+rate+"점");
		System.out.println("감독 이름 : "+prod);
		System.out.println("발표 연도 : "+year+"년");
	}
}
public class Example4 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Movie m = new Movie("기생충",4.5,"봉준호",2020);
		
		m.print();
	}
}
