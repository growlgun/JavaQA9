import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    Radio service = new Radio();

    @Test
    public void ShouldIncreaseVolume() {
        int expected = 1;
        int actual = service.setVolume(1);
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void ShouldNotIncreaseAbove100() {
        int expected = 100;
        int actual = service.setVolume(101);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void ShouldDecreaseVolume() {
        int expected = 0;
        int actual = service.setVolume(-2);
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void ShouldStartFromZeroWave() {
        int expected = 0;
        for (int i = 0; i < 10; i++) {
            service.nextWave();

        }
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