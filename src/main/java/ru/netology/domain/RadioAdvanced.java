package ru.netology.domain;

public class RadioAdvanced {
    private String name;
    private int currentNumberStation;
    private int lastStation = 9;
    private int startStation = 0;
    private int currentVolume;
    private int maxVolume = 10;
    private int minVolume = 0;
    private boolean on;

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

    public void nextNumberStation() {
        if (currentNumberStation == lastStation) {
            this.currentNumberStation = startStation;
        } else {
            currentNumberStation++;
        }
    }

    public void prevNumberStation() {
        if (currentNumberStation == startStation) {
            this.currentNumberStation = lastStation;
        } else {
            currentNumberStation--;
        }
    }

    public int getLastStation() {
        return lastStation;
    }

    public void setLastStation(int lastStation) {
        this.lastStation = lastStation;
    }

    public int getStartStation() {
        return startStation;
    }

    public void setStartStation(int startStation) {
        this.startStation = startStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume > maxVolume) {
            return;
        }
        if (currentVolume < minVolume) {
            return;
        }
        this.currentVolume = currentVolume;
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

    public int getMaxVolume() {
        return maxVolume;
    }

    public void setMaxVolume(int maxVolume) {
        this.maxVolume = maxVolume;
    }

    public int getMinVolume() {
        return minVolume;
    }

    public void setMinVolume(int minVolume) {
        this.minVolume = minVolume;
    }
}
