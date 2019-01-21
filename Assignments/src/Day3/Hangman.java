package Day3;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Hangman {
	
	public static void main(String[] args) {
		String[] values ;
		char[] guessLetter;
		int i = 0,count = 10;
		String line = null;
		
		try (Scanner s = new Scanner(new File("words.txt"))){
			int leng = 0;
			while(s.hasNext()){
				line = s.next();
				leng++;
			}
		
			values = new String[leng];
			Scanner sc = new Scanner(new File("words.txt"));
			while(sc.hasNext()){
				line = sc.next();
				Scanner token = new Scanner(line);
				values[i] = token.next();
				
				//token.useDelimiter(" ");
				//System.out.println(values[i]);
				i++;
				/*while (token.hasNext())
				{
					System.out.println(token.next());
					values[i] = token.next();
					i++;
				}*/
			}
			/*for(i = 0 ;i < values.length;i++)
			{
				System.out.println(values[i]);
			}*/
			
			int random = (int)(Math.random() * 13 + 1);
			
			int length = values.length;
			int len = values[random].length();
			char locations[] = new char[length];
			guessLetter = new char[len];
			for(i = 0;i < length ; i++)
			{
				locations[i] = '0';
			}
			
			System.out.println(len + " is word length");
			while(count > 0){
				display(len,count);
				char c = inputLetter();
				guessLetter = values[random].toCharArray();
			
				for( i = 0 ; i < len ; i++)
				{
					if(guessLetter[i] == c && locations[i] != c)
					{
						locations[i] = c;
						System.out.println("hit");
						count--;
					}
					}
				
				
			
			if(locations[i] == c)
			{
				break;
			}
			else
			{
				System.out.println("Miss");
				count--;
			}
			if(guessLetter == locations)
			{
				System.out.println("You Win");
			}
			else
			{
				System.out.println("Gotcha");
			}
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public static char inputLetter(){
		Scanner l = new Scanner(System.in);
		char userGuess = l.next().charAt(0);
		return userGuess;
	}
	
	public static void display(int len,int count){
		System.out.println("Guess a letter you have " + count + " tries left");
		/*while(len != 0)
		{
			
			len--;
		}*/
	}
}
