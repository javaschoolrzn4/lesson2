package ru.rzn.sbt.javaschool.basics;

import java.util.Objects;

public class LethalWeapon {
    public String color;
    private int roundsLeft;
    private Double power;
    private static long nextSerial = 0;
    private final long serial;

    public LethalWeapon() {
        this.serial = nextSerial;
        nextSerial++;
    }

    public LethalWeapon(String colorValue, Double powerValue, int roundsLeftValue) {
        this();
        this.color = colorValue;
        this.power = powerValue;
        this.roundsLeft = roundsLeftValue;
    }


    public long getSerial() {
        return this.serial;
    }

    public void reload (int count) {
        roundsLeft += count;
    }

    public void pewPew() {
        roundsLeft -= 2;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LethalWeapon that = (LethalWeapon) o;
        return roundsLeft == that.roundsLeft &&
                Objects.equals(color, that.color) &&
                Objects.equals(power, that.power);
    }

    @Override
    public int hashCode() {

        return Objects.hash(color, roundsLeft, power);
    }
}
