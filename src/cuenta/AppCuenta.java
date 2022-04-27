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
public class AppCuenta {
    public static void main(String[] args) {
        
     Cuenta c1= new Cuenta();
     
     Cuenta c2= new Cuenta("Pepe","8.888",2,10000);
     
     c1.setNombre("Anita");
     c1.setNroCuenta("1.238");
     c1.setInteres(40);
     c1.setSaldo(2000);
     
     

     
        
        
            if(c1.ingreso(180)){
                  System.out.println("Ingreso Correcto");
             }else{
                  System.out.println("Ingreso Incorrecto");
             }
        
        
             if(c1.reintegro(210)){
                System.out.println("Reintegro Correcto");
              }else{
                System.out.println("Reintegro Incorrecto");
               }
         if(c1.transferencia(1000, c2)){
                System.out.println("Transferencia Correcta");
              }else{
                System.out.println("Transferencia Incorrecta");
               }
        
        
        System.out.println("El Saldo es: " + c1.getSaldo());    
        System.out.println("El Saldo es: " + c2.getSaldo());
    }
    
}


         