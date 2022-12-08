package perscholas;

import perscholas.types.FireMonster;
import perscholas.types.StoneMonster;
import perscholas.types.WaterMonster;

public class MainRunner {
    public static void main (String [] args){
        FireMonster mon1 = new FireMonster();
        WaterMonster mon2 = new WaterMonster();
        StoneMonster mon3 = new StoneMonster();

        mon1.attack();
        mon2.attack();
        mon3.attack();
        }

    }

