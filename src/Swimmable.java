/**
 * Moves Brownbear 2 units in a specified direction, ignoring whether or not the BrownBear is in water or not.
 * @author imaus
 *
 */
public interface Swimmable {
	
	public void Swim(int direction);
	
		class BrownBear implements Swimmable{

			@Override
			public void Swim(int direction) {
				direction=direction+2;
			}
		}

}//ends Swimmable
