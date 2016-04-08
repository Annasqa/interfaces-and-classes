/**
 *   File Name: Circle.java<br>
 *
 *   LastName, FirstName<br>
 *   Java Boot Camp Exercise<br>
 *   Instructor: Jean-francois Nepton<br>
 *   Created: Apr 6, 2016
 *
 */

package com.sqa.aa.shapes;

/**
 * Circle //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 *
 * @author LastName, FirstName
 * @version 1.0.0
 * @since 1.0
 *
 */
public class Circle implements IShape {

	private String color = "White";

	private boolean ellipse = true;

	private String name = "Default Circle";

	private int numSides = 0;

	private double radius;

	private String type = "Circle";

	/**
	 *
	 */
	public Circle() {
		this.radius = 2;

	}

	/**
	 * @param color
	 * @param name
	 * 
	 */
	public Circle(String name, String color) {
		super();
		this.color = color;
		this.name = name;
		this.radius = 10 / 2;
	}

	public Circle(String name, String color, double diameter) {
		super();
		this.color = color;
		this.name = name;
		this.radius = diameter / 2;
	}

	/**
	 * @see com.sqa.aa.shapes.IShape#calcArea()
	 */
	@Override
	public double calcArea() {
		double area = Math.PI * this.radius * 2;
		return area;
	}

	/**
	 * @see com.sqa.aa.shapes.IShape#calcPerimeter()
	 */
	@Override
	public double calcPerimeter() {
		// TODO Auto-generated method stub
		return 0;
	}

	/**
	 * @return the color
	 */
	@Override
	public String getColor() {
		return this.color;
	}

	/**
	 * @see com.sqa.aa.shapes.IShape#getName()
	 */
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * @return the numSides
	 */
	@Override
	public int getNumSides() {
		return this.numSides;
	}

	/**
	 * @return the type
	 */
	@Override
	public String getType() {
		return this.type;
	}

	/**
	 * @return the ellipse
	 */
	@Override
	public boolean isEllipse() {
		return this.ellipse;
	}

	/**
	 * @param color
	 *            the color to set
	 */
	@Override
	public void setColor(String color) {
		this.color = color;
	}

	/**
	 * @param ellipse
	 *            the ellipse to set
	 */
	@Override
	public void setEllipse(boolean ellipse) {
		this.ellipse = ellipse;
	}

	/**
	 * @see com.sqa.aa.shapes.IShape#setName(java.lang.String)
	 */
	@Override
	public void setName(String name) {
		// TODO Auto-generated method stub

	}

	/**
	 * @param numSides
	 *            the numSides to set
	 */
	@Override
	public void setNumSides(int numSides) {
		this.numSides = numSides;
	}

	/**
	 * @param type
	 *            the type to set
	 */
	@Override
	public void setType(String type) {
		this.type = type;
	}

	/**
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Circle [color=");
		builder.append(this.color);
		builder.append(", ellipse=");
		builder.append(this.ellipse);
		builder.append(", name=");
		builder.append(this.name);
		builder.append(", numSides=");
		builder.append(this.numSides);
		builder.append(", type=");
		builder.append(this.type);
		builder.append("]");
		return builder.toString();
	}

	// @Override
	// public String toString() {
	// return this.getClass().getSimpleName() + " - " + super.toString();
	// }
}
