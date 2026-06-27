package com.yair.inventario.services;

import org.springframework.beans.factory.annotation.Value;

public class ProvedorDirector_Impl implements IProveedorService{

    private InformeService informeService;

    @Value("${proveedor.director.email}")
    private String email;

    public ProvedorDirector_Impl(InformeService informeService) {
        this.informeService = informeService;
    }

    @Override
    public String getDetallesProveedor() {
        return "Director de Proveedores Nacionales \\n | " +
                "Email: " + email + " \n" +  informeService.getInforme();
    }
}
