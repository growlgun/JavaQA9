public class Radio {
    private int currentVolume;
    private int currentWave;

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentWave(int currentWave) {
        if (currentWave > 9) {
            currentWave = 0;
        }
        if (currentWave < 0) {
            currentWave = 9;
        }
        this.currentWave = currentWave;
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

    public int getCurrentWave() {
        return currentWave;
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


    public void nextWave() {
        if (currentWave >= 9) {
            currentWave = 0;
        } else {
            currentWave++;

        }
    }

    public void prevWave() {
        if (currentWave <= 0) {
            currentWave = 9;
        } else {
            currentWave--;

        }
    }


}
