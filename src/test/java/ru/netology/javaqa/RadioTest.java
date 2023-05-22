package ru.netology.javaqa;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    Radio radio = new Radio();

    @Test
    public void shouldCompareWithoutCountStations() {
        Assertions.assertEquals(9, radio.getLastStation());
    }

    @Test
    public void shouldCompareWithCountStations() {
        Radio radio = new Radio(17);
        Assertions.assertEquals(16, radio.getLastStation());
    }

    @Test
    public void shouldCompareWithCountStations2() {
        Radio radio = new Radio(15);
        int expected = radio.getFirstStation() + radio.getCountStations() - 1;
        int actual = radio.getLastStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetStation() {

        radio.setCurrentStation(5);

        int expected = 5;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNegativeStation() {

        radio.setCurrentStation(-5);

        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetExceedingStation() {

        radio.setCurrentStation(11);

        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNextStation() {

        radio.setCurrentStation(5);
        radio.setNextStation();

        int expected = 6;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNextStationFromLast() {

        radio.setCurrentStation(radio.getLastStation());
        radio.setNextStation();

        int expected = radio.getFirstStation();
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNextStationFrom8() {

        radio.setCurrentStation(8);
        radio.setNextStation();

        int expected = 9;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetPrevStation() {

        radio.setCurrentStation(3);
        radio.setPrevStation();

        int expected = 2;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetPrevStationFromFirst() {

        radio.setCurrentStation(radio.getFirstStation());
        radio.setPrevStation();

        int expected = radio.getLastStation();
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetPrevStationFrom1() {

        radio.setCurrentStation(1);
        radio.setPrevStation();

        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolume() {

        radio.setCurrentVolume(50);
        radio.increaseVolume();

        int expected = 51;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolumeAboveMax() {

        radio.setCurrentVolume(radio.getMaxVolume());
        radio.increaseVolume();

        int expected = radio.getMaxVolume();
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolume() {

        radio.setCurrentVolume(38);
        radio.decreaseVolume();

        int expected = 37;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolumeLowerMin() {

        radio.setCurrentVolume(radio.getMinVolume());
        radio.decreaseVolume();

        int expected = radio.getMinVolume();
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNegativeVolume() {

        radio.setCurrentVolume(-50);

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolumeAbove100() {

        radio.setCurrentVolume(150);

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
}
