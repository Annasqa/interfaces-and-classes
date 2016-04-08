/**
 *   File Name: Square.java<br>
 *
 *   LastName, FirstName<br>
 *   Java Boot Camp Exercise<br>
 *   Instructor: Jean-francois Nepton<br>
 *   Created: Apr 6, 2016
 *
 */

package com.sqa.aa.shapes;

/**
 * Square //ADDD (description of class)
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
public class Square implements IShape {
	private String color = "Black";

	private boolean ellipse = false;
	private double length;

	private String name = "Default Square";

	private int numSides = 4;

	private String type = "Square";

	private int width;

	/**
	 *
	 */
	public Square() {
		this.length = 1;
	}

	/**
	 * @param color
	 * @param ellipse
	 * @param name
	 * @param numSides
	 * @param type
	 */
	public Square(String name, String color) {
		super();
		this.color = color;
		this.name = name;
		this.length = 10;

	}

	public Square(String name, String color, double length) {
		super();
		this.color = color;
		this.name = name;
		this.length = length;

	}

	@Override
	public double calcArea() {
		double area = this.length * this.length;
		return area;
	}

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
	 * @return the name
	 */
	@Override
	public String getName() {
		return this.name;
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
	 * @param name
	 *            the name to set
	 */
	@Override
	public void setName(String name) {
		this.name = name;
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
		builder.append("Square [color=");
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

}
