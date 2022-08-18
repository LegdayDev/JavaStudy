package product.domain.orders;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import product.dto.OrderRespDto;


public class OrdersDao {
	private Connection conn;
	public OrdersDao() {}
	public OrdersDao(Connection conn) {this.conn=conn;}
	
	//주문하기,주문취소
	public int insert(Orders orders) {
		int result = -1;
		
		try {
			StringBuilder sql = new StringBuilder();
			sql.append("INSERT INTO orders ");
			sql.append("VALUES(orders_seq.nextval,?,?)");
			
			PreparedStatement pstmt = conn.prepareStatement(sql.toString());
			
	
			pstmt.setInt(1, orders.getCustomerId());
			pstmt.setInt(2, orders.getProductd());

			
			result = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return result;
	}
	public Orders fintById(int id) {
		Orders orders = new Orders();
		
		try {
			PreparedStatement pstmt = conn.prepareStatement("SELECT * FROM orders WHERE id="+id);
			ResultSet rs = pstmt.executeQuery();
			
			if(rs.next()) {
				orders.setId(rs.getInt("id"));
				orders.setCustomerId(id);
				orders.setProductd(id);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return orders;
	}
	
	public ArrayList<Orders> findAll() {
		ArrayList<Orders> ordersList = new ArrayList<>();
		try {
			
			PreparedStatement pstmt = conn.prepareStatement("SELECT * FROM orders ORDER BY id DESC");
			ResultSet rs = pstmt.executeQuery(); //Read(select)할때만 executeQuery를 쓴다.(commit을 안한다.)
		
			while(rs.next()) {
				Orders orders = new Orders();
				orders.setId(rs.getInt("id"));
				orders.setCustomerId(rs.getInt("customerid"));
				orders.setProductd(rs.getInt("productid"));
				ordersList.add(orders);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ordersList;
	}
	public int updateById(int id, Orders orders) {
		int result = -1;
		
		try {
			StringBuilder sql = new StringBuilder();
			sql.append("UPDATE orders SET customerid=?, productid=?");
			sql.append("WHERE id = ?");
			PreparedStatement pstmt = conn.prepareStatement(sql.toString());
			pstmt.setInt(1,orders.getCustomerId());
			pstmt.setInt(2,orders.getProductd());
			pstmt.setInt(3,id);

			result = pstmt.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return result;
	}
	public int deleteById(int id) {
		int result = -1;
			
		try {
			StringBuilder sql = new StringBuilder();
			sql.append("DELETE FROM orders WHERE id = ?");
			
			PreparedStatement pstmt = conn.prepareStatement(sql.toString());
			pstmt.setInt(1, id);
			result = pstmt.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return result;
	}
	public ArrayList<OrderRespDto> findByIdToOrderList(int customerId) {
		ArrayList<OrderRespDto> dtoList = new ArrayList<>();
		try {
			StringBuilder sql = new StringBuilder();
			sql.append("select o.id, c.username, p.name, p.price"); //join을 하여 임의의 테이블이 생겼을 때 임의의 클래스를 만들어야 한다.(DTO : Data Transfer Object)통신전달오브젝트
			sql.append("from orders o ");
			sql.append("INNER JOIN customer c ");
			sql.append("OON o.customerId = c.id ");
			sql.append("INNER JOIN product p ");
			sql.append("ON o.productId = p.id ");
			sql.append("WHERE c.id = ?");
			
			PreparedStatement pstmt = conn.prepareStatement(sql.toString());
			pstmt.setInt(1, customerId);
			
			ResultSet rs = pstmt.executeQuery(); 
			while(rs.next()) {
				OrderRespDto dto = new OrderRespDto();
				dto.setId(rs.getInt("id"));
				dto.setUsername(rs.getString("username"));
				dto.setName(rs.getString("name"));
				dto.setPrice(rs.getInt("price"));
				dtoList.add(dto);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return dtoList;
	}
	
	
}
