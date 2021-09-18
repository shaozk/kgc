package com.kgc.day8.dao;

import java.util.List;

import com.kgc.day8.bean.Order;

public class OrderDao {
	
	/**
	 * 
	 * @param id
	 * @return
	 * 0--没有订单
	 * 1--订单已签
	 * 2--订单存在且没签
	 */
	public int findOrderById(int id, List<Order> listOrder) {
		int exist = 0;
		for(Order order : listOrder) {
			int dishId = order.getId();
			if(dishId == id) {
				exist = 1;
				if(order.getStatus() == 1) {
					exist = 1;
					break;
				} else {
					order.setStatus(1);
					exist = 2;
					break;
				}
			}
		}
		return exist;
	}
	
	/**
	 * 通过id删除订单
	 * @param id
	 * @param exist
	 * @return
	 * 0 无订单
	 * 1 
	 */
	public int deleteOrderById(int id, List<Order> listOrder) {
		int exist = 0;
		for(Order order : listOrder) {
			int dishId = order.getId();
			if(dishId == id && order.getStatus() == 1) {
				listOrder.remove(order);
				exist = 1;
				break;
			}
		}
		return exist;
	}
	
	/**
	 * 保存订单
	 * @param order
	 */
	public List<Order> saveOrder(Order order, List<Order> listOrder) {
		listOrder.add(order);
		return listOrder;
	}

}
