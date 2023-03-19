/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

import com.mycompany.forms.ConversorMoneda;
import java.util.concurrent.ExecutionException;

/**
 *
 * @author Carlos Saavedra
 */
public class convertirDivisa {

    public static double convertir(double importe, String divisa, boolean reverse) throws Exception {

        if (!ConversorMoneda.isReverseBool()) {
            switch (divisa) {
                case "dolar":
                    return valorDivisas.DOLAR.getValor() * importe;
                case "euros":
                    return valorDivisas.EURO.getValor() * importe;
                case "libras esterlinas":
                    return valorDivisas.GBP.getValor() * importe;
                case "yen japonés":
                    return valorDivisas.JPY.getValor() * importe;
                case "won sur coreano":
                    return valorDivisas.KRW.getValor() * importe;
                case "cop-peso":
                    return importe;

                default:
                    throw new Exception("Dato no valido");
            }
        } else {
            switch (divisa) {
                case "dolar":

                    return  Math.round(importe / valorDivisas.DOLAR.getValor()) ;
                case "euros":
                    return  Math.round(importe /  valorDivisas.EURO.getValor());
                case "libras esterlinas":
                    return  Math.round(importe /  valorDivisas.GBP.getValor());
                case "yen japonés":
                    return  Math.round(importe /  valorDivisas.JPY.getValor());
                case "won sur coreano":
                    return Math.round(importe /  valorDivisas.KRW.getValor());
                case "cop-peso":
                    return importe;

                default:
                    throw new Exception("Dato no valido");

            }

        }

    }
}
