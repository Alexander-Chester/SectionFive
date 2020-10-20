package sectionFive;
import acm.program.*; 
import java.io.*;
public class SecFiveProbOneWordCount extends ConsoleProgram {
	
	public void run() {
		int lines = 0;
		int words = 0;
		int chars = 0;
		BufferedReader rd = new openFileReader("File:  ");
			try {
				while (true) {
					String Line = rd.readLine();
					if (Line == null) break;
					lines ++;
					words += countwords(line);
					chars += Line.length();
				}
				rd.close();
			}
			catch (IOException ex) {
				println("An Io exception has occurred");
			}
			println("lines = " + lines);
			println("words = " + words);
			println("Chars = " + chars);
	}

	/*gets the name of input file from user and returns a bufferedreader attached to that file
	 * if the file does not exist, it gives the user another chance to put the name in*/
	
	private BufferedReader openFileReader(String prompt) {
		BufferedReader rd = null;
		while (rd == null) {
			String name = readLine(prompt);
			try {
				rd = new BufferedReader(new FileReader(name));
			} catch (IOException ex) {
				println("can't open that file");
			}
		}
		return rd;
	}
				
			}
		}
	}
	 */
}
