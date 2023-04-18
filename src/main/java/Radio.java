public class Radio {
    private int currentVolume;
    private int currentWave;
    private int amount;


    public Radio() {
        amount = 10;

    }

    public Radio(int amountOfStations) {
        amount = amountOfStations;

    }


    public int getCurrentVolume() {
        return currentVolume;
    }


    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < 0) {
            currentVolume = 0;
        }
        if (currentVolume > 100) {
            currentVolume = 100;
        }
        this.currentVolume = currentVolume;
    }


    public int increaseVolume() {
        if (currentVolume >= 100) {
            currentVolume = 100;
        } else {
            currentVolume++;
        }
        return currentVolume;
    }

    public int decreaseVolume() {
        if (currentVolume <= 0) {
            currentVolume = 0;
        } else {
            currentVolume--;

        }
        return currentVolume;
    }


    public void setCurrentWave(int currentWave) {
        //currentWave = 28
        if (currentWave > amount - 1) {
            currentWave = amount - 1;
        }
        if (currentWave < 0) {
            currentWave = 0;
        }
        this.currentWave = currentWave;

    }

    public int getCurrentWave() {
        return currentWave;
    }

    public void nextWave() {
        //amount = 10
        if (currentWave >= amount - 1) {
            currentWave = 0;
        } else {
            currentWave++;

        }
    }

    public void prevWave() {
        //currentWave = 0
        if (currentWave <= 0) {
            currentWave = amount - 1;
        } else {
            currentWave--;

        }
    }


}
