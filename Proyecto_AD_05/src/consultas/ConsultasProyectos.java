package consultas;

import hibernate_bd.HibernateUtil;
import hibernate_bd.ProyectosEntity;
import org.hibernate.ObjectNotFoundException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import javax.persistence.PersistenceException;
import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class ConsultasProyectos {

    Session session = null;
    List<ProyectosEntity> piezas = new ArrayList<ProyectosEntity>();

    public ConsultasProyectos() {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        session = sessionFactory.openSession();
    }

    public ProyectosEntity recuperarProyecto(String codigo) {
        ProyectosEntity proyecto = new ProyectosEntity();
        proyecto = session.load(ProyectosEntity.class, codigo);
        return proyecto;
    }

    public List<ProyectosEntity> recuperarDatosProyectos() {
        piezas.clear();
        try {
            Query q = session.createQuery("from ProyectosEntity ");
            List<ProyectosEntity> lista = q.list();
            piezas.addAll(lista);
        } catch (ObjectNotFoundException o) {
            System.out.println("Error");
        }
        return piezas;
    }

    public boolean anadirProyecto(String codigo, String nombre, String ciudad) {
        ProyectosEntity proyecto = new ProyectosEntity();
        Transaction tx = session.beginTransaction();
        proyecto.setCodigo(codigo);
        proyecto.setNombre(nombre);
        proyecto.setCiudad(ciudad);
        proyecto.setEstado("ALTA");
        session.save(proyecto);
        try {
            tx.commit();
            JOptionPane.showMessageDialog(null, "El proyecto se ha añadido correctamente");
        } catch (PersistenceException e) {
            JOptionPane.showMessageDialog(null, "No se ha podido añadir el proyecto, comprueba que los datos introducidos son correctos");
            return false;
        }
        return true;
    }

    public void eliminarProyecto(String codigo) {
        ProyectosEntity pieza = new ProyectosEntity();
        Transaction tx = session.beginTransaction();
        pieza = session.load(ProyectosEntity.class, codigo);
        pieza.setEstado("BAJA");
        tx.commit();
        session.update(pieza);
    }

    public boolean editarProyecto(String codigo, String nombre, String ciudad, String estado) {
        ProyectosEntity pieza = new ProyectosEntity();
        Transaction tx = session.beginTransaction();
        pieza.setCodigo(codigo);
        pieza.setNombre(nombre);
        pieza.setCiudad(ciudad);
        pieza.setEstado(estado);
        session.update(pieza);
        try {
            tx.commit();
            JOptionPane.showMessageDialog(null, "El proyecto se ha editado correctamente");
        } catch (PersistenceException e) {
            JOptionPane.showMessageDialog(null, "No se ha podido editar el proyecto, comprueba que el código no exista ya y que no se supere el máximo de longitud");
            return false;
        }
        return true;
    }

    public List<ProyectosEntity> cargarAltas() {
        List<ProyectosEntity> proyectos = new ArrayList<ProyectosEntity>();
        Query q = session.createQuery("from ProyectosEntity where estado = 'ALTA'");
        proyectos = q.list();
        return proyectos;
    }

    public void cerrarConexion() {
        session.close();
    }
}
