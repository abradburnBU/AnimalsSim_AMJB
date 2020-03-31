/**
 * Used to move BrownBear 3 units in a specified direction and Goldfinch 1 unit in a specified direction.
 * @author imaus
 *
 */
public interface Walkable {

	public void walk(int direction);
	
		class Goldfinch implements Walkable{

			@Override
			public void walk(int direction) {
				direction++;
			}
		}
		
		class BrownBear implements Walkable{

			@Override
			public void walk(int direction) {
				direction=direction+3;		
			}
		}
		
}//ends walkable
