package progam.datatype;

public class Bank {
	public static void main(String[] args) {
		
	
	String custmor_name="varun";
	long custmore_Account_no=23445615255256l;
	double account_blance=45090.449;
	double deposite_Amount=5000;
	double total_Amount=account_blance+deposite_Amount;
	
	System.out.println("Custmore name:- "+custmor_name);
	System.out.println("Custmore account number:- "+custmore_Account_no);
	System.out.println("account blance:- "+account_blance);
	System.out.println("account blance "+account_blance+" deposite amount "+deposite_Amount+" total amount "+total_Amount);
	
	double withdraw_amount=40000;
	double remanining_amount=total_Amount-withdraw_amount;
	System.out.println("total amount in account "+total_Amount+" withdraw amount form account "+withdraw_amount+"  remaining amonut in account "+remanining_amount);


	
	}
}
