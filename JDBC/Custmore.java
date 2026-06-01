package com.day4;

public class Custmore {
	int cust_ID;
	String name;
	String email;
	long phone_No;
	String city;
	int age;
	long adharNo;
	int purchase;
	int payAmmount;
	int remaingAmmount;
	
	public Custmore(int cust_ID, String name) {
		super();
		this.cust_ID = cust_ID;
		this.name = name;
	}
	public Custmore(int cust_ID, String name, String email, long phone_No, String city, int age, long adharNo,
			int purchase, int payAmmount, int remaingAmmount) {
		super();
		this.cust_ID = cust_ID;
		this.name = name;
		this.email = email;
		this.phone_No = phone_No;
		this.city = city;
		this.age = age;
		this.adharNo = adharNo;
		this.purchase = purchase;
		this.payAmmount = payAmmount;
		this.remaingAmmount = remaingAmmount;
	}
	public int getCust_ID() {
		return cust_ID;
	}
	public void setCust_ID(int cust_ID) {
		this.cust_ID = cust_ID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getPhone_No() {
		return phone_No;
	}
	public void setPhone_No(long phone_No) {
		this.phone_No = phone_No;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public long getAdharNo() {
		return adharNo;
	}
	public void setAdharNo(long adharNo) {
		this.adharNo = adharNo;
	}
	public int getPurchase() {
		return purchase;
	}
	public void setPurchase(int purchase) {
		this.purchase = purchase;
	}
	public int getPayAmmount() {
		return payAmmount;
	}
	public void setPayAmmount(int payAmmount) {
		this.payAmmount = payAmmount;
	}
	public int getRemaingAmmount() {
		return remaingAmmount;
	}
	public void setRemaingAmmount(int remaingAmmount) {
		this.remaingAmmount = remaingAmmount;
	}
	@Override
	public String toString() {
		return "Custmore [cust_ID=" + cust_ID + ", name=" + name + ", email=" + email + ", phone_No=" + phone_No
				+ ", city=" + city + ", age=" + age + ", adharNo=" + adharNo + ", purchase=" + purchase
				+ ", payAmmount=" + payAmmount + ", remaingAmmount=" + remaingAmmount + "]";
	}
	public Custmore(int cust_ID) {
		super();
		this.cust_ID = cust_ID;
	}
	
	
	

}
