public class Radio {
    private int currentVolume;
    public int currentWave;

    public int setCurrentVolume(int currentVolume) {
        this.currentVolume = currentVolume;
        return currentVolume;
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


    public int setVolume(int volume) {
        if (volume < 0) {
            return 0;
        }
        if (volume > 100) {
            return 100;
        }
        currentVolume = volume;
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

    public int setWave(int wave) {
        if (wave < 0) {
            return 0;
        }
        if (wave > 9) {
            return 9;
        }
        currentWave = wave;
        return currentWave;
    }


}
