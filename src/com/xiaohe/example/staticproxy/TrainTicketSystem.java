package com.xiaohe.example.staticproxy;
/**
 * Runnable advantage: easier to share resource
 * @author Xiaohe Cathy Huang
 *
 */

public class TrainTicketSystem implements Runnable{
	private int num=50;
	public static void main(String[] args){
		//real role
		TrainTicketSystem web=new TrainTicketSystem();
		//proxy role(黄牛)
		Thread t1=new Thread(web,"Orbitz");
		Thread t2=new Thread(web,"Expedia");
		//start thread
		t1.start();
		t2.start();
	}

	@Override
	public void run() {
		while(true){
			if(num<=0)
			{
				break;
			}
			System.out.println(Thread.currentThread().getName()+" get the ticket"+num--);
		}
	}

}

	

