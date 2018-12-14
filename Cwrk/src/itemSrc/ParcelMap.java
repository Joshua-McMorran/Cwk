package itemSrc;

import java.util.TreeMap;


public class ParcelMap 
{
    /* Storage for an arbitrary number of details.
     * String - an id for the parcel
     */
    private TreeMap <String,Parcel> allParcels;

    
    public ParcelMap()
    {
    	//your code goes here
    }
    

    /**
     * This method for adding a new set of parcels to allParcels
     * 
     * You are to complete the method.
     * 
     * 
     */
    public void addDetails(Parcel details) 
    {
    	//your code goes here 
    }
    /*
     * a method to check whether the map has any parcel at all
     * complete the method
     */
    
    public boolean hasParcel() {
    	//your code goes here - return appropriate value
    	return false;
    }
    
    /**
     * a method to determine how many items are in the collection
     * complete the method.
     * 
     */
    
    public int getNumberOfEntries()
    {
    	//your code goes here - return appropriate value
    	return -1;
    }
    
    /**
     * a method to check whether all the parcels have been collected
     * @return true if all collected, false otherwise
     * Logic:
     * 1) use for each loop
     * 2) use a reference of Parcel, e.g., p to iterate trough allParcels
     * 3) if p is not collected, allGone returns false, otherwise, return true
     * Complete the method
     * 
     */
    public boolean allGone () {
    	//your code goes here - return appropriate value
    	
    	return false;
    }
 
    /**
     * a method to obtain all parcels in the collection, add them to a StringBuffer object
     * then return the content
     * @return content of string buffer
     * Logic:
     * 1) create a StringBuffere object
     * 2) for a reference p of Parcel, go through all the values of the collection
     * 3) add p to the string buffer object
     * 4) return string content of string buffer
     */
    public String listDetails()
    {
    	//your code goes here - return appropriate value
    	
        return null;
    }
    
   /*
    * a method to mark a parcel as collected
    * 
    */
    public void setCollected(Parcel p){
    	//your code goes here 
    	
    }
    
    /**
     * a method to list uncollected parcels
     * @return  string content of the uncollected ones.
     * Hints:
     *  - consider the logic of listDetails method above
     *  - use String buffer as appropriate
     *   - use isCollected method of parcel to decide which one is uncollected
     *   - only list the uncollected one
     */
    public String listUncollected()
    {
    	//your code goes here - return appropriate value
    	
        return null;
    }
    
    /**
     * a method for finding a parcel whose id is known
     * @param id - the id of a parcel
     * @return - the parcel that has a matching id
     * You are to implement this method.
     * Use unit test to check it works fine
     * 
     */
    public Parcel findParcel(String id) {
    	//your code goes here - return appropriate value
    	return null;

    }

}
