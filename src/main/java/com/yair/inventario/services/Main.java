package com.yair.inventario.services;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("aplicationContext.xml");

        IProveedorService ProveedorNacional = contexto.getBean("miProveedorNacional", IProveedorService.class);

        System.out.println(ProveedorNacional.getDetallesProveedor());

        contexto.close();
    }
}
