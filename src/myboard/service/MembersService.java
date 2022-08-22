package myboard.service;

import java.sql.Connection;
import java.util.ArrayList;
import myboard.domain.members.Members;
import myboard.domain.members.MembersDao;

public class MembersService {
	private Connection conn;
	private MembersDao membersDao;
	public MembersService(Connection conn,MembersDao membersDao) {
		this.conn = conn;
		this.membersDao = membersDao;
	}
	
	public void 회원등록(Members members) {
		int result= membersDao.insert(members);
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
	public Members 회원정보보기(String username) {
		return membersDao.findByMemberUserName(username);
	}
	public ArrayList<Members> 회원목록보기(){
		return membersDao.findAll();
	}
	
	public void 회원삭제(String username) {
		int result = membersDao.deleteByUsername(username);
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
	public void 회원정보수정(String username,String content) {
		int result = membersDao.updateByUsername(username, content);
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
}
