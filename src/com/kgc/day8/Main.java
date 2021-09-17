package com.kgc.day8;

import java.util.*;

import com.kgc.day8.dao.OrderDao;

public class Main {
	public static void main(String[] args) {
		initView();
		
		int funcNumber = 0;
		OrderDao dao = new OrderDao();
		dao.init(); // 初始化数据库
		Scanner in = new Scanner(System.in);
	
		do {
			// 输入字符处理
			while(true) {
				try {
					System.out.print("请选择：");
					funcNumber = in.nextInt();
					break;
				} catch(Exception e) {
					tips();
					in = new Scanner(System.in);
				}
			}
			
			switch(funcNumber) {
			case 1:
				dao.orderMeal(); // 订餐
				break;
			case 2:
				dao.viewBag();		// 查看餐袋
				break;
			case 3:
				dao.signOrder();	// 签收订单
				break;
			case 4:
				// TODO
				dao.deleteOrder(); // 删除订单
				break;
			case 5:
				// TODO
				dao.thunbsUp();	// 点赞
				break;
			case 6:
				signOut();	// 退出
				break;
			default :
				tips();		// 提示
				break;
			}
		} while(funcNumber != -1);
	}

	/**
	 * 提示
	 */
	private static void tips() {
		System.out.println("请输入1-6的整数！");
	}

	private static void initView() {
		System.out.println("欢迎使用“吃货联盟订餐管理系统");
		System.out.println("*********************");
		System.out.println("1.我要订单");
		System.out.println("2.查看餐袋");
		System.out.println("3.签收订单");
		System.out.println("4.删除订单");
		System.out.println("5.我要点赞");
		System.out.println("6.退出系统");
		System.out.println("*********************");
	}
	
	/**
	 * 退出系统
	 */
	public static void signOut() {
		System.out.println("谢谢使用，再见！");
		System.exit(0);
	}

}