package sectionFive;
import acm.program.*; 
import acm.util.*; 
import java.io.*; 

public class HistogramMaker extends ConsoleProgram {
	
	public void run() {
		initHistogram();
		readScoresIntoHistogram();
		displayHistogram();
		}
/*initializes histogram array*/
	private void initHistogram() {
		histogramArray = new int[11];
		for (i=0; i<=10;i++) {
			historgramArray[i]=0;
			
		}
	}
	/* reads grades and updates array*/
	private void readScoresIntoHistogram() {
		try {
			BufferedReader rd = new BufferedReader( new FileReader(Data_File));
			while (true) {
				String line = rd.readLine(); 
				if (line == null) break;           
				int score = Integer.parseInt(line); 
				if (score < 0 || score > 100) {
					throw new ErrorException("That score is out of range");
					} 
					else {
						int range = score / 10;
						histogramArray[range]++;
						}
				}
			} 
		catch (IOException ex) { 
			throw new ErrorException(ex);
			} 
		}
	/*displays histogram*/
	private void displayHistogram() {
		 for (int range = 0; range <= 10; range++) {
			 String label;
			 switch (range) {
			 case  0: label = "00-09"; break;
			 case 10: label = "  100"; break;
			 default:
				 label = (10 * range) + "-" + (10 * range + 9);
				 break;
				 }
			 String stars = createStars(histogramArray[range]);
			 println(label + ": " + stars);
			 }
		 }
	/*creates a string of n starts*/
	 private String createStars(int n) {
		 String stars = "";
		 for (int i = 0; i < n; i++) {
			 stars += "*";
			 }
		 return stars;
		 } 
	 /* Private instance variables */
	 private int[] histogramArray;
	 
	 /* Name of the data file */
	 private static final String DATA_FILE = "MidtermScores.txt";
}
	
		
