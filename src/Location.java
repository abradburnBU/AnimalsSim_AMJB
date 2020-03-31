/**
 * The location class is used to place the animals on a "grid" that exists beyond xs and ys of 0 and holds the appropriate coordinates in an array.
 * @author imaus
 *
 */
public class Location {
	
	private int xCoord; //Used to store the xCoordinate of the animal
	private int yCoord; //Used to store the yCoordinate of the animal
	
	/**
	 * Empty argument constructor initializes the variables
	 */
	
	public Location() {
		
		xCoord=0;
		yCoord=0;
		
	}//end empty-argument constructor
	
	/**
	 * The preferred constructor sets the x and y coordinate variables equal to what is currently being executed.
	 * @param x
	 * @param y
	 */
	
	public Location(int x, int y) {
		
		this.xCoord=xCoord;
		this.yCoord=yCoord;
		
	}//ends the preferred constructor
	
	/**
	 * The update method updates the coordinates to what they are being changed to and does error checking to try to prevent the user from setting the points outside of the bounds.
	 * @param x
	 * @param y
	 */
	
	public void update(int x, int y) {
		
		InvalidCoordinateException ice = new InvalidCoordinateException("Coordinates cannot be less than 0!");
		try {
			
			if(x>=0) {
			x=xCoord;
			}else {
				throw ice;
			}//ends else
			if(y>=0) {
			y=yCoord;
			}else {
				throw ice;
			}//ends else
			
		}catch(InvalidCoordinateException s) {
			System.out.println(s.getMessage());
		}//ends catch block
		
	}//ends update method
	
	/**
	 * getCoordinates method sets the coordinates to what they currently are and then returns them.
	 * @return
	 */
	
	public int[] getCoordinates() {
		
		int[] a=new int[2];
		a[0]=xCoord;
		a[1]=yCoord;
		
		return a;
		
	}//ends getCoordinates
	
	//GETTERS AND SETTERS

	protected int getxCoord() {
		return xCoord;
	}

	protected void setxCoord(int xCoord) {
		this.xCoord = xCoord;
	}

	protected int getyCoord() {
		return yCoord;
	}

	protected void setyCoord(int yCoord) {
		this.yCoord = yCoord;
	}

	public void setxCoord(Location l) {
		// TODO Auto-generated method stub
		
	}

	public void setyCoord(Location l) {
		// TODO Auto-generated method stub
		
	}
	
}//ends Location class
