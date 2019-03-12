import info.gridworld.actor.Bug;

public class ZBug extends Bug {
	
	private int steps;
    private int sideLength;
    
    private int count;
	/**
	 * Constructs a box bug that traces a square of a given side length
	 * 
	 * @param length
	 *            the side length
	 */
	public ZBug(int length) {
		steps = 0;
        sideLength = length;
        
	}

	/**
	 * Moves to the next location of the square.
	 */
	public void act() {
		if (steps < sideLength && canMove()) {
			move();
			steps++;
        }
     else if(count == 1) {
       
        steps = 0;
        setDirection(getDirection() + 225);
        count ++;
     }
        else if(count >= 2) {
            
            steps = 10;

    } else {
        steps = 0;
        count ++;
        turn();
        turn();
        turn();
        System.out.println(count);
    }
    }
    public void start(){
        setDirection(getDirection() + 90);

    }
}
