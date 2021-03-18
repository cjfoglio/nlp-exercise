import java.io.*;
import java.util.*;

public class WordCount{
	private int words, sentences, paragraphs;
	private String filename;

	public WordCount(){
		this.words = this.sentences = this.paragraphs = 0;
		this.filename = new String();
	}

	public WordCount(String filename){
		this.words = this.sentences = this.paragraphs = 0;
		this.filename = filename;
	}

	// Scans file and determines word counts
	public void scanFile(){
		words = sentences = paragraphs = 0;
		try{
			File file = new File(filename);
			BufferedReader bf = new BufferedReader(new FileReader(file));
			String line = bf.readLine();

			while (line != null){
				// If the line is empty, increment paragraph count
				if (line.equals("")){
					paragraphs++;
				}
				else{
					for (int i=0; i<line.length(); i++){
						// If end of line
						if (i==line.length()-1) {
							words++;
							// If char is a period or end of quote, increment sentence count
							if (line.charAt(i) == '.' || line.charAt(i) == '\"'){
								sentences++;
							}
						}
						else if (line.charAt(i) == '.'){
							/* If there is a period with space or end of quote after, increment 
								sentence and word count
							*/
							if ((line.charAt(i+1) == ' ') || (line.charAt(i+1) == '\"')){
								sentences++;
								words++;
								i++; // skip ahead 2 chars 
								// If the chars are in this order: <word>."<space>, skip loop ahead 1 more time
								if (line.charAt(i+1) == ' '){
									i++;
								}
							}
						}
						// If there is only a space, just increment word cound
						else if (line.charAt(i) == ' '){
							words++;
						}
					}
				}

				// Read next line of text
				String oldLine = line;
				line = bf.readLine();

				// If last line wasn't empty, increment paragraph count
				if (line == null && !oldLine.equals("")){
					paragraphs++;
				}
			}
		}
		catch(IOException e){
			System.out.println("IOException: " + e);
		}
	}

	public String toString(){
		String str = new String();
		str = "\nFilename: " + filename+ "\nWords: " + words + "\nSentences: " + sentences + "\nParagraphs: " + paragraphs + "\n";
		return str;
	}
}