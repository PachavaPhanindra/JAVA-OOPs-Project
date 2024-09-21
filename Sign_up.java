package Project;

import java.util.Scanner;
import java.util.Random;
//import java.time.LocalDateTime;
//import java.time.format.DateTimeFormatter;

class Sign_up {
	static Scanner input=new Scanner(System.in);

    {
        System.out.println(Book.yellow+"\n**********************Sign_up************************\n"+Book.reset);
    }
    
    private boolean nameLength(String name) {
    	if(name.length()<4) {
    		System.out.println(Book.red+"\nThe name you are entering should have atleast 4 Characters\n"+Book.reset);
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

    {
        System.out.print("Enter First Name: ");
    }

    private String firstName=input.next();

    String setFirstName(){
    	
    	if(nameLength(firstName)) {   		
    		if(isnameValid(firstName,0,firstName.length())){
    			return firstName;
    		}else{
    			System.out.println(Book.red+"\nFirst Name should not have any Special characters\n"+Book.reset);
    			System.out.print("Enter First Name: ");
    			firstName=input.next();
    		}
    	}else {
    		System.out.print("Enter First Name: ");
			firstName=input.next();
    	}
        return setFirstName();
    }

    private String lastName;

    {
        setFirstName();
        System.out.print("Enter Last Name: ");
        lastName=input.next();
        setLastName();
    }


    String setLastName(){
    	
    	if(nameLength(lastName)) {    		
    		if(isnameValid(lastName,0,lastName.length())){
    			return lastName;
    		}else{
    			System.out.println(Book.red+"\nLast Name should not have any Special characters\n"+Book.reset);
    			System.out.print("Enter Last Name: ");
    			lastName=input.next();
    		}
    	}else {
    		System.out.print("Enter Last Name: ");
			lastName=input.next();
    	}
        return setLastName();
    }


    private String password;
    
    private String n;
    
    private boolean isMobileno(String n,int length) {
    	for(int i=0;i<length;i++) {
    		char ch=n.charAt(i);
    		if(ch<'0'||ch>'9') {
    			return false;
    		}
    	}
    	return true;
    	
    }
    
    private void setMobile_Number(){
        System.out.print("Enter Mobile Number: ");

        String n=input.next();
        int mobile_length=n.length();
        
        if(isMobileno(n,mobile_length)) {
        	if(mobile_length==10){
        		char fd=n.charAt(0);
        		if(fd>='6'&&fd<='9') {      			
        			this.n=n;
        		}else {
        			System.out.println(Book.red+"\n# Mobile Number should start with 6/7/8/9 only. #\n"+Book.reset);
        			setMobile_Number();
        		}
        	}else{
        		System.out.println(Book.red+"\n**Invalid Mobile Number**Mobile Number should have 10 digits Only.\n"+Book.reset);
        		setMobile_Number();
        	}
        }else {
        	System.out.println(Book.red+"\nMobile Number Should only have digits\n"+Book.reset);
        	setMobile_Number();
        }
    }

    private String getMobile_Number(){
        setMobile_Number();
        return n;
    }
    
    private String mobileNo=getMobile_Number();

    Random random=new Random();
    
    private int generated_OTP=random.nextInt(9000)+1000;
    
    {
        System.out.println("\nAn OTP has been sent to your Mobile Number.Verify it...");
        System.out.println("Your OTP to Sign-in: "+Book.yellow+generated_OTP+Book.reset+"\n");
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
    
    private String setPassword() {
    	System.out.print(Book.green+"(Your Password must have one Capital letter,one Small letter,");
        System.out.println("one Number and one Special Character)\n"+Book.reset);
        
        System.out.print("Enter Strong Password: ");
        final String password=input.next();
        
        if(!isPassword(password)) {
        	return setPassword();
        }
        return password;
    }
    
    
    private boolean isOTP_correct(){
        System.out.print("Enter OTP: ");
        int entered_OTP=input.nextInt();

        if(generated_OTP==entered_OTP){
            return true;
        }
        return false;
    }

    
    private boolean isSign_up(int count){
    	
    	if(count>0) {    		
    		if(isOTP_correct()){
    			System.out.println(Book.green+"\nSigned up Successfully...\n\n"+Book.reset);
    			
    			System.out.print("Create Password: ");
    			
    			String setPassword=setPassword();
    			
    			System.out.print("Confirm Password: ");
    			String repassword=input.next();
    			
    			while(!repassword.equals(setPassword)){
    				System.out.println(Book.red+"\nPassword not matched"+Book.reset);
    				System.out.print("Re enter Password: ");
    				repassword=input.next();
    			}
    			
    			this.password=repassword;
    			return true;
    		}else{
    			System.out.println(Book.red+"Wrong OTP. TRY AGAIN\n"+Book.reset);
    			return isSign_up(--count);
    		}
    	}
    	
    	System.out.println(Book.green+"\nYou exeeded OTP limitations\n"+Book.reset);
    
        
        while(true) {        	
        	System.out.print("Do you want to continue Sign_up?(YES/NO): ");
        	String new_otp=input.next();
        	if(new_otp.toLowerCase().equals("yes")){
        		generated_OTP=random.nextInt(9000)+1000;
        		System.out.println("Re-generated OTP: "+Book.yellow+generated_OTP+Book.reset+"\n");
        		return isSign_up(3);
        	}else if(new_otp.toLowerCase().equals("no")) {      	
        		System.out.println("\nTHANK YOU");
        		return false;
        	}else {
        		System.out.println("Enter appropriate choice\n");
        	}
        }
    }

    String getPassword(){
        return password;
    }

    boolean getSign_up(){
        return isSign_up(3);
    }
    
    String mobile() {
    	return mobileNo;
    }

    public static void main(String[] args) {
        Sign_up sign=new Sign_up();
        sign.getSign_up();
    }
}
