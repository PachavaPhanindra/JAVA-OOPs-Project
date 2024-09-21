package Project;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;

class ODI implements Book{
	{
        System.out.println(Book.yellow+"\nHere are the details of BHARAT VS AUSTRALIA ODI\n"+Book.reset);

        System.out.println(Book.purple+"Date:Aug 1st,2024     Time: 2pm-10pm    Venue: Wankhade Stadium,Mumbai\n\nTicket Price: ");
        System.out.println("               1->  Stand A: 99/-");
        System.out.println("               2->  Stand B: 79/-");
        System.out.println("               3->  Stand C: 49/-"+Book.reset);

    }

    private void odi_ticket(int amount,String date){
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

            System.out.println(Book.yellow+"____________________________________________________________");
            System.out.println("|                     BHARAT VS AUSTRALIA                  |");
            System.out.println("|                                                          |");
            System.out.println("|   Time: 2pm-10pm                                         |");
            System.out.println("|                                                          |");
            System.out.print("|   No.Tickets: "+count+"<----------------> Price: ");
            System.out.printf("%-16d|\n",cost);
            System.out.println("|                                                          |");
            System.out.println("| Seat:"+seatNo+"-"+(seatNo+count-1)+"            Date: "+date+"                   |");
            System.out.println("|                                                          |");
            System.out.println("| Venue: Wankhade Stadium,Mumbai                           |");
            System.out.println("|                                                          |");
            System.out.println("|Booked at: "+now.format(formatter)+"                            |    ");
            System.out.println("____________________________________________________________"+Book.reset);

            System.out.println("\nYour current Balance is: "+Book.cyan+Action.wallet.balance+Book.reset);

            if(Action.wallet.balance<100){
                Action.wallet.getRecharge();
            }
    }
    
    public void book(){
        System.out.print("Enter respective ID of stand while booking: ");
        int n=Sign_up.input.nextInt();

        if(n==1){
            odi_ticket(99,"Aug 1,2024");   
        }else if(n==2){
            odi_ticket(79,"Aug 1,2024");   
        }else if(n==3){
            odi_ticket(49,"Aug 1,2024");   
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
    public static void main(String[] args) {
        
    }
}
