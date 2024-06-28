package Intermediate2.generic.test.ex3;

import Intermediate2.generic.test.ex3.unit.Marine;
import Intermediate2.generic.test.ex3.unit.Zealot;
import Intermediate2.generic.test.ex3.unit.Zergling;

public class ShuttleTest {
    public static void main(String[] args) {
        Shuttle<Marine> shuttle1 = new Shuttle<>();
        shuttle1.in(new Marine("마린", 40));
        shuttle1.showInfo();

        Shuttle<Zealot> shuttle2 = new Shuttle<>();
        shuttle2.in(new Zealot("질럿", 160));
        shuttle2.showInfo();

        Shuttle<Zergling> shuttle3 = new Shuttle<>();
        shuttle3.in(new Zergling("저글링", 35));
        shuttle3.showInfo();

        UnitPrinter.printV1(shuttle1);
        UnitPrinter.printV2(shuttle1);
    }
}
