package com.vatsalya.library_management;

import java.io.Serializable;

@SuppressWarnings("serial")
public class BookBean implements Serializable {
	
	private String bName,bId,aName;
	private float bPrice;
	private int bQty;
	
	public BookBean() {}

	public String getbName() {
		return bName;
	}

	public void setbName(String bName) {
		this.bName = bName;
	}

	public String getbId() {
		return bId;
	}

	public void setbId(String bId) {
		this.bId = bId;
	}

	public String getaName() {
		return aName;
	}

	public void setaName(String aName) {
		this.aName = aName;
	}

	public float getbPrice() {
		return bPrice;
	}

	public void setbPrice(float bPrice) {
		this.bPrice = bPrice;
	}

	public int getbQty() {
		return bQty;
	}

	public void setbQty(int bQty) {
		this.bQty = bQty;
	}


}
