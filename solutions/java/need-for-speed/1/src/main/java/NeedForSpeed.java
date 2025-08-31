class NeedForSpeed {
    int speed;
    int batteryDrain;
    int distanceDriven;
    int batteryCharge;
    
    NeedForSpeed(int speed, int batteryDrain) {
        this.speed = speed;
        this.batteryDrain = batteryDrain;
        this.distanceDriven = 0;
        this.batteryCharge = 100;
    }

    public boolean batteryDrained() {
        return batteryCharge < this.batteryDrain;
    }

    public int distanceDriven() {
        return this.distanceDriven;
    }

    public void drive() {
        if(!this.batteryDrained()){
            this.distanceDriven += this.speed;
            this.batteryCharge -= this.batteryDrain;
        }
    }

    public static NeedForSpeed nitro() {
        return new NeedForSpeed(50, 4);
    }
}

class RaceTrack {
    private int distance;
    
    RaceTrack(int distance) {
        this.distance = distance;
    }

    public boolean canFinishRace(NeedForSpeed car) {
        return ((car.batteryCharge / car.batteryDrain) * car.speed) >= this.distance; 
    }
}
