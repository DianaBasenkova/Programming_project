public class Radio {
    public int currentStation;

    public int getCurrentStation() {

        return currentStation;
    }
    private int currentVolume;
    public int getCurrentVolume() {
        return currentVolume;}

    public void setCurrentVolume(int newCurrentVolume) {
        currentVolume = newCurrentVolume;
    }
    public void setCurrentStation(int newCurrentStation){
    if (newCurrentStation < 0){return;}
    if (newCurrentStation >9){return;}
        currentStation = newCurrentStation;
    }
    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume = currentVolume + 1;
        }
        else return;
    }
    public void decreaseVolume(){
        if (currentVolume > 0) {currentVolume = currentVolume - 1;}
        else return;
    }
    public void nextStation(){
        if (currentStation < 9){currentStation = currentStation +1;
        }
        else currentStation = 0;
    }

    public void prevStation(){
        if (currentStation > 0){currentStation = currentStation - 1;}
        else currentStation = 9;
    }
    }

