package com.yair.inventario.services;

import org.springframework.stereotype.Component;

@Component
public class InformeFinancieroImp implements InformeService{


    @Override
    public String getInforme() {
        return "Reporte financiero: El proveedor está al cirriente con sus pagos";
    }
}
