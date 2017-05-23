package com.conceptoftheday.collections.linkedHashSet;

public class Customer {
	String name;
	int id;

	public Customer(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}

	@Override
	public int hashCode() {
		return id;
	}

	@Override
	public boolean equals(Object object) {
		Customer customer = (Customer) object;
		return (id == customer.id);
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return id + " , " + name;
	}

}
