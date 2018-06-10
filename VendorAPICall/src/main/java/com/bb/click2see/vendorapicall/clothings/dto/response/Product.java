
package com.bb.click2see.vendorapicall.clothings.dto.response;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Product {

	private int id;
	private String name;
	private Price price;
	private List<Image> images = null;
	private String brandName;
	private String colour;
	private boolean hasVariantColours;
	private Object groupId;
	private int productCode;
	private boolean hasVariantPrices;
	private String productType;
	private Object variantItemCount;
	private String url;
	private String baseImageUrl;
	private boolean isRecommended;
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Price getPrice() {
		return price;
	}

	public void setPrice(Price price) {
		this.price = price;
	}

	public List<Image> getImages() {
		return images;
	}

	public void setImages(List<Image> images) {
		this.images = images;
	}

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public boolean isHasVariantColours() {
		return hasVariantColours;
	}

	public void setHasVariantColours(boolean hasVariantColours) {
		this.hasVariantColours = hasVariantColours;
	}

	public Object getGroupId() {
		return groupId;
	}

	public void setGroupId(Object groupId) {
		this.groupId = groupId;
	}

	public int getProductCode() {
		return productCode;
	}

	public void setProductCode(int productCode) {
		this.productCode = productCode;
	}

	public boolean isHasVariantPrices() {
		return hasVariantPrices;
	}

	public void setHasVariantPrices(boolean hasVariantPrices) {
		this.hasVariantPrices = hasVariantPrices;
	}

	public String getProductType() {
		return productType;
	}

	public void setProductType(String productType) {
		this.productType = productType;
	}

	public Object getVariantItemCount() {
		return variantItemCount;
	}

	public void setVariantItemCount(Object variantItemCount) {
		this.variantItemCount = variantItemCount;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getBaseImageUrl() {
		return baseImageUrl;
	}

	public void setBaseImageUrl(String baseImageUrl) {
		this.baseImageUrl = baseImageUrl;
	}

	public boolean isIsRecommended() {
		return isRecommended;
	}

	public void setIsRecommended(boolean isRecommended) {
		this.isRecommended = isRecommended;
	}

	public Map<String, Object> getAdditionalProperties() {
		return this.additionalProperties;
	}

	public void setAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
	}

}
