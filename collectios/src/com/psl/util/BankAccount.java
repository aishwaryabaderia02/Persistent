package com.psl.util;

public class BankAccount implements Comparable<BankAccount>{
	private String numbers;
	private double balance;
	private String fullName;
	
	
	public BankAccount( String fullName,String numbers, double balance) {
		super();
		this.numbers = numbers;
		this.balance = balance;
		this.fullName = fullName;
	}

	public BankAccount(String numbers, double balance) {
		super();
		this.numbers = numbers;
		this.balance = balance;
	}
	
	public BankAccount() {
		super();
	}

	public String getNumbers() {
		return numbers;
	}
	public void setNumbers(String numbers) {
		this.numbers = numbers;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	@Override
	public String toString(){
		return String.format("BankAccount[%s,%f]", getNumbers(), getBalance());
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((numbers == null) ? 0 : numbers.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BankAccount other = (BankAccount) obj;
		if (numbers == null) {
			if (other.numbers != null)
				return false;
		} else if (!numbers.equals(other.numbers))
			return false;
		return true;
	}

	@Override
	public int compareTo(BankAccount anotherAccount) {
		if (getBalance() > anotherAccount.getBalance())
		{
			return 1;
		}
		else if (getBalance() < anotherAccount.getBalance())
		{
			return -1;
		}
		else
			return 0;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	
}
