package Project;

class User {
	static User user=new User();
	
	private String firstName="Virat";
	private String lastName="Kohli";
	private String password="Vk#18";
	private String mobile="6301444132";
	
	boolean direct=false;
	
	{
		System.out.println(Book.cyan+"                   %%%WELCOME TO Cricket queue-TTD view%%%                       \n"+Book.reset);
		
		while(true) {
			System.out.print("Are you new to the Cricket queue-TTD view? (YES/NO): ");
			
			String new_user=Sign_up.input.next();
			
			if(new_user.toLowerCase().equals("no")){
				direct=true;
				
				break;
			}else if(new_user.toLowerCase().equals("yes")) {
				break;
			}else {
				System.out.println("Enter appropriate choice\n");
			}
		}
	}
	
	String getfirstName() {
		return firstName;
	}
	
	String getLastName() {
		return lastName;
	}
	
	String getPassword() {
		return password;
	}
	
	String userMobile() {
		return mobile;
	}
	
	public static void main(String[] args) {
		
		if(user.direct) {	
			Login login=new Login();
			boolean b_login=login.getLogin();
			if(b_login){
				new CrickTemp();
			}
		}else {
			new CricTTD();
		}
	}
}
