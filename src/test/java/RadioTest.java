import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class RadioTest {
    Radio service = new Radio();
    Radio serviceTwo = new Radio(30);


    @Test
    public void shouldBeAbleToSetVolume() {

        service.setCurrentVolume(1);
        int expected = 1;
        int actual = service.getCurrentVolume();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void pShouldNotBeAbleToIncreaseVolumeAbove100() {

        service.setCurrentVolume(100);
        service.increaseVolume();
        int expected = 100;
        int actual = service.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldBeAbleToIncreaseVolume() {
        int expected = 1;
        int actual = service.increaseVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldBeAbleToDecreaseVolume() {
        service.setCurrentVolume(1);
        int expected = 0;
        int actual = service.decreaseVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotBeAbleToDecreaseVolumeBelow0() {

        int expected = 0;
        int actual = service.decreaseVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void ShouldNotBeAbleToSetVolumeAbove100() {
        service.setCurrentVolume(101);
        int expected = 100;
        int actual = service.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void ShouldNotBeAbleToSetVolumeBelow0() {
        service.setCurrentVolume(-2);
        int expected = 0;
        int actual = service.getCurrentVolume();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void ShouldStartFromZeroWave2() {

        serviceTwo.setCurrentWave(28);
        for (int i = 0; i < 2; i++)
            serviceTwo.nextWave();
        Assertions.assertEquals(0, serviceTwo.getCurrentWave());


    }

    @Test
    public void ShouldStartFromZeroWave() {
        service.setCurrentWave(9);
        for (int i = 0; i < 2; i++) service.nextWave();
        int expected = 1;
        int actual = service.getCurrentWave();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void ShouldStartFromNinthWave() {

        service.setCurrentWave(1);
        for (int i = 0; i < 2; i++) service.prevWave();
        int expected = 9;
        int actual = service.getCurrentWave();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void ShouldStartFromMaxWave() {

        serviceTwo.setCurrentWave(1);
        for (int i = 0; i < 2; i++) serviceTwo.prevWave();
        Assertions.assertEquals(29, serviceTwo.getCurrentWave());
    }

    @Test
    public void shouldBeAbleToSetWave() {
        service.setCurrentWave(5);
        int expected = 5;
        int actual = service.getCurrentWave();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotBeAbleToSetWaveBelowZero() {
        service.setCurrentWave(-1);
        int expected = 0;
        int actual = service.getCurrentWave();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotBeAbleToSetWaveAbove9() {
        service.setCurrentWave(10);
        int expected = 9;
        int actual = service.getCurrentWave();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotBeAbleToSetWaveAboveMaxWave() {
        serviceTwo.setCurrentWave(30);
        Assertions.assertEquals(29, serviceTwo.getCurrentWave());
    }
}