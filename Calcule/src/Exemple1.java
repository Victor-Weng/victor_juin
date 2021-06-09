import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/*
* Author : victor
* Date : Jun. 9, 2021
* Description :
*/
public class Exemple1
	{
		
		public static void main(String[] args)
		{
				FileReader ficALire;
				BufferedReader entree;
				char c;
				
				try {
					ficALire=new FileReader("monFichier.txt");
					entree = new BufferedReader(ficALire);
					c=(char) entree.read();
					System.out.print(c);
					entree.close();
					ficALire.close();
				} catch (FileNotFoundException e) {
					System.out.println("Le ficheir ne peut pas etre lu");
				} catch (IOException e) {
					System.out.println("Erreur entree/sortie");
					e.printStackTrace();
				}

					
		}

	}
