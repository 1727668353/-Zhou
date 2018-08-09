package com.accp.springmvc.entity;

public class tb_detail {
	  private String billno;
	  private int lineid;
	  private String goodsname;
	  private float goodsnum;
	  private float goodsprice;
	  private float goodsmoneyamt;
	  private int  ispresent;
	public String getBillno() {
		return billno;
	}
	public void setBillno(String billno) {
		this.billno = billno;
	}
	public int getLineid() {
		return lineid;
	}
	public void setLineid(int lineid) {
		this.lineid = lineid;
	}
	public String getGoodsname() {
		return goodsname;
	}
	public void setGoodsname(String goodsname) {
		this.goodsname = goodsname;
	}
	public float getGoodsnum() {
		return goodsnum;
	}
	public void setGoodsnum(float goodsnum) {
		this.goodsnum = goodsnum;
	}
	public float getGoodsprice() {
		return goodsprice;
	}
	public void setGoodsprice(float goodsprice) {
		this.goodsprice = goodsprice;
	}
	public float getGoodsmoneyamt() {
		return goodsmoneyamt;
	}
	public void setGoodsmoneyamt(float goodsmoneyamt) {
		this.goodsmoneyamt = goodsmoneyamt;
	}
	public int getIspresent() {
		return ispresent;
	}
	public void setIspresent(int ispresent) {
		this.ispresent = ispresent;
	}
}
