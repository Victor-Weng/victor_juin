import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/*
* Author : victor
* Date : Jun. 9, 2021
* Description :
*/
public class Exemple4
	{
		
		public static void main(String[] args)	throws IOException,FileNotFoundException
		{
	
				BufferedReader entree;
				int c;
				
			
					entree = new BufferedReader(new FileReader("monFichier.txt"));
		
					// while(il y a la possibilitee de lire)
					while(entree.ready())
					{
					
						c=entree.read();
						System.out.print((char) c);
					}
					
					entree.close();
	

					
		}

	}
