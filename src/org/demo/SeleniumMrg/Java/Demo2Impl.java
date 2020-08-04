package org.demo.SeleniumMrg.Java;

public class Demo2Impl implements IDemo{

	@Override
	public int Multiply(int a, int b) {
		// TODO Auto-generated method stub
		return a*b;
	}
	public static void main(String [] args)
	{
		IDemo d= new Demo2Impl();
		System.out.print(d.Multiply(3, 10));
	}

}
