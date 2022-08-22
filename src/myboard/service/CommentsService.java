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
	
	public void ��۵��(Comments comments) {
		int result= commentsDao.insert(comments);
		try {
			if(result==1) {
				conn.commit();
				System.out.println("Ŀ��");
			}
			else {
				conn.rollback();
			}
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("�ѹ��");
		}
	}
	public Comments ����ѰǺ���(int id) {
		return commentsDao.findByBoardId(id);
	}
	public void ��ۻ���(int id) {
		int result = commentsDao.deleteById(id);
		try {
			if(result==1) {
				conn.commit();
				System.out.println("Ŀ��");
			}
			else {
				conn.rollback();
			}
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("�ѹ��");
		}
	}
	public void ��ۼ���(int id, String content) {
		int result = commentsDao.updateByContent(id, content);
		try {
			if(result==1) {
				conn.commit();
				System.out.println("Ŀ��");
			}
			else {
				conn.rollback();
			}
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("�ѹ��");
		}
	}
}
