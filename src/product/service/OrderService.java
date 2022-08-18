package product.service;

import java.util.ArrayList;

import product.dto.OrderRespDto;

public interface OrderService {
	public void 주문하기(int customerId, int productId); // productId의 재고를 확인후 1보다 크거나같으면 product재고 -1
	public void 주문취소하기(int id); //id를 통해 orders테이블의 행삭제
	public ArrayList<OrderRespDto> 고객별주문보기(int customerId);
}
