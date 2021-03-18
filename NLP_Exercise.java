/*
	@author - Caleb Foglio
*/

import java.io.*;
import java.util.*;

public class NLP_Exercise{
	public static void main(String [] args){
		if (args.length < 1){
			System.out.println("Missing argument: filename. \nPlease run by: java NLP_Exercise <path to file>");
			System.exit(-1);
		}
		else if (args.length > 1){
			System.out.println("Too many arguments. \nPlease run by: java NLP_Exercise <path to file>");
			System.exit(-1);
		}
		String filename = args[0];
		WordCount wc = new WordCount(filename);
		wc.scanFile();
		System.out.println(wc.toString());
	}
}