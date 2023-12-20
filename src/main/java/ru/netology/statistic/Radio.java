package ru.netology.statistic;

public class Radio {
    private int currentRadioStationNumber;
    private int soundVolume;


    public int nextStationNumber() {
        if (currentRadioStationNumber < 9) {
            currentRadioStationNumber = currentRadioStationNumber + 1;
        }
        return currentRadioStationNumber;
    }

    public int prevVolume() {
        if (soundVolume < 100) {
            soundVolume = soundVolume - 1;
        }
        return soundVolume;
    }

    public void setMaxNumbStation() {
        currentRadioStationNumber = 9;
    }

    public void setMaxSound() {
        soundVolume = 100;
    }

    public int getCurrentRadioStationNumber() {
        return currentRadioStationNumber;
    }

    public void setCurrentRadioStationNumber(int newCurrentRadioStationNumber) {
        if (newCurrentRadioStationNumber < 1) {
            return;
        }
        if (newCurrentRadioStationNumber > 9) {
            return;
        }
        currentRadioStationNumber = newCurrentRadioStationNumber;
    }

    public int getSoundVolume() {
        return soundVolume;
    }

    public void setSoundVolume(int newSoundVolume) {
        if (newSoundVolume < 0) {
            return;
        }
        if (newSoundVolume > 100) {
            newSoundVolume = 100;
        }
        soundVolume = newSoundVolume;
    }

}
