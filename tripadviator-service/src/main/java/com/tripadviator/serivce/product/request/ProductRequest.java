package com.tripadviator.serivce.product.request;

import com.tripadviator.serivce.base.AbstractRequest;

public class ProductRequest extends AbstractRequest
{
	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 7317703613504640375L;

	private String startDate;

	private String endDate;
	
	private String topX;
	
	private int destId;
	
	private String currencyCode;
	
	private int catId;
	
	private int subCatId;
	
	private boolean dealsOnly;

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getEndDate() {
		return endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public String getTopX() {
		return topX;
	}

	public void setTopX(String topX) {
		this.topX = topX;
	}

	public int getDestId() {
		return destId;
	}

	public void setDestId(int destId) {
		this.destId = destId;
	}

	public String getCurrencyCode() {
		return currencyCode;
	}

	public void setCurrencyCode(String currencyCode) {
		this.currencyCode = currencyCode;
	}

	public int getCatId() {
		return catId;
	}

	public void setCatId(int catId) {
		this.catId = catId;
	}

	public int getSubCatId() {
		return subCatId;
	}

	public void setSubCatId(int subCatId) {
		this.subCatId = subCatId;
	}

	public boolean isDealsOnly() {
		return dealsOnly;
	}

	public void setDealsOnly(boolean dealsOnly) {
		this.dealsOnly = dealsOnly;
	}

}
