package Project;

class Booking {
	{
        System.out.println(Book.yellow+"\n-----Enter ID of Respective BOOKING You want----"+Book.reset);
    }

    void booking(){
        
        System.out.print("\nBookings: ");

        System.out.println("1->  Cricket Match Ticket");
        System.out.println("          2->  TTD Darshan Ticket ");

        int n=Sign_up.input.nextInt();

        if(n>0&&n<3){
            System.out.print(Book.white+"\n$$$ WELCOME TO ");

            if(n==1){
                System.out.print("CRICKET $$$\n\n"+Book.reset);

                Cricket cricket=new Cricket();
                cricket.book();

            }else{
                System.out.print("TTD $$$\n\n"+Book.reset);
                
                TTD ttd=new TTD();
                ttd.book();

            }
        }else{
            System.out.println("\nEnter Appropriate Booking ID\n");
            booking();
        }
    }
}
