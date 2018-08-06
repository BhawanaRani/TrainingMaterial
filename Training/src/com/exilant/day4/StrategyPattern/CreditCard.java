package com.exilant.day4.StrategyPattern;

public class CreditCard implements Payment{
	private String name;
private int cardNumber;
private String bankName;
private  double discount;
private String cvv;
private String dateExpiry;

public CreditCard(String name, int cardNumber, String bankName, double discount, String cvv, String dateExpiry) {
	super();
	this.name = name;
	this.cardNumber = cardNumber;
	this.bankName = bankName;
	this.discount = discount;
	this.cvv = cvv;
	this.dateExpiry = dateExpiry;
}

@Override
public String toString() {
	return "CreditCard [name=" + name + ", cardNumber=" + cardNumber + ", bankName=" + bankName + ", discount="
			+ discount + ", cvv=" + cvv + ", dateExpiry=" + dateExpiry + "]";
}


@Override
public void pay(int amount) {
	
	if(this.bankName.equalsIgnoreCase("hdfc"))
	{
		amount=(int)(amount-(amount*0.1));
		System.out.println("you are paying with hdfc paytm and got discount"+amount);
	}
	else
	{
		System.out.println("paid amount"+amount);
	}
}

}
