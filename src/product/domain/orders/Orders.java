package product.domain.orders;

public class Orders {
	private int id;
	private int customerId;
	private int productd;
	
	public Orders() {
		// TODO Auto-generated constructor stub
	}

	public Orders(int id, int customerid, int productid) {
		super();
		this.id = id;
		this.customerId = customerid;
		this.productd = productid;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public int getProductd() {
		return productd;
	}

	public void setProductd(int productd) {
		this.productd = productd;
	}
	
}
