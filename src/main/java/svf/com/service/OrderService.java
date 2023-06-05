package svf.com.service;

import java.util.List;

import svf.com.exception.OrderException;
import svf.com.model.OrderDTO;
import svf.com.model.OrderDTO2;
import svf.com.model.Orders;
import svf.com.model.SignUpData;

public interface OrderService {
	
	public OrderDTO2 addOrder(OrderDTO order) throws OrderException;
	public Orders updateOrder(Orders order) throws OrderException;
	public Orders deleteOrder(Integer orderId) throws OrderException;
	public Orders viewOrder(Integer orderId) throws OrderException;
	public List<Orders>viewAllOrders() throws OrderException;
	public SignUpData viewcustomer(Integer orderid) throws OrderException;
	
	public List<Orders> getOrdersByUserId(Integer userid)throws OrderException;

}
