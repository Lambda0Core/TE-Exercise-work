package com.techelevator.farm;

import java.math.BigDecimal;

public class Cow extends FarmAnimal implements MarketInterface {
	private BigDecimal price;

	public Cow() {
		super("Cow", "moo!");
//		price = new BigDecimal("1500.00");
		price = BigDecimal.valueOf(1500.00);
	}

	public Cow(BigDecimal price){
		super("Cow", "moo!");
		this.price = price;
	}
	@Override
	public BigDecimal getPrice() {
		return this.price;
	}
}
