package com.jm3200104.spring.mvc.dao;

import org.springframework.stereotype.Repository;

import com.jm3200104.spring.mvc.model.Item;

@Repository
public class ItemDao {
	public Item getItem(long id) {
		Item item = new Item();
		item.setId(1l);
		item.setName("Car");
		return item;
	}
}
