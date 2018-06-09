/**
 * 
 */
package com.bb.click2see.vendorapicall.dto;

public class Product {
	
	private final int id;

	private final String name;
	
	public Product(int id, String name) {
		this.id =id;
		this.name =name;
	}

	
	
	/*private Double price = 0d;
	
	private String description = null;
	
	private String offers = null;
	
	private boolean isLoanAvailable = false;
	
	private String loanOffers = null;*/

	public int getId() {
		return id;
	}

	/*public void setId(int id) {
		this.id = id;
	}
*/
	public String getName() {
		return name;
	}

/*	public void setName(String name) {
		this.name = name;
	}*/

	/*public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getOffers() {
		return offers;
	}

	public void setOffers(String offers) {
		this.offers = offers;
	}

	public boolean isLoanAvailable() {
		return isLoanAvailable;
	}

	public void setLoanAvailable(boolean isLoanAvailable) {
		this.isLoanAvailable = isLoanAvailable;
	}

	public String getLoanOffers() {
		return loanOffers;
	}

	public void setLoanOffers(String loanOffers) {
		this.loanOffers = loanOffers;
	}
	*/
	
}
