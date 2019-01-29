package Nugget4;

import java.util.Comparator;

public class LanguageComparator implements Comparator<Movies>{

	@Override
	public int compare(Movies m1, Movies m2) {
		return m1.getLanguage().compareTo(m2.getLanguage());
		
	}

}
