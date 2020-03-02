package uvsq21603110;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import java.util.ArrayList;

public class AppTest 
{

    @Test
    public void initRobot(){
        Robot r = new Robot(1,0);
        assertTrue(r.position == 1);
    }

    @Test
    public void AvancerTous(){

        ArrayList<Robot> Robotlist= new ArrayList<Robot>();

        Robot r = new Robot(1,0);
        Robot r1 = new Robot(2,0);
        Robot r2 = new Robot(3,0);
        Robotlist.add(r);
        Robotlist.add(r1);
        Robotlist.add(r2);

        r.avancerTous(Robotlist);
        assertTrue(r.position == 2 && r1.position == 3 && r2.position == 4);

    }
}
