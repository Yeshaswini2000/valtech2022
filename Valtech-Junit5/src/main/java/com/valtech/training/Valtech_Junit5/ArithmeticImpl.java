package com.valtech.training.Valtech_Junit5;


import com.valtech.training.Valtech_Junit5.Arithmetic;

public class ArithmeticImpl implements Arithmetic {

	public int add(int a, int b) {
		// TODO Auto-generated method stub
		return a+b;
	}

	public int sub(int a, int b) {
		// TODO Auto-generated method stub
		return a-b;
	}

	public int mul(int a, int b) {
		// TODO Auto-generated method stub
		return a*b;
	}

	public int div(int a, int b) {
		// TODO Auto-generated method stub
		//if(b==0) return 0;
		return a/b;
	}

}