package business;

public class Bank {

    int amt=5000;
    String acc="HDFC12";
    public int deposit(int am,String ac)throws AccountNotFoundException {
    	if(acc.equals(ac)){
    		System.out.println("BUSINESS :Inside deposite method");
    		amt=amt+am;
    		return amt;
    	}else{
    		throw new AccountNotFoundException();
    	}	
    }
    
}
