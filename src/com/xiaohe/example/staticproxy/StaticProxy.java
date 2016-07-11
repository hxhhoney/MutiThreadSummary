package com.xiaohe.example.staticproxy;
/**
 * Static Proxy Mode for mutithread
 * 1.read role
 * 2.proxy role: have real role's reference
 * 3.Both implement the same interface.
 * @author Xiaohe Cathy Huang
 *
 */

public class StaticProxy {
	public static void main(String[] args){
		You you=new You();
		WeddingCompany company=new WeddingCompany(you);
		company.marry();
		
	}

}

  interface Marry{
	  //public abstract 可以省略
	  void marry();
	
}
  //real role
  class You implements Marry{

	@Override
	public void marry() {
		System.out.println("Marry!");
	}  
  }
  //proxy role
  class WeddingCompany implements Marry{
	  private Marry you;
	  @Override
	  public void marry() {
		  
		    before();
			you.marry();	
			after();
	  }
	  public void before(){
		  System.out.println("New House");
	  }
	  public void after(){
		  System.out.println("Travel");
	  }
	  public WeddingCompany(){
		  
	  }
	  
	  public WeddingCompany(Marry you){
		  this.you=you;
	  }

	
	  
  }
  

