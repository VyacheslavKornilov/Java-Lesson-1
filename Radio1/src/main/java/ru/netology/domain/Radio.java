package ru.netology.domain;

public class Radio {
    private int currentRadioStation;
    private int currentVolume;
    private int maxNumberStation = 10;

    public Radio(int maxNumberStation) {
        this.maxNumberStation = maxNumberStation;
    }

    public Radio() {
    }

    public int getMaxNumberStation() {
        return maxNumberStation;
    }

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentRadioStation(int currentRadioStation) {
        if (currentRadioStation > maxNumberStation) {
            return;
        }
        if (currentRadioStation <= 0) {
            return;
        }
        if (currentRadioStation == maxNumberStation) {
            currentRadioStation = maxNumberStation--;
            currentRadioStation = maxNumberStation;
        }
        this.currentRadioStation = currentRadioStation;
    }

    public void setNextRadioStation() {
        if (currentRadioStation < maxNumberStation) {
            currentRadioStation++;
        }
        if (currentRadioStation == maxNumberStation) {
            currentRadioStation = maxNumberStation--;
            currentRadioStation = maxNumberStation;
        }
        if (currentRadioStation == maxNumberStation) {
            currentRadioStation = 0;
        }
    }

    public void setPrevRadioStation() {
        if (currentRadioStation > 0) {
            currentRadioStation--;
        } else {
            currentRadioStation = maxNumberStation - 1;
        }
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume > 100) {
            return;
        }
        if (currentVolume <= 0) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public void setCurrentVolumeUp() {
        if (currentVolume < 100) {
            currentVolume++;
        } else {
            currentVolume = 100;
        }
    }

    public void setCurrentVolumeDown() {
        if (currentVolume > 0) {
            currentVolume--;
        } else {
            currentVolume = 0;

        }
    }
}
