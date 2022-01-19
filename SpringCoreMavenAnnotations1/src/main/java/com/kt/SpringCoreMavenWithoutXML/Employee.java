package com.kt.SpringCoreMavenWithoutXML;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("keerthi") // it automatically create the object
@Scope// we habe 5 types of scopes: singletone, prototype : by defalut ist single tone
//why we are use: if you want call "object" two times with singletone scope: we get same object again
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
