package com.beginnersBook;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DemoJava_9 {

	public static void main(String[] args) throws FileNotFoundException {

	  	FileOutputStream fos = new FileOutputStream("beginersBook.txt");
			try(fos) { // resource can be defined out the try scope
				String myString = "we are trying to write this line to output file";
				byte[] bytes = myString.getBytes();
				fos.write(bytes);
				System.out.println("We have successfully written line to the file");

			} catch (IOException e) {
				
				e.printStackTrace();
			}

		}

}
