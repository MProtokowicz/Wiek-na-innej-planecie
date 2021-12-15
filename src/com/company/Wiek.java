package com.company;

public class Wiek {
    private static final int ZIEMSKIROKWSEKUNDACH = 31557600;

    private static double obliczRokPlanetyWSekundachZiemskich(Planety planeta)
    {
        return planeta.getObrotPlanety() * ZIEMSKIROKWSEKUNDACH;
    }

    private static double wiekNaPlanecie(int wiek,Planety planeta)
    {
        return wiek / obliczRokPlanetyWSekundachZiemskich(planeta);
    }

    static double obliczWiekNaPlanecie(int wiek,Planety planeta)
    {
        return wiekNaPlanecie(wiek,planeta);
    }

}
