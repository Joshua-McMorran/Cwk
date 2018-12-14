 package itemTests;

import static org.junit.Assert.*;

import org.junit.*;

import itemSrc.*;


public class WorkerTest {

	Worker wareHouseWorker;
/**
 * This tests the Worker constructor
 * You are to implement this constructor
 */
	@Test
	public void testWorker() {
		QueueOfCusts qOfCusts = new QueueOfCusts();
		assertTrue(qOfCusts.getNumQueueing()==0);
		CustInQueue cin = new CustInQueue("Andrew", "px21");
		CustInQueue cin2 = new CustInQueue("Janice", "lt64s");

		qOfCusts.addDetails(cin);
		qOfCusts.addToQueue();
		qOfCusts.addDetails(cin2);
		qOfCusts.addToQueue();

		SeedMap seedList = new SeedMap();
		Seed s = new Seed("lt64s", "Square", 5, "Blue");

		Seed s2 = new Seed("ntqx", "Circle", 3, "Green");
		seedList.addDetails(s);
		seedList.addDetails(s2);
		wareHouseWorker = new Worker( qOfCusts, seedList, 5, 4);

		assertTrue(wareHouseWorker.getNum()==4);
		assertEquals(wareHouseWorker.getNext().getName(), "Andrew");
		assertEquals(wareHouseWorker.getNext().getName(), "Janice");

	}
/*
 * This tests whether the current customer can be obtained
 * You are to implement this method
 */
	@Test
	public void testGetCurrentCust() {
		QueueOfCusts qOfCusts = new QueueOfCusts();
		assertTrue(qOfCusts.getNumQueueing()==0);
		CustInQueue cin = new CustInQueue("Andrew", "px21");
		CustInQueue cin2 = new CustInQueue("Janice", "lt64s");

		qOfCusts.addDetails(cin);
		qOfCusts.addToQueue();
		qOfCusts.addDetails(cin2);
		qOfCusts.addToQueue();

		SeedMap seedList = new SeedMap();
		Seed s = new Seed("lt64s", "Square", 5, "Blue");

		Seed s2 = new Seed("ntqx", "Circle", 3,"Green");
		seedList.addDetails(s);
		seedList.addDetails(s2);

		wareHouseWorker = new Worker( qOfCusts, seedList, 5, 4);
		assertEquals(qOfCusts.getNext(),cin);
		wareHouseWorker.setClosed(true);
		assertEquals(qOfCusts.getNext(),cin2);
	}

/**
 * This has already been tested with the constructor
 * Implementation is provided
 */
	@Test
	public void testGetNum() {
		QueueOfCusts qOfCusts = new QueueOfCusts();
		assertTrue(qOfCusts.getNumQueueing()==0);
		CustInQueue cin = new CustInQueue("Andrew", "px21");
		CustInQueue cin2 = new CustInQueue("Janice", "lt64s");

		qOfCusts.addDetails(cin);
		qOfCusts.addToQueue();
		qOfCusts.addDetails(cin2);
		qOfCusts.addToQueue();

		SeedMap seedList = new SeedMap();
		Seed s = new Seed("lt64s", "Square", 5, "Blue");

		Seed s2 = new Seed("ntqx", "Circle", 3,"Green");
		seedList.addDetails(s);
		seedList.addDetails(s2);

		wareHouseWorker = new Worker( qOfCusts, seedList, 5, 4);
		assertEquals(wareHouseWorker.getNum(), 4);
	}
/**
 * This tests whether a worker has closed processing a customer's job
 * Provide an implementation of this method
 */
	@Test
	public void testGetClosed() {
		QueueOfCusts qOfCusts = new QueueOfCusts();

		CustInQueue cin = new CustInQueue("Andrew", "px21");
		CustInQueue cin2 = new CustInQueue("Janice", "lt64s");

		qOfCusts.addDetails(cin);
		qOfCusts.addToQueue();
		qOfCusts.addDetails(cin2);
		qOfCusts.addToQueue();

		SeedMap seedList = new SeedMap();
		Seed s = new Seed("lt64s", "Square", 5, "Blue");

		Seed s2 = new Seed("ntqx", "Square", 6 ,"Green");
		seedList.addDetails(s);
		seedList.addDetails(s2);

		wareHouseWorker = new Worker( qOfCusts, seedList, 5, 4);
		assertEquals(qOfCusts.getNext(),cin);
		wareHouseWorker.setClosed(true);
		assertFalse(wareHouseWorker.getCurrentCust()==cin);
		assertFalse(wareHouseWorker.getCurrentCust()==cin2);
		assertTrue(wareHouseWorker.getClosed());
		wareHouseWorker.setClosed(false);
		assertFalse(wareHouseWorker.getClosed());
	}
/**
 * this has been tested alongside the getClosed method
 * Provide an implementation for this method
 */
	@Test
	public void testSetClosed() {
		QueueOfCusts qOfCusts = new QueueOfCusts();

		CustInQueue cin = new CustInQueue("Andrew", "px21");
		CustInQueue cin2 = new CustInQueue("Janice", "lt64s");

		qOfCusts.addDetails(cin);
		qOfCusts.addToQueue();
		qOfCusts.addDetails(cin2);
		qOfCusts.addToQueue();

		SeedMap seedList = new SeedMap();
		Seed s = new Seed("lt64s", "Square", 5, "Blue");

		Seed s2 = new Seed("ntqx", "Square", 6 ,"Green");
		seedList.addDetails(s);
		seedList.addDetails(s2);
		
		
		wareHouseWorker = new Worker( qOfCusts, seedList, 5, 4);
		assertFalse(wareHouseWorker.getClosed());
		wareHouseWorker.setClosed(false);
		assertTrue(wareHouseWorker.getClosed());

	}

/**
 * You're provided with a working implementation of this method
 * Write the tests for it
 *
 */
	@Test
	public void testProcessOneCustomer() {
		QueueOfCusts qOfCusts = new QueueOfCusts();

		CustInQueue cin = new CustInQueue("Andrew", "px21");
		CustInQueue cin2 = new CustInQueue("Janice", "lt64s");

		qOfCusts.addDetails(cin);
		qOfCusts.addToQueue();
		qOfCusts.addDetails(cin2);
		qOfCusts.addToQueue();

		SeedMap seedList = new SeedMap();
		Seed s = new Seed("lt64s", "Square", 5, "Blue" );

		Seed s2 = new Seed("ntqx", "Circle", 5, "Green");
		seedList.addDetails(s);
		seedList.addDetails(s2);

		wareHouseWorker = new Worker( qOfCusts, seedList, 5, 4);


 		wareHouseWorker.processOneCustomer();

		CustInQueue current = wareHouseWorker.getCurrentCust();
		assertTrue(current==cin);

		wareHouseWorker.processOneCustomer();
		CustInQueue current2 = wareHouseWorker.getCurrentCust();
		assertTrue(current2==cin2);

	}

}
