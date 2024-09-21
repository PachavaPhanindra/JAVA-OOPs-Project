package Project;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;

class Test implements Book{
	{
        System.out.println(Book.yellow+"\nHere are the details of MUMBAI VS ANDHRA Ranji\n"+Book.reset);

        System.out.println(Book.purple+"Date:oct 11th-oct 15th     Time: 9:30am-4:30pm    Venue: Eden Gardens Stadium,Kolkata\n\nTicket Price: ");
        System.out.println("               1->  Stand A: 90/-");
        System.out.println("               2->  Stand B: 70/-");
        System.out.println("               3->  Stand C: 40/-"+Book.reset);

    }

    private void ranji_ticket(int amount,int day){
        System.out.print("Number of Tickets you want: ");
            final int count=Sign_up.input.nextInt();

            final int cost=count*amount;


            while(Action.wallet.balance<cost){
                System.out.println(Book.red+"\nInSufficient Amount to book Ticket\nPlease Recharge before Booking\n"+Book.reset);
                Action.wallet.return_recharge();
            }

            Action.wallet.balance-=cost;

            System.out.println(Book.green+"\n$$$$ Booked Succesfully $$$$\n"+Book.reset);

            Random random=new Random();
            final int seatNo=1+random.nextInt(100);

            LocalDateTime now = LocalDateTime.now();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

            System.out.println("#### Ticket Details ####\n");

            System.out.println(Book.cyan+"____________________________________________________________");
            System.out.println("|                     ANDHRA VS MUMBAI                     |");
            System.out.println("|                                                          |");
            System.out.println("|   Time: 9:30am-4:30pm                                    |");
            System.out.println("|                                                          |");
            System.out.print("|   No.Tickets: "+count+"<----------------> Price: ");
            System.out.printf("%-16d|\n",cost);
            System.out.println("|                                                          |");
            System.out.println("| Seat:"+seatNo+"-"+(seatNo+count-1)+"           DAY:"+day+"   Date: oct "+(10+day)+",2024           |");
            System.out.println("|                                                          |");
            System.out.println("|Booked at: "+now.format(formatter)+"                            |    ");
            System.out.println("|                                                          |");
            System.out.println("| Venue: Eden Gardens Stadium,Kolkata                      |");
            System.out.println("____________________________________________________________"+Book.reset);

            System.out.println("\nYour current Balance is: "+Book.cyan+Action.wallet.balance+Book.reset);

            if(Action.wallet.balance<100){
                Action.wallet.getRecharge();
            }
    }
    
    private int day;
    
    private boolean isDay(int day,int n) {
    	if(day>0&&day<6) {
    		if(n==1) {    			
    			ranji_ticket(90,day);
    		}else if(n==2) {
    			ranji_ticket(70,day);
    		}else {
    			ranji_ticket(50,day);
    		}
    		return true;
    	}
    	System.out.print(Book.red+"\nEnter apprpriate day: "+Book.reset);
    	day=Sign_up.input.nextInt();
    	return isDay(day,n);
    }
    
    public void book(){
        System.out.print("Enter respective ID of stand while booking: ");
        int n=Sign_up.input.nextInt();
        

        if(n==1){
        	System.out.print("Enter Day: ");
            day=Sign_up.input.nextInt();
            isDay(day,n); 
        }else if(n==2){
        	System.out.print("Enter Day: ");
            int day=Sign_up.input.nextInt();
            isDay(day,n);   
        }else if(n==3){
        	System.out.print("Enter Day: ");
            int day=Sign_up.input.nextInt();
            isDay(day,n);   
        }else{
            System.out.println(Book.red+"Invalid stand ID, TRY AGAIN\n"+Book.reset);
            book();
        }
        
        while(true) {
        	
        	System.out.print("\nDo you want another Booking?(YES/NO): ");
        	
        	String book_again=Sign_up.input.next();
        	
        	if(book_again.toLowerCase().equals("yes")){
        		CrickTemp.action.getMainaction();
        		break;
        	}else if(book_again.toLowerCase().equals("no")){
        		System.out.println("\nTHANK YOU");
        		break;
        	}else {
        		System.out.println("Enter appropriate choice\n");
        	}
        }
    }
}
