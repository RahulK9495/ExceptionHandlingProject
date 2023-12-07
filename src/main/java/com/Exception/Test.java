package com.Exception;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Main method started");

		Scanner sc = new Scanner(System.in);
		String input = sc.next();

		addTextToFile(input);

		System.out.println("Main method ended");
	}

	public static void addTextToFile(String input) {

		File fl = new File("Mytest.txt");
		FileWriter fr=null;
		try {
			if (fl.createNewFile())
				System.out.println("File created successfully!!!!");
			else
				System.out.println("File already existed!!!!!!");
			
			fr=new FileWriter(fl);
			fr.write(input);
			
		} catch (IOException e) {
			System.out.println("under the catch block exception!!!!!!");
			e.printStackTrace();
		}
		finally
		{
			System.out.println("Under the finally block !!!!");
			try {
				fr.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
