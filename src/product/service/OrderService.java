package product.service;

import java.util.ArrayList;

import product.dto.OrderRespDto;

public interface OrderService {
	public void �ֹ��ϱ�(int customerId, int productId); // productId�� ��� Ȯ���� 1���� ũ�ų������� product��� -1
	public void �ֹ�����ϱ�(int id); //id�� ���� orders���̺��� �����
	public ArrayList<OrderRespDto> �����ֹ�����(int customerId);
}
