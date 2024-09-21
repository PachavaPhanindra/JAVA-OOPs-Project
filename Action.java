package Project;

class Action {
	static Wallet wallet=new Wallet();
    {
        wallet.getRecharge();
    }

    
    private void main_action(){
    	System.out.println(Book.yellow+"\n-----Enter 1 for booking other than 1 will terminaate action----\n"+Book.reset);

        System.out.print("\n1-> Bookings: ");

        int n=Sign_up.input.nextInt();

        
        if(n==1){
            //System.out.print("BOOKINGS $$$\n");

            Booking booking=new Booking();
            booking.booking();

        }else{
        	while(true) {
        		
        		System.out.print("\nDo you really want to exit?(YES/NO): ");
        		String exit=Sign_up.input.next();
        		
        		if(exit.toLowerCase().equals("yes")){
        			System.out.println("\nTHANK YOU");
        			break;
        		}else if(exit.toLowerCase().equals("no")){
        			System.out.println("\nEnter Appropriate Action\n");
        			main_action();
        			break;
        		}else {
        			System.out.println("Enter appropriate choice\n");
        		}
        	}

        }
    }

    void getMainaction(){
        main_action();
    }
    public static void main(String[] args) {
        Action action=new Action();
        action.getMainaction();
    }
}
