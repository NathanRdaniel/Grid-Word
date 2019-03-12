import info.gridworld.actor.Bug;

public class DancingBug extends Bug {
	
	private int steps;
	private int sideLength;
    int danceStep;
    int[] dance = {4,2,3,4,5,6,7,8,9,10};
	/**
	 * Constructs a box bug that traces a square of a given side length
	 * 
	 * @param length
	 *            the side length
	 */
	public DancingBug(int length) {
		steps = 0;
        sideLength = length;
        danceStep = 0;
	}

	/**
	 * Moves to the next location of the square.
	 */
	public void act() {
		if (steps < sideLength && canMove()) {
			move();
			steps++;
		} else {
            dance();
            steps = 0;


		}
    }
    public void dance(){
        if( danceStep == dance.length){
            this.danceStep = 0;
          
        }
        System.out.println(danceStep);
            for(int j = 0; j < dance[danceStep]; j++){
            turn();
        }
        this.danceStep =  danceStep + 1;

        
    }
}
