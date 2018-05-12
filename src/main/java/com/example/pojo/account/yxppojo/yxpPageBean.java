package com.example.pojo.account.yxppojo;

import java.util.List;

public class yxpPageBean {

	public yxpPageBean(Integer currpage, Integer pagesize, Object data, Integer count) {
		this.currpage = currpage;
		this.pagesize = pagesize;
		this.data = data;
		this.count = count;
		this.total = count%pagesize==0?count/pagesize:count/pagesize+1;
		this.prevpage = currpage-1>0?currpage-1:1;
		this.nextpage = currpage+1<total?currpage+1:total;
	}
	private Integer currpage;
	private Integer pagesize;
	private Object data;
	private Integer count;
	private Integer total;
	private Integer prevpage;
	private Integer nextpage;
	public Integer getCurrpage() {
		return currpage;
	}
	public void setCurrpage(Integer currpage) {
		this.currpage = currpage;
	}
	public Integer getPagesize() {
		return pagesize;
	}
	public void setPagesize(Integer pagesize) {
		this.pagesize = pagesize;
	}
	public Object getData() {
		return data;
	}
	public void setData(Object data) {
		this.data = data;
	}
	public Integer getCount() {
		return count;
	}
	public void setCount(Integer count) {
		this.count = count;
	}
	public Integer getTotal() {
		return total;
	}
	public void setTotal(Integer total) {
		this.total = total;
	}
	public Integer getPrevpage() {
		return prevpage;
	}
	public void setPrevpage(Integer prevpage) {
		this.prevpage = prevpage;
	}
	public Integer getNextpage() {
		return nextpage;
	}
	public void setNextpage(Integer nextpage) {
		this.nextpage = nextpage;
	}
}

