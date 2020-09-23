import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Fase4APP {

	public static void main(String[] args) {
		List<Character> name = Arrays.asList('À', 'n', 'g', 'e', 'l');
		List<Character> surename = Arrays.asList('C','a','l','z','a','d','a');
		
		List<Character> fullName = new ArrayList<>();
		fullName.addAll(name);
		fullName.add(' ');
		fullName.addAll(surename);

		System.out.println(fullName.toString());
	}

}
