package com.gege.principle.singlerespinsobility;

public class SingleResponsibility1 {
	 public static void main(String[] args) {
		 Vehicle vehicle = new Vehicle();
		 
		 vehicle.run("motor");
		 vehicle.run("airplane");
	 }
}

//交通工具类
// 方式1：在run方法中违反了单一职责原则。
// 根据交通工具不同 分解成不同的类
class Vehicle{
	public void run(String vehicle) {
		System.out.println(vehicle+ " run on road...");
	}
}
