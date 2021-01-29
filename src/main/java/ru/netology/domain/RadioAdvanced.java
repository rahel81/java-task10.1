package ru.netology.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class RadioAdvanced {
    private String name;
    private int currentNumberStation;
    private int lastStation = 10;
    private int startStation = 0;
    private int currentVolume;
    private int maxVolume = 100;
    private int minVolume = 0;
    private boolean on;

    public void nextNumberStation() {
        if (currentNumberStation == lastStation) {
            currentNumberStation = startStation;
        } else {
            currentNumberStation++;
        }
    }

    public void prevNumberStation() {
        if (currentNumberStation == startStation) {
            currentNumberStation = lastStation;
        } else {
            currentNumberStation--;
        }
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
