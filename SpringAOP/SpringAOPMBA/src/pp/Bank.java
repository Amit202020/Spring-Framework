package pp;

public class Bank {
	
	 private int  amt = 5000;
     private String  ac = "sbi12345";
     
     public int  deposit(int  amt , String  acc){                 
                if(acc.equals(this.ac)){
                        this.amt = this.amt + amt;
                        return amt;
                }
                return 0;
     }

}
