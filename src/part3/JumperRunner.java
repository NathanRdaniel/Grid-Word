
import info.gridworld.actor.Bug;
import info.gridworld.actor.Rock;
import info.gridworld.grid.Grid;
import info.gridworld.grid.Location;
import info.gridworld.actor.ActorWorld;
import info.gridworld.actor.Rock;

import java.awt.Color;

public class JumperRunner {
	
	public static void main(String[] args) {
		ActorWorld world = new ActorWorld();
		JumpingBug bob = new JumpingBug(5);
        world.add(new Location(5, 5), bob);
        world.add(new Rock());
		world.show();
	}
}

