package product.domain.product;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;


public class ProductDao {
	private Connection conn;
	public ProductDao() {	}
	public ProductDao(Connection conn) {this.conn= conn;}
	
	public int insert(Product product) {
		int result = -1;
		
		try {
			StringBuilder sql = new StringBuilder();
			sql.append("INSERT INTO product ");
			sql.append("VALUES(product_seq.nextval,?,?,?)");
			
			PreparedStatement pstmt = conn.prepareStatement(sql.toString());
			
	
			pstmt.setString(1, product.getName());
			pstmt.setInt(2, product.getPrice());
			pstmt.setInt(3, product.getQty());
			
			result = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return result;
	}
	
	public ArrayList<Product> findAll() {
		ArrayList<Product> productList = new ArrayList<>();
		try {
			
			PreparedStatement pstmt = conn.prepareStatement("SELECT * FROM customer ORDER BY id DESC");
			ResultSet rs = pstmt.executeQuery(); //Read(select)할때만 executeQuery를 쓴다.(commit을 안한다.)
		
			while(rs.next()) {
				Product product = new Product();
				product.setId(rs.getInt("id"));
				product.setName(rs.getString("name"));
				product.setPrice(rs.getInt("price"));
				product.setQty(rs.getInt("qty"));
				productList.add(product);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return productList;
	}
	public Product fintById(int id) {
		Product product = new Product();
		
		try {
			PreparedStatement pstmt = conn.prepareStatement("SELECT * FROM product WHERE id="+id);
			ResultSet rs = pstmt.executeQuery();
			
			if(rs.next()) {
				product.setId(rs.getInt("id"));
				product.setName(rs.getString("name"));
				product.setPrice(rs.getInt("price"));
				product.setQty(rs.getInt("qty"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return product;
	}
	public int updateByName(int id, Product product) {
		int result = -1;
		
		try {
			StringBuilder sql = new StringBuilder();
			sql.append("UPDATE product SET name=?, price=?, qty=? ");
			sql.append("WHERE id = ?");
			PreparedStatement pstmt = conn.prepareStatement(sql.toString());
			pstmt.setString(1,product.getName());
			pstmt.setInt(2,product.getPrice());
			pstmt.setInt(3,product.getQty());
			pstmt.setInt(4, id);
			result = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return result;
	}
	public int updateByIdToQty(int id) {
		int result = -1;
		try {
			StringBuilder sql = new StringBuilder();
			sql.append("UPDATE product SET qty=qty-1 ");
			sql.append("WHERE id = ?");
			PreparedStatement pstmt = conn.prepareStatement(sql.toString());

			pstmt.setInt(1,id);
			pstmt.setInt(2,id);
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
			sql.append("DELETE FROM product WHERE id = ?");
			PreparedStatement pstmt = conn.prepareStatement(sql.toString());
			pstmt.setInt(1, id);
			result = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}
	
	
	
	
	
}
