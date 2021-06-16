import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
* Author : victor
* Date : Jun. 16, 2021
* Description : Introduction sur les expressions regulieres
*              	 etapes / structure
*/
public class RegExp1
	{

		public static void main(String[] args)
			{
				Scanner crayon=new Scanner(System.in);
				
				// input est le texte dans lequel l'expression sera recherchee
				System.out.println("Inscire le texte pour la recherche");
				String input = crayon.nextLine();
				// Expression a rechercher
				System.out.println("Inscire le texte rechercher");
				String  regEx = crayon.nextLine();
				
				// Etape 1 : Utiliser Pattern
				Pattern patternEx = Pattern.compile(regEx,Pattern.CASE_INSENSITIVE);
				
				// Etape 2 : Allouer un objet Matcher pour l'entree specifie
				Matcher matcherEx = patternEx.matcher(input);
				
				// Etape 3 : Verifier la concordance et afficher le resultat
				
				//======================================================
				
				// on peut utiliser find()
				/*
				 * while (matcherEx.find()) { System.out.println("Le(s) mot(s) \"" +
				 * matcherEx.group() + "\" debute a l'indice " + matcherEx.start() +
				 * " et finit a l'indice " + matcherEx.end()); }
				 */
				
				//======================================================
				
				// Utiliser matches() ; Doit correspondre entierement a tout le texte
				
				/*
				 * if (matcherEx.matches()) {
				 * System.out.println("Les deux textes sont les memes");
				 * 
				 * }else { System.out.println("Les deux textes sont differentes"); }
				 */
				
				//======================================================
				
				// Utiliser lookingAt() 
				
					if (matcherEx.lookingAt())
					{
						System.out.println("On a trouve \"" +
					matcherEx.group()+ "\" commencant a l'indice " + matcherEx.start() +
					" et fini a l'indice " + matcherEx.end()); 
					}
					else
					{
						System.out.println("Le texte ne se trouve pas au debut");
					}
					 
				//======================================================
					
			}

	}
