package ru.netology.domain;

public class RadioAdvanced {
    private String name;
    private int currentNumberStation;
    private int lastStation = 10;
    private int startStation = 0;
    private int currentVolume;
    private int maxVolume = 100;
    private int minVolume = 0;
    private boolean on;

    public RadioAdvanced() {
    }

    public RadioAdvanced(int lastStation, int startStation) {
        this.lastStation = lastStation;
        this.startStation = startStation;
    }

    public void nextNumberStation() {
        if (currentNumberStation == lastStation) {
            currentNumberStation = startStation;
            return;
        }
        currentNumberStation++;
    }

        public void prevNumberStation() {
        if (currentNumberStation == startStation) {
            currentNumberStation = lastStation;
            return;
        }
        currentNumberStation--;
    }
    public RadioAdvanced(int currentVolume) {
        if (currentVolume > maxVolume) {
            return;
        }
        if (currentVolume < minVolume) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public int getCurrentNumberStation() {
        return currentNumberStation;
    }

    public void setCurrentNumberStation(int currentNumberStation) {
        if (currentNumberStation > lastStation) {
            return;
        }
        if (currentNumberStation < startStation) {
            return;
        }
        this.currentNumberStation = currentNumberStation;
    }

    public void plusVolume() {
        if (currentVolume != maxVolume) {
            currentVolume++;
        }
    }

    public void minusVolume() {
        if (currentVolume != minVolume) {
            currentVolume--;
        }
    }
}
