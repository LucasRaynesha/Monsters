package perscholas.types;

import perscholas.Monster;
public class StoneMonster implements Monster {
    @Override
    public void attack(){
        System.out.println("Attack with Stones!");
    }
}
