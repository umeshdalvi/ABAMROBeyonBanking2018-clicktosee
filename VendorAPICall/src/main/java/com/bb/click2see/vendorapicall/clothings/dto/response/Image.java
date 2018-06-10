
package com.bb.click2see.vendorapicall.clothings.dto.response;

import java.util.HashMap;
import java.util.Map;

public class Image {

	private String url;
	private String size;
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public Map<String, Object> getAdditionalProperties() {
		return this.additionalProperties;
	}

	public void setAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
	}

}
