package myboard.domain.comments;

public class Comments {
	private int id;
	private String content;
	private int boardId;
	private int memberId;
	
	public Comments() {
		// TODO Auto-generated constructor stub
	}

	public Comments(int id, String content, int boardId, int memberId) {
		super();
		this.id = id;
		this.content = content;
		this.boardId = boardId;
		this.memberId = memberId;
	}
	public Comments(String content, int boardId, int memberId) {
		super();
		this.content = content;
		this.boardId = boardId;
		this.memberId = memberId;
	}
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public int getBoardId() {
		return boardId;
	}

	public void setBoardId(int boardId) {
		this.boardId = boardId;
	}

	public int getMemberId() {
		return memberId;
	}

	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}
	
}
