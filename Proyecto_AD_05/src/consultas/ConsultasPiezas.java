package consultas;

import hibernate_bd.HibernateUtil;
import hibernate_bd.PiezasEntity;
import org.hibernate.ObjectNotFoundException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import javax.persistence.PersistenceException;
import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class ConsultasPiezas {

    Session session = null;
    List<PiezasEntity> piezas = new ArrayList<PiezasEntity>();

    public ConsultasPiezas() {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        session = sessionFactory.openSession();
    }

    public PiezasEntity recuperarPieza(String codigo) {
        PiezasEntity pieza = new PiezasEntity();
        pieza = session.load(PiezasEntity.class, codigo);
        return pieza;
    }

    public List<PiezasEntity> recuperarDatosPiezas() {
        piezas.clear();
        try {
            Query q = session.createQuery("from PiezasEntity ");
            List<PiezasEntity> lista = q.list();
            piezas.addAll(lista);
        } catch (ObjectNotFoundException o) {
            System.out.println("Error");
        }
        return piezas;
    }

    public boolean anadirPieza(String codigo, String nombre, float precio, String descripcion) {
        PiezasEntity pieza = new PiezasEntity();
        Transaction tx = session.beginTransaction();
        pieza.setCodigo(codigo);
        pieza.setNombre(nombre);
        pieza.setPrecio(precio);
        pieza.setDescripcion(descripcion);
        pieza.setEstado("ALTA");
        session.save(pieza);
        try {
            tx.commit();
            JOptionPane.showMessageDialog(null, "La pieza se ha añadido correctamente");
        } catch (PersistenceException e) {
            JOptionPane.showMessageDialog(null, "No se ha podido añadir la pieza, comprueba que el código no exista ya y que no se supere el máximo de longitud");
            return false;
        }
        return true;
    }

    public void eliminarPieza(String codigo) {
        PiezasEntity pieza = new PiezasEntity();
        Transaction tx = session.beginTransaction();
        pieza = session.load(PiezasEntity.class, codigo);
        pieza.setEstado("BAJA");
        tx.commit();
        session.update(pieza);
    }

    public boolean modificarPieza(String codigo, String nombre, float precio, String descripcion, String estado) {
        PiezasEntity pieza = new PiezasEntity();
        Transaction tx = session.beginTransaction();
        pieza.setCodigo(codigo);
        pieza.setNombre(nombre);
        pieza.setPrecio(precio);
        pieza.setDescripcion(descripcion);
        pieza.setEstado(estado);
        session.update(pieza);
        try {
            tx.commit();
            JOptionPane.showMessageDialog(null, "La pieza se ha editado correctamente");
        } catch (PersistenceException e) {
            JOptionPane.showMessageDialog(null, "No se ha podido editar la pieza, comprueba que no se supere el máximo de longitud");
            return false;
        }
        return true;
    }

    public List<PiezasEntity> cargarAltas() {
        List<PiezasEntity> piezas = new ArrayList<PiezasEntity>();
        Query q = session.createQuery("from PiezasEntity where estado = 'ALTA'");
        piezas = q.list();
        return piezas;
    }

    public void cerrarConexion() {
        session.close();
    }
}
