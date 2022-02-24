public class Fan {

    private static final int MAX_SPEED = 3;

    private int speed = 0; //Assuming when fan objects are created that they are in 'OFF' state
    private boolean reversed;

    public void increaseSpeed(){
        speed++;
        if(speed > MAX_SPEED){
            speed = 0;
        }
    }

    public void reverseDirection(){
        reversed = !reversed;
    }

    public int getSpeed(){
        return speed;
    }

    public boolean isReversed(){
        return reversed;
    }

}
