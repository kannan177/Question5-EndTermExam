package main;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestToughQuestion2 {
	Calories cal=new Calories(); 
	@SuppressWarnings("static-access")
    @Test
	public void testBreadCalorie() {
		assertEquals(148,cal.calculateCalories(2));
	}
	@SuppressWarnings("static-access")
    @Test
	public void testBreadJamCalorie() {
		assertEquals(226,cal.calculateCalories(2,3));
	}
	@SuppressWarnings("static-access")
    @Test
	public void testBreadJamButterCalorie() {
		assertEquals(532,cal.calculateCalories(2,3,3));
	}
}
