package com.yair.inventario.services;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.yair.inventario.services")
@PropertySource("classpath:datosEmpresa.properties")
public class ConfiguracionEmpresa {

// Creacion del bean informeDirector
    @Bean
    public InformeService informeDirecto(){
        return new InformeFinancieroDirector_Impl();
    }

    // Creacion del bean del proveedorDirector
    @Bean
    public IProveedorService proveedorDirector(){
        return new ProvedorDirector_Impl(informeDirecto());
    }
}
