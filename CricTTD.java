package Project;

class CricTTD {
	static Sign_up sign=new Sign_up();
	{	
		boolean b_sign=sign.getSign_up();
		if(b_sign) {		
			Login login=new Login();
			boolean b_login=login.getLogin();
			if(b_login){
				new CrickTemp();
			}
		}
	}
	
    public static void main(String[] args) {
    	new CricTTD();
    }
}


