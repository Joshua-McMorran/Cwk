package itemTests;

import static org.junit.Assert.*;

import org.junit.Test;

import itemSrc.*;

public class SeedMapTest {
	SeedMap seedList;

	@Test
	public void testSeedMap() {
		seedList = new SeedMap();
		assertTrue(seedList.getNumberOfEntries()==0);
		Seed s = new Seed("X004", "Potato", "Circle", 5 , "blue");
		Seed s2 = new Seed("X003", "Beans", "Squaer", 5 , "yellow");
		seedList.addDetails(s);
		seedList.addDetails(s2);
		assertTrue(seedList.getNumberOfEntries()==2);
	}
	@Test
	public void testAddDetails() {
		seedList = new SeedMap();
		Seed s = new Seed("X004", "Potato", "Circle", 5 , "blue");
		Seed s2 = new Seed("X003", "Beans", "Squaer", 5 , "yellow");
		seedList.addDetails(s);
		seedList.addDetails(s2);
		
		assertTrue(seedList.getNumberOfEntries()==2);
	}
	@Test
	public void testHasSeeds() {
		seedList = new SeedMap();
		Seed s = new Seed("X004", "Potato", "Circle", 5 , "blue");
		Seed s2 = new Seed("X003", "Beans", "Squaer", 5 , "yellow");
		seedList.addDetails(s);
		seedList.addDetails(s2);	
		assertTrue(seedList.hasSeeds("X004")==true);
		assertTrue(seedList.hasSeeds("X003")==true);
	}
	@Test
	public void testGetNumberOfEntries() {
		seedList = new SeedMap();
		assertTrue(seedList.getNumberOfEntries() == 0);
		Seed s = new Seed("X004", "Potato", "Circle", 5 , "blue");
		Seed s2 = new Seed("X003", "Beans", "Squaer", 5 , "yellow");
		seedList.addDetails(s);
		assertTrue(seedList.getNumberOfEntries() == 1);
		seedList.addDetails(s2);
		assertTrue(seedList.getNumberOfEntries() == 2);	
	}
	@Test
	public void testAllGone() {
		seedList = new SeedMap();
		Seed s = new Seed("X004", "Potato", "Circle", 5 , "blue");
		Seed s2 = new Seed("X003", "Beans", "Squaer", 5 , "yellow");
		seedList.addDetails(s);
		seedList.addDetails(s2);
		assertTrue(seedList.allGone() == false);
		s.setCollected(true);
		s2.setCollected(true);
		assertTrue(seedList.allGone() == true);
	}
	@Test
	public void testListDetails() {
		seedList = new SeedMap();
		Seed s = new Seed("X004", "Potato", "Circle", 5 , "blue");
		Seed s2 = new Seed("X003", "Beans", "Squaer", 5 , "yellow");
		seedList.addDetails(s);
		seedList.addDetails(s2);
		String details [] = seedList.listDetails().split(",");
		assertTrue(details.length==10);	
	}
	@Test
	public void testSetCollected() {
		seedList = new SeedMap();
		Seed s = new Seed("X004", "Potato", "Circle", 5 , "blue");
		Seed s2 = new Seed("X003", "Beans", "Squaer", 5 , "yellow");
		seedList.addDetails(s);
		seedList.addDetails(s2);
		seedList.setCollected(s2);
		assertTrue(seedList.findSeed("X003").isCollected() ==true);
		seedList.setCollected(s);
		assertTrue(seedList.findSeed("X004").isCollected() ==true);
	}
	@Test
	public void testFindSeed() {
		seedList = new SeedMap();
		Seed s = new Seed("X004", "Potato", "Circle", 5 , "blue");
		Seed s2 = new Seed("X003", "Beans", "Squaer", 5 , "yellow");
		seedList.addDetails(s);
		seedList.addDetails(s2);
		assertTrue(seedList.findSeed("X004")!=null);
	}
}
