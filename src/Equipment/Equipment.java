/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Equipment;

import Prototype.IPrototype;
import java.awt.image.BufferedImage;
import java.util.ArrayList;

/**
 *
 * @author Gabriel
 */
public abstract class Equipment implements IPrototype {
    private String name;
    private int range;
    private int level;
    private int damage;
    private int area;
    private ArrayList<String>images;

    public Equipment(String name, int range, int level, int damage, int area, ArrayList<String> images) {
        this.name = name;
        this.range = range;
        this.level = level;
        this.damage = damage;
        this.area = area;
        this.images = images;
    }

    
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRange() {
        return range;
    }

    public void setRange(int range) {
        this.range = range;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public ArrayList<String> getImages() {
        return images;
    }

    public void setImages(ArrayList<String> images) {
        this.images = images;
    }
    
    public void addImages(String image){
        this.images.add(image);
    }
    
    
    
    public void levelUp(int levels){}
    
    public void action(){}
    
    @Override
    public IPrototype clone() {
        return this;
    }

    @Override
    public IPrototype deepClone() {
        return this;
    }
}
