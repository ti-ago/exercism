class ProductionRemoteControlCar implements RemoteControlCar, Comparable<ProductionRemoteControlCar> {
    private int distanceTravelled;
    private int victories;

    public ProductionRemoteControlCar(){
        distanceTravelled = 0;
        victories = 0;
    }

    public void drive() {
        distanceTravelled += 10;
    }

    public int getDistanceTravelled() {
        return distanceTravelled;
    }

    public int getNumberOfVictories() {
        return victories;
    }

    public void setNumberOfVictories(int numberOfVictories) {
        victories = numberOfVictories;
    }

    public int compareTo(ProductionRemoteControlCar prcc){
        return Integer.compare(prcc.victories, this.victories);
    }
}
