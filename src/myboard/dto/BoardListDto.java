package myboard.dto;

public class BoardListDto {
	private int id;
	/*
	private String ����;
	private String �ۼ���;
	private int ��ۼ�;
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
	public BoardListDto(int id, String ����, String �ۼ���, int ��ۼ�) {
		super();
		this.id = id;
		this.���� = ����;
		this.�ۼ��� = �ۼ���;
		this.��ۼ� = ��ۼ�;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String get����() {
		return ����;
	}
	public void set����(String ����) {
		this.���� = ����;
	}
	public String get�ۼ���() {
		return �ۼ���;
	}
	public void set�ۼ���(String �ۼ���) {
		this.�ۼ��� = �ۼ���;
	}
	public int get��ۼ�() {
		return ��ۼ�;
	}
	public void set��ۼ�(int ��ۼ�) {
		this.��ۼ� = ��ۼ�;
	}
	*/
	
	
	
	
	
	
	
}
