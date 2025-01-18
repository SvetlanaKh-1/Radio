package ru.netology.Radio.objects;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void testRadioDefault() {
        Radio rad = new Radio();

        Assertions.assertEquals(0, rad.getMinStation());
        Assertions.assertEquals(9, rad.getMaxStation());
        Assertions.assertEquals(0, rad.getCurrentStation());
    }

    @Test
    public void testRadioParam() {
        Radio rad = new Radio(30);

        Assertions.assertEquals(0, rad.getMinStation());
        Assertions.assertEquals(29, rad.getMaxStation());
        Assertions.assertEquals(0, rad.getCurrentStation());
    }

    @Test
    public void shouldSetStation() {
        Radio rad = new Radio(30);

        rad.setCurrentStation(28);

        Assertions.assertEquals(28, rad.getCurrentStation());
    }

    @Test
    public void shouldSetMaxStation() {
        Radio rad = new Radio(30);

        rad.setCurrentStation(29);

        Assertions.assertEquals(29, rad.getMaxStation());
    }

    @Test
    public void shouldSetMinStation() {
        Radio rad = new Radio(30);

        rad.setCurrentStation(0);

        Assertions.assertEquals(0, rad.getMinStation());
    }

    @Test
    public void shouldSetStationAboveMax() {
        Radio rad = new Radio(30);

        rad.setCurrentStation(30);

        Assertions.assertEquals(0, rad.getCurrentStation());
    }

    @Test
    public void shouldSetStationBelowMin() {
        Radio rad = new Radio(30);

        rad.setCurrentStation(-1);

        Assertions.assertEquals(0, rad.getCurrentStation());
    }

    @Test
    public void shouldSetNextStation() {
        Radio rad = new Radio(30);
        rad.setCurrentStation(6);
        rad.setNextStation();

        Assertions.assertEquals(7, rad.getCurrentStation());
    }

    @Test
    public void shouldSetNextStationAboveMax() {
        Radio rad = new Radio(30);
        rad.setCurrentStation(29);
        rad.setNextStation();

        Assertions.assertEquals(0, rad.getCurrentStation());
    }

    @Test
    public void shouldSetPrevStation() {
        Radio rad = new Radio(30);
        rad.setCurrentStation(9);
        rad.setPrevStation();

        Assertions.assertEquals(8, rad.getCurrentStation());
    }

    @Test
    public void shouldSetPrevStationBelowMin() {
        Radio rad = new Radio(30);
        rad.setCurrentStation(0);
        rad.setPrevStation();

        Assertions.assertEquals(29, rad.getCurrentStation());
    }

    @Test
    public void shouldSetVolume() {
        Radio rad = new Radio();

        rad.setCurrentVolume(99);
        int expected = 99;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetMaxVolume() {
        Radio rad = new Radio();

        rad.setCurrentVolume(100);
        int expected = 100;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetMinVolume() {
        Radio rad = new Radio();

        rad.setCurrentVolume(0);
        int expected = 0;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolumeAboveMaX() {
        Radio rad = new Radio();

        rad.setCurrentVolume(101);
        int expected = 0;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolumeBelowMin() {
        Radio rad = new Radio();

        rad.setCurrentVolume(-1);
        int expected = 0;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetIncreaseVolume() {
        Radio rad = new Radio();
        rad.setCurrentVolume(99);

        rad.setIncreaseVolume();
        int expected = 100;
        int actual = rad.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetIncreaseVolumeAboveMax() {
        Radio rad = new Radio();
        rad.setCurrentVolume(100);

        rad.setIncreaseVolume();
        int expected = 100;
        int actual = rad.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetDecreaseVolume() {
        Radio rad = new Radio();
        rad.setCurrentVolume(99);

        rad.setDecreaseVolume();
        int expected = 98;
        int actual = rad.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetDecreaseVolumeBelowMin() {
        Radio rad = new Radio();
        rad.setCurrentVolume(-1);

        rad.setDecreaseVolume();
        int expected = 0;
        int actual = rad.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
}