package com.yair.inventario.services;

import org.springframework.aop.support.annotation.AnnotationClassFilter;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {

        //Ya no se usara archivo XML
        //ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("aplicationContext.xml");

        //Nueva linea para el contexto
        AnnotationConfigApplicationContext contexto = new AnnotationConfigApplicationContext(ConfiguracionEmpresa.class);
        //ProveedorNacional_Impl ProveedorNacional = contexto.getBean("miProveedorNacional", ProveedorNacional_Impl.class);

        ProvedorDirector_Impl provedorDirector = contexto.getBean("proveedorDirector", ProvedorDirector_Impl.class);
        System.out.println("-------Director Proveddores Nacionales-----");
        System.out.println(provedorDirector.getDetallesProveedor());
        System.out.println("-----------------------------");
        contexto.close();
    }
}
