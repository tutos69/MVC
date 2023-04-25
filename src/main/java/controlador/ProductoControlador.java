/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.io.Serializable;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import modelo.Producto;

/**
 *
 * @author edwin
 */
/*@Stateless*/
public class ProductoControlador extends AbstractFacade<Producto>{

    @PersistenceContext()
    private EntityManager em;

    public ProductoControlador() {
        super(Producto.class);
    }

    protected EntityManager getEntityManager() {
        return em;
    }
}
