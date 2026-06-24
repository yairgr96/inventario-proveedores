package com.yair.inventario.services;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("miProveedorNacional")
@Scope("singleton")
public class ProveedorNacional_Impl implements IProveedorService {

    @Autowired
    /*@Qualifier("miInformeTrimestral")*/
    private InformeService informeService;
    private String emailSoporte;

    public String getEmailSoporte() {
        return emailSoporte;
    }

    public void setEmailSoporte(String emailSoporte) {
        this.emailSoporte = emailSoporte;
    }

    //Inyeccion de dependencia por CONSTRUCTOR
    public ProveedorNacional_Impl(InformeService informeService){
        this.informeService = informeService;
    }

    @Override
    public String getDetallesProveedor() {
        return "Proveedor Nacional: Empresa S.A. de C.V." + informeService.getInforme();
    }

    // Método que se ejecuta tras el nacimiento del objeto
    @PostConstruct
    public void ejecutarDespuesDeCreacion() {
        System.out.println(">>> Inicializando recursos: Abriendo conexión a BD del Proveedor...");
    }

    // Método que se ejecuta antes de la muerte del objeto
    @PreDestroy
    public void ejecutarAntesDeDestruccion() {
        System.out.println(">>> [PreDestroy]: Cerrando conexiones de forma segura. Liberando memoria...");
    }
}
