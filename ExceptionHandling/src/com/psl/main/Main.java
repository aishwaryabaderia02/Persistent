package com.psl.main;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {
	
	public static void main(String[] args) {
		try(FileReader fr = new FileReader("Some file")){
			searchProduct("CODE-001");
			
		}catch(IOException | ProductNotFoundException e){
			
		}finally{
			
		}
	}
	
	public static void searchProduct(String productCode) throws ProductNotFoundException
	{
		throw new ProductNotFoundException("Not Found");
		
	}
}
