/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Factory;

import Equipment.Equipment;
import Equipment.Power;
import Equipment.Weapon;
import java.awt.image.BufferedImage;
import java.util.ArrayList;

/**
 *
 * @author Gabriel
 */
public class FactoryEquipment implements IFactoryEquipment {
   
    
    @Override
    public Equipment createEquipment(Type type,String name,int range,int level,int damage,int area,ArrayList<BufferedImage> images){
        
        switch(type){
            case Power:
                Power p = new Power(name,range,level,damage,area,images);
                return p;
            case Weapon:
                Weapon w = new Weapon(name,range,level,damage,area,images);
                return w;
        }
        return null;
    }
    
}