package com.ocp.violation.test;

import com.ocp.violation.model.FestivalType;
import com.ocp.violation.model.FixedDeposit;

public class FixedDepositTest {
	public static void main(String[] args) {
		FixedDeposit fixedDeposit = new FixedDeposit(1222, "Jateen", 2000, 5, FestivalType.DIWALI);
		
		fixedDeposit.getInterestRates();
		fixedDeposit.calculateSimpleInterest();
		System.out.println(fixedDeposit.calculateSimpleInterest());
		
	}

}
