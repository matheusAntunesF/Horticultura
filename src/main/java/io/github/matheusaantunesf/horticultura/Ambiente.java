/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package io.github.matheusaantunesf.horticultura;
import java.math.BigDecimal;
/**
 *
 * @author mathe
 */
public class Ambiente {
    private BigDecimal temperatura;
    private BigDecimal umidade;

    public BigDecimal getTemperatura() {
        return temperatura;
    }

    public Integer setTemperatura(BigDecimal temperatura) {
        if(temperatura.compareTo(new BigDecimal("0.18")) < 0
                || temperatura.compareTo(new BigDecimal("0.28")) > 0){
            return -1;
        }
        this.temperatura = temperatura;
        return 0;
    }

    public BigDecimal getUmidade() {
        return umidade;
    }

    public Integer setUmidade(BigDecimal umidade) {
        if(umidade.compareTo(new BigDecimal("0.6")) < 0
                || umidade.compareTo(new BigDecimal("0.8")) > 0){
            return -1;
        }
        this.umidade = umidade;
        return 0;
    }
    
    @Override
    public String toString(){
        return "Temperatura: " + temperatura.multiply(new BigDecimal("100")) + 
                '%' + '\n' + "Umidade: " + 
                umidade.multiply(new BigDecimal(100)) + '%';
    }
    
}
