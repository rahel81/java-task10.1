package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioAdvancedTest {
    RadioAdvanced radio = new RadioAdvanced();

    @Test
    void CurrentNumberStation() {
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
    void LastStation() {
        radio.setCurrentNumberStation(9);
        radio.nextNumberStation();
        assertEquals(0, radio.getCurrentNumberStation());
    }

    @Test
    void StartStation() {
        radio.setCurrentNumberStation(0);
        radio.prevNumberStation();
        assertEquals(9, radio.getCurrentNumberStation());
    }

    @Test
    void CurrentVolume() {
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
    void MaxVolume() {
        radio.setCurrentVolume(10);
        radio.plusVolume();
        assertEquals(10, radio.getCurrentVolume());
    }

    @Test
    void MinVolume() {
        radio.setCurrentVolume(0);
        radio.minusVolume();
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    void NextNumberStationOverLast() {
        radio.setCurrentNumberStation(11);
        assertEquals(0, radio.getCurrentNumberStation());
    }

    @Test
    void PrevNumberStationUnderStart() {
        radio.setCurrentNumberStation(-1);
        assertEquals(0, radio.getCurrentNumberStation());
    }

    @Test
    void OverMaxVolume() {
        radio.setCurrentVolume(11);
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    void UnderMinVolume() {
        radio.setCurrentVolume(-1);
        assertEquals(0, radio.getCurrentVolume());
    }
}