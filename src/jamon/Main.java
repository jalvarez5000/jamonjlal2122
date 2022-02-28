/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jamon;

/**
*Clase main del programa, que define un objeto mijamonAlvarezLechugajl2122 con unos parametros
*y realiza acciones de compra y venta de jamones
 * @author alvarezlechugajl2122
 */
public class Main {

    /**
* Este metodo es el principal de ejecucion del programa
 */  

    public static void main(String[] args) {
        JamonAlvarezLechugaJL2122 miJamonAlvarezLechugaJL2122;
        int stockActual;
        
        miJamonAlvarezLechugaJL2122 = new JamonAlvarezLechugaJL2122("5Jotas",580,100);
        
        vendeJamAlvarezLechugaJL2122(miJamonAlvarezLechugaJL2122);
        
        compraJamAlvarezLechugaJL2122(miJamonAlvarezLechugaJL2122);
        stockActual = miJamonAlvarezLechugaJL2122.obtenerStock();
        System.out.println("El stock actual es "+ stockActual );
    }

        /**
*Metodo comprajamalvarezlechugajl2122
* 
* En este metodo se va a comprar la cantiad de 50 jamones de stock que es de 100 unidades
* se hace con la idea de que aumentar la variable stock, que pasa a ser de 150 unidades.
 */  

    private static void compraJamAlvarezLechugaJL2122(JamonAlvarezLechugaJL2122 miJamonAlvarezLechugaJL2122) {
        try
        {
            System.out.println("Compra de Jamones");
            miJamonAlvarezLechugaJL2122.comprar(50);
        } catch (Exception e)
        {
            System.out.print("Fallo al ingresar " + e);
        }
    }
        /**
*Metodo vendejamalvarezlechugajl2122
* 
* En este metodo se va a vender la cantiad de 80 jamones de stock que es de 150 unidades
* se hace con la idea de que bajar la variable stock, que pasa a ser de 70 unidades.
 */  

    private static void vendeJamAlvarezLechugaJL2122(JamonAlvarezLechugaJL2122 miJamonAlvarezLechugaJL2122) {
        try
        {
            System.out.println("Venta de Jamones");
            miJamonAlvarezLechugaJL2122.vender(80,"España");
        } catch (Exception e)
        {
            System.out.print("Fallo al vender " + e);
        }
    }
}
