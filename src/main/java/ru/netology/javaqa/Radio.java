//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package ru.netology.javaqa;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Radio {
    private int currentStation;
    private int currentVolume;
    private int firstStation = 0;
    private int countStations = 10;
    private int lastStation = 9;
    private int minVolume = 0;
    private int maxVolume = 100;

    public Radio(int countStations) {
        this.countStations = countStations;
        this.lastStation = this.firstStation + countStations - 1;
    }

    public void setNextStation() {
        if (this.currentStation < this.lastStation) {
            ++this.currentStation;
        } else {
            this.currentStation = this.firstStation;
        }

    }

    public void setPrevStation() {
        if (this.currentStation > this.firstStation) {
            --this.currentStation;
        } else {
            this.currentStation = this.lastStation;
        }

    }

    public void increaseVolume() {
        if (this.currentVolume < this.maxVolume) {
            ++this.currentVolume;
        }

        if (this.currentVolume >= this.maxVolume) {
            this.currentVolume = this.maxVolume;
        }

    }

    public void decreaseVolume() {
        if (this.currentVolume > this.minVolume) {
            --this.currentVolume;
        }

        if (this.currentVolume <= this.minVolume) {
            this.currentVolume = this.minVolume;
        }

    }

    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation >= this.firstStation) {
            if (newCurrentStation <= this.lastStation) {
                this.currentStation = newCurrentStation;
            }
        }
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume >= this.minVolume) {
            if (newCurrentVolume <= this.maxVolume) {
                this.currentVolume = newCurrentVolume;
            }
        }
    }
}