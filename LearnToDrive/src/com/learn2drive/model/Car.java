package com.learn2drive.model;
/*
 * entity
 * model
 * java bean/bean
 */
public class Car {
	/*data members
	 * attribute
	 * properties
	 * instance variables*/
	private String make, model, colour;
	private Engine engine;         //car "has a" engine
									/*containership
									 * composition
									 * 		Car has a engine
									 *  agrregation
									 *  	Driver has car(s)     
									 */
	
	//no arg constructor //no parameter constructor
	public Car(){
		//make = model = colour = "";
		this("","","");
	}
	
	public Car(String make,String model,String colour)
	{
		make = this.make;
		model = this.model;
		colour = this.colour;
		
	}
	
	/*member methods
	 * instance methods
	 * getters are called accessor
	 */
	public String getMake() {
		return make;
	}
	/*
	 * setters are called mutators
	 */
	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	@Override    //annotations
	//Access Specifier could be made less restrictive
	//co-variant return type, subclass overriding method of superclass can 
	//change return types to that of it's subclasses
	public String toString() {
		return getMake() + "---" + getModel() + "---" +getColour() ;
	}
	
	
}
