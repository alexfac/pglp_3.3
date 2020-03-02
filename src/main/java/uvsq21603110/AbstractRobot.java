package uvsq21603110;

public abstract class AbstractRobot {
    protected Position position;
    protected int direction;

    public AbstractRobot(){
        position = new Position(1,1);
        direction = 0;//Vers le haut
    }

    public void avance(){}


}
