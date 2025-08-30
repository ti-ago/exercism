
class BirdWatcher {
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public int[] getLastWeek() {
        return birdsPerDay;
    }

    public int getToday() {
        return birdsPerDay[birdsPerDay.length-1];
    }

    public void incrementTodaysCount() {
        birdsPerDay[birdsPerDay.length-1] += 1;
    }

    public boolean hasDayWithoutBirds() {
        for(int i:birdsPerDay){
            if(i == 0){
                return true;
            }
        }
        return false;
    }

    public int getCountForFirstDays(int numberOfDays) {
        int size;
        if (numberOfDays > birdsPerDay.length){
            size = birdsPerDay.length;
        }else{
            size = numberOfDays;
        }
        int sum = 0;
        for(int i = 0; i < size; i++){
            sum += birdsPerDay[i];
        }
        return sum;
    }

    public int getBusyDays() {
        int sum = 0;
        for(int i:birdsPerDay){
            if(i>=5){
                sum += 1;
            }
        }
        return sum;
    }
}
