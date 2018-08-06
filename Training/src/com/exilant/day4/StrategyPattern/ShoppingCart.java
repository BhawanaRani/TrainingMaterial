package com.exilant.day4.StrategyPattern;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
List<Item> items;


public ShoppingCart() {
	items=new ArrayList<>();
}

public void addList(List<Item> items)
{
	this.items=items;
}
public void addItem(Item item)
{
	this.items.add(item);
}


public void removeItem(Item item)
{
	this.items.remove(item);
}


public void modifyItemCount(Item item)
{
	
}


public int calculated()
{
	int sum=0;
	for(Item item:items)
	{
		sum=sum+(item.getPrice()*item.getQty());
	}
	return sum;
}


public void checkOut(Payment paymentStrategy)
{
	paymentStrategy.pay(calculated());
}
}
