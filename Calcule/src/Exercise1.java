import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/*
* Author : victor
* Date : Jun. 9, 2021
* Description :
*/
public class Exercise1
	{
		
		public static void main(String[] args)	throws IOException,FileNotFoundException
		{
				FileReader ficALire;
				BufferedReader entree;
				int c;
		
			
					ficALire=new FileReader("C:\\Users\\victo\\OneDrive\\Desktop\\monFichier.txt");
					entree = new BufferedReader(ficALire);
					c=entree.read(); // Lecture du premiere caractere
					int countlettrea = 0;
					
					
					while(c != -1)
					{
						if(c == 'a') {
						countlettrea++;
						c=entree.read();
						}
						else
						c=entree.read();	
					}
					
					entree.close();
					ficALire.close();
					
					System.out.println(countlettrea);
	

					
		}

	}
