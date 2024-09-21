package Project;

class Cricket implements Book{
	{
        System.out.println(Book.yellow+"The Coming up Matches are : "+Book.reset);

        System.out.println(Book.cyan+"\n1->  BHARAT VS AUSTRALIA ODI(Aug 1st,2024)\n");
        System.out.println("2->  MUMBAI VS ANDHRA Ranji(oct 11th-oct 15th)\n");
        System.out.println("3->  RCB VS CSK IPL(Mar 25th,2025)\n"+Book.reset);

    }
    
    
    public void book(){
        System.out.print("Enter the respective ID of match you want to book: ");
        final int n=Sign_up.input.nextInt();

        if(n==1){
            ODI odi=new ODI();
            odi.book();
        }else if(n==2){
            Test test=new Test();
            test.book();
        }else if(n==3){
            Ipl ipl=new Ipl();
            ipl.book();
        }else{
            System.out.println(Book.red+"INVALID MATCH ID..\n"+Book.reset);
            book();
        }
    }

    public static void main(String[] args) {
        Cricket cricket=new Cricket();
        cricket.book();
    }
}
