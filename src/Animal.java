/**
 * The animal class sets the shared information that is common of each of the animals that is then passed on to its child classes.
 * @author imaus
 *
 */

public abstract class Animal {

	protected int simID; //Used to set the generic ID associated with the animal
	protected Location location; //Used to set the generic location of the associated animal
	protected boolean full; //Boolean that determines whether or not an animal is full
	protected boolean rested; //Boolean that determines whether or not an animal is rested
	
	/**
	 * Empty argument constructor initializes the variables.
	 */
	
	public Animal() {
		
		simID=0;
		Location l = new Location();
		l.setxCoord(0);
		l.setyCoord(0);
		full=false;
		rested=true;
		
	}//ends empty-argument constructor
	
	/**
	 * The preferred constructor sets the current variables equal to their matching component with the exception that simID has to pass a check to be accepted.
	 * @param simID
	 * @param location
	 */
	
	public Animal(int simID, Location location) {
		
		InvalidSimIDException isie = new InvalidSimIDException("The SimID must be an integer greater than 0!");
		try {
			if(simID>0) {
		this.simID=simID;
			}else {
				throw isie;
			}//ends else
		}catch(InvalidSimIDException i) {
			System.out.println(i.getMessage());
		}
		this.location=location;
		full=false;
		rested=true;
		
	}//ends preferred constructor

	/**
	 * The eat method randomly generates a number between 0 and 1. If the number is greater than or equal to .5 then the animal is full, if not the animal is hungry.
	 * The result is then returned.
	 * @return
	 */
	
	boolean eat() {
		
		double x=Math.random();
		
		if(x<=-.5) {
			return false;
		} 
		return true;
	}//ends method eat

	/**
	 *The rested method randomly generates a number between 0 and 1. If the number is greater than or equal to .5 then the animal is rested, if not the animal is tired.
	 *The result is then returned. 
	 * @return
	 */
	
	public boolean rested() {
		
		double x=Math.random();
		
		if(x<=-.5) {
			return false;
		} 
		return true;	
	}//ends method rested

	//GETTERS AND SETTERS
	
	protected int getSimID() {
		return simID;
	}

	protected void setSimID(int simID) {
		this.simID = simID;
	}

	protected Location getLocation() {
		return location;
	}

	protected void setLocation(Location location) {
		this.location = location;
	}

	protected boolean isFull() {
		return full;
	}

	protected void setFull(boolean full) {
		this.full = full;
	}

	protected boolean isRested() {
		return rested;
	}

	protected void setRested(boolean rested) {
		this.rested = rested;
	}
	
}//ends Animal
