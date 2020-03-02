package uvsq21603110;


import java.util.ArrayList;

public class Robot {
    public int position;
    public int direction;
    private ArrayList<Robot> RobotList;

    public Robot(int position, int direction){
        this.position = position;
        this.direction = direction;
    }

    public void tourne(){
        this.position += 90;
    }
    public void avance(){
        this.position += 1;
    }

    public void avancerTous(ArrayList <Robot>RobotList){
        for (int i = 0; i < RobotList.size(); i++) {
            RobotList.get(i).avance();
        }
    }

}
