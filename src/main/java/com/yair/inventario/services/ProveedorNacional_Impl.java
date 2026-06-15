package com.yair.inventario.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("miProveedorNacional")
public class ProveedorNacional_Impl implements IProveedorService {

    private InformeService informeService;
    private String emailSoporte;

    public String getEmailSoporte() {
        return emailSoporte;
    }

    public void setEmailSoporte(String emailSoporte) {
        this.emailSoporte = emailSoporte;
    }

    //Inyeccion de dependencia por CONSTRUCTOR
    @Autowired
    public ProveedorNacional_Impl(InformeService informeService){
        this.informeService = informeService;
    }

    @Override
    public String getDetallesProveedor() {
        return "Proveedor Nacional: Empresa S.A. de C.V." + informeService.getInforme();
    }
}
