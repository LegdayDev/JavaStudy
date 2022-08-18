package product;

import java.sql.Connection;
import java.util.ArrayList;

import oracle.jdbc.driver.DBConversion;
import product.domain.customer.CustomerDao;
import product.domain.orders.OrdersDao;
import product.domain.product.ProductDao;
import product.dto.OrderRespDto;
import product.service.OrderService;
import product.service.OrderServiceImpl;
import service.DbConnection;

public class MainApp {
	

	public static void main(String[] args) {
		Connection conn = DbConnection.connection();
		
		CustomerDao customerDao = new CustomerDao(conn);
		ProductDao productDao = new ProductDao(conn);
		OrdersDao orderDao = new OrdersDao(conn);
		
		
		OrderService orderService = new OrderServiceImpl(conn,productDao,orderDao);
		int customerId=1;
		
		ArrayList<OrderRespDto> orderRespDtoList = orderService.고객별주문보기(customerId);
		
		for(int i=0;i<orderRespDtoList.size();i++) {
			System.out.println(orderRespDtoList.get(i).getName());
		}
		

	}

}
