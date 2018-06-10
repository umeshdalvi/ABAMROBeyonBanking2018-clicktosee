
package com.bb.click2see.vendorapicall.clothings.dto.response;

import java.util.HashMap;
import java.util.Map;

public class Price {

	private Current current;
	private Previous previous;
	private Rrp rrp;
	private boolean isMarkedDown;
	private boolean isOutletPrice;
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	public Current getCurrent() {
		return current;
	}

	public void setCurrent(Current current) {
		this.current = current;
	}

	public Previous getPrevious() {
		return previous;
	}

	public void setPrevious(Previous previous) {
		this.previous = previous;
	}

	public Rrp getRrp() {
		return rrp;
	}

	public void setRrp(Rrp rrp) {
		this.rrp = rrp;
	}

	public boolean isIsMarkedDown() {
		return isMarkedDown;
	}

	public void setIsMarkedDown(boolean isMarkedDown) {
		this.isMarkedDown = isMarkedDown;
	}

	public boolean isIsOutletPrice() {
		return isOutletPrice;
	}

	public void setIsOutletPrice(boolean isOutletPrice) {
		this.isOutletPrice = isOutletPrice;
	}

	public Map<String, Object> getAdditionalProperties() {
		return this.additionalProperties;
	}

	public void setAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
	}

}
