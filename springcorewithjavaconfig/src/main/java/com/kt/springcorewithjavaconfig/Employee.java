package com.kt.springcorewithjavaconfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


public class Employee {

	int eid;
	String ename;
	int esal;
	@Autowired
	Address address;

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public int getEsal() {
		return esal;
	}

	public void setEsal(int esal) {
		this.esal = esal;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(int eid, String ename, int esal, Address address) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.esal = esal;
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", esal=" + esal + ", address=" + address + "]";
	}
	
	
	
	
}
