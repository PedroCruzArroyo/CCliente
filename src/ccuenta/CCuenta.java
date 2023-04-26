/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ccuenta;


/**
 * Clase que permite crear objetos Cuenta Corrient, con los atributos ...
 * @author Pedro 
 * @version 1.0 28/02/2023
 * @since 1/1/2023
 * @see Main
 */
public class CCuenta {
    /**
     * Nombre de tipo String del titular de la cuenta
     */
    private String nombre;
    /**
     * Cuenta tipo String del numero de cuenta de 20 digitos
     */
    private String cuenta;
     /**
     * Cuenta tipo double del saldo de  la cuenta 
     */
    private double saldo;
    /**
     * Cuenta tipo double del tipo de interes que paga la cuenta 
     */
    private double tipoInterés;

    /**
     * Constructor sin parametros de la clase Cuenta
     */
    public CCuenta ()
    {
    }
    /**
     * Constructor con parametros de la clase CCuenta
     * @param nom tipo String , parametro que identifica el nombre del titular de la cuenta
     * @param cue tipo String , parametro que identifica el numero de cuenta del titular
     * @param sal tipo int , parametro que identifica el saldo restante de la cuenta
     * @param tipo tipo double , parametro que identifica el tipo de interes de la cuenta
     */
    public CCuenta (String nom, String cue, double sal, double tipo)
    {
        nombre=nom;
        cuenta=cue;
        saldo=sal;
    }
   
    /**
     * Método para asignar el nombre del titular de la cuenta
     * @param nom tipo String, para asignar nombre del titular de la cuenta
     */
    public void setNombre(String nom)
    {
        nombre=nom;
    }
    
    /**
     * Método que me devuelve el nombre del titular
     * @return tipo String con el valor del atributo nombre , titular de la CCuenta
     */
    public String getNombre()
    {
        return nombre;
    }

    /**
     * Método que me devuelve el saldo disponible en cada momento
     * @return tipo double , para consultar el saldo de la cuenta
     */
     public double getEstado ()
    {
        return getSaldo();
    }

    
     /**
      * Método para ingresar cantidades en la cuenta. Modifica el saldo.
      * @param cantidad tipo double, ...
      * @throws Exception ripo Exception cuando el argumento es inferior a 0
      */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }



   
    /**
     * Método para retirar cantidades en la cuenta. Modifica el saldo.
     * @param cantidad de tipo double, la cantidad a retirar del saldo de la cuenta
     * @throws Exception por si la cantidad retirada es mayor que el saldo de la cuenta
     */
    public void retirar (double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (getEstado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
    }


    /**
     * Método que me devuelve el número de cuenta
     * @return de tipo String nos devuelve el numero de cuenta de 20 digitos
     */
    public String getCuenta ()
    {
        return cuenta;
    }

    /**
     * @param cuenta the cuenta to set
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * @return the saldo
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * @param saldo the saldo to set
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * @return the tipoInterés
     */
    public double getTipoInterés() {
        return tipoInterés;
    }

    /**
     * @param tipoInterés the tipoInterés to set
     */
    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }
}
