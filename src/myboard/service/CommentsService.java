package myboard.service;

import java.sql.Connection;

import myboard.domain.comments.Comments;
import myboard.domain.comments.CommentsDao;
import myboard.domain.members.Members;

public class CommentsService {
	private Connection conn;
	private CommentsDao commentsDao;
	public CommentsService(Connection conn, CommentsDao commentsDao) {
		super();
		this.conn = conn;
		this.commentsDao = commentsDao;
	}
	
	public void ´ñ±Ûµî·Ï(Comments comments) {
		int result= commentsDao.insert(comments);
		try {
			if(result==1) {
				conn.commit();
				System.out.println("Ä¿¹Ô");
			}
			else {
				conn.rollback();
			}
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("·Ñ¹éµÊ");
		}
	}
	public Comments ´ñ±ÛÇÑ°Çº¸±â(int id) {
		return commentsDao.findByBoardId(id);
	}
	public void ´ñ±Û»èÁ¦(int id) {
		int result = commentsDao.deleteById(id);
		try {
			if(result==1) {
				conn.commit();
				System.out.println("Ä¿¹Ô");
			}
			else {
				conn.rollback();
			}
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("·Ñ¹éµÊ");
		}
	}
	public void ´ñ±Û¼öÁ¤(int id, String content) {
		int result = commentsDao.updateByContent(id, content);
		try {
			if(result==1) {
				conn.commit();
				System.out.println("Ä¿¹Ô");
			}
			else {
				conn.rollback();
			}
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("·Ñ¹éµÊ");
		}
	}
}
