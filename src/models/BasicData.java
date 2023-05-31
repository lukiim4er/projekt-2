package models;

import java.util.Scanner;

public abstract class BasicData {
    public String Brand;
    public String Colour;


    public int age;


    public String getBrand() {
        return this.Brand;
    }
    public String getColour() {
        return this.Colour;
    }

    public void setBrand(String Brand) {
        this.Brand = Brand;
    }

    public String setColour(String s)  {
        Scanner scanner = null;
        return String.valueOf(this.setColour(String.valueOf(scanner.nextLine())));
    }
    public String getAge() {
        return String.valueOf(this.age);
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void breakLine() {
        System.out.println("----------------------------");
    }

    public abstract void welcome(String opt);

    public abstract void performBasicFunction();

    public abstract void performRoadFunction();

    public abstract void performDownhillFunction();
}
