package service;

import java.sql.Connection;
import java.util.ArrayList;

public class MyApp {

	public static void main(String[] args) {
		Connection conn = DbConnection.connection();
		
		EmpDao empDao = new EmpDao(conn);
		DeptDao deptDao = new DeptDao(conn);
		MyService myService = new MyService(empDao, deptDao,conn); //DI : ª˝º∫¿⁄ ¡÷¿Œ
		
		Dept dept = new Dept(50,"TF∆¿","busan");
		ArrayList<Integer> empnos = new ArrayList<Integer>();
		empnos.add(7369);
		empnos.add(7499);
		
		myService.TF∆¿√¢º≥(dept, empnos);
		

	}

}
