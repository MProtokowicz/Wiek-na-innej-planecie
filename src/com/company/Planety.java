package com.company;
public enum Planety {
    MERKURY (0.2408467),
    WENUS ( 0.61519726),
    ZIEMIA (1.0),
    MARS (1.8808158),
    JOWISZ (11.862615),
    SATURN (29.447498),
    URAN (84.016846),
    NEPTUN (164.79132);

    private double obrotPlanety;


    Planety(double obrotPlanety) //obrót planety wokół własnej orbity w porównaniu z latami ziemskimi
    {
        this.obrotPlanety = obrotPlanety;
    }



    public double getObrotPlanety()
    {
        return obrotPlanety;
    }
}
