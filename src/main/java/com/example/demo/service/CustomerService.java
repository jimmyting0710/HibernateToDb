package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.CustomerDao;
import com.example.demo.entity.Customer;
import com.example.demo.model.CustomerBo;

@Service
public class CustomerService {
	@Autowired
	private CustomerDao dao;
	
	public void add(CustomerBo bo) {
		Customer entity = new Customer();
		entity.setId(bo.getId());
		entity.setName(bo.getName());
		entity.setAddress(bo.getAddress());
		dao.save(entity);
		System.out.println(bo.getName());
		
	}
	
	public CustomerBo get(long id) {
		Customer entity =dao.findById(id).orElse(new Customer());
		CustomerBo bo =new CustomerBo();
		bo.setId(entity.getId());
		bo.setName(entity.getName());
		bo.setAddress(entity.getAddress());
		return bo;
		
		
		
	}

}
