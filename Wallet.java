package Project;

import java.util.Random;

class Wallet {
//	static Login login=new Login();
//    {
//        login.getLogin();
//    }
	static Phonepe phonepe=new Phonepe();
	static Gpay gpay=new Gpay();
	
	
	
Random random=new Random();
    
    int generated_OTP;
    
    
    private boolean OTP(int count) {
    	
	    if(count>0) {
	    	
	    	System.out.print("Enter OTP to verify: ");
	    	int OTP=Sign_up.input.nextInt();
	    	
	    	if(OTP==this.generated_OTP) {
	    		return true;
	    	}else {
	    		System.out.println(Book.red+"Wrong OTP. TRY AGAIN\n"+Book.reset);
	    		return OTP(--count);
	    	}
	    }
	    
	    System.out.println(Book.green+"\nYou exeeded OTP limitations\n"+Book.reset);
	    
	    	
        	System.out.println("A new OTP has been sent to your Registered Mobile Number");
        		generated_OTP=random.nextInt(9000)+1000;
        		System.out.println("Re-generated OTP: "+Book.yellow+generated_OTP+Book.reset+"\n");
        		return OTP(3);        
    }
      
    
    private boolean mobile_v() {
    	System.out.print("Enter registered Mobile No: ");
    	String rmobile=Sign_up.input.next();
    	
    	if(User.user.direct) {
    		if(rmobile.equals(phonepe.getMobile())) {
    			
    		    
    		    this.generated_OTP=random.nextInt(9000)+1000;
    		    
    		    System.out.println("\nAn OTP has been sent to your Registered Mobile Number.Verify it...");
    	        System.out.println("Your OTP to Sign-in: "+Book.yellow+generated_OTP+Book.reset+"\n");
    	        
    	        return OTP(3);
    		}else if(rmobile.equals(gpay.getMobile())) {
    			this.generated_OTP=random.nextInt(9000)+1000;
    		    
    		    System.out.println("\nAn OTP has been sent to your Registered Mobile Number.Verify it...");
    	        System.out.println("Your OTP to Sign-in: "+Book.yellow+generated_OTP+Book.reset+"\n");
    	        
    	        return OTP(3);
    		}else {
    			System.out.println(Book.red+"Mobile Number MisMatched"+Book.reset);
    			return mobile_v();
    		}
    	}else {
    		if(rmobile.equals(CricTTD.sign.mobile())) {
    			
    		    
    		    this.generated_OTP=random.nextInt(9000)+1000;
    		    
    		    System.out.println("\nAn OTP has been sent to your Registered Mobile Number.Verify it...");
    	        System.out.println("Your OTP to Sign-in: "+Book.yellow+generated_OTP+Book.reset+"\n");
    	        
    	        return OTP(3);
    		}else {
    			System.out.println(Book.red+"Mobile Number MisMatched"+Book.reset);
    			return mobile_v();
    		}
    	}
    }
	
	
	
	
	
	
	
	double balance;
	double amount;
	
	int pu=0;int pp=0;
	String p_userName;String phonepe_Username;String npu;
	String p_password;String phonepe_password;String npp;
	
	int gu=0;int gp=0;
	String g_userName;String gpay_Username;String ngu;
	String g_password;String gpay_password;String ngp;
	
	private String resetPU() {		
		return npu;
	}
	
	private String resetPP() {
		return npp;
	}
	
	private String resetGU() {		
		return ngu;
	}
	
	private String resetGP() {
		return ngp;
	}
	
	
	
	private void phonepeUN() {
		System.out.print("\nEnter PhonePe User Name: ");
		this.phonepe_Username=Sign_up.input.next();
		
		if(pu==0) {	
			
			this.p_userName=phonepe.getUserName();
		}else {
			
			this.p_userName=resetPU();
		}
		
		if(this.phonepe_Username.equals(this.p_userName)) {
			phonepeP();
		}else {
			System.out.println(Book.red+"\nInvalid PhonePe User Name. Enter"+Book.reset);
			
			System.out.print("Enter\n"+Book.purple+"1->  for Forgot Phonepe UserName/ any number to TRY AGAIN: "+Book.reset);

	        int n=Sign_up.input.nextInt();
	        
	        if(n==1) {
	        	pu=1;
	        	setpun();
	        }
			phonepeUN();
		}
	}
	
	private void phonepeP() {
		System.out.print("\nEnter PhonePe Password: ");
		this.phonepe_password=Sign_up.input.next();
		
		if(pp==0) {			
			this.p_password=phonepe.getPassword();
		}else {
			this.p_password=resetPP();
		}
		
		if(!phonepe_password.equals(this.p_password)) {
			System.out.println(Book.red+"\nInvalid PhonePe Password."+Book.reset);
			
			System.out.print("Enter\n"+Book.purple+"1->  for Forgot Phonepe Password/ any number to TRY AGAIN: "+Book.reset);

	        int n=Sign_up.input.nextInt();
	        
	        if(n==1) {
	        	pp=1;
	        	setpp();
	        }
			phonepeP();
		}
	}
	
	
	private void gpayUN() {
		
		System.out.print("\nEnter Gpay User Name: ");
		this.gpay_Username=Sign_up.input.next();
		
		if(gu==0){
			this.g_userName=gpay.getUserName();
		}else {
			this.g_userName=resetGU();
		}
		
		if(this.gpay_Username.equals(this.g_userName)) {
			gpayP();
		}else {
			System.out.println(Book.red+"\nInvalid Gpay User Name.  TRY AGAIN"+Book.reset);
			
			System.out.print("Enter\n"+Book.purple+"1->  for Forgot Gpay UserName/ any number to TRY AGAIN: "+Book.reset);

	        int n=Sign_up.input.nextInt();
	        
	        if(n==1) {
	        	gu=1;
	        	setgun();
	        }
			gpayUN();
		}
	}
	
	private void gpayP() {
		System.out.print("\nEnter Gpay Password: ");
		this.gpay_password=Sign_up.input.next();
		
		if(gp==0) {
			
			this.g_password=gpay.getPassword();
		}else {
			this.g_password=resetGP();
		}
		
		if(!this.gpay_password.equals(this.g_password)) {
			System.out.println(Book.red+"\nInvalid Gpay Password.  TRY AGAIN"+Book.reset);
			
			System.out.print("Enter\n"+Book.purple+"1->  for Forgot Gpay Password/ any number to TRY AGAIN: "+Book.reset);

	        int n=Sign_up.input.nextInt();
	        
	        if(n==1) {
	        	gp=1;
	        	setgp();
	        }
			gpayP();
		}
	}
	
	private boolean isPassword(String password) {
    	int cap=0,small=0,num=0,spe=0;
    	for(int i=0;i<password.length();i++) {
    		char ch=password.charAt(i);
    		if(ch>='A'&&ch<='Z') {
    			cap++;
    		}else if(ch>='a'&&ch<='z') {
    			small++;
    		}else if(ch>='0'&&ch<='9') {
    			num++;
    		}else if((ch>='!'&&ch<='/')||(ch>=':'&&ch<='@')) {
    			spe++;
    		}
    	}
    	
    	if(cap<1||small<1||num<1||spe<1) {
    		System.out.println(Book.red+"\nYour password is not Strong enough\n"+Book.reset);
    		return false;
    	}
    	return true;
    }
	
	private String setpp() {
		if(mobile_v()) {
			System.out.print(Book.green+"(Your Phonepe Password must have one Capital letter,one Small letter,");
			System.out.println("one Number and one Special Character)\n"+Book.reset);
			
			System.out.print("Set new PhonePe Password: ");
			this.npp=Sign_up.input.next();
			if(isPassword(this.npp)) {
				return this.npp;
			}else {
				return setpp();
			}
		}
		return "";
	}
	
	private String setgp() {
		if(mobile_v()) {
			System.out.print(Book.green+"(Your Gpay Password must have one Capital letter,one Small letter,");
			System.out.println("one Number and one Special Character)\n"+Book.reset);
			
			System.out.print("Set new Gpay Password: ");
			this.ngp=Sign_up.input.next();
			if(isPassword(this.ngp)) {
				return this.ngp;
			}else {
				return setgp();
			}
		}
		return "";
	}
	
	private boolean nameLength(String name) {
    	if(name.length()<4) {
    		System.out.println(Book.red+"\nThe UserName you are entering should have atleast 4 Characters\n"+Book.reset);
    		return false;
    	}
    	return true;
    }
	
	private String setpun() {
		if(mobile_v()) {
			System.out.println(Book.green+"\nPhonepe Username must be of atleast 4 characters and must contain one '@' character"+Book.reset);
			System.out.print("Set new PhonePe UserName: ");
			this.npu=Sign_up.input.next();
			if(nameLength(this.npu)) {
				if(isnameValid(this.npu,0,this.npu.length())) {
					
					return this.npu;
				}else {
					System.out.println(Book.red+"your Phonepe username must have '@' character"+Book.reset);
					return setpun();
				}
			}
			return setpun();
		}
		return "";
	}
	
	private String setgun() {
		if(mobile_v()) {
			System.out.println(Book.green+"\nGpay Username must be of atleast 4 characters and must contain one '@' character"+Book.reset);
			System.out.print("Set new Gpay UserName: ");
			this.ngu=Sign_up.input.next();
			if(nameLength(this.ngu)) {
				if(isnameValid(this.ngu,0,this.ngu.length())) {
					
					return this.ngu;
				}else {
					System.out.println(Book.red+"your Gpay username must have '@' character"+Book.reset);
					return setgun();
				}
			}
			return setgun();
		}
		return "";
	}
	
	
	
	private boolean isnameValid(String name,int i,int userName_length){
        if(i<userName_length){
            if(name.charAt(i)=='@'){
                return true;
            }else{
                return isnameValid(name, ++i, userName_length);
            }
        }
        return false;
    }
	
	private String color="\033[0m";
	
	private void payment(String choice) {
		if(choice.toLowerCase().equals("phonepe")) {
			color="\033[0;35m";
			phonepeUN();
			
			System.out.print("\nEnter amount: ");

	        amount=Sign_up.input.nextDouble();

	        balance+=amount;
	        
        }else if(choice.toLowerCase().equals("gpay")) {
        	color="\033[0;32m";
        	gpayUN();
        	
        	System.out.print("\nEnter amount: ");

            amount=Sign_up.input.nextDouble();

            balance+=amount;
            
        }else {
        	System.out.println("////  Invalid Choice  ////\n");
        	System.out.print("Recharge from(PhonePe/Gpay)?: ");
        	this.choice=Sign_up.input.next();
     
        	payment(this.choice);
        }
	}

    

    {
        System.out.println(Book.yellow+"\n****Recharge Your Dual Wallet****\n"+Book.reset);
    }
    
    private String choice;
    
    
    private void recharge(){
    	
    	System.out.print("Recharge from(PhonePe/Gpay)?: ");
    	
    	this.choice=Sign_up.input.next();
    	
    	payment(this.choice);  
    		
        System.out.println("An amount of "+amount+" has been credited to wallet via "+color+this.choice+Book.reset);

        System.out.println("Your Current Balance is: "+Book.cyan+balance+Book.reset);
    }


    private boolean doRecharge(){
        if(balance<100){
            System.out.println(Book.red+"\nYour Wallet must have minimum of 100/-\n"+Book.reset);
            recharge();
            return doRecharge();
        }
        return true;
    }

    boolean getRecharge(){
        return doRecharge();
    }

    void return_recharge(){
        recharge();
    }

     public static void main(String[] args) {
         Wallet wallet=new Wallet();
         wallet.getRecharge();
     }
}
