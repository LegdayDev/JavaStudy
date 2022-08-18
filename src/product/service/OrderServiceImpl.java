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
	public void �ֹ��ϱ�(int customerId, int productId) {
		//1. ���Ȯ��(��� 0���� ū�� �˻�����) - product findById
		//2. �ֹ��ϱ�(order�� insert�ϱ�) - order insert
		//3. ���-1�ϱ� - product updateByIdToQty
	}

	@Override
	public void �ֹ�����ϱ�(int id) {
		// 1. order deleteById
		// 2. ���+�ϱ� product qty+1
	}

	@Override
	public ArrayList<OrderRespDto> �����ֹ�����(int customerId) {
		
		return ordersDao.findByIdToOrderList(customerId);
	} //Impl : implement ����

}
