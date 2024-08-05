package com.test;

import com.model.Day;

public class DayTest {
	public static void main(String[] args) {
        Day today = Day.WEDNESDAY;

        switch (today) {
            case MONDAY:
                System.out.println("Mondays are tough!");
                break;
            case FRIDAY:
                System.out.println("Fridays are great!");
                break;
            case SATURDAY:
            case SUNDAY:
                System.out.println("Weekends are the best!");
                break;
            default:
                System.out.println("Midweek days are so-so.");
                break;
        }
	}
}


