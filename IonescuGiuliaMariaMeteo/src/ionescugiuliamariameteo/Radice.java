/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ionescugiuliamariameteo;

import java.util.ArrayList;

/**
 *
 * @author giuli
 */
public class Radice {
    public ArrayList<Tempo> weather;
    public Main main;
    public Vento wind;
    public Nuvole clouds;
    public String name;

    public Radice(ArrayList<Tempo> weather, Main main, Vento wind, Nuvole clouds, String name) {
        this.weather = weather;
        this.main = main;
        this.wind = wind;
        this.clouds = clouds;
        this.name = name;
    }

    public ArrayList<Tempo> getWeather() {
        return weather;
    }

    public void setWeather(ArrayList<Tempo> weather) {
        this.weather = weather;
    }

    public Main getMain() {
        return main;
    }

    public void setMain(Main main) {
        this.main = main;
    }

    public Vento getWind() {
        return wind;
    }

    public void setWind(Vento wind) {
        this.wind = wind;
    }

    public Nuvole getClouds() {
        return clouds;
    }

    public void setClouds(Nuvole clouds) {
        this.clouds = clouds;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
