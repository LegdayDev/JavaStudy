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
	
	public void ȸ�����(Members members) {
		int result= membersDao.insert(members);
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
	public Members ȸ����������(String username) {
		return membersDao.findByMemberUserName(username);
	}
	public ArrayList<Members> ȸ����Ϻ���(){
		return membersDao.findAll();
	}
	
	public void ȸ������(String username) {
		int result = membersDao.deleteByUsername(username);
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
	public void ȸ����������(String username,String content) {
		int result = membersDao.updateByUsername(username, content);
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
