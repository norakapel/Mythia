import java.io.*;

public class Thiseas {

	String [] Questions1 = new String [10];
	String [] Rights1 = new String [10];
	String [] Wrongs1 = new String [10];
	public Thiseas() {

		String [] Insert1 = new String [3];
		int j =0;
		String file = "THISEAS.part1.csv";
		BufferedReader reader = null;
		String line = "";
		try {
			reader = new BufferedReader(new FileReader(file));
			while ((line = reader.readLine()) != null) {
				
				int k =0;
				String[] row = line.split(",");
				for (String index : row ) {
					
					Insert1[k] =index ;
					k++;
				}

				Questions1[j] = Insert1[0];
				Rights1[j] = Insert1[1];
				Wrongs1[j] = Insert1[2];
				j++;
			}
		}catch(Exception e){
			
			e.printStackTrace();
			
		}finally {
			try {
				reader.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
							
		}
	}


	public String[] getQ1Stage1() {
		
		return Questions1;
		
	}

	public String[] getR1Stage1() {
		
		return Rights1;
		
	}
	
	public String[] getW1Stage1() {
	
		return Wrongs1;
	
	}
}
