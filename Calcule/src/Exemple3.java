import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/*
* Author : victor
* Date : Jun. 9, 2021
* Description :
*/
public class Exemple3
	{
		
		public static void main(String[] args)	throws IOException,FileNotFoundException
		{
				FileReader ficALire;
				BufferedReader entree;
				int c;
				
			
					ficALire=new FileReader("monFichier.txt");
					entree = new BufferedReader(ficALire);
					c=entree.read(); // Lecture du premiere caractere
					
					// -1 est retourner lorsqu'il n'y a plus des caracteres
					// \n est retourner lorsqu'on saute une ligne
					// Donc, il imprime une ligne seulement
					
					while(c != -1 && c != '\n')
					{
						System.out.print((char) c);
						c=entree.read();
					}
					
					entree.close();
					ficALire.close();
	

					
		}

	}
