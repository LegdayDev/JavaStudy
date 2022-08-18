package product.service;

import java.sql.Connection;
import java.util.ArrayList;

import product.domain.orders.OrdersDao;
import product.domain.product.ProductDao;
import product.dto.OrderRespDto;

public class OrderServiceImpl implements OrderService{
	private Connection connectioin;
	private ProductDao productDao;
	private OrdersDao ordersDao;
	
	
	public OrderServiceImpl(Connection connectioin, ProductDao productDao, OrdersDao ordersDao) {
		super();
		this.connectioin = connectioin;
		this.productDao = productDao;
		this.ordersDao = ordersDao;
	}

	@Override
	public void 주문하기(int customerId, int productId) {
		//1. 재고확인(재고가 0보다 큰지 검사한후) - product findById
		//2. 주문하기(order에 insert하기) - order insert
		//3. 재고-1하기 - product updateByIdToQty
	}

	@Override
	public void 주문취소하기(int id) {
		// 1. order deleteById
		// 2. 재고+하기 product qty+1
	}

	@Override
	public ArrayList<OrderRespDto> 고객별주문보기(int customerId) {
		
		return ordersDao.findByIdToOrderList(customerId);
	} //Impl : implement 약자

}
