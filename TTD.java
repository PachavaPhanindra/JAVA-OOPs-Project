package Project;

class TTD implements Book{
	{
        System.out.println("The Coming TTD Darshan Tickets are : ");

        System.out.println("\n1->  VIP Break Darshan\n");
        System.out.println("2->  Arjita Seva\n");
        System.out.println("3->  Suprabhata Seva\n");
    }

    public void book(){
        System.out.print("Enter the respective ID of Darshan you want to book: ");
        final int n=Sign_up.input.nextInt();

        if(n==1){
            VIP vip=new VIP();
            vip.book();
        }else if(n==2){
            Arjita arjita=new Arjita();
            arjita.book();
        }else if(n==3){
            Suprabhata suprabhata=new Suprabhata();
            suprabhata.book();
        }else{
            System.out.println("INVALID Darshan ID..\n");
            book();
        }
    }

    public static void main(String[] args) {
        TTD ttd=new TTD();
        ttd.book();
    }
}
