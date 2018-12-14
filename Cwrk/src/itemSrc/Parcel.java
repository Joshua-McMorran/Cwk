package itemSrc;


/**
 * A class about a parcel that forms the order item
 * For you, it will be another item.
 * I will email you the item to work with.
 * You will decide on attributes and methods and do appropriate tests
 *
 * @author John Kanyaru
 *
 */

public class Parcel implements Comparable <Parcel>
{
	/**
	 * id - to identify each parcel(item)
	 * days - number of days waiting to be collected
	 * width, height, weight - dimensions and how heavy
	 * closed - whether the parcel/item is now closed, not waiting any more
	 */
	private String id;
	private int days;
	private int length;
	private int width;
	private int height;
	private int weight;
	private boolean collected = false;

 /**
  * You are to complete this parameterised constructor
  * complete the implementation of the constructor
  * @param id
  * @param days
  * @param length
  * @param width
  * @param height
  * @param weight
  */
    public Parcel(String id, int days, int length, int width, int height,
			int weight) {
		//your code goes here
	}



	public String getId() {
		//your code goes here - return appropriate value
		return id;
	}
	public void setId(String id) {
		//your code goes here
	}
	public int getDays() {
		//your code goes here - return appropriate value
		return -1;
	}
	public void setDays(int days) {
		//your code goes here
	}
	public int getLength() {
		//your code goes here - return appropriate value
		return -1;
	}
	public void setLength(int length) {
		////your code goes here
	}
	public int getWidth() {
		//your code goes here - return appropriate value
		return -1;
	}
	public void setWidth(int width) {
		//your code goes here
	}

	public int getHeight() {
		//your code goes here
		return -1;
	}

	public void setHeight(int height) {
		//your code goes here
	}
	public int getWeight() {
		//your code goes here - return appropriate value
		return -1;
	}
	public void setWeight(int weight) {
		//your code goes here
	}



	public boolean isCollected() {
		//your code goes here - return appropriate value
		return false;
	}



	public void setCollected(boolean collected) {
		//your code goes here
	}



	/**
     * Test for content equality between two objects.
     * @param other The object to compare to this one.
     * @return true if the argument object has same id
     * logic for working this out is as follows:
     * 1) check whether formal local parameter other is an instance of Parcel
     * 2) declare an object reference to parcel, e.g., otherItem, and coerce other to it
     * 3) Return true if id is the same as otherItem.getId(), otherwise, false
     */
    public boolean equals(Object other)
    {
       //to remove
    	if(other instanceof Parcel) {
            Parcel otherItem = (Parcel) other;
            return id.equals(otherItem.getId());
        }
        else {
            return false;
        }
    }

    /**
     * We want to compare this object against another, for the purpose
     * of sorting. The fields are compared by id.
     * @param otherDetails - the object be compared against.
     * @return a negative integer if this id comes before the parameter's id,
     *         zero if they are equal and a positive integer if this
     *         comes after the other.
     *
     *         You are to complete this method appropriately
     */

    public int compareTo(Parcel otherDetails)
    {
       //to remove
    	return id.compareTo(otherDetails.getId());
    }

/**
 * provide a complete implementation of the toString method
 * return appropriate details of the parcel and an informative message, e.g.
 * Parcel id days length width height weight collected
 * where id, days, length, width, height, weight, collected are values of those fields
 */

	@Override
	public String toString() {
		//to remove
		return "Parcel [id=" + id + ", days=" + days+ ", length=" + length
				+ ", width=" + width + ", height=" + height + ", weight="
				+ weight + "collected:" + collected + "]";
	}

}
