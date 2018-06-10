
package com.bb.click2see.vendorapicall.clothings.dto.response;

import java.util.HashMap;
import java.util.Map;

public class Previous {

	private Object value;
	private String text;
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	public Object getValue() {
		return value;
	}

	public void setValue(Object value) {
		this.value = value;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public Map<String, Object> getAdditionalProperties() {
		return this.additionalProperties;
	}

	public void setAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
	}

}
