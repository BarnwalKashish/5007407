// BuilderPatternTest.java
package com.builderpattern;

public class BuilderPatternTest {
    public static void main(String[] args) {

        Computer basicComputer = new Computer.Builder()
                .setCPU("Intel i3")
                .setRAM("4GB")
                .setStorage("256GB SSD")
                .build();

        Computer gamingComputer = new Computer.Builder()
                .setCPU("Intel i9")
                .setRAM("32GB")
                .setStorage("1TB SSD")
                .setGPU("NVIDIA RTX 3080")
                .setMotherboard("ASUS ROG")
                .setPowerSupply("750W")
                .setCoolingSystem("Liquid Cooling")
                .build();

        Computer workstationComputer = new Computer.Builder()
                .setCPU("AMD Ryzen 9")
                .setRAM("64GB")
                .setStorage("2TB SSD")
                .setGPU("NVIDIA Quadro")
                .setMotherboard("MSI Creator")
                .setPowerSupply("850W")
                .setCoolingSystem("Advanced Air Cooling")
                .build();

        System.out.println("Basic Computer: " + basicComputer);
        System.out.println("Gaming Computer: " + gamingComputer);
        System.out.println("Workstation Computer: " + workstationComputer);
    }
}
