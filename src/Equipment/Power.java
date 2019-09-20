/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Equipment;

import java.awt.image.BufferedImage;
import java.util.ArrayList;

/**
 *
 * @author Gabriel
 */
public class Power extends Equipment {
    
    public Power(String name, int range, int level, int damage, int area, ArrayList<String> images) {
        super(name, range, level, damage, area, images);
    }
    
    @Override
    public void levelUp(int levels){}
    
    @Override
    public void action(){}
    
}
