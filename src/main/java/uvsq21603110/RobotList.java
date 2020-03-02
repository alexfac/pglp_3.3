package uvsq21603110;

import java.util.ArrayList;

public class RobotList {

    public ArrayList<AbstractRobot> getRobotlist() {
        return robotlist;
    }

    ArrayList<AbstractRobot> robotlist;

    public RobotList(){
        robotlist = new ArrayList<AbstractRobot>();
    }

    public void add(AbstractRobot robot){
        this.robotlist.add(robot);
    }

    public void avancerTous(){
        for (int i = 0; i < robotlist.size(); i++) {
            robotlist.get(i).avance();
        }
    }
}
