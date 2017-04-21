package com.demo.Demo_Project;

class Shape {
	public float area() {
		return 0;
	}

	public float circumference() {
		return 0;
	}
	public void display(float finalArea){
		System.out.print(finalArea);
	}
}

class Circle extends Shape {
	private float radius;
	private float result;
	
	Circle(float radius){
		this.radius = radius;
	}	
	public float area(){
		result = (float) (3.14 * radius * radius);
		return result;		
	}	
	public float circumference(){
		result = (float) (2 * 3.14 * radius);
		return result;
		
	}

}

class Rectangle extends Shape {
	private float length;
	private float breadth;
	private float result;
	
	Rectangle(float length, float breadth){
		this.length = length;
		this.breadth = breadth;
	}	
	public float area(){
		result = length * breadth;
		return result;		
	}	
	public float circumference(){
		result = 2 * (length + breadth);
		return result;
		
	}

}

class DemoShape {
	public static void main(String args[]) {	
		//Circle
		 Shape objCircle = new Circle(3);
		 float resultArea = objCircle.area();
		 System.out.print("Circle: \nArea: ");
		 objCircle.display(resultArea);
		 float resultCircum = objCircle.circumference();
		 System.out.print("\nCircumference: ");
		 objCircle.display(resultCircum);
		 
		 //Rectangle
		 Shape objRectangle = new Rectangle(3,4);
		 float resultAreaRectangle = objRectangle.area();
		 System.out.print("\nRectangle: \nArea: ");
		 objRectangle.display(resultAreaRectangle);
		 float resultCircumRectangle = objRectangle.circumference();
		 System.out.print("\nCircumference: ");
		 objRectangle.display(resultCircumRectangle);
	}

}
