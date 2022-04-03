package org.company;

public class CompanyInfo {
	public void companyName(String companyname,String city,int pincode) {
		System.out.println(companyname+"\n"+city+"\t"+pincode);
	}
	public static void main(String[] args) {
		CompanyInfo a = new CompanyInfo();
		a.companyName("royal enfield","chennai",600028);
	}

}
