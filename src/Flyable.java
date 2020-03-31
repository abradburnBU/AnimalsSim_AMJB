/**
 * Used to move the Goldfinch to the location that has been specified to represent flying. I couldn't figure out why there was an
 * issue with the line "class Goldfinch implements Flyable".
 * @author imaus
 *
 */
public interface Flyable {

	public void fly(Location l);
/**	
	class Goldfinch implements Flyable{
		static Location a[];

		@Override
		public void fly(Location l) {
			Location s = new Location();
			s.setxCoord(l);
			s.setyCoord(l);
			Location a=s;
		}
	}
**/
}//ends Flyable
