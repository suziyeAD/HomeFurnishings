package com.dt.info;

public class Order {
//�����б�
	private String pid;//�������
	private String ptime;//����ʱ��
	private String aname;//�ջ���
	private String aphone;//�ջ��˵绰
	private String apro;//�ջ���ʡ��
	private String acity;//�ջ��˳���
	private String axian;//�ջ�����
	private String aqvyu;//�ջ���������
	private String axiangxi;//�ջ�����ϸ��ַ
	private String pric;//�������
	private String pst;//�Ѿ�֧��״̬
    private String cid;//�رն������
    private String ctime;//�رն���ʱ��
    private String cpric;//�رն������
    private String sct;//�ر�֧��״̬
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
