package day4;

public class Animations implements Runnable {
	String a = "- -";
	String b = "+ +";
	String c = "^ ^";
	String d = "* *";
	String e = " _ ";
	@Override
	public void run() {
		System.out.println(a.charAt(0) + a.charAt(1) + a.charAt(0));
		System.out.println(e);
	}
	
	public static void main(String[] args) {
		Thread t1 = new Thread();
		t1.start();
	}
}
