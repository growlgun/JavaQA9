import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    Radio service = new Radio();

    @Test
    public void shouldBeAbleToSetVolume() {
        int expected = 1;
        int actual = service.setVolume(1);
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldNotBeAbleToIncreaseVolumeAbove100(){
        int expected = 100;
        service.currentVolume = 100;
        int actual = service.increaseVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldBeAbleToIncreaseVolume(){
        int expected = 1;
        int actual = service.increaseVolume();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldBeAbleToDecreaseVolume(){
        int expected = 0;
        service.currentVolume = 1;
        int actual = service.decreaseVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotBeAbleToDecreaseVolumeBelow0(){
        int expected = 0;
        int actual = service.decreaseVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void ShouldNotBeAbleToSetVolumeAbove100() {
        int expected = 100;
        int actual = service.setVolume(101);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void ShouldNotBeAbleToSetVolumeBelow0() {
        int expected = 0;
        int actual = service.setVolume(-2);
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void ShouldStartFromZeroWave() {
        int expected = 0;
        for (int i = 0; i < 10; i++) service.nextWave();
        int actual = service.currentWave;
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void ShouldStartFromNinthWave() {
        int expected = 9;
        service.currentWave = 2;
        for (int i = 0; i < 3; i++) {
            service.prevWave();
        }
        int actual = service.currentWave;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldBeAbleToSetWave() {
        int expected = 5;
        service.setWave(5);
        int actual = service.currentWave;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotBeAbleToSetWaveBelowZero() {
        int expected = 0;
        service.setWave(-1);
        int actual = service.currentWave;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotBeAbleToSetWaveAbove9() {
        int expected = 0;
        service.setWave(10);
        int actual = service.currentWave;
        Assertions.assertEquals(expected, actual);
    }
}