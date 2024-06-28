package Intermediate2.generic.test.ex3;

import Intermediate2.generic.test.ex3.unit.BioUnit;

public class Shuttle <T extends BioUnit>{
    private T unit;

    public void in(T t){
        unit = t;
    }

    public T out(){
        return unit;
    }

    public void showInfo(){
        System.out.println("이름 : " + unit.getName() + " hp : " + unit.getHp());
    }

}
