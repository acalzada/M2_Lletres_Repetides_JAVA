
public class Fase1APP {

	public static void main(String[] args) {
		
		char[] nom = {'A', 'n', 'g', 'e', 'l'};
		
		
		System.out.print(nom[0]);
		for(int idx = 1; idx < nom.length; idx++)
		{
			System.out.print(" , " + nom[idx]);
		}
		System.out.println(". \n");
	}

}
