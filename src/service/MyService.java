package service;

import java.sql.Connection;
import java.util.ArrayList;

public class MyService {
	//composition : 결합
	private EmpDao empDao;
	private DeptDao deptDao;
	private Connection conn;

	public ArrayList<Emp> 직원목록() {
		return empDao.직원목록보기();
	
	}
	
	public MyService(EmpDao empDao, DeptDao deptDao, Connection conn) {
		super();
		this.empDao = empDao;
		this.deptDao = deptDao;
		this.conn = conn;
	}

	//2. 직원 상세보기가 필요
	public Emp 직원한건보기(int empno) {
		return empDao.직원한건보기(empno);
	
	}
	//3. 직원 추가
	public int 직원추가(Emp emp) {
		return empDao.직원추가(emp);
	}
	//4. 부서 추가
	public int 부서추가(Dept dept) {
		return deptDao.부서추가(dept);
	}
	//5. TF팀 창설
	//1) 팀이 먼저 창설(Dept Entity를받는다) //50 TF team 부산

	public void TF팀창설(Dept dept, ArrayList<Integer> empnos) {
		int count=0;
		count = count+deptDao.부서추가(dept); //TF팀 부서추가
		for(int i=0;i<empnos.size();i++) {
			count= count+empDao.직원수정(dept.getDeptno(),empnos.get(i) );
		}
		
		try {
			if(count == empnos.size()+1) {
				conn.commit();
				System.out.println("커밋");
			}
			else {
				conn.rollback();
				System.out.println("롤백됨");
			}
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
	}
}
