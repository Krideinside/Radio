//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package ru.netology.javaqa;

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

    public Radio() {
    }

    public Radio(int currentStation, int currentVolume, int firstStation, int countStations, int lastStation, int minVolume, int maxVolume) {
        this.currentStation = currentStation;
        this.currentVolume = currentVolume;
        this.firstStation = firstStation;
        this.countStations = countStations;
        this.lastStation = lastStation;
        this.minVolume = minVolume;
        this.maxVolume = maxVolume;
    }

    public int getCurrentStation() {
        return this.currentStation;
    }

    public int getCurrentVolume() {
        return this.currentVolume;
    }

    public int getFirstStation() {
        return this.firstStation;
    }

    public int getCountStations() {
        return this.countStations;
    }

    public int getLastStation() {
        return this.lastStation;
    }

    public int getMinVolume() {
        return this.minVolume;
    }

    public int getMaxVolume() {
        return this.maxVolume;
    }

//    public void setFirstStation(int firstStation) {
//        this.firstStation = firstStation;
//    }
//
//    public void setCountStations(int countStations) {
//        this.countStations = countStations;
//    }
//
//    public void setLastStation(int lastStation) {
//        this.lastStation = lastStation;
//    }
//
//    public void setMinVolume(int minVolume) {
//        this.minVolume = minVolume;
//    }
//
//    public void setMaxVolume(int maxVolume) {
//        this.maxVolume = maxVolume;
//    }
//
//    public boolean equals(Object o) {
//        if (o == this) {
//            return true;
//        } else if (!(o instanceof Radio)) {
//            return false;
//        } else {
//            Radio other = (Radio)o;
//            if (!other.canEqual(this)) {
//                return false;
//            } else if (this.getCurrentStation() != other.getCurrentStation()) {
//                return false;
//            } else if (this.getCurrentVolume() != other.getCurrentVolume()) {
//                return false;
//            } else if (this.getFirstStation() != other.getFirstStation()) {
//                return false;
//            } else if (this.getCountStations() != other.getCountStations()) {
//                return false;
//            } else if (this.getLastStation() != other.getLastStation()) {
//                return false;
//            } else if (this.getMinVolume() != other.getMinVolume()) {
//                return false;
//            } else {
//                return this.getMaxVolume() == other.getMaxVolume();
//            }
//        }
//    }
//
//    protected boolean canEqual(Object other) {
//        return other instanceof Radio;
//    }
//
//    public int hashCode() {
//        int PRIME = true;
//        int result = 1;
//        result = result * 59 + this.getCurrentStation();
//        result = result * 59 + this.getCurrentVolume();
//        result = result * 59 + this.getFirstStation();
//        result = result * 59 + this.getCountStations();
//        result = result * 59 + this.getLastStation();
//        result = result * 59 + this.getMinVolume();
//        result = result * 59 + this.getMaxVolume();
//        return result;
//    }
//
//    public String toString() {
//        int var10000 = this.getCurrentStation();
//        return "Radio(currentStation=" + var10000 + ", currentVolume=" + this.getCurrentVolume() + ", firstStation=" + this.getFirstStation() + ", countStations=" + this.getCountStations() + ", lastStation=" + this.getLastStation() + ", minVolume=" + this.getMinVolume() + ", maxVolume=" + this.getMaxVolume() + ")";
//    }
}
