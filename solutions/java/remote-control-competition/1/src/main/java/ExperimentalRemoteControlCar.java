public class ExperimentalRemoteControlCar implements RemoteControlCar {
    private int distanceTravelled;

    public ExperimentalRemoteControlCar(){
        distanceTravelled = 0;
    }

    public void drive() {
        distanceTravelled += 20;
    }

    public int getDistanceTravelled() {
        return distanceTravelled;
    }
}
