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
public class Exercise2
	{
		
		public static void main(String[] args)	throws IOException,FileNotFoundException
		{
				BufferedReader entree;
				String ligne;
				String Fichier="C:\\Users\\victo\\OneDrive\\Desktop\\monResultat.txt";
				FileWriter ficAEcrire;
				PrintWriter sortie;
				int somme = 0;
			
					entree = new BufferedReader(new FileReader("C:\\Users\\victo\\OneDrive\\Desktop\\monCalcul.txt"));
		
					// while(il y a la possibilitee de lire)
					while(entree.ready())
					{
					
						ligne=entree.readLine();
						somme = somme + Integer.parseInt(ligne);
						
					}
					
					entree.close();
					
					try {
						ficAEcrire=new FileWriter(Fichier);
						sortie=new PrintWriter(ficAEcrire);
						sortie.print(somme);
						sortie.close();
					} catch (IOException e) {
						System.out.println("Erreur entree/sortie");
					}
	

					
		}

	}
