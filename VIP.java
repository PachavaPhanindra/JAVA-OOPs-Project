package Project;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

class VIP implements Book{
	{
        System.out.println(Book.yellow+"\nHere are the details of VIP Drahan in TTD\n"+Book.reset);

        System.out.println(Book.purple+"Date:Jul 23th,2024     Time: 10AM \n\nTicket Price: 91"+Book.reset);

    }

    private void vip_ticket(int amount){
        System.out.print("Number of Tickets you want: ");
            final int count=Sign_up.input.nextInt();

            final int cost=count*amount;


            while(Action.wallet.balance<cost){
                System.out.println(Book.red+"\nInSufficient Amount to book Ticket\nPlease Recharge before Booking\n"+Book.reset);
                Action.wallet.return_recharge();
            }

            Action.wallet.balance-=cost;

            System.out.println(Book.green+"\n$$$$ Booked Succesfully $$$$\n"+Book.reset);


            LocalDateTime now = LocalDateTime.now();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

            System.out.println("#### Ticket Details ####\n");

            System.out.println(Book.cyan+"************************************************************");
            System.out.println("*                        VIP-DARSHAN                       *");
            System.out.println("*                                                          *");
            System.out.println("*   Time: 10AM                                             *");
            System.out.println("*                                                          *");
            System.out.print("*   No.Tickets: "+count+"<-----------------> Price: ");
            System.out.printf("%-15d",cost);
            System.out.println("*                                                          *");
            System.out.println("* Date: Jul 23th,2024                                      *");
            System.out.println("*                                                          *");
            System.out.println("*Booked at: "+now.format(formatter)+"                            *");
            System.out.println("*                                                          *");
            System.out.println("* Om Namo Venkatesaya!                          Tirupathi  *");
            System.out.println("************************************************************"+Book.reset);

            System.out.println("\nYour current Balance is: "+Book.cyan+Action.wallet.balance+Book.reset);

            if(Action.wallet.balance<100){
                Action.wallet.getRecharge();
            }
    }

    public void book(){

        vip_ticket(91);   
        
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
