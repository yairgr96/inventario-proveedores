package com.yair.inventario.services;

public class ProveedorInternacional_Imp implements IProveedorService{

    private InformeService informeService;

    public void setInformeService(InformeService informeService) {
        this.informeService = informeService;
    }

    @Override
    public String getDetallesProveedor() {
        return "Provedor Internacional: Empresa Internacional";
    }
}
