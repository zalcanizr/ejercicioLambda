package com.cice.interfaces.impl;

import com.cice.interfaces.IFuncional;

public class Funcional implements IFuncional{

    @Override
    public double calculadora(double multiplicando, double multiplicador) {
        return multiplicando*multiplicador;
    }
}
