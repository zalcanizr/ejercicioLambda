package com.cice.interfaces;

@FunctionalInterface


//interfaz funcional es aquella que tienen un unico metodo sin definir pero puede tener muchos más metodos definidos
//la expresion landa se apoya en una interfaz funcional, la expresion define la funcionalidad del método abstracto,
//por eso solo tengo un metodo abstracto porque si tuvieramos varios sin definir no sabría a cúal método
//le está definiendo la funcionalidad.
public interface IFuncional {

    double calculadora(double multiplicando,double multiplicador);
}
