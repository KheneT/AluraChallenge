/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

/**
 *
 * @author Carlos Saavedra
 */
public enum valorDivisas {
    
    
    //GBP = LIBRA ESTERLINA
    //JPY Yen Japones
    //KRW Won sur Coreano
    DOLAR(0.00021),EURO(0.00020),GBP(0.00017),JPY(0.028),KRW(0.27),COP_PESO(1);
    
    private double valor;
    
    private valorDivisas(double valor){
    this.valor = valor;
    }
    
     public double getValor(){
    return valor;
    }
    
    public void setValor(int valor){
    this.valor = valor;
    }
    
    
    
    
}
