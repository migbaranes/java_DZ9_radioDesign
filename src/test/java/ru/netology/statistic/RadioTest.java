package ru.netology.statistic;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    Radio rad = new Radio(19);

    @Test
    public void RadioStationTwentyChannels() {


        rad.setCurrentRadioStationNumber(15);

        int expected = 15;
        int actual = rad.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldRadioStationNumber() {


        rad.setCurrentRadioStationNumber(5);

        int expected = 5;
        int actual = rad.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldNextStationNumber() {


        rad.setCurrentRadioStationNumber(14);

        int expected = 15;
        int actual = rad.nextStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNextWhenCurrentMax() {


        rad.setCurrentRadioStationNumber(19);

        int expected = 0;
        int actual = rad.nextStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNextStationAboveMaxNumber() {


        rad.setCurrentRadioStationNumber(20);

        int expected = 1;
        int actual = rad.nextStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldPrevStationNumber() {


        rad.setCurrentRadioStationNumber(5);

        int expected = 4;
        int actual = rad.prevStationNumber();

        Assertions.assertEquals(expected, actual);
    }

//    @Test
//    public void PrevStationZero() {
//
//
//        rad.setCurrentRadioStationNumber(0);
//
//        int expected = 20;
//        int actual = rad.prevStationNumber();
//
//        Assertions.assertEquals(expected, actual);
//    }

//    @Test
//    public void PrevStationMax() {
//
//        rad.setCurrentRadioStationNumber(20);
//
//        int expected = 20;
//        int actual = rad.prevStationNumber();
//
//        Assertions.assertEquals(expected, actual);
//    }

    @Test
    public void shouldPrevAboveMaxStationNumber() {


        rad.setCurrentRadioStationNumber(25);

        int expected = 20;
        int actual = rad.prevStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldPrevLessMinStationNumber() {


        rad.setCurrentRadioStationNumber(-1);

        int expected = 20;
        int actual = rad.prevStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldUpVolume() {


        rad.setSoundVolume(59);

        int expected = 60;
        int actual = rad.upVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldUpAboveMaxVolume() {


        rad.setSoundVolume(102);

        int expected = 100;
        int actual = rad.upVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDownVolume() {


        rad.setSoundVolume(59);

        int expected = 58;
        int actual = rad.downVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldLessMinVolume() {


        rad.setSoundVolume(-1);

        int expected = 0;
        int actual = rad.downVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldAboveMaxVolume() {


        rad.setSoundVolume(101);

        int expected = 100;
        int actual = rad.downVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldRadioStationAboveMaxNumber() {


        rad.setCurrentRadioStationNumber(21);

        int expected = 0;
        int actual = rad.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldRadioStationLessMinNumber() {


        rad.setCurrentRadioStationNumber(-5);

        int expected = 0;
        int actual = rad.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void soundVolume() {
        Radio vol = new Radio(9);

        vol.setSoundVolume(17);

        int expected = 17;
        int actual = vol.getSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void soundVolumeLessMin() {
        Radio vol = new Radio(9);

        vol.setSoundVolume(-1);

        int expected = 0;
        int actual = vol.getSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void soundVolumeAboveMax() {
        Radio vol = new Radio(9);

        vol.setSoundVolume(102);

        int expected = 100;
        int actual = vol.getSoundVolume();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldSetMaxNumbStation() {


        rad.setMaxNumbStation();
        int expected = 20;
        int actual = rad.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetMaxSound() {


        rad.setMaxSound();
        int expected = 100;
        int actual = rad.getSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testRadioEmpty() {
        Radio rad = new Radio();
    }

}
