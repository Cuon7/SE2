package Tut09.AdapterToDos;

import Tut09.AdapterTodos.adapter.SquarePegAdapter;
import Tut09.AdapterTodos.round.RoundHole;
import Tut09.AdapterTodos.round.RoundPeg;
import Tut09.AdapterTodos.square.SquarePeg;

/**
 * Somewhere in client code...
 */
public class Demo {
	public static void main(String[] args) {
		//TO-DO: Create 2 instances of RoundHole and RoundPeg with same radius
                RoundHole hole = new RoundHole(5);
                RoundPeg rPeg = new RoundPeg(5);
	 
		//TO-DO: If RoundHole instance can "fits" with RoundPeg instance => show a message
                if(hole.fits(rPeg)) {
                    System.out.println("Round peg fits round hole");
                }
		//TO-DO: Create 2 instances of SquarePeg with 2 different widths
                SquarePeg smallSqPeg = new SquarePeg(2);
                SquarePeg largeSqPeg = new SquarePeg(20);
		//Note: You can't make RoundHole instance "fit" with SquarePeg instance
		//Therefore, we need to use Adapter for solving the problem.
		
		//TO-DO: Create 2 corresponding instances of SquarePegAdapter  
	        SquarePegAdapter smallSqPegAdapter = new SquarePegAdapter(smallSqPeg);
                SquarePegAdapter largeSqPegAdapter = new SquarePegAdapter(largeSqPeg);
		//TO-DO: If the RoundHole instance can "fits" with "small" RoundPegAdapter instance 
		//show a suitable message
                if (hole.fits(smallSqPegAdapter)) {
                System.out.println("Square peg w2 fits round hole r5.");
                }
		//TO-DO: If the RoundHole instance can not "fits" with "big" RoundPegAdapter instance 
		//show a suitable message
                if (!hole.fits(largeSqPegAdapter)) {
                System.out.println("Square peg w20 does not fit into round hole r5.");
                }
	}
}