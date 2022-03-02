/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package jamon;


 /**
*Clase jamonalvarezlechuga del programa, que define los distintos objetos con unos parametros
*y realiza acciones de compra y venta de jamones
 * @author alvarezlechugajl2122
 */

public class JamonAlvarezLechugaJL2122 {
//get y set de categoria
    /**
     * @return the categoria
     */
    public String getCategoria() {
        return categoria;
    }

    /**
     * @param categoria the categoria to set
     */
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
//get y set de precio
    /**
     * @return the precio
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * @param precio the precio to set
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }
//get y set de mesesCuracion
    /**
     * @return the mesesCuracion
     */
    public int getMesesCuracion() {
        return mesesCuracion;
    }

    /**
     * @param mesesCuracion the mesesCuracion to set
     */
    public void setMesesCuracion(int mesesCuracion) {
        this.mesesCuracion = mesesCuracion;
    }
//get y set de stock
    /**
     * @return the stock
     */
    public int getStock() {
        return stock;
    }

    /**
     * @param stock the stock to set
     */
    public void setStock(int stock) {
        this.stock = stock;
    }
  
    /** creamos las variables sin inicializar, y de forma privada, 
     * para que los cambios a estas solo se puedan realizar desde esta clase
    */
    
    private String categoria;
    private double precio;
    private int mesesCuracion;
    private int stock;

    /** Constructor sin argumentos
     * Constructor con parámetro para iniciar todas las propiedades de la clase jamon
     */
    public JamonAlvarezLechugaJL2122 ()
    {
    }
  
   /** aqui es donde inicializas todas las variables de la clase a los del objeto creado en el main
     */ 
    
    public JamonAlvarezLechugaJL2122 (String cat, double precio, int stock) 
    {
        this.categoria =cat;
        this.precio=precio;
        this.stock=stock;
    }

  /** Método para asignar la categoría del jamón   */  

    public void asignarCategoria(String cat)
    {
        setCategoria(cat);
    }
    
    /** Método que me devuelve la categoría del jamón */
    
    public String obtenerCategoria()
    {
        return getCategoria();
    }

    /** Método que me devuelve el stock de jamones disponible en cada momento */
    
     public int obtenerStock ()
    {
        return getStock();
    }

     /** Método para comprar jamnones. Modifica el stock.
     * Este método va a ser probado con Junit
     * comprobamos que no se desee comprar una cantidad ngativa de unidades, si se quiere comprar una cantidad negativa,
     * mostraremos un mensaje de error, si la cantidad es correcta, gestionaremos el cambio  en la variable de la clase
     * añadiendole la cantidad deseada.
      */ 
    
     public void comprar(int cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede comprar un nº negativo de jamones");
        setStock(getStock() + cantidad);
    }

   /** funcion la cual entra por parametro la cantidad de unidades a vender y hace los cambios en las variables
    * de la clase JamonAlvarezLechugaJL2122, si la cantidad que deseas quitar es inferior o igual a 0, no se podra hacer 
    * y mostraremos un fallo por pantalla, si la cantidad que queremos vender es superior al stock, mostraremos por
    * pantalla un mensaje de error. Si la cantidad que queremos vender no cumple ninguna de las condiciones anteriores,
    * se podra hacer la venta. 
     */
     
    public void vender (int cantidad, java.lang.String paisalvarezlechugajl2122) throws Exception 
    {
        if (cantidad <= 0) 
            throw new Exception ("No se puede vender una cantidad negativa de jamones");
        if (obtenerStock()< cantidad)
            throw new Exception ("No  hay suficientes jamones para vender");
        setStock(getStock() - cantidad); 
    }
}
