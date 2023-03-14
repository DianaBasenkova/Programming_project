import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    //Инициализируем с условием если всего станций 10, максимальный номер станции  = 9
    Radio radio = new Radio();

    @Test
    // установить станцию выше лимита
    public void settingStationOverMax() {

        radio.setCurrentStation(12);
        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    //установить станцию ниже лимита
    public void settingStationBelowMin() {

        radio.setCurrentStation(-5);
        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    // переключить на следующую станцию
    public void shouldSwitchNextStation() {

        radio.setCurrentStation(5);
        radio.nextStation();
        int expected = 6;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    //переключить на предыдущую станцию
    public void shouldSwitchPrevStation() {

        radio.setCurrentStation(9);
        radio.prevStation();
        int expected = 8;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    //переключение назад с минимальной на максимальную станицию
    public void shouldReturnIfStationMin() {

        radio.setCurrentStation(0);
        radio.prevStation();
        int expected = radio.getMaxNumberOfStation();
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    //переключение вперед с максмальной станции на минимальную
    public void shouldReturnIfStationMax() {

        radio.setCurrentStation(9);
        radio.nextStation();
        int expected = 0;
        int actual = radio.getMinNumberOfStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    //увеличение звука
    public void shouldIncreaseVolume() {

        radio.setCurrentVolume(50);
        radio.increaseVolume();
        int expected = 51;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    //уменьшение звука
    public void sholdDecreaseVolume() {

        radio.setCurrentVolume(100);
        radio.decreaseVolume();
        int expected = 99;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    //невозможно увеличить звук, если он на максимуме
    public void shouldReturnIfVolMax() {

        radio.setCurrentVolume(100);
        radio.increaseVolume();
        int expected = 100;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    //невозможно уменьшить звук, если он на минимуме
    public void shouldReturnIfVolMin() {

        radio.setCurrentVolume(0);
        radio.decreaseVolume();
        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    //установка количества станций
    public void setRadioTotalNumberOfStations() {
        Radio radio = new Radio(25);
        Assertions.assertEquals(25, radio.getTotalStation());
    }

    @Test
    //проверка максимального номера станции, если всего их 25
    public void checkingMaxNumber() {
        Radio radio = new Radio(20);
        int expected = 19;
        int actual = radio.getMaxNumberOfStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void newSettingStations() {
        Radio radio = new Radio(20);
        radio.setCurrentStation(15);
        int expected = 15;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }
}