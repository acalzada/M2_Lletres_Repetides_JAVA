import java.util.Arrays;
import java.util.List;

public class Fase2APP {

	private static String VOWELS = "AÀÁÂÃÄÅĀĂĄǺȀȂẠẢẤẦẨẪẬẮẰẲẴẶḀÆǼEȄȆḔḖḘḚḜẸẺẼẾỀỂỄỆĒĔĖĘĚÈÉÊËIȈȊḬḮỈỊĨĪĬĮİÌÍÎÏĲOŒØǾȌȎṌṎṐṒỌỎỐỒỔỖỘỚỜỞỠỢŌÒÓŎŐÔÕÖUŨŪŬŮŰŲÙÚÛÜȔȖṲṴṶṸṺỤỦỨỪỬỮỰYẙỲỴỶỸŶŸÝ";
	public static final String ANSI_RED = "\u001B[31m";
	public static final String ANSI_RESET = "\u001B[0m";
	
	public static void main(String[] args) {
		List<Character> nom = Arrays.asList('À', 'n', 'g', '0', '*',  'e', 'l', '3');
		
		for(Character lletra: nom)
		{
			System.out.print(lletra + " - ");
			
			if(Character.isDigit(lletra))
			{
				System.out.println(ANSI_RED + "Els noms de persones no contenen números!" + ANSI_RESET);
			}else {
				System.out.println(tipusLletra(lletra));
			}
		}
			
	}
	
	
	/**
	 * Returns whether the Character is a VOWEL or a CONSONANT.
	 * 
	 * Considers all non VOWELs as CONSONANTs. This means all punctuation characters (f.e. *,!@), 
	 * unless used on a VOWEL, will also be considered as CONSONANTS.
	 * 
	 * @param c - Letter to check type. 
	 * 
	 * @return String containing VOWEL or CONSONANT.
	 */
	public static String tipusLletra(char c)
	{
		if (VOWELS.indexOf(Character.toUpperCase(c)) >= 0)
		{
			return "VOCAL";
		}
		
		// Considerem els espais en blanc i caracters especials com *,!@ com a consonants
		return "CONSONANT";   
	}
}
