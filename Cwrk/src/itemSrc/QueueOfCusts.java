package itemSrc;

import java.util.LinkedList;


public class QueueOfCusts
{
    // Storage for an arbitrary number of details.
    private LinkedList <CustInQueue> queue;

 
    /**      
     * initialising the list of customers
     */
    public QueueOfCusts() {
    	queue = new LinkedList<CustInQueue>();
    }


    /**
     * Add a new set of details to the list
     * Complete this method
     *
     */
    public  void addDetails(CustInQueue details)
    {
    	queue.add(details);

    }

    /**
     * @return The number of entries currently in the
     *         list.
     *         you are to complete this method
     *
     */
    public int getNumberOfEntries()
    {
    	return queue.size();
    }
    /**
     * find out how many customers are in the list queieing
     *
     * logic:
     * 1) initialise a count to 0
     * 2) iterate from first to last item in queue. Use for each loop is better
     * 3) compare each custinque with one at current queue location, i f they are different,
     * increment count
     * return count.
     *
     */
    public  int getNumQueueing () {
    	int count = 0;
    	for(CustInQueue cq: queue)
    	{
    		if(!cq.equals(queue.get(count)))
    		{
    			count++;
    		}
    	}
    	return count;
    }
    /**
     *
     * @param i - location in list
     * @return the cust in location i
     * implement this method
     *
     */
    public CustInQueue get(int i) {
    	return queue.get(i);
    }

    /**
     * get the next one in queue
     * Logic:
     * 1) declare a reference to (e.g., cq) CustInQueue and initialise it to null
     * 2) check that, while number queieing is 0, all you can do is wait
     * 3) assign cq to first item in the list
     * 4) remove the first item in the list
     * 5) return cq
     */
    public  CustInQueue getNext() {

    	CustInQueue cq = null;
    	if(queue.size() > 0) {
    		cq = queue.getFirst();
    		queue.removeFirst();
    	}
    	
    	return cq;
    }

    /**
     * this is a method to obtain a string value of an object in the list/queue.
     * since, they could be many, store them in a string buffer object
     * @return a string buffer content
     * Logic:
     * 1) instantiate a string buffer object
     * 2) loop through the queue/list
     * 3) append each item you find into the string buffer
     * 4) return the content of the string buffer
     * Write unit test for this method
     *
     */
    public String getQueueString() {
    	StringBuffer sb = new StringBuffer();
		for (CustInQueue cq : queue) {
			if (cq.isInQueue()) {
				sb.append(cq.toString() + "\n");
			}
		}
		return sb.toString();
    }
    /**
     * this method adds a new item to the list/queue
     * The logic to complete it is as follows:
     * 1) for custinqueue object cq, iterate through the queue/list (use for each loop)
     * 2) if cq is uniqueue, add it to the queue by using setInqueue function of
     * CustIinque class
     * Write unit tests for this method
     */
    public  void  addToQueue() {
    	for (CustInQueue cq : queue) {
			if (!cq.isInQueue()) {
				cq.setInQueue(true);
				break;
			}
		}
    }

}
