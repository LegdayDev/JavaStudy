package myboard.domain.comments;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import myboard.domain.boards.Boards;

public class CommentsDao {
	private Connection conn;
	public CommentsDao() {}
	public CommentsDao(Connection conn) {this.conn = conn;}
	
	public int insert(Comments comments) {
		int result = -1;
		try {
			StringBuilder sql = new StringBuilder();
			sql.append("INSERT INTO comments ");
			sql.append("VALUES(comments_seq.nextval,?,?,?)");
			
			PreparedStatement pstmt = conn.prepareStatement(sql.toString());
			
	
			pstmt.setString(1, comments.getContent());
			pstmt.setInt(2, comments.getBoardId());
			pstmt.setInt(3, comments.getMemberId());
			
			result = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}
	
	public ArrayList<Comments> findAll() {
		ArrayList<Comments> commentsList = new ArrayList<>();
		try {
			
			PreparedStatement pstmt = conn.prepareStatement("SELECT * FROM comments ORDER BY id DESC");
			ResultSet rs = pstmt.executeQuery(); //Read(select)할때만 executeQuery를 쓴다.(commit을 안한다.)
		
			while(rs.next()) {
				Comments commets = new Comments();
				commets.setId(rs.getInt("id"));
				commets.setContent(rs.getString("content"));
				commets.setBoardId(rs.getInt("boardId"));
				commets.setMemberId(rs.getInt("memberId"));
				commentsList.add(commets);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return commentsList;
	}
	public Comments findByBoardId(int id) {
		Comments comments = new Comments();
		
		try {
			PreparedStatement pstmt = conn.prepareStatement("SELECT * FROM comments WHERE id="+id);
			ResultSet rs = pstmt.executeQuery();
			
			if(rs.next()) {
				comments.setId(rs.getInt("id"));
				comments.setContent(rs.getString("content"));
				comments.setBoardId(rs.getInt("boardId"));
				comments.setMemberId(rs.getInt("memberId"));
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return comments;
	}
	public int updateByContent(int id, String content) {
		int result = -1;
		
		try {
			StringBuilder sql = new StringBuilder();
			sql.append("UPDATE comments SET content=? ");
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
	
	public int deleteById(int id) {
		int result = -1;
			
		try {
			StringBuilder sql = new StringBuilder();
			sql.append("DELETE FROM comments WHERE id=?");
			
			PreparedStatement pstmt = conn.prepareStatement(sql.toString());
			pstmt.setInt(1, id);
			
			result = pstmt.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return result;
	}
}
