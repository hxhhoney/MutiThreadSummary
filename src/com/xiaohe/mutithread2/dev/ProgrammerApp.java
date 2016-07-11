package com.xiaohe.mutithread2.dev;

public class ProgrammerApp {
	public static void main(String[] args){
		// Thread 1
		//create real role
		Programmer pro=new Programmer();
		//create proxy role
		Thread proxy = new Thread(pro);
		//use .start(),  begin thread.
		proxy.start();
		
		//Thread 2: in the mmain
		for(int i=0;i<100;i++)
		{
			System.out.println("hxh........");
		}
		
		
		
	}
}
