package com.ocp.solution.model;

import com.ocp.violation.model.FestivalType;

public class FixedDeposit {
	private int accountNumber;
	private String name;
	private double principle;
	private int duration;
	private IFestivalInterest festivalType ;
	public FixedDeposit(int accountNumber, String name, double principle, int d, IFestivalInterest string) {
		super();
		this.accountNumber = accountNumber;
		this.name = name;
		this.principle = principle;
		this.duration = d;
		this.festivalType = string;
	}
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrinciple() {
		return principle;
	}
	public void setPrinciple(double principle) {
		this.principle = principle;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	public IFestivalInterest getFestivalType() {
		return festivalType;
	}
	public void setFestivalType(IFestivalInterest festivalType) {
		this.festivalType = festivalType;
	}
	
	
//	public double getInterestRates() {
//		if (festivalType==FestivalType.NEWYEAR)
//			return 8/100;
//		if (festivalType==FestivalType.DIWALI)
//			return 8.5/100;
//		if(festivalType==FestivalType.HOLI)
//			return 7.5/100;
//		if(festivalType==FestivalType.OTHERS)
//			return 6.5/100;
//		return (Double) null;		
//	}
	
	public double calculateSimpleInterest() {
		return principle*duration*this.calculateSimpleInterest();
	}
	

	
	@Override
	public String toString() {
		return "FixedDeposit [accountNumber=" + accountNumber + ", name=" + name + ", principle=" + principle
				+ ", duration=" + duration + ", festivalType=" + festivalType + "]";
	}

}
