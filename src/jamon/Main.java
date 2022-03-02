/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jamon; //la clase puede llamar a las funciones de las clases de la carpeta a la que mencionamos, en este caso es la carpeta jamon

/**
*Clase main del programa, que define un objeto mijamonAlvarezLechugajl2122 con unos parametros
*y realiza acciones de compra y venta de jamones
 * @author alvarezlechugajl2122
 */
public class Main {

    /**
* Este metodo es el principal de ejecucion del programa
* creas el objeto miJamonAlvarezLechugaJL2122 sin inicializar variable que llevara la cuenta de cuantas unidades hay en el stock
* inicializas el objeto miJamonAlvarezLechugaJL2122 en la clase JamonAlvarezLechugaJL2122, la cual te va a gestionar todos 
* los cambios que quieras hacer(no te hara cambios en el objeto, el objeto solo sirve para darle valores a las variables de dicha clase)
* hacemos uso de la funcion vendeJamAlvarezLechugaJL2122() la cual solo mustra informacion por pantalla. 
* Para hacer uso de esta, debemos introducir el objeto creado anteriormente por parametro.
* hacemos uso de la funcion compraJamAlvarezLechugaJL2122() la cual solo mustra informacion por pantalla.
* Para hacer uso de esta, debemos introducir el objeto creado anteriormente por parametro.
* cogemos la variable inicializada anteriormente (stockActual) y le damos el valor  de stockActual.
* mostramos por pantalla la variable stockActual, la cual almacenara la cantidad de jamones que hay actualmente en el stock
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
* si salta una excepcion no finalizara el programa, sino, que mostraremos por pantalla el mensaje de error
* haces uso de la clase JamonAlvarezLechugaJL2122 (la cual gestiona la informacion de miJamonAlvarezLechugaJL2122) 
* para añadirle 50 unidades. La funcion de dicha clase que te hace el cambio es la funcion comprar, a la cual le metes por 
* parametro la cantidad que deseas añadirle.
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
* funcion la cual entra una variable por parametro y no devuelve nada.
* si salta una excepcion no finalizara el programa, sino, que mostraremos por pantalla el mensaje de error
* haces uso de la clase JamonAlvarezLechugaJL2122 (la cual gestiona la informacion de miJamonAlvarezLechugaJL2122)
* para quitarle 80 unidades. La funcion de dicha clase que te hace el cambio es la funcion vender, a la cual le metes por
* parametro la cantidad que deseas quitarle. si hay una excepcion saltara el error que pongamos, 
* su utilidad es evitar que finalice el programa en caso de error.
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
