package com.dt.info;

public class Page {
	private int currentpage;//当前页
	private int pagesize=3;//每页显示条数
	private int sumsize;//总条数
	private int lastpage;//最后一页
	public int getLastpage() {
		return lastpage;
	}
	public void setLastpage(int lastpage) {
		
		if(this.currentpage>lastpage){
			this.currentpage=lastpage;
		}else if(this.currentpage<1){
			this.currentpage=1;
		}else {
			this.lastpage = lastpage;
		}
	}
	public int getCurrentpage() {
		return currentpage;
	}
	public void setCurrentpage(int currentpage) {
		this.currentpage = currentpage;
	}
	public int getPagesize() {
		return pagesize;
	}
	public void setPagesize(int pagesize) {
		this.pagesize = pagesize;
	}
	public int getSumsize() {
		return sumsize;
	}
	public void setSumsize(int sumsize) {
		this.sumsize = sumsize;
	}
	
}
