package com.psl.main;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import com.psl.util.BankAccount;

public class UserInteface {
	
	public static void main(String[] args) {
		List<String> strs;
		
		strs = new ArrayList<String>();
		
		strs.add("New");
		strs.add("Day");
		strs.add("Everyday");
		
		System.out.println(strs.get(2));
		System.out.println(strs.size());
		System.out.println(strs.remove(0));
		
		for(String s : strs)
		{
			System.out.println(s);
		}
		
		if(strs.contains("Everyday")){
			
		}
		strs.indexOf("Everyday");
		strs.lastIndexOf("Everyday");
		
		List<BankAccount> accounts;
		
		accounts = new LinkedList<BankAccount>();
		
		accounts.add(new BankAccount("23432" , 345.55));
		accounts.add(new BankAccount("54768" , 3684.54));
		accounts.add(new BankAccount("23432" , 3742.35));
		
		for(BankAccount ac : accounts){
			System.out.println(ac);
		}
		
		if(accounts.contains(new BankAccount("54768", 0)))
		{
			System.out.println("Found");
		}
	
	}
}
