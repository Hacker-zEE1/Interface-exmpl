package com.shaqib.implit;

import com.shaqib.it.it1;

public class Implit1 implements it1 {

	@Override
	public void m1() {
		System.out.println("method 1");
	}

	@Override
	public void m2() {
		// TODO Auto-generated method stub
		System.out.println("method 2");
	}

	@Override
	public void m3() {
		// TODO Auto-generated method stub
		System.out.println("method 3");
	}
	
	public static void main(String[] args)
	{
	Implit1 t=new Implit1();
	t.m1();
	t.m2();
	t.m3();
	}

}
