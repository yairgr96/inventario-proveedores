package com.yair.inventario.services;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("aplicationContext.xml");

        ProveedorNacional_Impl ProveedorNacional = contexto.getBean("miProveedorNacional", ProveedorNacional_Impl.class);

        System.out.println("-------Proveddores Nacionales-----");
        System.out.println(ProveedorNacional.getDetallesProveedor());
        System.out.println("Soporte/Ayuda: " + ProveedorNacional.getEmailSoporte());
        System.out.println("-----------------------------");


        System.out.println("-------Proveddor Internacional-----");
        ProveedorInternacional_Imp proveedorInternacionalImp = contexto.getBean("miProveedorInternacional", ProveedorInternacional_Imp.class);
        System.out.println(proveedorInternacionalImp.getDetallesProveedor());



        contexto.close();
    }
}
