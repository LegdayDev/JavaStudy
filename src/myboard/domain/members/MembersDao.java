package myboard.domain.members;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;


public class MembersDao {

	private Connection conn;
	public MembersDao() {}
	public MembersDao(Connection conn) {this.conn = conn;}
	
	public int insert(Members members) {
		int result = -1;
		try {
			StringBuilder sql = new StringBuilder();
			sql.append("INSERT INTO members ");
			sql.append("VALUES(members_seq.nextval,?,?)");
			
			PreparedStatement pstmt = conn.prepareStatement(sql.toString());
	
			pstmt.setString(1, members.getUsername());
			pstmt.setString(2, members.getPassword());
	
			
			result = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}
	
	public ArrayList<Members> findAll() {
		ArrayList<Members> membersList = new ArrayList<>();
		try {
			
			PreparedStatement pstmt = conn.prepareStatement("SELECT * FROM members ORDER BY id DESC");
			ResultSet rs = pstmt.executeQuery(); //Read(select)할때만 executeQuery를 쓴다.(commit을 안한다.)
		
			while(rs.next()) {
				Members members = new Members();
				members.setId(rs.getInt("id"));
				members.setUsername(rs.getString("username"));
				members.setPassword(rs.getString("password"));
				membersList.add(members);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return membersList;
	}
	public Members findByMemberUserName(String username) {
		Members members = new Members();
		
		try {
			PreparedStatement pstmt = conn.prepareStatement("SELECT * FROM members WHERE username="+username);
			ResultSet rs = pstmt.executeQuery();
			
			if(rs.next()) {
				members.setId(rs.getInt("id"));
				members.setUsername(rs.getString("username"));
				members.setPassword(rs.getString("password"));
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return members;
	}//
	public int updateByUsername(String username, String content) {
		int result = -1;
		
		try {
			StringBuilder sql = new StringBuilder();
			sql.append("UPDATE members SET content=? ");
			sql.append("WHERE usernmae = ?");
			PreparedStatement pstmt = conn.prepareStatement(sql.toString());
			pstmt.setString(1,content);
			pstmt.setString(2, username);
			result = pstmt.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return result;
	}
	
	public int deleteByUsername(String username) {
		int result = -1;
			
		try {
			StringBuilder sql = new StringBuilder();
			sql.append("DELETE FROM members WHERE username = ?");
			
			PreparedStatement pstmt = conn.prepareStatement(sql.toString());
			pstmt.setString(1, username);
			result = pstmt.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return result;
	}
	
}
