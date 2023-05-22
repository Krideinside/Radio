package ru.netology.javaqa;

public class Radio {
    private int currentStation;
    private int currentVolume;
    private int firstStation = 0;
    private int countStations = 10;
    private int lastStation = 9;
    private int minVolume = 0;
    private int maxVolume = 100;

    public Radio() {

    }

    public Radio(int countStations) {
        this.countStations = countStations;
        lastStation = firstStation + countStations - 1;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public int getFirstStation() {
        return firstStation;
    }

    public int getCountStations() {
        return countStations;
    }

    public int getLastStation() {
        return lastStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public int getMinVolume() {
        return minVolume;
    }

    public int getMaxVolume() {
        return maxVolume;
    }

    public void setNextStation() {
        if (currentStation < lastStation) {
            currentStation++;
        } else {
            currentStation = firstStation;
        }
    }

    public void setPrevStation() {
        if (currentStation > firstStation) {
            currentStation = currentStation - 1;
        } else {
            currentStation = lastStation;
        }
    }

    public void increaseVolume() {
        if (currentVolume < maxVolume) {
            currentVolume = currentVolume + 1;
        }
        if (currentVolume >= maxVolume) {
            currentVolume = maxVolume;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > minVolume) {
            currentVolume = currentVolume - 1;
        }
        if (currentVolume <= minVolume) {
            currentVolume = minVolume;
        }
    }


    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation < firstStation) {
            return;
        }
        if (newCurrentStation > lastStation) {
            return;
        }
        currentStation = newCurrentStation;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < minVolume) {
            return;
        }
        if (newCurrentVolume > maxVolume) {
            return;
        }
        currentVolume = newCurrentVolume;
    }
}