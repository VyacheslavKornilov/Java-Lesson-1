package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RadioTest {

    @Test
    public void enterStation() {
        Radio radio = new Radio(20);
        radio.setCurrentRadioStation(20);
        assertEquals(19, radio.getCurrentRadioStation());
    }

    @Test
    public void enterStationMoreMax() {
        Radio radio = new Radio(20);
        radio.setCurrentRadioStation(21);
        assertEquals(0, radio.getCurrentRadioStation());
    }

    @Test
    public void enterNotCorrectStation() {
        Radio radio = new Radio(20);
        radio.setCurrentRadioStation(0);
        assertEquals(0, radio.getCurrentRadioStation());
    }

    @Test
    public void nextStation() {
        Radio radio = new Radio(20);
        radio.setCurrentRadioStation(10);
        radio.setNextRadioStation();
        assertEquals(11, radio.getCurrentRadioStation());
    }

    @Test
    public void prevStation() {
        Radio radio = new Radio(20);
        radio.setCurrentRadioStation(10);
        radio.setPrevRadioStation();
        assertEquals(9, radio.getCurrentRadioStation());
    }

    @Test
    public void prevStationIfNumberStationZero() {
        Radio radio = new Radio(20);
        radio.setCurrentRadioStation(0);
        radio.setPrevRadioStation();
        assertEquals(19, radio.getCurrentRadioStation());
    }

    @Test
    public void volumeLevel() {
        Radio radio = new Radio();
        radio.setCurrentVolume(5);
        assertEquals(5, radio.getCurrentVolume());
    }

    @Test
    public void volumeLevelUp() {
        Radio radio = new Radio();
        radio.setCurrentVolume(5);
        radio.setCurrentVolumeUp();
        assertEquals(6, radio.getCurrentVolume());
    }

    @Test
    public void volumeLevelUpIfVolumeMax() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);
        radio.setCurrentVolumeUp();
        assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    public void volumeLevelDown() {
        Radio radio = new Radio();
        radio.setCurrentVolume(5);
        assertEquals(5, radio.getCurrentVolume());
    }

    @Test
    public void volumeLevelDownIfVolumeLevelZero() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void defaultConstructor() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(5);
        assertEquals(5, radio.getCurrentRadioStation());
    }

    @Test
    public void defaultConstructorEnterStationMoreMax() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(11);
        assertEquals(0, radio.getCurrentRadioStation());
    }
}