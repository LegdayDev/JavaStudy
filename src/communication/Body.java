package communication;

public class Body {
	private String dataType;
	private Items items;
	private int pageNo;
	private int numOfRows;
	private int totalCoung;
	

	public Body() {
		// TODO Auto-generated constructor stub
	}
	
	public Body(String dataType, Items items, int pageNo, int numOfRows, int totalCoung) {
		super();
		this.dataType = dataType;
		this.items = items;
		this.pageNo = pageNo;
		this.numOfRows = numOfRows;
		this.totalCoung = totalCoung;
	}

	public String getDataType() {
		return dataType;
	}
	public void setDataType(String dataType) {
		this.dataType = dataType;
	}
	public Items getItems() {
		return items;
	}
	public void setItems(Items items) {
		this.items = items;
	}
	public int getPageNo() {
		return pageNo;
	}
	public void setPageNo(int pageNo) {
		this.pageNo = pageNo;
	}
	public int getNumOfRows() {
		return numOfRows;
	}
	public void setNumOfRows(int numOfRows) {
		this.numOfRows = numOfRows;
	}
	public int getTotalCoung() {
		return totalCoung;
	}
	public void setTotalCoung(int totalCoung) {
		this.totalCoung = totalCoung;
	}
	
	
}
