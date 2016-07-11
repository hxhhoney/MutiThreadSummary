package com.xiaohe.mutithread.dev;
/**
 * Running Game
 * 1.Create Mutithread, extends Thread+ override run()//运行一切从run开始
 * 2.Use thread:create subclass object(see RabbitApp main)+object.start//线程的启动（不代表线程运行）
 * Disadvantage: single inheritance, if our class already inherit another class, then it can not inherit Thread
 * @author Xiaohe Cathy Huang
 *
 */

public class Rabbit extends Thread{

	@Override
	public void run() {
		//Thread
		for(int i=0;i<100;i++)
		{
			System.out.println("Rabbit is running"+i+"step");
		}
	}
	
}
class Tortoise extends Thread{

	@Override
	public void run() {
		//Thread
		for(int i=0;i<100;i++)
		{
			System.out.println("Tortoise is running"+i+"step");
		}
	}
	
}
