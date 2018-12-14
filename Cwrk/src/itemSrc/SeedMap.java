package itemSrc;
import java.util.Map.Entry;
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
		
	public boolean allGone(){
		for(Entry<String, Seed> entry : allSeeds.entrySet()) {
			Seed seed = entry.getValue();
			 if(seed.isCollected())
			 {
				 continue;
			 }
			 else
			 {
				 return false;
			 }
		}
		return true;
	}
	
	public String listDetails(){
		StringBuffer seedBuffer = new StringBuffer();
		for(Entry<String, Seed> entry : allSeeds.entrySet())
		{
			Seed seed = entry.getValue();
			String id = seed.getId();
			String type = seed.getType();
			String shape = seed.getShape();
			String colour = seed.getColour();
			int weight = seed.getWeight();
			
			seedBuffer.append(id+ ",");
			seedBuffer.append(type+ ",");
			seedBuffer.append(shape+ ",");
			seedBuffer.append(colour + ",");
			seedBuffer.append(weight +  ",");
		}
		return seedBuffer.toString();
	}
	
	public void setCollected(Seed s){
		s.setCollected(true);
	}
	
	public String listUncollected() {
		StringBuffer seedBuffer = new StringBuffer();
		for(Entry<String, Seed> entry:allSeeds.entrySet())
		{
			Seed seed = entry.getValue();
			if(seed.isCollected() == false){
				seedBuffer.append(seed);	
			}	
		}
		return seedBuffer.toString();
	}
	
	public Seed findSeed (String id){
		for(Entry<String, Seed> entry : allSeeds.entrySet())
		{
			String key = entry.getKey();
			if(id == key) 
			{
				return entry.getValue();
			}
		}
		return null;
	}
}
