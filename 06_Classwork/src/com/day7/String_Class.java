package com.day7;

public class String_Class {
	
		public static void main(String[] args) {
//			String name1 = "at";
//			String name2 = "AT";
//			System.out.println(name1.hashCode());
//			System.out.println(name2.hashCode());
//			System.out.println(name1==name2);
//			
//			String name3= "B";
//			name3 += "M";
//			System.out.println(name3.hashCode());
			
			
			//StringBuffer
			
			StringBuffer name4= new StringBuffer("Jateen");
			System.out.println(name4.hashCode());
			 name4=   name4.append("Tiwari");
			 
			 System.out.println(name4.hashCode());
			 
			 //StringBuilder
			 
			 StringBuilder name5 = new StringBuilder("Jateen");
			 System.out.println(name5.hashCode());
			 name5 = name5.append("Hello");
			 System.out.println(name5.hashCode());

			 
			

		}

	}



