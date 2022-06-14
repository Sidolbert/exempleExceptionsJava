package exempleExceptionsJava;

import java.util.Scanner;

public class Utils {

	/**
	 * fonction qui demande l'entrée d'une chaîne de caractères à l'utilisateur
	 * puis, à l'aide d'un Scanner, récupère la chaîne entrée
	 * 
	 * @return la chaîne obtenue
	 * @param la question posée à l'utilisateur
	 */
	public static String scanString(String question) {
		System.out.println(question);
		Scanner scan = new Scanner(System.in);
		String ret = scan.nextLine();
		// scan.close();
		return ret;
	}

	/**
	 * fonction qui demande l'entrée d'une chaîne de caractères à l'utilisateur
	 * puis, à l'aide d'un Scanner, récupère le nombre entrée
	 * 
	 * @return le chiffre obtenue
	 * @param la question posée à l'utilisateur
	 */
	public static Integer scanInteger(String question) {
		System.out.println(question);
		Integer ret;
		
		//le bloc try catch : comment attraper les exceptions et éviter
		//les problèmes qu'on ne contrôle pas
		//pas forcément tous les problèmes mais sera utile dans tous les cas où
		//vous intéragissez avec des éléments extérieurs au programme
		
		
		try {
			//on essaye d'exécuter ce morceau de code
			Scanner scan = new Scanner(System.in);
			ret = scan.nextInt();
		} catch (Exception exception) { //si un problème est signalé, une exception est créée
			//en cas d'exception on exécute ce morceau de code à la place de l'autre
			//return 0;
			//ici je redemande l'exécution de scanInteger, cette fois avec un peu de chance de façon valide
			return scanInteger("entrez un nombre entier !");
		}finally {
			//si ce bloc est présent le code à l'intérieur est exécuté que le try ait fonctionné ou pas
		}

		// scan.close();
		return ret;
	}
}
