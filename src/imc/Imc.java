/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imc;

/**
 *
 * @Luis Alejandro Gutierrez Pimienta
 */
public class Imc {

   public Imc(){
    
        
    }
    
    public String Resultado(double peso, double altura){
        String resultado1="";
        double resultado2;
        
        resultado2=(peso)/(altura*altura);
        
        if (resultado2<=15){
            resultado1="Delgadez muy severa";
        }
        
        if(resultado2>15 && resultado2<=15.9){
            resultado1="Delgadez severa";
        }
        
        if(resultado2>16 && resultado2<=18.4){
            resultado1="Delgadez";
        }
        
        if(resultado2>18.5 && resultado2<=24.9){
            resultado1="Peso saludable";
        }
        
        if(resultado2>25 && resultado2<=29.9){
            resultado1="Sobrepeso";
        }
        
        if(resultado2>30 && resultado2<=34.9){
            resultado1="Obesidad Severa";
        }
        
        if(resultado2>40){
            resultado1="Obesidad Mórbida";
        }
        
        
        
        
        
        
        
        return resultado1;
    }
}
