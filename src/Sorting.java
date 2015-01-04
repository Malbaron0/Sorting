import java.io.*;
import java.util.Scanner;


public class Sorting {

	public static void main(String[] args) throws FileNotFoundException {
		String para = "Paragraph.txt";
		File file = new File(para);
		Scanner input = new Scanner(file);
		String words2[] = new String [100];
		int count = 0;
		String sentence = new String();
		String temp = new String();
		double average;
		boolean swapped = true;
		
		
		//Reads the paragraph from the file.
		while (input.hasNextLine()){
		sentence = sentence + input.nextLine();
		}
		
		String words[] = sentence.split("\\.");
		
		while(swapped){
			swapped = false;
			
			for (int i = 0; i < words.length-1; i++){
				if(words[i].length() < words[i+1].length()){
					temp = words[i];
					words[i] = words[i+1];
					words[i + 1] = temp;
					swapped = true;
				
				}
			
				
			}
		}
		
		PrintWriter sent = new PrintWriter("Sorted.txt");
		sent.println("Sentences in order largest to smallest \n");
		for (int i = 0; i < words.length-1; i++){
			sent.println((i+1)+":" + words[i]);
		}
		
		sent.close();
		
	}
}
	