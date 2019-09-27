import java.math.BigInteger;

import org.junit.jupiter.params.shadow.com.univocity.parsers.conversions.BigIntegerConversion;

public class Rib {
	//int banque, etablissement, clef;
	String accountNumber;
	BigInteger accountNumberInt;
	
	
	
	
	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public BigInteger getAccountNumberInt() {
		return accountNumberInt;
	}

	public void setAccountNumberInt(BigInteger accountNumberInt) {
		this.accountNumberInt = accountNumberInt;
	}

	public Rib(String string) {
		// TODO Auto-generated constructor stub
		accountNumber=string;
		accountNumberInt=null;
		
	}

	private boolean Verific() {
		// TODO Auto-generated method stub

	return true;
	}

	public String replace() {
		for (char c='A'; c<='Z'; c++) {
			//int n=compte.indexOf(c);
			switch (c) {
			case 'A':
			case 'J':
				accountNumber.replace(c, (char) 1);
				break;
			default:
				break;
			}	
		}
		return accountNumber;
	}
	
	public boolean check() {
		accountNumberInt = BigIntegerConversion(String accountNumber);
		accountNumberInt = ((Object) this.getAccountNumberInt()).BigInteger();
		if (accountNumberInt%97)==0) {
			return true;
		}
		return false;
		
	}
	
	
	
}
