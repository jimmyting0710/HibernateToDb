package com.example.demo.model;

public class CustomerBo {
	private long id;
	private String name;
	private String address;
	
	public String toString() {
		StringBuilder sb =new StringBuilder();
		sb.append("id:"+id+",");
		sb.append("name:"+name+",");
		sb.append("address:"+address);
		return sb.toString();
		
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}
