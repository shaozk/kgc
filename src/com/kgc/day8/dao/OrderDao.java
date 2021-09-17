package com.kgc.day8.dao;

import java.util.*;

import com.kgc.day8.bean.Dish;
import com.kgc.day8.bean.Order;

public class OrderDao {
	
	int count = 0;	// 计数器（记录订单序号）
	List<Order> listOrder = new ArrayList<Order>();
	List<Dish> listDish = new ArrayList<Dish>();
	Scanner in = new Scanner(System.in);
	
	/**
	 * 初始化数据
	 */
	public void init() {
		// 初始化订单
		initOrder();
	}

	/**
	 * 订餐
	 * 1.输入订单信息
	 * 2.存储订单
	 * 3.过滤错误输入
	 */
	public void orderMeal() {
		int id = 0;
		int number = 0;
		int time = 0;
		int confirm = 0;
		int status;
		double price = 0;
		String name;
		String address;
		Dish dish = new Dish();
		Order order = new Order();
		
		// 订单人姓名
		System.out.println("***我要订单***");
		System.out.print("订单人姓名：");
		name = in.next();
		
		// 菜品及份数
		System.out.println("**菜单**");
		viewDish();
		
		while((id = correctInput(id, "请输入菜品序号：")) != -1) {
			if(id < 1 || id > 3) {
				System.out.print("序号范围1-3");
			} else {
				break;
			}
		}
		number = correctInput(number, "请输入你所需要购买的份数：");
		dish = findDish(id);
		dish.setNumber(number);
		
		// 送餐时间
		while((time = correctInput(time, "请输入送餐时间：")) != -1) {
			if(time < 10 || time > 20) {
				System.out.print("时间范围10-20！");
			} else {
				break;
			}
		}
		
		// 送餐地址
		System.out.print("请输入送餐地址：");
		address = in.next();
		
		// 总金额
		double sumPrice = number * dish.getPrice();
		if(sumPrice < 50) {
			sumPrice += 6;
		}
		System.out.println("总金额：" + sumPrice);
		
		// 确认订单
		while((confirm = correctInput(confirm, "是否确定提交订单？(1/0)")) != -1) {
			if(confirm == 1) {
				// 保存订单
				order.setId(++count);
				order.setDish(dish);
				order.setName(name);
				order.setAddress(address);
				order.setTime(time);
				order.setStatus(0);
				
				saveOrder(order);
				
				System.out.println("订单提交成功");
				
				// 显示订单
				viewOrder(order);
				break;
			} else if(confirm == 0) {
				System.out.println("订单已取消");
				break;
			} else {
				System.out.println("请输入1(确定)或0(取消)!!!");
			}
		}
		
	}

	/**
	 * 正确的输入数字
	 * 1.输入不是数字，重新输入
	 * 2.输入是数字，返回输入结果
	 * @param num
	 * @param message
	 * @return
	 */
	private int correctInput(int num, String message) {
		while(true) {
			try {
				System.out.print(message);
				num= in.nextInt();
				break;
			} catch(Exception e) {
				System.out.println("数据格式不正确!!!");
				in = new Scanner(System.in);
			}
		}
		return num;
	}

	private void saveOrder(Order order) {
		listOrder.add(order);
		
	}

	private Dish findDish(int id) {
		for(Dish dish : listDish) {
			if(dish.getId() == id) {
				return dish;
			}
		}
		return null;
	}

	/**
	 * 显示订单
	 */
	private void viewOrder(Order order) {
		
		double price = order.getDish().getPrice();
		int number = order.getDish().getNumber();
		double sumPrice = price * number;
		if(sumPrice < 50) {
			sumPrice += 6;
		}
		
		System.out.println("---订单信息---\t");
		System.out.println("订单号\t" + order.getId());
		System.out.println("姓名\t" + order.getName());
		System.out.println("菜品\t" + order.getDish().getName());
		System.out.println("单价\t" + order.getDish().getPrice() + "元");
		System.out.println("份数\tx" + order.getDish().getNumber());
		System.out.println("总金额\t" + sumPrice);
		System.out.println("送餐时间\t" + order.getTime());
		System.out.println("送餐地址\t" + order.getAddress());
		System.out.println("------------");
		
	}

	/**
	 * 显示菜单
	 * 1.遍历菜单列表
	 */
	private void viewDish() {
		System.out.println("序号\t名称\t单价\t点赞数");
		for(Dish dish : listDish) {
			System.out.println(dish.getId() + "\t" + dish.getName() + "\t" 
					+ dish.getPrice() + "\t" + dish.getThumbs());
		}
		
	}

	/**
	 * 显示餐袋
	 * 1.格式化输出
	 * 2.遍历订单列表(listOrder)
	 */
	public void viewBag() {
		System.out.println("***插看餐袋***");
		System.out.println("序号\t订餐人\t餐品信息\t\t送餐日期\t送餐地址\t\t总金额\t订单状态");
		for(Order order : listOrder) {
			soutOrder(order);
		}
	}

	/**
	 * 格式化输出订单信息
	 * @param order
	 */
	private void soutOrder(Order order) {
		int id = order.getId();
		int time = order.getTime();
		int number = order.getDish().getNumber();
		int status = order.getStatus();
		double price = order.getDish().getPrice();
		String name = order.getName();
		String dishName = order.getDish().getName();
		String address = order.getAddress();
		
		double sumPrice = price * number;
		if(sumPrice < 50) {
			sumPrice += 6;
		}
		System.out.println(
				id + "\t" + name + '\t' + dishName + " " + number + "份" + "\t" + time + '\t' + 
				address +"\t" + sumPrice + "\t" + 
				changNumber(status));
	}

	/**
	 * 签收订单
	 * 1.遍历订单列表，查看是否存在未签收的订单
	 * 2.所有订单已签收，退出子程序
	 * 3.输入订单号，签收订单
	 */
	public void signOrder() {
		System.out.println("***签收订单***");
		System.out.println("待签收的订单：");
		int flag = 0;
		for(Order order : listOrder) {
			if(order.getStatus() == 0) {
				System.out.println("订单号：" + order.getId());
				flag++;
			}
		}
		if(flag == 0) {
			System.out.println("目前订单已全部签收,不要重复签收");
		} else {
			int id = 0, exist = 0;
			while((id = correctInput(id, "输入需要签收的订单号：")) != -1) {
				exist = findOrderById(id);
				switch(exist) {
				case 0:
					System.out.println("查无此订单");
					break;
				case 1:
					System.out.println(id + "已签收，请不要重复签收");
					break;
				case 2:
					System.out.println(id + "号订单成功签收");
					break;
				}
				if(exist == 2) break;
			}
			
		}
		
	}

	/**
	 * 
	 * @param id
	 * @return
	 * 0--没有订单
	 * 1--订单已签
	 * 2--订单存在且没签
	 */
	private int findOrderById(int id) {
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
	 * 删除订单
	 * 1.查找是否存在给定订单号
	 * 2.删除订单(从订单列表中移除)
	 */
	public void deleteOrder() {
		System.out.println("***删除订单***");
		System.out.println("可删除的订单：");
		int flag = 0;
		for(Order order : listOrder) {
			if(order.getStatus() == 1) {
				System.out.println("订单号：" + order.getId());
				flag++;
			}
		}
		if(flag == 0) {
			System.out.println("无订单");
		} else {
			int id = 0, exist = 0;
			while((id = correctInput(id, "请输入你要删除的订单号：")) != -1) {
				for(Order order : listOrder) {
					if(order.getDish().getId() == id) {
						listOrder.remove(order);
						System.out.println("订单号：" + order.getDish().getId() + "已删除");
						exist++;
						break;
					}
				}
				if(exist == 0) {
					System.out.println("查无此订单");
					break;
				} else {
					break;
				}
			}
		}
		
		
		
	}

	/**
	 * 点赞
	 */
	public void thunbsUp() {
		// TODO Auto-generated method stub
		
	}

	public String changNumber(int n) {
		if(n == 0) {
			return "已预订";
		} else if(n == 1) {
			return "已完成";
		}
		return "";
	}
	

	private void initOrder() {
		Dish dish1 = new Dish();
		Dish dish2 = new Dish();
		Dish dish3 = new Dish();
		
		Order order1 = new Order();
		Order order2 = new Order();
		
		dish1.setId(1);
		dish1.setName("鱼香肉丝");
		dish1.setNumber(3);
		dish1.setPrice(20.0);
		dish1.setThumbs(50);
		
		dish2.setId(2);
		dish2.setName("时令蔬菜");
		dish2.setNumber(5);
		dish2.setPrice(13.0);
		dish2.setThumbs(50);
		
		dish3.setId(3);
		dish3.setName("红烧鲫鱼");
		dish3.setPrice(50.0);
		dish3.setThumbs(1000);

		// 添加菜单
		listDish.add(dish1);
		listDish.add(dish2);
		listDish.add(dish3);
		
		order1.setId(++count);
		order1.setDish(dish1);
		order1.setName("小明");
		order1.setTime(3);
		order1.setAddress("天成路207号");
		order1.setStatus(1);
		
		order2.setId(++count);
		order2.setDish(dish2);
		order2.setName("小王");
		order2.setTime(10);
		order2.setAddress("天成路207号");
		order2.setStatus(0);
		
		// 添加订单
		listOrder.add(order1);
		listOrder.add(order2);
	}
	
}
