package itemSrc;

public class Seed implements Comparable <Seed> {
	private String id;
	private String type;
	private String shape;
	private String colour;
	private int weight;
	private boolean  collected = false;

	public Seed( String id, String t, String s, int w, String c)
	{ 
		this.id = id;
		this.type = t;
		this.shape = s;
		this.weight = w; 
		this.colour = c;

	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {

		this.type = type;
	}
	public String getShape() {
		return shape;
	}
	public void setShape(String shape) {
		this.shape = shape;
	}
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public boolean isCollected() {
		return collected;
	}
	public void setCollected(boolean collected) {
		this.collected = collected;
	}
	@Override
	public int compareTo(Seed otherDetails) {
		return id.compareTo(otherDetails.getId());
	}

    public boolean equals(Object other)
    {
       //to remove
    	if(other instanceof Seed) {
            Seed otherItem = (Seed) other;
            return id.equals(otherItem.getId());
        }
        else {
            return false;
        }
    }
}
