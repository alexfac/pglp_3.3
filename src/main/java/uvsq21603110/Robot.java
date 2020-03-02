package uvsq21603110;


import java.util.ArrayList;

public class Robot extends AbstractRobot{

   public Robot(){
       super();
   }

    public void tourne(){
       if(this.direction == 0)
           this.direction = 0;
       else if(this.direction == 90)
           this.direction = 90;
       else if(this.direction == 180)
           this.direction = 180;
       else if(this.direction == 270)
           this.direction = 270;
       else System.out.println("Entrer 0, 90, 180 ou 270");
    }

    @Override
    public void avance(){
        if(this.direction == 0)
            position.y += 1;
        else if(this.direction == 90)
            position.x += 1;
        else if(this.direction == 180)
            position.y -= 1;
        else if(this.direction == 270)
            position.x -= 1;

    }

    public void avancerTous(ArrayList <Robot>RobotList){
        for (int i = 0; i < RobotList.size(); i++) {
            RobotList.get(i).avance();
        }
    }

}
