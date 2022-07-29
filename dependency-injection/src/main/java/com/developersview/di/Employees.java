package com.developersview.di;

/**
 * @author pranoy.chakraborty
 * @Date 29/07/22
 */
public class Employees {

    private String name;
    private int iq;
    private String skill;

    public Employees(String name, int iq, String skill) {
        this.name = name;
        this.iq = iq;
        this.skill = skill;
    }

    @Override
    public String toString() {
        return "Employees {" +
                "name='" + name + '\'' +
                ", iq=" + iq +
                ", skill='" + skill + '\'' +
                '}';
    }
}
