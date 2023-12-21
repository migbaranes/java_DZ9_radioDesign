package ru.netology.statistic;

public class Radio {

    private int desiredNumberOfRadioStations = 9;
    private int currentRadioStationNumber;
    private int soundVolume;

    public Radio (int desiredNumberOfRadioStations) {

    }

    public int nextStationNumber() {
        if (currentRadioStationNumber < desiredNumberOfRadioStations) {
            currentRadioStationNumber = currentRadioStationNumber + 1;
        }
        return currentRadioStationNumber;
    }

    public int prevStationNumber() {
        if (currentRadioStationNumber < desiredNumberOfRadioStations) {
            currentRadioStationNumber = currentRadioStationNumber - 1;
        }
        if (currentRadioStationNumber < 0) {
            currentRadioStationNumber = 0;
        }
        return currentRadioStationNumber;
    }

    public int upVolume() {
        if (soundVolume < 100) {
            soundVolume = soundVolume + 1;
        }
        return soundVolume;
    }

    public int downVolume() {
        if (soundVolume < 100) {
            soundVolume = soundVolume - 1;
        }
        if (soundVolume < 0) {
            soundVolume = 0;
        }
        return soundVolume;
    }

    public void setMaxNumbStation() {
        currentRadioStationNumber = desiredNumberOfRadioStations;
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
        if (newCurrentRadioStationNumber > desiredNumberOfRadioStations) {
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
