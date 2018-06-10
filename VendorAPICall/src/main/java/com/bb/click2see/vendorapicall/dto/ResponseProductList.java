/**
 * 
 */
package com.bb.click2see.vendorapicall.dto;

import java.util.List;

/**
 * @author C34795
 *
 */
public class ResponseProductList {

	private List<ResponseProduct> productList;

	public List<ResponseProduct> getProductList() {
		return productList;
	}

	public void setProductList(List<ResponseProduct> productList) {
		this.productList = productList;
	}

	public ResponseProductList(List<ResponseProduct> productList) {
		this.productList = productList;
	}

}
