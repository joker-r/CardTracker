package com.cardtracker.model;

public class Card {
	 private int cardnumber;

	public int getCardnumber() {
		return cardnumber;
	}

	public void setCardnumber(int cardnumber) {
		this.cardnumber = cardnumber;
	}

	@Override
	public String toString() {
		return "Card [cardnumber=" + cardnumber + "]";
	}
	 
}
