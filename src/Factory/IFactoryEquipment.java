/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Factory;

import Equipment.Equipment;
import java.awt.image.BufferedImage;
import java.util.ArrayList;

/**
 *
 * @author Gabriel
 */
public interface IFactoryEquipment {
    
    public Equipment createEquipment(Type type,String name,int range,int level,int damage,int area,ArrayList<String> images);
    
}
