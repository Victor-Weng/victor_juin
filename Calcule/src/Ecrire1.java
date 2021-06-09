import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/*
* Author : victor
* Date : Jun. 9, 2021
* Description :
*/
public class Ecrire1
	{
		
		public static void main(String[] args)	
		{
				String Fichier="Ecrire.txt";
				final String s1="hi \n";
				final String s2="bonjour";
				
				FileWriter ficAEcrire;
				PrintWriter sortie;
				
				try {
					ficAEcrire=new FileWriter(Fichier);
					sortie=new PrintWriter(ficAEcrire);
					sortie.print(s1);
					sortie.print(s2);
					sortie.close();
				} catch (IOException e) {
					System.out.println("Erreur entree/sortie");
				}
					
		}

	}
