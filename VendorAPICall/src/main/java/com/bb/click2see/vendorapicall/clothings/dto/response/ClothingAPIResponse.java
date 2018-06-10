
package com.bb.click2see.vendorapicall.clothings.dto.response;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ClothingAPIResponse {

	private String searchTerm;
	private Object categoryName;
	private int itemCount;
	private String redirectUrl;
	private List<Product> products = null;
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	public String getSearchTerm() {
		return searchTerm;
	}

	public void setSearchTerm(String searchTerm) {
		this.searchTerm = searchTerm;
	}

	public Object getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(Object categoryName) {
		this.categoryName = categoryName;
	}

	public int getItemCount() {
		return itemCount;
	}

	public void setItemCount(int itemCount) {
		this.itemCount = itemCount;
	}

	public String getRedirectUrl() {
		return redirectUrl;
	}

	public void setRedirectUrl(String redirectUrl) {
		this.redirectUrl = redirectUrl;
	}

	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}

	public Map<String, Object> getAdditionalProperties() {
		return this.additionalProperties;
	}

	public void setAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
	}

}
