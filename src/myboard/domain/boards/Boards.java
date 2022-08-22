package myboard.domain.boards;

public class Boards {
	private int id;
	private String title;
	private String content;
	private int memberId;
	
	public Boards() {
		// TODO Auto-generated constructor stub
	}

	public Boards(int id, String title, String content, int memberId) {
		super();
		this.id = id;
		this.title = title;
		this.content = content;
		this.memberId = memberId;
	}
	public Boards(String title, String content, int memberId) {
		super();
		this.title = title;
		this.content = content;
		this.memberId = memberId;
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

	public String getContent() {
		return content;
	}

	public void setContent(String comment) {
		this.content = comment;
	}

	public int getMemberId() {
		return memberId;
	}

	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}
	
}
