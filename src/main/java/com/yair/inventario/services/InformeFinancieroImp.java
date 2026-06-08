package com.yair.inventario.services;

public class InformeFinancieroImp implements InformeService{


    @Override
    public String getInforme() {
        return "Reporte financiero: El proveedor está al cirriente con sus pagos";
    }
}
