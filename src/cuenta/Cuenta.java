/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuenta;

/**
 *
 * @author info5
 */
public class Cuenta {

    private String nombre;
    private String nroCuenta;
    private double interes;
    private double saldo;
    
    //sin parametros
    public Cuenta(){}
    //con parametros
    public Cuenta(String nombre, String nroCuenta, double interes, double saldo){
    this.nombre= nombre;
    this.nroCuenta = nroCuenta;
    this.interes = interes;
    this.saldo = saldo;

                      }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNroCuenta() {
        return nroCuenta;
    }

    public void setNroCuenta(String nroCuenta) {
        this.nroCuenta = nroCuenta;
    }

    public double getInteres() {
        return interes;
    }

    public void setInteres(double interes) {
        this.interes = interes;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
   
    public boolean ingreso(double monto){
    boolean operacionCorrecta=false;
    if(monto>0){
        saldo+=monto;
        operacionCorrecta=true;
       
    }else{
        operacionCorrecta=false;
       
        
    }
     return operacionCorrecta;
    }
    
    public boolean reintegro(double monto2){
       boolean operacionCorrecta2=false;
    
     if(monto2>0){
         if((monto2-saldo)<=0){
         saldo-=monto2;
         operacionCorrecta2=true;
         }
        
    }else{
        operacionCorrecta2=false;
        
    }
    
    return operacionCorrecta2;
    }  
    
   public boolean transferencia(double monto, Cuenta c){
       
       boolean transferenciaCorrecta = false;
       
       if (monto < 0) {
            transferenciaCorrecta = false;
        } else if (saldo >= monto) {
            reintegro(monto);
            c.ingreso(monto);
        } else {
            transferenciaCorrecta = false;
        }
       return transferenciaCorrecta;
   }

}  