/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Character;

import Builder.IBuilder;
import Equipment.Equipment;
import Prototype.IPrototype;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author Gabriel
 */
public class Character implements IPrototype{
    private String name;
    private ArrayList<String> images;
    private ArrayList<Equipment> equipments;
    private int hp;
    private int dps;
    private int level;
    private int space;
    private int rarity;
    private int cost;
    private Equipment equiped;

    public Character(String name, ArrayList<String> images, ArrayList<Equipment> equipments, int hp, int dps, int level, int space, int rarity, int cost, Equipment equiped) {
        this.name = name;
        this.images = images;
        this.equipments = equipments;
        this.hp = hp;
        this.dps = dps;
        this.level = level;
        this.space = space;
        this.rarity = rarity;
        this.cost = cost;
        this.equiped = equiped;
    }

    
    
    public String getName() {
        return name;
    }

    public ArrayList<String> getImages() {
        return images;
    }

    public ArrayList<Equipment> getEquipments() {
        return equipments;
    }

    public int getHp() {
        return hp;
    }

    public int getDps() {
        return dps;
    }

    public int getLevel() {
        return level;
    }

    public int getSpace() {
        return space;
    }

    public int getRarity() {
        return rarity;
    }

    public int getCost() {
        return cost;
    }
    
    public void levelUp(int levels){
        this.equiped.levelUp(levels);
        Random r = new Random();
        while(levels!=0){
            int chance = r.nextInt(10)+1;
            if(chance<7){
                this.level= this.level+1;
                this.dps = this.dps + 1;
                this.hp = this.hp + 1;
            }
            levels-=1;
            
        }
    }
    
    public void equip(int index){
        this.equiped = this.equipments.get(index);
    }
    
    public void removeEquipment(Equipment equipment){
        this.equipments.remove(equipment);
    }
    
    public void action(){
        
    }

    @Override
    public IPrototype clone() {
        Character copy = new Character(this.name,this.images,this.equipments,this.hp,this.dps,this.level,this.space,this.rarity,this.cost,this.equiped);
        copy.equipments = new ArrayList<>();
        copy.images = new ArrayList<>();
        return copy;
    }

    @Override
    public IPrototype deepClone() {
        Character copy = new Character(this.name,this.images,this.equipments,this.hp,this.dps,this.level,this.space,this.rarity,this.cost,this.equiped);
        return copy;
    }
    
    
    public class CharacterBuilder implements IBuilder{
        private String name;
        private ArrayList<String> images = new ArrayList<>();
        private ArrayList<Equipment> equipments = new ArrayList<>();
        private int hp;
        private int dps;
        private int level;
        private int space;
        private int rarity;
        private int cost;
        private Equipment equiped;    
        
        public CharacterBuilder setName(String name){
            this.name = name;
            return this;
        }
        
        public CharacterBuilder addImage(String image){
            this.images.add(image);
            return this;
        }
        
        public CharacterBuilder addEquipment(Equipment equipment){
            this.equipments.add(equipment);
            return this;
        }
        
        public CharacterBuilder setHp(int hp){
            this.hp = hp;
            return this;
        }
        
        public CharacterBuilder setDps(int dps){
            this.dps = dps;
            return this;
        }
        
        public CharacterBuilder setLevel(int level){
            this.level = level;
            return this;
        }
        
        public CharacterBuilder setSpace(int space){
            this.space = space;
            return this;
        }
        
        public CharacterBuilder setRarity(int rarity){
            this.rarity = rarity;
            return this;
        }
        
        public CharacterBuilder setCost(int cost){
            this.cost = cost;
            return this;
        }
        
        public CharacterBuilder convert(Character cha){
            this.setCost(cha.getCost());
            this.setName(cha.getName());
            this.images = cha.getImages();
            this.equipments = cha.getEquipments();
            this.setHp(cha.getHp());
            this.setDps(cha.getDps());
            this.setLevel(cha.getLevel());
            this.setSpace(cha.getSpace());
            this.setRarity(cha.getRarity());
            this.equiped = cha.equiped;
            return this;
        }
        
        
        
        @Override
        public Object build() {
            return new Character(this.name,this.images,this.equipments,this.hp,this.dps,this.level,this.space,this.rarity,this.cost,this.equiped);
        }
        
    }
}
