
public class Test_220104_서장원_문제3 {

	
	public static void main(String[] args) {
		
		Account a=new Account("홍길동","123-45-6789", 10000);
		a.deposit(5000);
		a.withdraw(7000);
		a.withdraw(30000);
	}
}

class Account{
	
	String accountNo;
	String owerName;
	int balance;
	
	public Account(String accountNo, String owerName, int balance) {
		super();
		this.accountNo = accountNo;
		this.owerName = owerName;
		this.balance = balance;
	}
	
	public void deposit(int amount) {
		balance+=amount;
		System.out.println("입금 금액: " + amount +"원, 현재 잔고: "+ balance+"원");
		
	}
	
	public void withdraw(int amount) {
		
		if(balance-amount<0) {
			System.out.println("현재잔고: "+balance+ "원, 출금할 금액: "+ amount+"원");
			System.out.println("잔고가 부족하여 출금할 수 없습니다.");
		}else {
			
			System.out.println("현재잔고: "+balance+ "원, 출금할 금액: "+ amount+"원");
			balance-=amount;
			System.out.println(amount+"원이 출금되었습니다 (현재잔고: "+ balance+"원)" );
			
		}
		
		
		
		
	}


	
	
	
	
}
