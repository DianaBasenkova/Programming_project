public class Radio {
    private int currentVolume;
    private int totalStations = 10;
    private int maxNumberOfStation = 9;
    private int minNumberOfStation = 0;
    private int currentStation = minNumberOfStation;

    public Radio(int totalStations) {
        this.totalStations = totalStations;
    }


    public int getTotalStation() {
        return totalStations;
    }

    public int getMaxNumberOfStation() {
        return totalStations - 1;
    }

    public int getMinNumberOfStation() {
        return minNumberOfStation;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation < minNumberOfStation) {
            return;
        }
        if (newCurrentStation > maxNumberOfStation) {
            return;
        }
        currentStation = newCurrentStation;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        currentVolume = newCurrentVolume;
    }

    public void nextStation() {
        if (currentStation < maxNumberOfStation) {
            currentStation = currentStation + 1;
        } else currentStation = minNumberOfStation;
    }

    public void prevStation() {
        if (currentStation > minNumberOfStation) {
            currentStation = currentStation - 1;
        } else currentStation = maxNumberOfStation;
    }

    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume = currentVolume + 1;
        } else return;
    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        } else return;
    }
}

