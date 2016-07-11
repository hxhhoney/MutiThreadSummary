package com.xiaohe.mutithread.dev;

public class RabbitApp {
	public static void main(String[] args)
	{
		Rabbit rab=new Rabbit();
		Tortoise tor=new Tortoise();
		rab.start();//只是放到起跑线上did not activate the thread， wait CPU to use it.Do not use run() here.
		tor.start();//开辟多条路径必须用start(), 如果直接用run()则为单一的主路径面（）
		
		for(int i=0;i<1000;i++)
		{
			System.out.println("++++++++++"+i);
		}
		
	}
}
