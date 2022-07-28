package pp;

public class Bank {
	
	 private int  amt = 5000;
   //  private String  ac = "sbi12345";
     
     public int  deposit(int  amt , String  ac)throws Exception{   
    	        System.out.println("business class executed");
                if(ac.equals("sbi12345")){
                        this.amt = this.amt + amt;
                        return amt;
                }
                else {
                	throw new  AccountNumberDoesNotExistException();
                }
                
     }

}
