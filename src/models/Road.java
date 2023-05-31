package models;

import interfaces.BasicInterface;
import interfaces.RoadInterface;

public class Road extends BasicData implements BasicInterface, RoadInterface {

    private static final String HELLO = "Hello, ";

    private String type;

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String[] RoadData() {
        return new String[]{
                "type: " + this.getType(),
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
        // Implementation of performRoadFunction() from RoadInterface
    }

    @Override
    public void performDownhillFunction() {

    }
}
