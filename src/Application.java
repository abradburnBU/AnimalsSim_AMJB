/**
 * In the application class each of the subsequent classes are being initialized and tested. After the class is initialized the getters and setters are used to check if the
 * exception handling works.
 * 
 * @author Austin Bradburn
 * @version 1.0
 *
 */
public class Application {

	public static void main(String[] args) {

/*********************************************
        Location Tests
*********************************************/
		
		int xCoord=3;
		int yCoord=2;
		
		Location test1 = new Location();
		Location test2 = new Location(xCoord, yCoord);
		
		test2.setxCoord(5);
		test2.getxCoord();
		
		test2.setyCoord(9);
		test2.getyCoord();
		
		System.out.print("The xCoordinate is: " +xCoord + " The yCoordinate is: " +yCoord);
		
/*********************************************
        Animal Tests
*********************************************/
		
		int simID=3;
		Location l = new Location();
		boolean full=true;
		boolean rested=true;
		
		//Animal test3 = new Animal(); - Cannot be instantiated because it is an abstract class
		//Animal test4 = new Animal(simID, l); - Cannot be instantiated because it is an abstract class
		
/*********************************************
        Goldfinch Tests
*********************************************/

		double wingSpan=6.0;
		
		Goldfinch test5 = new Goldfinch();
		Goldfinch test6 = new Goldfinch(simID, l, wingSpan);
		
		test6.setWingSpan(13.0); //This should throw an error message because a wingspan of 13.0 is outside of the appropriate range.
		test6.getWingSpan();
		
		System.out.print("\nThe Wingspan is: " +wingSpan);
		
		test6.setWingSpan(9.2);
		test6.getWingSpan();
		
		System.out.print("\nThe Wingspan is: " +wingSpan);
		
/*********************************************
        BrownBear Tests
*********************************************/

		String subSpecies="Grizzly";
		
		BrownBear test7 = new BrownBear();
		BrownBear test8 = new BrownBear(simID, l, subSpecies);
		
		test8.setSubSpecies("Kodiac");
		test8.getSubSpecies();
		
		System.out.print("\nThe SubSpecies is: " +subSpecies);
		
		test8.setSubSpecies("Rain"); //This should throw an error message because it is not one of the accepted SubSpecies
		test8.getSubSpecies();
		
		System.out.print("\nThe SubSpecies is: " +subSpecies);
		
	}//ends main method

}//ends Application
