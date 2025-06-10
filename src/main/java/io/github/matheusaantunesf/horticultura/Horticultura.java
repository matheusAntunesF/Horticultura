/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package io.github.matheusaantunesf.horticultura;

import java.math.BigDecimal;

/**
 *
 * @author mathe
 */
public class Horticultura {

    public static void main(String[] args) {
        Ambiente ambiente = new Ambiente();
        Integer checagem1 = ambiente.setTemperatura(new BigDecimal("0.2"));
        Integer checagem2 = ambiente.setUmidade(new BigDecimal("0.7"));
        if(checagem1 == 0 && checagem2 == 0){
            System.out.println(">> " + ambiente);
        }
        checagem1 = ambiente.setTemperatura(new BigDecimal("0.0"));
        checagem2 = ambiente.setUmidade(new BigDecimal("0.9"));
        if(checagem1 == -1 && checagem2 == -1){
            System.out.println(">> ERRO na segunda insercao!");
        }
    }
}
