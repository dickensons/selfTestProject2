

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import ch.aplu.jgamegrid.*;
import java.awt.*;

/**
 * The test class. For testing of the second PakMan project.
 * @version (9.01.2015)
 */public class Test
{
    /**
     * First of all we need to prepare our project for the testing.
     * It would be to painful to change something in existing code and we kind 
     * of not allowed to do so for the Level class. So we won't change it, we will add
     * code instead and @overload for some methods.
     * You are free to change all you think need to be change.
     * Just not forget to shere it with rest us ;)
     */
    
    /* 
     * Copy and paste the folowing commented code in the Level class. Uncomment it there.
    //-----------------------------------------------------------------------------
    //---------------------------------for the TEST sake----------------------------------
     
     
        public Level(PaKman game, String newMaze)
    {
        this.game = game;
        setupDefault(newMaze);
        
        // Initialize the number of pills
        for (int y = 0; y < nbVertCells; y++)
            for (int x = 0; x < nbHorzCells; x++)
                if (maze[y][x] == Tile.PILL)
                    pills++;
    }
    
    

    public void setupDefault(String newMaze)
    {
       String mazespec = newMaze;
       
        // Copy structure into maze
        for (int i = 0; i < nbVertCells; i++)
        {
            for (int k = 0; k < nbHorzCells / 2; k++)
                maze[i][k] = charToTile(mazespec.charAt(15 * i + k));
            // Mirror at vertical axis at nbHorzCells / 2
            for (int k = nbHorzCells / 2; k < nbHorzCells; k++)
                maze[i][k] = charToTile(mazespec.charAt(15 * i + (29 - k)));
        }
    }


//----------------------------------------------------------------------
 //---------------------------------end of the TEST----------------------------------
    
    */
   
   //And put this in PaKman class.
   /*
    * //-----------------------------------------------------------------------------
    //---------------------------------for the TEST sake----------------------------------
    
    public PaKman(String newMaze) {
        super(30, 33, 20, true); // Need to set the winsize, because it cannot
                                 // be changed.
        pacActor = new PaKActor(this);
        setSimulationPeriod(100);
        setTitle("TEST_PaKman");
        addKeyListener(this);
        addActListener(new CheckerReset());

        testSetupLevel(new Level(this, newMaze));
        
        lives = MAX_LIVES;

        // Show and activate the game window
        show();
        activate();
    }

    public void testSetupLevel(Level level) {
        theLevel = level;
        setNbHorzCells(level.getSize().x);
        setNbVertCells(level.getSize().y);
        level.drawLevel();
        addActor(new PostMovementChecker(), level.getSize());
        addActor(pacActor, level.getPakmanStart());
        addActor(new PreMovementChecker(), level.getSize());

      
        // pakman acts after ghosts and between movement checkers, to ensure
        // correct collision detection
        setActOrder(Ghost.class, PreMovementChecker.class, PaKActor.class,
                PostMovementChecker.class);
    }
    
    
 //----------------------------------------------------------------------
 //---------------------------------end of the TEST----------------------------------
    */
   
   /* I didn't get how to change ghostStart and PakmanStert positions.
       So we try to use default or
       will change pacmen and chost  start in level     
      
       public Location getPakmanStart() {
        return new Location(5, 24);
    }
        public Location getGhostStart() {
        return new Location(4, 15);
    }
   */
   
     /**
     * Default constructor for test class GhostTest
     */
    
    public Test() {
    }
   
    /**
     * Test for testing Tracy. I wonder if she(he?) moves only
     * 4 steps randomly and then hunt but only with 1 random step possible.
     * 
     * Nothing compile here yet. Don't panic.
     */
    
    
    //@Test
    public void tracyTest() {
    
       
       String newMaze =      //here we put our new maze.
            "xxxxxxxxxxxxxxx" + // 0
            "xxxxxxxxxxxxxxx" + // 1
            "xxxxxxxxxxxxxxx" + // 2
            "xxxxxxxxxxxxxxx" + // 3
            "xxxxxxxxxxxxxxx" + // 4
            "xxxxxxxxxxxxxxx" + // 5
            "xxxxxxxxxxxxxxx" + // 6
            "xxxxxxxxxxxxxxx" + // 7
            "xxxxxxxxxxxxxxx" + // 8
            "xxxxxxxxxxxxxxx" + // 9
            "xxxxxxxxxxxxxxx" + // 10
            "xxxxxxxxxxxxxxx" + // 11
            "xxxxxxxxxxxxxxx" + // 12
            "xxxxxxxxxxxxxxx" + // 13
            "xxxxx xxxxxxxxx" + // 14
            "xxxx  xxxxxxxxx" + // 15
            "xxxxx xxxxxxxxx" + // 16
            "xxxxxxxxxxxxxxx" + // 17
            "xxxxxxxxxxxxxxx" + // 18
            "xxxxxxxxxxxxxxx" + // 19
            "xxxxxxxxxxxxxxx" + // 20
            "xxxxxxxxxxxxxxx" + // 21
            "xxxxxxxxxxxxxxx" + // 22
            "xxxxxxxxxxxxxxx" + // 23
            "xxxxx xxxxxxxxx" + // 24
            "xxxxxxxxxxxxxxx" + // 25
            "xxxxxxxxxxxxxxx" + // 26
            "xxxxxxxxxxxxxxx" + // 27
            "xxxxxxxxxxxxxxx" + // 28
            "xxxxxxxxxxxxxxx" + // 29
            "xxxxxxxxxxxxxxx" + // 30
            "xxxxxxxxxxxxxxx" + // 31
            "xxxxxxxxxxx..xx"   // 32 
            ;
       PaKman testGuy = new PaKman(newMaze);
       
       //Adding new Ghost in the test.
      // Actor testTracy = new Tracy(testGuy);
      // testTracy = testGuy.getTracy();
       //testGuy.addActor(testTracy, new Location(5,16));
       
       
        Tracy testTracy = new Tracy(testGuy);
        testGuy.addActor(testTracy, testGuy.getLevel().getGhostStart());
        
       int turnedLeft = 0;
       int turnedRight = 0;
       
       for(int i=0; i<1000; i++){
       
           
           testTracy.act();
           testTracy.act();
           
           if(testTracy.getLocation().equals(new Location(5,14))){
               
            turnedLeft++;
            }
           else 
                if(testTracy.getLocation().equals(new Location(5,16))){
                turnedRight++;
            }
           
             testTracy.setLocation(testGuy.getLevel().getGhostStart());
       
    }
     System.out.print("turnedLeft: " + turnedLeft + " turnedRight: " + turnedRight);
     
        
            
         if(turnedRight>550){
           fail("It turns to often right " + turnedRight);
            }
         else {
           assertTrue(turnedRight<550 && turnedRight>450);
            }
     
        
    }
     
}
