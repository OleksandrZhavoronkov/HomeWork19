package com.example.demo;

public abstract class PersonRandomizer {
    //Method to randomize sex (0-1)
    public static int SexRandom() {
        return (int) (Math.random() * 2);
    }
    //Method to randomize Age (18-53)
    public static int AgesRandom() {
        return (int) (18 + (Math.random() * 35));
    }
    //Method to randomize male weight (50-145)
    public static int MaleWeightsRandom() {
        return (int) (50 + (Math.random() * 95));
    }
    //Method to randomize male Height (160-195)
    public static int MaleHeightsRandom() {
        return (int) (160 + (Math.random() * 35));
    }
    //Method to randomize female weight (45-125)
    public static int FemaleWeightsRandom() {
        return (int) (45 + (Math.random() * 80));
    }
    //Method to randomize female height (140-180)
    public static int FemaleHeightsRandom() {
        return (int) (140 + (Math.random() * 40));
    }
}
