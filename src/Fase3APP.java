import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Fase3APP {

	public static void main(String[] args) {
		List<Character> nom = Arrays.asList('À', 'n', 'g', 'e', 'l', 'n' ,'e', 'e');
		HashMap<Character, Integer> letterRegister = new HashMap<Character, Integer>();
		
		for(Character lletra: nom)
		{
			if(letterRegister.containsKey(lletra))
			{
				letterRegister.put(lletra, letterRegister.get(lletra) + 1);
			}else {
				letterRegister.put(lletra, 1);
			}
		}

		letterRegister.forEach((letter,count) -> System.out.println(letter + " = " + count));
	}

}
