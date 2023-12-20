package ru.netology.statistic;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void shouldRadioStationNumber() {
        Radio rad = new Radio();

        rad.setCurrentRadioStationNumber(5);

        int expected = 5;
        int actual = rad.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNextStationNumber() {
        Radio rad = new Radio();

        rad.setCurrentRadioStationNumber(5);

        int expected = 6;
        int actual = rad.nextStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNextStationAboveMaxNumber() {
        Radio rad = new Radio();

        rad.setCurrentRadioStationNumber(9);

        int expected = 9;
        int actual = rad.nextStationNumber();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldPrevVolume() {
        Radio rad = new Radio();

        rad.setSoundVolume(98);

        int expected = 97;
        int actual = rad.prevVolume();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldPrevAboveMaxVolume() {
        Radio rad = new Radio();

        rad.setSoundVolume(101);

        int expected = 100;
        int actual = rad.prevVolume();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldRadioStationAboveMaxNumber() {
        Radio rad = new Radio();

        rad.setCurrentRadioStationNumber(11);

        int expected = 0;
        int actual = rad.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldRadioStationLessMinNumber() {
        Radio rad = new Radio();

        rad.setCurrentRadioStationNumber(-5);

        int expected = 0;
        int actual = rad.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void soundVolume() {
        Radio vol = new Radio();

        vol.setSoundVolume(17);

        int expected = 17;
        int actual = vol.getSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void soundVolumeLessMin() {
        Radio vol = new Radio();

        vol.setSoundVolume(-1);

        int expected = 0;
        int actual = vol.getSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void soundVolumeAboveMax() {
        Radio vol = new Radio();

        vol.setSoundVolume(102);

        int expected = 100;
        int actual = vol.getSoundVolume();

        Assertions.assertEquals(expected, actual);
    }


//    @Test
//    public void soundVolumeAboveMax() {
//        Radio vol = new Radio();
//
//        vol.setSoundVolume(101);
//
//        int expected = 100;
//        int actual = vol.increaseVolume();
//
//        Assertions.assertEquals(expected, actual);
//    }

    @Test
    public void shouldSetMaxNumbStation() {
        Radio rad = new Radio();

        rad.setMaxNumbStation();
        int expected = 9;
        int actual = rad.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetMaxSound() {
        Radio rad = new Radio();

        rad.setMaxSound();
        int expected = 100;
        int actual = rad.getSoundVolume();

        Assertions.assertEquals(expected, actual);
    }


}
