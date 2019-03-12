***Part 1***
------------
1) No if theres rocks or a wall surrounding him, he canot move spaces.
2)he will rotate right and atempt to go right.
3)rotate
4)flowers
5)it will rotate right and go to its nearest spaces. so if moving left in the bottom left corner it will go back
6)it rotates
7) No
8) its color fades after x distance away
9) it stops the bug from moving that direction
10) No;

E1- 
***1***
-------
0 N
45  NE
90 E
135 SE
180 S
225 SW
270 W
315 NW 
360 N
***2***
-------
Error Code
***3***
-------
setColor()
***4***
-------
The bug is deleted
***PART 2***
------------
1. What is the role of the instance variable sideLength?
To show its the total side distance to turn
2. What is the role of the instance variable steps?
The amount of steps it dose before it needs to turn
3. Why is the turn method called twice when steps becomes equal to sideLength?
Because turning is a 45 degree turn.
4. Why can the move method be called in the BoxBug class when there is no move method in the BoxBug code?
Because its a child of bug.
5. After a BoxBug is constructed, will the size of its square pattern always be the same? Why or why not?
NO, you can change the peramiters on its Size
6. Can the path a BoxBug travels ever change? Why or why not?
No its set in the code so you will need to change the code 
7. When will the value of steps be zero?
At the corners.
***PART 3***
------------
1. How would you access the row value for loc1?
2. What is the value of b after the following statement is executed?
3. What is the value of loc3 after the following statement is executed?
4. What is the value of dir after the following statement is executed?
5. How does the getAdjacentLocation method know which adjacent location to return?
Set 4
------
1. How can you obtain a count of the objects in a grid? How can you obtain a count of the empty locations in a bounded grid?
getEmptyAdjacentLocations on every spot
getOccupiedAdjacentLocations on every spot
2. How can you check if location (10,10) is in a grid?
we can get the number of coloms and rows and see if 10 fits inside the values of the rows and colloms
3. Grid contains method declarations, but no code is supplied in the methods. Why? Where can you find the implementations of these methods?
in gridworld.jar 
4. All methods that return multiple objects return them in an ArrayList. Do you think it would be a better design to return the objects in an array? Explain your answer.
array lists  because theres no set value to the ammount so you can havem infinent amount iff needed. 


What will a jumper do if the location in front of it is empty, but the location 

two cells in front contains a flower or a rock?
What will a jumper do if the location two cells in front of the jumper is out of the grid?
What will a jumper do if it is facing an edge of the grid?
What will a jumper do if another actor (not a flower or a rock) is in the cell that is two cells in front of the jumper?
What will a jumper do if it encounters another jumper in its path?
Are there any other tests the jumper needs to make?
f.
2. Design: Groups address important design decisions to solve the problem:
a. Which class should Jumper extend?
Bug
b. Is there an existing class that is similar to the Jumper class?
BoxBug
c. Should there be a constructor? If yes, what parameters should be specified
for the constructor?
ya i guess you can do jump length
d. Which methods should be overridden?
none
e. What methods, if any, should be added?
Jump
f. What is the plan for testing the class?
Set up a grid for a bug and a rock


small groups, discuss and clarify the details of the problem:
What will a jumper do if the location in front of it is empty, but the location two cells in front contains a flower or a rock?
it will move normaly until theres a flkower or rock in its path than it will jumpo over
What will a jumper do if the location two cells in front of the jumper is out of the grid? not jump but turn
What will a jumper do if it is facing an edge of the grid?
turn when it hits an edge
What will a jumper do if another actor (not a flower or a rock) is in the cell that is two cells in front of the jumper? move
What will a jumper do if it encounters another jumper in its path? l
They will colide and turn
Are there any other tests the jumper needs to make?
if it cant move.


1. Which statement(s) in the canMove method ensures that a bug does not try to move out of its grid?
checks location and matches tat its on the grid
2. Which statement(s) in the canMove method determines that a bug will not walk into a rock?
a  instanceof rock
3. Which methods of the Grid interface are invoked by the canMove method and why?
?
4. Which method of the Location class is invoked by the canMove method and why?
getAdjacentLocation for other actors
5. Which methods inherited from the Actor class are invoked in the canMove method?
flower rock, bug and actor
6. What happens in the move method when the location immediately in front of the bug is out of the grid?
it turns
7. Is the variable loc needed in the move method, or could it be avoided by calling getLocation() multiple times?
it makes the code look cleaner and less complex, however its is unnessisary to the ciode itself.
8. Why do you think the flowers that are dropped by a bug have the same color as the bug? 
Because it uses the color of the bug for the flower.
9. When a bug removes it self from the grid, will it place a flower into its previous location?
no only one actor can be in one place at one time so if its remoced from grid the bug never moved in the grid to place a  flower.
10. Which statement(s) in the move method places the flower into the grid at the bug’s previous location? 
removeSelfFromGrid();
Flower flower = new Flower(getColor());
flower.putSelfInGrid(gr, loc);
11. If a bug needs to turn 180 degrees, how many times should it call the turn method?
4
