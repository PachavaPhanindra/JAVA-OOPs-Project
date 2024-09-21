package Project;

import java.util.Random;

class Login {
	//static Sign_up sign=new Sign_up();
//    {
//        sign.getSign_up();
//    }

    {
        System.out.println(Book.yellow+"\n\n-------------------Login---------------------\n\n"+Book.reset);
    }

    // boolean isLogin(){
    //     while(true){
    //         System.out.print("Enter User Name: ");
    //         final String userName=Sign_in.input.next();

    //         if(userName.equals(sign.getUserName())){
                
    //             while(true){
    //                 System.out.print("Enter Password: ");
        
    //                 final String password=Sign_in.input.next();
    //                 if(password.equals(sign.getPassword())){
    //                     System.out.println("Logged in Successfully...\n");
    //                     break;
    //                 }else{
    //                     System.out.println("Invalid Password. TRY AGAIN\n");
    //                 }
    //             }

    //             break;
    //         }else{
    //             System.out.println("Invalid User Name. TRY AGAIN\n");
    //         }
    //     }
    //     return true;
    // }
    
    int fn=0,ln=0,p=0;
    private String firstName,lastName,password;
    private String sfirstName,slastName,spassword;
    private String nf,nl,np;
    
    
    private String resetFn() {		
		return nf;
	}
    
    private String resetLn() {		
		return nl;
	}
    
    private String resetP() {		
		return np;
	}

    private void isFirstName(){
        System.out.print("Enter First Name: ");
        this.firstName=Sign_up.input.next();
        
        if(User.user.direct) {
        	if(fn==0) {      	
            	this.sfirstName=User.user.getfirstName();
            }else {
            	this.sfirstName=resetFn();
            }
        }else {        	
        	if(fn==0) {      	
        		this.sfirstName=CricTTD.sign.setFirstName();
        	}else {
        		this.sfirstName=resetFn();
        	}
        }
        
        if(this.firstName.equals(this.sfirstName)) {
			isLastName();
		}else {
			System.out.println(Book.red+"\nInvalid First Name. Enter"+Book.reset);
			
			System.out.print("Enter\n"+Book.purple+"1->  for Forgot First Name/ any number to TRY AGAIN: "+Book.reset);

	        int n=Sign_up.input.nextInt();
	        
	        if(n==1) {
	        	fn=1;
	        	setFn();
	        }
			isFirstName();
		}

    }
    
    private void isLastName(){
        System.out.print("Enter Last Name: ");
        this.lastName=Sign_up.input.next();
        
        if(User.user.direct) {
        	if(ln==0) {      	
            	this.slastName=User.user.getLastName();
            }else {
            	this.slastName=resetLn();
            }
        }else {
        	if(ln==0) {      	
            	this.slastName=CricTTD.sign.setLastName();
            }else {
            	this.slastName=resetLn();
            }
        }
         
        
        if(this.lastName.equals(this.slastName)) {
			isPassword();
		}else {
			System.out.println(Book.red+"\nInvalid Last Name. Enter"+Book.reset);
			
			System.out.print("Enter\n"+Book.purple+"1->  for Forgot Last Name/ any number to TRY AGAIN: "+Book.reset);

	        int n=Sign_up.input.nextInt();
	        
	        if(n==1) {
	        	ln=1;
	        	setLn();
	        }
			isLastName();
		}

    }

    
    private void isPassword() {
		System.out.print("\nEnter Password: ");
		this.password=Sign_up.input.next();
		
		if(User.user.direct) {
			if(p==0) {			
				this.spassword=User.user.getPassword();
			}else {
				this.spassword=resetP();
			}
		}else {
			if(p==0) {			
				this.spassword=CricTTD.sign.getPassword();
			}else {
				this.spassword=resetP();
			}
		}
			
		if(!password.equals(this.spassword)) {
			System.out.println(Book.red+"\nInvalid Password."+Book.reset);
			
			System.out.print("Enter\n"+Book.purple+"1->  for Forgot Password/ any number to TRY AGAIN: "+Book.reset);

	        int n=Sign_up.input.nextInt();
	        
	        if(n==1) {
	        	p=1;
	        	setP();
	        }
			isPassword();
		}else {
			System.out.println(Book.green+"\nLogin Successfully..."+Book.reset);
		}
	}

    /*private boolean passwordCheck(){
    	if(User.user.direct) {
    		if(isPassword().equals(User.user.getPassword())){
    			System.out.println("\nLogged in Successfully...\n");
    			System.out.println("               %%% WELCOME TO CRIC-TTD %%%                  \n\n");
    			return true;
    		}else{ 
    			System.out.println("Invalid Password. TRY AGAIN\n");
    		}
    	}else {
    		
    		if(isPassword().equals(CricTTD.sign.getPassword())){
    			System.out.println("\nLogged in Successfully...\n");
    			System.out.println("               %%% WELCOME TO CRIC-TTD %%%                  \n\n");
    			return true;
    		}else{ 
    			System.out.println("Invalid Password. TRY AGAIN\n");
    		}
    	}
        return passwordCheck();
    }

    private boolean check(){
    	if(User.user.direct) {
    		if(lastName.equals(User.user.getLastName())){
                if(passwordCheck()){
                    return true;
                }else{
                    return passwordCheck();
                }
            }else{
                System.out.println("\nInvalid Last Name. TRY AGAIN\n");
                return check();
            }
    	}else {
    		if(isLastName().equals(CricTTD.sign.setLastName())){
                if(passwordCheck()){
                    return true;
                }else{
                    return passwordCheck();
                }
            }else{
                System.out.println("\nInvalid Last Name. TRY AGAIN\n");
                return check();
            }
    	}
        
    }*/
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
    		if(rmobile.equals(User.user.userMobile())) {
    			
    		    
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
    
    private String setFn() {
    	if(mobile_v()) {
    		System.out.println(Book.green+"\nFirst Name must be of atleast 4 characters and should not contain any special characters"+Book.reset);
    		System.out.print("\nSet New First Name: ");
    		this.nf=Sign_up.input.next();
    		if(nameLength(this.nf)) {
    			if(isnameValid(this.nf,0,this.nf.length())) {
    				return this.nf;
    			}else {
    				System.out.println(Book.red+"\nFirst Name should not have any Special characters\n"+Book.reset);
    				return setFn();
    			}
    		}
    		return setFn();
    	}
    	return "";
    }
    
    private String setLn() {
    	if(mobile_v()) {
    		System.out.println(Book.green+"\nLast Name must be of atleast 4 characters and should not contain any special characters"+Book.reset);
    		System.out.print("\nSet New Last Name: ");
    		this.nl=Sign_up.input.next();
    		if(nameLength(this.nl)) {
    			if(isnameValid(this.nl,0,this.nl.length())) {
    				return this.nl;
    			}else {
    				System.out.println(Book.red+"\nLast Name should not have any Special characters\n"+Book.reset);
    				return setLn();
    			}
    		}
    		return setLn();
    	}
    	return "";
    }
    
    private String setP() {
    	if(mobile_v()) {
    		System.out.print(Book.green+"\n(Your Password must have one Capital letter,one Small letter,");
    		System.out.println("one Number and one Special Character)"+Book.reset);
    		
    		System.out.print("\nSet New Password: ");
    		this.np=Sign_up.input.next();
    		if(isPassword(this.np)) {
    			return this.np;
    		}else {
    			return setP();
    		}
    	}
    	return "";
    }

    
    /*private void isLogin(){
    	if(User.user.direct) {
    		if(isFirstName().equals(User.user.getfirstName())){
    			check();
    		}else{
    			System.out.println("\nInvalid First Name. TRY AGAIN\n");
    			isLogin();
    		}  
    	}else {
    		
    		if(isFirstName().equals(CricTTD.sign.setFirstName())){
    			check();
    		}else{
    			System.out.println("\nInvalid First Name. TRY AGAIN\n");
    			isLogin();
    		}
    	}
    }*/
    
    private boolean nameLength(String name) {
    	if(name.length()<4) {
    		System.out.println(Book.red+"\nThe UserName you are entering should have atleast 4 Characters\n"+Book.reset);
    		return false;
    	}
    	return true;
    }
    
    
    private boolean isnameValid(String name,int i,int userName_length){
        if(i<userName_length){
            if((name.charAt(i)>='A'&&name.charAt(i)<'z')){
                return isnameValid(name, ++i, userName_length);
            }else{
                return false;
            }
        }
        return true;
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
    
    private boolean doLogin(){
        
        while(true) {
        	System.out.print("Do You Want to Login Now?(Yes/No): ");
        	
        	String bool=Sign_up.input.next();
        	
        	if(bool.toLowerCase().equals("yes")){
        		isFirstName();
        		return true;
        	}else if(bool.toLowerCase().equals("no")){
        		System.out.println("Will See You Again...\n\nTHANK YOU");
        		return false;
        	}else {
        		System.out.println("Enter appropriate choice\n");
        	}
        }
    }

    boolean getLogin(){
        return doLogin();
    }
    public static void main(String[] args) {
    	Login login=new Login();
        boolean b=login.getLogin();
        if(b){
            new CrickTemp();
        }
    }
}
