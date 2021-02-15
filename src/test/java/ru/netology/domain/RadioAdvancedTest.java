package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioAdvancedTest {
    RadioAdvanced radio = new RadioAdvanced();

    @Test
    void currentNumberStation() {
        radio.setCurrentNumberStation(9);
        assertEquals(9, radio.getCurrentNumberStation());
    }

    @Test
    void nextNumberStation() {
        radio.setCurrentNumberStation(7);
        radio.nextNumberStation();
        assertEquals(8, radio.getCurrentNumberStation());
    }

    @Test
    void prevNumberStation() {
        radio.setCurrentNumberStation(7);
        radio.prevNumberStation();
        assertEquals(6, radio.getCurrentNumberStation());
    }

    @Test
    void lastStation() {
        radio.setCurrentNumberStation(9);
        radio.nextNumberStation();
        assertEquals(0, radio.getCurrentNumberStation());
    }

    @Test
    void startStation() {
        radio.setCurrentNumberStation(0);
        radio.prevNumberStation();
        assertEquals(9, radio.getCurrentNumberStation());
    }

    @Test
    void currentVolume() {
        radio.setCurrentVolume(5);
        assertEquals(5, radio.getCurrentVolume());
    }

    @Test
    void plusVolume() {
        radio.setCurrentVolume(9);
        radio.plusVolume();
        assertEquals(10, radio.getCurrentVolume());
    }

    @Test
    void minusVolume() {
        radio.setCurrentVolume(3);
        radio.minusVolume();
        assertEquals(2, radio.getCurrentVolume());
    }

    @Test
    void maxVolume() {
        radio.setCurrentVolume(10);
        radio.plusVolume();
        assertEquals(10, radio.getCurrentVolume());
    }

    @Test
    void minVolume() {
        radio.setCurrentVolume(0);
        radio.minusVolume();
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    void nextNumberStationOverLast() {
        radio.setCurrentNumberStation(11);
        assertEquals(0, radio.getCurrentNumberStation());
    }

    @Test
    void prevNumberStationUnderStart() {
        radio.setCurrentNumberStation(-1);
        assertEquals(0, radio.getCurrentNumberStation());
    }

    @Test
    void overMaxVolume() {
        radio.setCurrentVolume(11);
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    void underMinVolume() {
        radio.setCurrentVolume(-1);
        assertEquals(0, radio.getCurrentVolume());
    }
}
