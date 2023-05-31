package models;

import interfaces.BasicInterface;
import interfaces.DownhillInterface;

public class Downhill extends BasicData implements BasicInterface, DownhillInterface {

    private static final String HELLO = "Hello, ";
    private String suspension = "FULL";

    public String getSuspension() {
        return this.suspension;
    }

    public void setSuspension(String suspension) {
        this.suspension = suspension;
    }

    public String[] DownhillData() {
        return new String[]{
                "Suspension: " + this.getSuspension(),
                "brand: " + this.getBrand(),
                "age: " + this.getAge(),
                "colour: " + this.getColour(),
        };
    }

    @Override
    public void welcome(String opt) {
        System.out.println(HELLO + opt);
    }

    @Override
    public void performBasicFunction() {
        // Implementation of performBasicFunction() from BasicInterface
    }

    @Override
    public void performRoadFunction() {
        // Implementation of performRoadFunction() from DownhillInterface
    }

    @Override
    public void performDownhillFunction() {
        // Implementation of performDownhillFunction() from DownhillInterface
    }
}
