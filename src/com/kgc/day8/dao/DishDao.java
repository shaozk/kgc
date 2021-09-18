package com.kgc.day8.dao;

import java.util.List;

import com.kgc.day8.bean.Dish;

public class DishDao {
	
	/**
	 * 通过id找菜品
	 * @param id
	 * @param listDish
	 * @return
	 */
	public Dish findDishById(int id, List<Dish> listDish) {
		for(Dish dish : listDish) {
			if(dish.getId() == id) {
				return dish;
			}
		}
		return null;
	}

	/**
	 * 修改菜品
	 * @param dish
	 * @param listDish
	 */
	public void update(Dish dish, List<Dish> listDish) {
		for(Dish d : listDish) {
			if(dish.getId() == d.getId()) {
				d = dish;
			}
		}
		
	}

}
