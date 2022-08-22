package myboard.domain.boards;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import myboard.dto.BoardListDto;
import product.dto.OrderRespDto;


public class BoardsDao {
	private Connection conn;
	public BoardsDao() {
		// TODO Auto-generated constructor stub
	}
	public BoardsDao(Connection conn) {this.conn= conn;}

	public int insert(Boards boards) {
		int result = -1;
		try {
			StringBuilder sql = new StringBuilder();
			sql.append("INSERT INTO boards ");
			sql.append("VALUES(boards_seq.nextval,?,?,?)");
			
			PreparedStatement pstmt = conn.prepareStatement(sql.toString());
			
	
			pstmt.setString(1, boards.getTitle());
			pstmt.setString(2, boards.getContent());
			pstmt.setInt(3, boards.getMemberId());
			
			result = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}
	
	public ArrayList<Boards> findAll() {
		ArrayList<Boards> BoardsList = new ArrayList<>();
		try {
			
			PreparedStatement pstmt = conn.prepareStatement("SELECT * FROM boards ORDER BY id DESC");
			ResultSet rs = pstmt.executeQuery(); //Read(select)할때만 executeQuery를 쓴다.(commit을 안한다.)
		
			while(rs.next()) {
				Boards boards = new Boards();
				boards.setId(rs.getInt("id"));
				boards.setTitle(rs.getString("title"));
				boards.setContent(rs.getString("content"));
				boards.setMemberId(rs.getInt("memberId"));
				BoardsList.add(boards);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return BoardsList;
	}
	public Boards findByMemberId(int memberId) {
		Boards boards = new Boards();
		
		try {
			PreparedStatement pstmt = conn.prepareStatement("SELECT * FROM boards WHERE memberId="+memberId);
			ResultSet rs = pstmt.executeQuery();
			
			if(rs.next()) {
				boards.setId(rs.getInt("id"));
				boards.setTitle(rs.getString("title"));
				boards.setContent(rs.getString("content"));
				boards.setMemberId(rs.getInt("memberId"));
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return boards;
	}
	public int updateByContent(int id, String content) {
		int result = -1;
		
		try {
			StringBuilder sql = new StringBuilder();
			sql.append("UPDATE boards SET content=? ");
			sql.append("WHERE id = ?");
			PreparedStatement pstmt = conn.prepareStatement(sql.toString());
			pstmt.setString(1,content);
			pstmt.setInt(2, id);
			result = pstmt.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return result;
	}
	
	public int deleteById(int memberId, int id) {
		int result = -1;
			
		try {
			StringBuilder sql = new StringBuilder();
			sql.append("DELETE FROM boards WHERE memberId = ? ");
			sql.append("AND id=?");
			
			PreparedStatement pstmt = conn.prepareStatement(sql.toString());
			pstmt.setInt(1, memberId);
			pstmt.setInt(2, id);
			result = pstmt.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return result;
	}
	
	public BoardListDto findByIdToBorderList(int id) {
		BoardListDto dto = new BoardListDto();
		try {
			StringBuilder sql = new StringBuilder();
			sql.append("SELECT b.id,max(b.title) as title,max(m.username) as username,count(c.content) as content "); //join을 하여 임의의 테이블이 생겼을 때 임의의 클래스를 만들어야 한다.(DTO : Data Transfer Object)통신전달오브젝트
			sql.append("FROM boards b LEFT OUTER JOIN members m ");
			sql.append("on b.memberiD=m.id ");
			sql.append("LEFT OUTER JOIN comments c ");
			sql.append("on m.id = c.memberId ");
			sql.append("WHERE b.id = ? ");
			sql.append("group by b.id");
			
			
			PreparedStatement pstmt = conn.prepareStatement(sql.toString());
			pstmt.setInt(1, id);
			
			ResultSet rs = pstmt.executeQuery(); 
			while(rs.next()) {
				
				dto.setId(rs.getInt("id"));
				dto.setTitle(rs.getString("title"));
				dto.setUsername(rs.getString("username"));
				dto.setContent(rs.getInt("content"));
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return dto;
	}
}
