package com.dt.info;

public class Order {
//订单列表
	private String pid;//订单编号
	private String ptime;//订单时间
	private String aname;//收货人
	private String aphone;//收货人电话
	private String apro;//收货人省份
	private String acity;//收货人城市
	private String axian;//收货人县
	private String aqvyu;//收货人所在区
	private String axiangxi;//收货人详细地址
	private String pric;//订单金额
	private String pst;//已经支付状态
    private String cid;//关闭订单编号
    private String ctime;//关闭订单时间
    private String cpric;//关闭订单金额
    private String sct;//关闭支付状态
    private String panme;
    private double  pprice;
    private int pcount;

    private String canme;
    private double  cprice;
    private int ccount;
	public Order() {
		super();
	}
	public Order(String pid, String ptime, String aname, String aphone, String apro, String acity, String axian,
			String aqvyu, String axiangxi, String pric, String pst, String cid, String ctime, String cpric, String sct,
			String panme, double pprice, int pcount, String canme, double cprice, int ccount) {
		super();
		this.pid = pid;
		this.ptime = ptime;
		this.aname = aname;
		this.aphone = aphone;
		this.apro = apro;
		this.acity = acity;
		this.axian = axian;
		this.aqvyu = aqvyu;
		this.axiangxi = axiangxi;
		this.pric = pric;
		this.pst = pst;
		this.cid = cid;
		this.ctime = ctime;
		this.cpric = cpric;
		this.sct = sct;
		this.panme = panme;
		this.pprice = pprice;
		this.pcount = pcount;
		this.canme = canme;
		this.cprice = cprice;
		this.ccount = ccount;
	}
	public String getPid() {
		return pid;
	}
	public void setPid(String pid) {
		this.pid = pid;
	}
	public String getPtime() {
		return ptime;
	}
	public void setPtime(String ptime) {
		this.ptime = ptime;
	}
	public String getAname() {
		return aname;
	}
	public void setAname(String aname) {
		this.aname = aname;
	}
	public String getAphone() {
		return aphone;
	}
	public void setAphone(String aphone) {
		this.aphone = aphone;
	}
	public String getApro() {
		return apro;
	}
	public void setApro(String apro) {
		this.apro = apro;
	}
	public String getAcity() {
		return acity;
	}
	public void setAcity(String acity) {
		this.acity = acity;
	}
	public String getAxian() {
		return axian;
	}
	public void setAxian(String axian) {
		this.axian = axian;
	}
	public String getAqvyu() {
		return aqvyu;
	}
	public void setAqvyu(String aqvyu) {
		this.aqvyu = aqvyu;
	}
	public String getAxiangxi() {
		return axiangxi;
	}
	public void setAxiangxi(String axiangxi) {
		this.axiangxi = axiangxi;
	}
	public String getPric() {
		return pric;
	}
	public void setPric(String pric) {
		this.pric = pric;
	}
	public String getPst() {
		return pst;
	}
	public void setPst(String pst) {
		this.pst = pst;
	}
	public String getCid() {
		return cid;
	}
	public void setCid(String cid) {
		this.cid = cid;
	}
	public String getCtime() {
		return ctime;
	}
	public void setCtime(String ctime) {
		this.ctime = ctime;
	}
	public String getCpric() {
		return cpric;
	}
	public void setCpric(String cpric) {
		this.cpric = cpric;
	}
	public String getSct() {
		return sct;
	}
	public void setSct(String sct) {
		this.sct = sct;
	}
	public String getPanme() {
		return panme;
	}
	public void setPanme(String panme) {
		this.panme = panme;
	}
	public double getPprice() {
		return pprice;
	}
	public void setPprice(double pprice) {
		this.pprice = pprice;
	}
	public int getPcount() {
		return pcount;
	}
	public void setPcount(int pcount) {
		this.pcount = pcount;
	}
	public String getCanme() {
		return canme;
	}
	public void setCanme(String canme) {
		this.canme = canme;
	}
	public double getCprice() {
		return cprice;
	}
	public void setCprice(double cprice) {
		this.cprice = cprice;
	}
	public int getCcount() {
		return ccount;
	}
	public void setCcount(int ccount) {
		this.ccount = ccount;
	}
	@Override
	public String toString() {
		return "Order [pid=" + pid + ", ptime=" + ptime + ", aname=" + aname + ", aphone=" + aphone + ", apro=" + apro
				+ ", acity=" + acity + ", axian=" + axian + ", aqvyu=" + aqvyu + ", axiangxi=" + axiangxi + ", pric="
				+ pric + ", pst=" + pst + ", cid=" + cid + ", ctime=" + ctime + ", cpric=" + cpric + ", sct=" + sct
				+ ", panme=" + panme + ", pprice=" + pprice + ", pcount=" + pcount + ", canme=" + canme + ", cprice="
				+ cprice + ", ccount=" + ccount + "]";
	}
	
	

}
