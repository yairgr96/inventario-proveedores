package com.yair.inventario.services;

import org.springframework.stereotype.Component;

/*@Component("miInformeTrimestral")*/
public class InformeFinancieroTrimestral_Imp implements InformeService{

    @Override
    public String getInforme() {
        return "Reporte Trimestral: Ganancias en aumento";
    }
}
