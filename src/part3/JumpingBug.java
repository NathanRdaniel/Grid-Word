import info.gridworld.actor.Bug;
import info.gridworld.actor.Rock;
import info.gridworld.grid.Grid;
import info.gridworld.grid.Location;
import info.gridworld.actor.ActorWorld;
import info.gridworld.actor.Flower;

public class JumpingBug extends Bug {
	
private int length;

	public JumpingBug(int length) {
	this.length = length;
	}

	/**
	 * Moves to the next location of the square.
	 */
	public void act() {
	
    Location loc = getLocation();
		Location next = loc.getAdjacentLocation(getDirection());
		if (canMove()) {
			move();

		}else if(getGrid().get(next) instanceof Rock ){
			jump();
		} else if(getGrid().get(next) instanceof Flower ){
			jump();
		} else {
		turn();
		}
	}
		public void jump() {

			Location loc = getLocation();
			Location adj = loc.getAdjacentLocation(getDirection());
			Location next = adj.getAdjacentLocation(getDirection());
			System.out.println(getLocation() );
			getDirection();
			moveTo(next);
			

			}
			

			
		}
  
    

