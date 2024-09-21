package Project;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;

class Ipl implements Book{
	{
        System.out.println(Book.yellow+"\nHere are the details of RCB vs CSK TATA IPL March 25th,2025\n"+Book.purple);

        System.out.println(Book.purple+"Date:Mar25th,2025     Time: 7:30pm-11:30pm    Venue: M Chinnaswami Stadium,Bengaluru \n\nTicket Price: ");
        System.out.println("               1->  Stand A: 95/-");
        System.out.println("               2->  Stand B: 75/-");
        System.out.println("               3->  Stand C: 45/-"+Book.reset);

    }

    private void ipl_ticket(int amount,String date){
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

            System.out.println(Book.white+"____________________________________________________________");
            System.out.println("|                           RCB VS CSK                     |");
            System.out.println("|                                                          |");
            System.out.println("|   Time: 7:30pm-11:30pm                                   |");
            System.out.println("|                                                          |");
            System.out.print("|   No.Tickets: "+count+"<----------------> Price: ");
            System.out.printf("%-19d|\n",cost);
            System.out.println("|                                                          |");
            System.out.println("| Seat:"+seatNo+"-"+(seatNo+count-1)+"            Date: "+date+"                  |");
            System.out.println("|                                                          |");
            System.out.println("| Venue: M Chinnaswami Stadium,Bengaluru                   |");
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
            ipl_ticket(95,"Mar 25,2025");   
        }else if(n==2){
            ipl_ticket(75,"Mar 25,2025");   
        }else if(n==3){
            ipl_ticket(45,"Mar 25,2025");   
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
