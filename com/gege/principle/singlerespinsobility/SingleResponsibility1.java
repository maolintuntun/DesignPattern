package com.gege.principle.singlerespinsobility;

public class SingleResponsibility1 {
	 public static void main(String[] args) {
		 Vehicle vehicle = new Vehicle();
		 
		 vehicle.run("motor");
		 vehicle.run("airplane");
	 }
}

//��ͨ������
// ��ʽ1����run������Υ���˵�һְ��ԭ��
// ���ݽ�ͨ���߲�ͬ �ֽ�ɲ�ͬ����
class Vehicle{
	public void run(String vehicle) {
		System.out.println(vehicle+ " run on road...");
	}
}
