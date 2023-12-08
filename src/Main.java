import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Map;

public class Main {
	public static void main(String[] args) {
		//crea la mappa con il primo metodo
		Map<String, String> hashmap1 = new HashMap<>();
		hashmap1.put("Pantalone", "Gucci");
		hashmap1.put("Maglia", "Louis Vuitton");
		hashmap1.put("Giubotto", "Moncler");
		//stampa prima metodo
		System.out.println(hashmap1);

		//crea la mappa con il secondo metodo
		Map<String, String> hashmap2 = Map.of("Pantalone", "Gucci", "Maglia", "Louis Vuitton", "Giubotto", "Moncler");
		//stampa secondo metodo
		System.out.println(hashmap2);

		//crea la mappa con il terzo metodo
		Map<String, String> hashmap3 = Map.ofEntries(
				new AbstractMap.SimpleEntry<>("Pantalone", "Gucci"),
				new AbstractMap.SimpleEntry<>("Maglia", "Louis Vuitton"),
				new AbstractMap.SimpleEntry<>("Giubotto", "Moncler")
		);

		//stampa terzo metodo
		System.out.println(hashmap3);
	}
}