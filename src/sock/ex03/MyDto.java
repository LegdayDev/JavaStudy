package sock.ex03;

public class MyDto {
	private int code; // 1: ��ż��� -1:��Ž���
	private String msg; // ����� ��� �ƴ��� ����
	private String data; //���� �����͸� ����
	
	public MyDto() {}

	public MyDto(int code, String msg, String data) {
		this.code = code;
		this.msg = msg;
		this.data = data;
	}

	public int getCode() {return code;}

	public void setCode(int code) {this.code = code;}

	public String getMsg() {return msg;}

	public void setMsg(String msg) {this.msg = msg;}

	public String getData() {return data;}

	public void setData(String data) {this.data = data;}
	
}
