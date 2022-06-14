package exempleExceptionsJava;

public class Main {

	public static void main(String[] args) {
		
		//exemple de fonctionnement des exceptions en Java :
		//comment on les gère selon le problème ?
		
		//on a les simples erreurs, où on réécrit juste son code
		//int x = "toto";
		String chaine = "toto";
		
		//on ne peut pas diviser par zéro
		//int x = 3/0;
		
		int x = Utils.scanInteger("entrez le dividende");
		int y = Utils.scanInteger("entrez le diviseur");
		//on m'a peut-être entré un zéro
		//pas besoin d'aller jusqu'au try catch ici, un simple if suffit à mes besoins
		//c'est moins coûteux et je contrôle entièrement la ligne de code qui déclenchait l'erreur
		if(y != 0) {
			int res = x/y;
			System.out.println("le résultat de la division entière de" + x + " et " + y + " est " + res);
		}else {
			System.out.println("le résultat de cette division est infini");
		}
		

	}

}
