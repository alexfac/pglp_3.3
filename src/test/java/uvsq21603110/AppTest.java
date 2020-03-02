package uvsq21603110;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import java.util.ArrayList;

public class AppTest 
{

    @Test
    public void initRobot(){
        Robot r = new Robot();
        assertTrue(r != null);
    }

    @Test
    public void TestList(){

        RobotList rl = new RobotList();
        Robot r = new Robot();
        Robot r1 = new Robot();
        rl.add(r);
        rl.add(r1);
        ArrayList<AbstractRobot> l = rl.getRobotlist();
        assertTrue(l.size() == 2);
    }

    @Test
    public void avanceTous(){

        RobotList rl = new RobotList();
        Robot r = new Robot();
        Robot r1 = new Robot();
        rl.add(r);
        rl.add(r1);
        rl.avancerTous();
        ArrayList<AbstractRobot> l = rl.getRobotlist();
        Position p = new Position(1,2);
        assertTrue(l.get(0).position.y == p.y && l.get(0).position.x == p.x);
        assertTrue(l.get(1).position.y == p.y && l.get(1).position.x == p.x);
    }
}
