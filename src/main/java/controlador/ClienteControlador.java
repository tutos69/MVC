/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import modelo.Cliente;

/**
 *
 * @author edwin
 */
public class ClienteControlador extends AbstractFacade<Cliente> {
    @PersistenceContext()
    private EntityManager em;

    public ClienteControlador() {
        super(Cliente.class);
    }

    protected EntityManager getEntityManager() {
        return em;
    }
}
