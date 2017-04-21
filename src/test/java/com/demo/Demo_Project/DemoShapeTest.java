package com.demo.Demo_Project;

import org.junit.Test;

import junit.framework.TestCase;

public class DemoShapeTest extends TestCase {
	
	@Test
	public void testShape(){
		
		Shape objCircleTest = new Circle(3);
		float result = objCircleTest.area();
		assertEquals(28.26f, result, 0.0f);
		//assertEquals(28.26, result);
		assertEquals(18.84f, objCircleTest.circumference(),0.0f);
		
		Shape objRectangleTest = new Rectangle(3,4);
		assertEquals(12.0f, objRectangleTest.area(),0.0f);
		assertEquals(14.0f, objRectangleTest.circumference(),0.0f);
	}
	
}
