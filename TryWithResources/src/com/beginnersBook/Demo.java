package com.beginnersBook;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo {

	public static void main(String[] args) throws FileNotFoundException {

      // try(FileOutputStream fos = new FileOutputStream("beginersBook.txt");) {
		FileOutputStream fos = new FileOutputStream("beginersBook.txt");
		try(FileOutputStream fos1 = fos) { // second way of defining
			String myString = "we are trying to write this line to output file";
			byte[] bytes = myString.getBytes();
			fos.write(bytes);
			System.out.println("We have successfully written line to the file");

		} catch (IOException e) {
			
			e.printStackTrace();
		}

	}

}
