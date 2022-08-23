package publicdata;

public class Response {
	private Header header;
	private Body body;
	
	public Response() {
		// TODO Auto-generated constructor stub
	} 
	
	public Response(Header header, Body body) {
		super();
		this.header = header;
		this.body = body;
	}

	public Header getHeader() {
		return header;
	}
	public void setHeader(Header header) {
		this.header = header;
	}
	public Body getBody() {
		return body;
	}
	public void setBody(Body body) {
		this.body = body;
	}
	
}
