/**
 * 
 */
package com.bb.click2see.vendorapicall.dto;

import lombok.Data;

@Data
public class Product {

	public Product(long incrementAndGet, int format) {
		
	}
	
	private int id;

	private String name;
	
	private Double price;
	
	private String description;
	
	private String offers;
	
	private boolean isLoanAvailable;
	
	private String loanOffers;
}
