import java.util.Objects;

public class Test {

	public static void main(String[] args) {
		
		Account a=new Account("1010","홍길동",100);
		Account b=new Account("2020","미주",030);
		
		if(a.equals(b)) {
			System.out.println("두 계좌는 동일한 계좌입니다!");
		}else {
			System.out.println("두 계좌는 다른 계좌입니다!");
		}
		
	}
}


class Account{
	
	String accountNo;
	String ownerName;
	int balance;
	
	
	
	
	public Account(String accountNo, String ownerName, int balance) {
		super();
		this.accountNo = accountNo;
		this.ownerName = ownerName;
		this.balance = balance;
	}


	

	@Override
	public String toString() {
		return "Account [accountNo=" + accountNo + ", ownerName=" + ownerName + ", balance=" + balance + "]";
	}




	@Override
	public int hashCode() {
		return Objects.hash(accountNo, balance, ownerName);
	}




	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Account other = (Account) obj;
		if(accountNo==null) {
			if(other.accountNo != null) {
				return false;
			}
		}else if(!accountNo.equals(other.accountNo))
				return false;
	
		if(balance!=other.balance) {
			return false;
		}
		
		if(ownerName == null) {
			if(other.ownerName!=null) {
				return false;
			}
		}else if(!ownerName.equals(other.ownerName)) {
				return false;
	
}
	return true;	
	}
	
	

}