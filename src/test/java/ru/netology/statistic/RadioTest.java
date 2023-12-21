package ru.netology.statistic;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    Radio rad = new Radio(9);

    @Test
    public void shouldRadioStationNumber() {


        rad.setCurrentRadioStationNumber(5);

        int expected = 5;
        int actual = rad.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNextStationNumber() {


        rad.setCurrentRadioStationNumber(5);

        int expected = 6;
        int actual = rad.nextStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNextStationAboveMaxNumber() {


        rad.setCurrentRadioStationNumber(9);

        int expected = 9;
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

    @Test
    public void shouldPrevAboveMaxStationNumber() {


        rad.setCurrentRadioStationNumber(9);

        int expected = 9;
        int actual = rad.prevStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldPrevLessMinStationNumber() {


        rad.setCurrentRadioStationNumber(-1);

        int expected = 0;
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


        rad.setCurrentRadioStationNumber(11);

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
        int expected = 9;
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


}
