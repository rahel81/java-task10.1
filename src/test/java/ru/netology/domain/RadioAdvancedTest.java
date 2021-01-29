package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioAdvancedTest {
     RadioAdvanced radio = new RadioAdvanced();
   
    @Test
    void CurrentNumberStation() {
        RadioAdvanced radio = new RadioAdvanced();
        radio.setCurrentNumberStation(7);
        assertEquals(7, radio.getCurrentNumberStation());
    }

    @Test
    void nextNumberStation() {
        RadioAdvanced radio = new RadioAdvanced();
        radio.setCurrentNumberStation(9);
        radio.nextNumberStation();
        assertEquals(10, radio.getCurrentNumberStation());
    }

    @Test
    void prevNumberStation() {
        RadioAdvanced radio = new RadioAdvanced();
        radio.setCurrentNumberStation(7);
        radio.prevNumberStation();
        assertEquals(6, radio.getCurrentNumberStation());
    }

    @Test
    void LastStation() {
        RadioAdvanced radio = new RadioAdvanced();
        radio.setCurrentNumberStation(10);
        radio.nextNumberStation();
        assertEquals(0, radio.getCurrentNumberStation());
    }

    @Test
    void StartStation() {
        RadioAdvanced radio = new RadioAdvanced();
        radio.setCurrentNumberStation(0);
        radio.prevNumberStation();
        assertEquals(10, radio.getCurrentNumberStation());
    }

    @Test
    void CurrentVolume() {
        RadioAdvanced radio = new RadioAdvanced(50);
        assertEquals(50, radio.getCurrentVolume());
    }

    @Test
    void MaxVolume() {
        RadioAdvanced radio = new RadioAdvanced(100);
        radio.plusVolume();
        assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    void MinVolume() {
        RadioAdvanced radio = new RadioAdvanced(0);
        radio.minusVolume();
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    void plusVolume() {
        RadioAdvanced radio = new RadioAdvanced(50);
        radio.plusVolume();
        assertEquals(51, radio.getCurrentVolume());
    }

    @Test
    void minusVolume() {
        RadioAdvanced radio = new RadioAdvanced(50);
        radio.minusVolume();
        assertEquals(49, radio.getCurrentVolume());
    }

    @Test
    void NextNumberStationOverLast() {
        RadioAdvanced radio = new RadioAdvanced();
        radio.setCurrentNumberStation(11);
        assertEquals(0, radio.getCurrentNumberStation());
    }

    @Test
    void PrevNumberStationUnderStart() {
        RadioAdvanced radio = new RadioAdvanced();
        radio.setCurrentNumberStation(-1);
        assertEquals(0, radio.getCurrentNumberStation());
    }

    @Test
    void OverMaxVolume() {
        RadioAdvanced radio = new RadioAdvanced(101);
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    void UnderMinVolume() {
        RadioAdvanced radio = new RadioAdvanced(-1);
        assertEquals(0, radio.getCurrentVolume());
    }
}
