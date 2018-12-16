package itemTests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import itemSrc.*;

class SeedTest {
	Seed s;

	@Test
	public void testSeed() {
		s = new Seed("lt64s", "Potato", "Square", 5, "Blue");
		assertEquals(s.getId(), "lt64s");
	}
	@Test
	public void testGetId() {
		s = new Seed("lt64s", "Potato", "Square", 5, "Blue");
		assertTrue(s.getId() == "lt64s");
	}
	
	@Test
	public void testSetId() {
		s = new Seed("lt64s", "Potato", "Square", 5, "Blue");
		assertSame(s.getId(), "lt64s");
		s.setId("pepe");
		assertEquals(s.getId(), "pepe");
	}
	
	@Test
	public void testType() {
		s = new Seed("lt64s", "Potato", "Square", 5, "Blue");
		assertTrue(s.getType() == "Potato");
	}
	
	@Test
	public void testSetType() {
		s = new Seed("lt64s", "Potato", "Square", 5, "Blue");
		assertSame(s.getType(), "Potato");
		s.setType("Bean");
		assertEquals(s.getType(),"Bean");
	}
	
	@Test
	public void testGetShape() {
		s = new Seed("lt64s", "Potato", "Square", 5, "Blue");
		assertEquals(s.getShape(), "Square");
	}
	
	@Test
	public void testSetShape() {
		s = new Seed("lt64s", "Potato", "Square", 5, "Blue");
		assertSame(s.getShape(), "Square");
		s.setShape("Circle");
		assertEquals(s.getShape(), "Circle");
	}
	
	@Test
	public void testColour() {
		s = new Seed("lt64s", "Potato", "Square", 5, "Blue");
		assertEquals(s.getColour(), "Blue");
	}
	
	@Test
	public void testSetColour() {
		s = new Seed("lt64s", "Potato", "Square", 5, "Blue");
		assertSame(s.getColour(), "Blue");
		s.setColour("Green");
		assertEquals(s.getColour(), "Green");
	}
	
	@Test
	public void testGetWeight() {
		s = new Seed("lt64s", "Potato", "Square", 5, "Blue");
		assertTrue(s.getWeight() == 5);
	}
	
	@Test
	public void testSetWeight() {
		s = new Seed("lt64s", "Potato", "Square", 5, "Blue");
		assertFalse(s.getWeight()!=5);
		s.setWeight(10);
		assertTrue(s.getWeight() == 10);
		
	}
	
	@Test
	public void testIsCollected() {
		s = new Seed("lt64s", "Potato", "Square", 5, "Blue");
		assertFalse(s.isCollected() != false);
	}
	
	@Test
	public void testSetCollected() {
		s = new Seed("lt64s", "Potato", "Square", 5, "Blue");
		assertFalse(s.isCollected() != false);
		s.setCollected(true);
		assertTrue(s.isCollected() == true);
	}

	@Test
	public void testEquals() {
		s = new Seed("lt64s", "Potato", "Square", 5, "Blue");
		Seed s2 = new Seed("lt64s", "Potato", "Square", 5, "Blue");
		assertTrue(s.equals(s2));
		assertFalse(s.equals("Test"));
	}
}
