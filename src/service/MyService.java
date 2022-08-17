package service;

import java.sql.Connection;
import java.util.ArrayList;

public class MyService {
	//composition : ����
	private EmpDao empDao;
	private DeptDao deptDao;
	private Connection conn;

	public ArrayList<Emp> �������() {
		return empDao.������Ϻ���();
	
	}
	
	public MyService(EmpDao empDao, DeptDao deptDao, Connection conn) {
		super();
		this.empDao = empDao;
		this.deptDao = deptDao;
		this.conn = conn;
	}

	//2. ���� �󼼺��Ⱑ �ʿ�
	public Emp �����ѰǺ���(int empno) {
		return empDao.�����ѰǺ���(empno);
	
	}
	//3. ���� �߰�
	public int �����߰�(Emp emp) {
		return empDao.�����߰�(emp);
	}
	//4. �μ� �߰�
	public int �μ��߰�(Dept dept) {
		return deptDao.�μ��߰�(dept);
	}
	//5. TF�� â��
	//1) ���� ���� â��(Dept Entity���޴´�) //50 TF team �λ�

	public void TF��â��(Dept dept, ArrayList<Integer> empnos) {
		int count=0;
		count = count+deptDao.�μ��߰�(dept); //TF�� �μ��߰�
		for(int i=0;i<empnos.size();i++) {
			count= count+empDao.��������(dept.getDeptno(),empnos.get(i) );
		}
		
		try {
			if(count == empnos.size()+1) {
				conn.commit();
				System.out.println("Ŀ��");
			}
			else {
				conn.rollback();
				System.out.println("�ѹ��");
			}
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
	}
}
