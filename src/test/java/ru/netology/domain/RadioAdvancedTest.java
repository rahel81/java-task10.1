package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioAdvancedTest {
    RadioAdvanced radio = new RadioAdvanced();

    @Test
    void currentNumberStation() {
        radio.setCurrentNumberStation(7);
        assertEquals(7, radio.getCurrentNumberStation());
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
        radio.setCurrentNumberStation(10);
        radio.nextNumberStation();
        assertEquals(0, radio.getCurrentNumberStation());
    }

    @Test
    void startStation() {
        radio.setCurrentNumberStation(0);
        radio.prevNumberStation();
        assertEquals(10, radio.getCurrentNumberStation());
    }

    @Test
    void currentVolume() {
        radio.setCurrentVolume(50);
        assertEquals(50, radio.getCurrentVolume());
    }

    @Test
    void plusVolume() {
        radio.setCurrentVolume(50);
        radio.plusVolume();
        assertEquals(51, radio.getCurrentVolume());
    }

    @Test
    void minusVolume() {
        radio.setCurrentVolume(50);
        radio.minusVolume();
        assertEquals(49, radio.getCurrentVolume());
    }

    @Test
    void maxVolume() {
        radio.setCurrentVolume(100);
        radio.plusVolume();
        assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    void minVolume() {
        radio.setCurrentVolume(0);
        radio.minusVolume();
        assertEquals(0, radio.getCurrentVolume());
    }
}
