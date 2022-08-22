package myboard.service;

import java.sql.Connection;
import java.util.ArrayList;

import myboard.domain.boards.Boards;
import myboard.domain.boards.BoardsDao;
import myboard.dto.BoardListDto;


public class BoardsService {
	private Connection conn;
	private BoardsDao boardsDao;
	public BoardsService(Connection conn, BoardsDao boardsDao) {
		super();
		this.conn = conn;
		this.boardsDao = boardsDao;
	}

	public void �ۻ���(Boards boards) {
		int result= boardsDao.insert(boards);
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
	public Boards ���Ѱ��б�(int id) {
		return boardsDao.findByMemberId(id);
	}
	public ArrayList<Boards> �۸�Ϻ���(){
		return boardsDao.findAll();
	}
	public void �ۻ���(int memberId, int id) {
		int result = boardsDao.deleteById(memberId,id);
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
	public void �ۼ���(int id, String content) {
		int result = boardsDao.updateByContent(id, content);
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
	public BoardListDto �Խñۺ���ۼ�(int id) {
		return boardsDao.findByIdToBorderList(id);
		
	}
}
