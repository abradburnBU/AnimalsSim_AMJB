/**
 * The BrownBear class is used to create/handle the specific traits that are exclusive to the BrownBear in comparison to other classes under the Animal parent
 * @author imaus
 *
 */

public class BrownBear extends Animal{

	private String subSpecies; //The subSpecies variable is exclusive to the BrownBear class and is used to determine what species the BrownBear is based on the 6 types given
	
	/**
	 * Empty argument constructor initializes the variables.
	 */
	
	public BrownBear() {
		
		simID=0;
		Location l = new Location();
		l.setxCoord(0);
		l.setyCoord(0);
		full=false;
		rested=true;
		subSpecies="Alaskan";
		
	}//ends empty-argument constructor
	
	/**
	 * The preferred constructor sets the currently executing variables to what they are equal to in the BrownBear class except for the subSpecies variable that has to be
	 * one of the String values: Alaskan, Asiatic, European, Grizzly, Kodiac, or Siberian
	 * @param simID
	 * @param l
	 * @param subSpecies
	 */
	
	public BrownBear(int simID, Location l, String subSpecies) {
		
		this.simID=simID;
		this.location=location;
		InvalidSubspeciesException ise = new InvalidSubspeciesException("Species must be one of six specified types");
		try {
			if((subSpecies.equals("Alaskan")) || ((subSpecies.equals("Asiatic")) || ((subSpecies.equals("European")) || ((subSpecies.equals("Grizzly")) || ((subSpecies.equals("Kodiac")) || ((subSpecies.equals("Siberian")))))))){
				this.subSpecies=subSpecies;
			}else {
				throw ise;
			}//ends else
		}catch(InvalidSubspeciesException i) {
			System.out.println(i.getMessage());
		}
		full=false;
		rested=true;
		
	}//ends preferred constructor
	
	/**
	 * The Walkable and Swimmable interfaces should be called to have them move the appropriate amount based on the BrownBear's current location and where it is trying to move
	 * to, however I couldn't figure out how to get these to work properly.
	 */
	
	public void Walkable() {
		
	}//Calls the interface Walkable and moves the BrownBear accordingly
	
	public void Swimmable() {
		
	}//Calls the Swimmable interface and moves the BrownBear accordingly

	//GETTERS AND SETTERS
	
	protected String getSubSpecies() {
		return subSpecies;
	}

	protected void setSubSpecies(String subSpecies) {
		this.subSpecies = subSpecies;
	}
	
}//ends BrownBear
