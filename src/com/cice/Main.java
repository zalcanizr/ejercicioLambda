package com.cice;

import com.cice.interfaces.IFuncional;
import com.cice.interfaces.impl.Funcional;

import java.util.Scanner;

public class Main {

    public static double multiplicando=3;
    public static double multiplicador=5;

    public static void main(String[] args) {
	// write your code here

        //crear objeto de tipo IFuncional
        //parametro de entrada-> funcion logica o implementacion del método
        IFuncional f= (multiplicando, multiplicador) -> (multiplicando+multiplicador);
        double suma=f.calculadora(multiplicando,multiplicador);
        System.out.println("la suma de los números es: "+ suma);

        f=(multiplicando, multiplicador) -> (multiplicando-multiplicador);
        double resta=f.calculadora(multiplicando,multiplicador);
        System.out.println("la resta de los números es: "+ resta);

        f=(multiplicando, multiplicador) -> (multiplicando*multiplicador);
        double multiplica=f.calculadora(multiplicando,multiplicador);
        System.out.println("la multiplicacion de los números es: "+ multiplica);

        f=(multiplicando, multiplicador) -> (multiplicando/multiplicador);
        double division=f.calculadora(multiplicando,multiplicador);
        System.out.println("la división de los números es: "+ division);
    }
}
