package uvsq21603110;

public class RobotStatique extends Robot{

    public RobotStatique(int position, int direction) {
        super(position, direction);
    }

    @Override
    public void avance(){
        throw new UnsupportedOperationException();
    }
}
