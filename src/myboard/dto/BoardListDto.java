package myboard.dto;

public class BoardListDto {
	private int id;
	/*
	private String 제목;
	private String 작성자;
	private int 댓글수;
	*/
	private String title;
	private String username;
	private int content;
	public BoardListDto() {
		// TODO Auto-generated constructor stub
	}
	public BoardListDto(int id, String title, String username, int content) {
		super();
		this.id = id;
		this.title = title;
		this.username = username;
		this.content = content;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public int getContent() {
		return content;
	}
	public void setContent(int content) {
		this.content = content;
	}
	
	/*
	public BoardListDto(int id, String 제목, String 작성자, int 댓글수) {
		super();
		this.id = id;
		this.제목 = 제목;
		this.작성자 = 작성자;
		this.댓글수 = 댓글수;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String get제목() {
		return 제목;
	}
	public void set제목(String 제목) {
		this.제목 = 제목;
	}
	public String get작성자() {
		return 작성자;
	}
	public void set작성자(String 작성자) {
		this.작성자 = 작성자;
	}
	public int get댓글수() {
		return 댓글수;
	}
	public void set댓글수(int 댓글수) {
		this.댓글수 = 댓글수;
	}
	*/
	
	
	
	
	
	
	
}
