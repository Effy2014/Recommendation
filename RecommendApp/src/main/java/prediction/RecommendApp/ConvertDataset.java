package prediction.RecommendApp;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ConvertDataset {
	public static void main(String[] args) throws IOException {
		
		   BufferedReader br = new BufferedReader(new FileReader("data/ydata-ymusic-user-artist-ratings-v1_0.txt"));
		   BufferedWriter bw = new BufferedWriter(new FileWriter("data/music-ratings.csv"));
		
		   String line;
		   while((line = br.readLine()) != null) {
			    String[] values = line.split("\\t", -1);
			    bw.write(values[0] + "," + values[1] + "," + values[2] + "\n");
		   }
		
		br.close();
		bw.close();

	}


}
