/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.productos;

import controlador.ClienteControlador;
import modelo.Producto;
import controlador.ProductoControlador;
import java.util.Date;
import modelo.Cliente;

/**
 *
 * @author edwin
 */
public class Productos {

    public static void main(String[] args) {
//        Producto producto = new Producto("ehdhdhd", 0.0, "hola dos3");
//        ProductoControlador p = new ProductoControlador();
//        p.create(producto);
       
//        Producto producto = p.find(251);

//        producto.setNombre("tttttt");
//        System.out.println(producto);

//        p.edit(producto);
//        p.remove(producto);
//         System.out.println(p.findAll());
//        System.out.println(p.find(1));

        Date d = new Date();
        Cliente c = new Cliente(d, "hola2", "", "", "", "", "", true);
        ClienteControlador cp = new ClienteControlador();
        cp.create(c);
        System.out.println(cp.findAll());
    }

}
