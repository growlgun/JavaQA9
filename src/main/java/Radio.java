public class Radio {
    public int currentVolume;
    public int currentWave;

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
    public void prevWave(){
        if (currentWave <= 0){
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
