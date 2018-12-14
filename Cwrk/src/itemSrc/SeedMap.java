package itemSrc;
import java.util.TreeMap;

public class SeedMap {

	private TreeMap <String, Seed> allSeeds;


	public SeedMap() {

		allSeeds = new TreeMap<String, Seed>();

	}


	public void addDetails (Seed details) {
		allSeeds.put(details.getId(), details);
	}

	public boolean hasSeeds(String key) {

		return allSeeds.containsKey(key);
	}
	
	public int getNumberOfEntries() {
		
		return allSeeds.size(); 
	}
		
	/**public boolean allGone() {
		
	}**/

}
