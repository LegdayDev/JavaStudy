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

	public void 글생성(Boards boards) {
		int result= boardsDao.insert(boards);
		try {
			if(result==1) {
				conn.commit();
				System.out.println("커밋");
			}
			else {
				conn.rollback();
			}
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("롤백됨");
		}
	}
	public Boards 글한개읽기(int id) {
		return boardsDao.findByMemberId(id);
	}
	public ArrayList<Boards> 글목록보기(){
		return boardsDao.findAll();
	}
	public void 글삭제(int memberId, int id) {
		int result = boardsDao.deleteById(memberId,id);
		try {
			if(result==1) {
				conn.commit();
				System.out.println("커밋");
			}
			else {
				conn.rollback();
			}
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("롤백됨");
		}
	}
	public void 글수정(int id, String content) {
		int result = boardsDao.updateByContent(id, content);
		try {
			if(result==1) {
				conn.commit();
				System.out.println("커밋");
			}
			else {
				conn.rollback();
			}
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("롤백됨");
		}
	}
	public BoardListDto 게시글별댓글수(int id) {
		return boardsDao.findByIdToBorderList(id);
		
	}
}
