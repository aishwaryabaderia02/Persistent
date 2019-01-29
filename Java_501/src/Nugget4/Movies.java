package Nugget4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.sql.Date;
import java.util.List;
import java.util.Scanner;
import Nugget4.LanguageComparator;
public class Movies {
	private String name, language, director, producer;
	private Date  releaseDate;
	private double  duration;
	
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getLanguage() {
		return language;
	}


	public void setLanguage(String language) {
		this.language = language;
	}


	public String getDirector() {
		return director;
	}


	public void setDirector(String director) {
		this.director = director;
	}


	public String getProducer() {
		return producer;
	}


	public void setProducer(String producer) {
		this.producer = producer;
	}


	public Date getReleaseDate() {
		return releaseDate;
	}


	public void setReleaseDate(Date releaseDate) {
		this.releaseDate = releaseDate;
	}


	public double getDuration() {
		return duration;
	}


	public void setDuration(double duration) {
		this.duration = duration;
	}


	public List<Movies> createMoviesList(){
		List<Movies> movie = new ArrayList<Movies>();
		Movies mov = new Movies();
		Scanner scanFile = null;
		try {
			scanFile = new Scanner(new File("C:\\Users\\Aishwarya\\eclipse-workspace\\Java_501\\Movies.txt"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		while (scanFile.hasNext())
		{
			String line = scanFile.nextLine();
			String[] details = line.split(",");
			
			mov.setName(details[0]);
			mov.setLanguage(details[1]);
			mov.setProducer(details[2]);
			mov.setDirector(details[3]);
			mov.setReleaseDate(Date.valueOf(details[4]));
			mov.setDuration(Double.parseDouble(details[5]));
			
			movie.add(mov);
		}
		
		return movie;
	} 
	
	public void sortByLanguage(List<Movies> movieList) {
		
		LanguageComparator lc = new LanguageComparator();
		Collections.sort(movieList,lc);
		System.out.println(movieList);
		
	}
	public static void main(String[] args) {
		
	}
}





















