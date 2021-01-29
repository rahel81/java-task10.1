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

    public RadioAdvanced(int currentVolume) {
        if (currentVolume > 100) {
            return;
        }
        if (currentVolume < 0) {
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
        if (currentNumberStation > 10) {
            return;
        }
        if (currentNumberStation < 0) {
            return;
        }
        this.currentNumberStation = currentNumberStation;
    }

    public void nextNumberStation() {
        if (currentNumberStation == lastStation) {
            setCurrentNumberStation(0);
            return;
        }
        currentNumberStation++;
    }

    public void prevNumberStation() {
        if (currentNumberStation == startStation) {
            setCurrentNumberStation(10);
            return;
        }
        currentNumberStation--;
    }

    public void plusVolume() {
        if (currentVolume != 100) {
            currentVolume++;
        }
    }

    public void minusVolume() {
        if (currentVolume != 0) {
            currentVolume--;
        }
    }
}
