package Nugget2;

import java.io.File;
import java.io.FileNotFoundException;
import java.sql.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class Movie {
	private int Srlno;
	private String name;
	private Date date;
	private Language language;
	
		
	public Language getLanguage() {
		return language;
	}


	public void setLanguage(Language language) {
		this.language = language;
	}


	public int getSrlno() {
		return Srlno;
	}


	public void setSrlno(int srlno) {
		Srlno = srlno;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Date getDate() {
		return date;
	}


	public void setDate(Date date) {
		this.date = date;
	}


	public static void main(String[] args) {
		ArrayList<Object> arl = new ArrayList<Object>();
		
		File file = new File("C:\\Users\\Aishwarya\\eclipse-workspace\\Java501\\Movies.txt");
		try {
			Scanner scanFile = new Scanner(file);
			while(scanFile.hasNext())
			{
				String str = scanFile.nextLine();
				String[] details = str.split(",");
				Movie mo = new Movie();
				int Sno = Integer.parseInt(details[0]); 
				mo.setSrlno(Sno);
				mo.setName(details[1]);
				mo.setLanguage(Language.valueOf(details[2].toUpperCase()));
				
				
				java.util.Date df = new SimpleDateFormat("dd/mm/yy").parse(details[3]);
				DateFormat dateformat = new SimpleDateFormat("yyyy-mm-dd");
				String formattedDate = dateformat.format(df);
				Date.valueOf(formattedDate);
				mo.setDate(Date.valueOf(formattedDate));
				
				arl.add(mo);
				
				System.out.println(mo);
			}
		} catch (FileNotFoundException | ParseException e) {
			e.printStackTrace();
		}
		
		System.out.println(arl);
	}


	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return getSrlno() + " " + getName() + " " + getLanguage() + " " + getDate();
	}
}
