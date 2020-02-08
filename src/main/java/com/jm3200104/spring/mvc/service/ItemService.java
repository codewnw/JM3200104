package com.jm3200104.spring.mvc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jm3200104.spring.mvc.dao.ItemDao;
import com.jm3200104.spring.mvc.model.Item;

@Service
public class ItemService {

	@Autowired
	private ItemDao itemDao;

	public Item getItem(long id) {
		return itemDao.getItem(id);
	}
}
