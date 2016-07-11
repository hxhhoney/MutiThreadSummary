package com.xiaohe.mutithread2.dev;
/**
 * Use Runnable(interface) to create threads
 * 1. class implement Runnable+ rewrite run();-->real role class
 * 2. 启动mutithread, use static proxy
 * 	(1)create real role
 *  (2)create proxy role+real role reference
 *  (3)use .start() 启用thread
 *  
 * Advantage:
 * 1.void single inheritance(java only have single inheritance, we do not use extends here, instead we use implements)
 * 2.Easier to share resources.
 * @author Xiaohe Cathy Huang
 *
 */

public class Programmer implements Runnable{

	@Override
	public void run() {
		for(int i=0;i<100;i++)
		{
			System.out.println("Type Hello World......");
		}
		
	}

}
