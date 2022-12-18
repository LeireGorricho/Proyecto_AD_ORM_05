package consultas;

import hibernate_bd.*;
import org.hibernate.ObjectNotFoundException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import javax.persistence.PersistenceException;
import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class ConsultasGestion {

    Session session = null;
    List<GestionEntity> gestion = new ArrayList<GestionEntity>();

    public ConsultasGestion() {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        session = sessionFactory.openSession();
    }

    public GestionEntity recuperarGestion(String codigo) {
        GestionEntity relacion = new GestionEntity();
        relacion = session.load(GestionEntity.class, Integer.parseInt(codigo));
        return relacion;
    }

    public List<GestionEntity> recuperarDatosGestiones() {
        gestion.clear();
        try {
            Query q = session.createQuery("from GestionEntity");
            List<GestionEntity> lista = q.list();
            gestion.addAll(lista);
        } catch (ObjectNotFoundException o) {
            System.out.println("Error");
        }
        return gestion;
    }

    public boolean anadirGestion(String codigo, String codproveedor, String codpieza, String codproyecto, int cantidad) {
        try {
            ConsultasPiezas consultasPiezas = new ConsultasPiezas();
            PiezasEntity pieza = consultasPiezas.recuperarPieza(codpieza);
            consultasPiezas.cerrarConexion();
            ConsultasProyectos consultasProyectos = new ConsultasProyectos();
            ProyectosEntity proyecto = consultasProyectos.recuperarProyecto(codproyecto);
            consultasProyectos.cerrarConexion();
            ConsultasProveedores consultasProveedores = new ConsultasProveedores();
            ProveedoresEntity proveedor = consultasProveedores.recuperarProveedor(codproveedor);
            consultasProveedores.cerrarConexion();
            Transaction tx = session.beginTransaction();
            GestionEntity gestion = new GestionEntity();
            gestion.setCodigo(codigo);
            gestion.setPiezasByCodpieza(pieza);
            gestion.setProveedoresByCodproveedor(proveedor);
            gestion.setProyectosByCodproyecto(proyecto);
            gestion.setCantidad(cantidad);
            gestion.setEstado("ALTA");
            session.save(gestion);
            tx.commit();
            JOptionPane.showMessageDialog(null, "La gestión se ha añadido correctamente");
        } catch (PersistenceException e) {
            JOptionPane.showMessageDialog(null, "No se ha podido añadir la gestión, comprueba que los datos introducidos son correctos");
            return false;
        }
        return true;
    }

    public void eliminarGestion(int codigo) {
        GestionEntity gestion = new GestionEntity();
        Transaction tx = session.beginTransaction();
        gestion = session.load(GestionEntity.class, codigo);
        gestion.setEstado("BAJA");
        tx.commit();
        session.update(gestion);
    }

    public boolean modificarGestion(String codigo, String codprove, String codpieza, String codproye, int cantidad, String estado, List<PiezasEntity> piezas, List<ProyectosEntity> proyectos, List<ProveedoresEntity> proveedores) {
        try {
            PiezasEntity pieza = null;
            ProveedoresEntity proveedor = null;
            ProyectosEntity proyecto = null;
            for (PiezasEntity piezasEntity : piezas) {
                if (piezasEntity.getCodigo().equals(codpieza)) {
                    pieza = piezasEntity;
                }
            }
            for (ProveedoresEntity proveedore : proveedores) {
                if (proveedore.getCodigo().equals(codprove)) {
                    proveedor = proveedore;
                }
            }
            for (ProyectosEntity proyectosEntity : proyectos) {
                if (proyectosEntity.getCodigo().equals(codproye)) {
                    proyecto = proyectosEntity;
                }
            }
            Transaction transaction = session.beginTransaction();
            GestionEntity gestion = new GestionEntity();
            gestion.setCodigo(codigo);
            gestion.setPiezasByCodpieza(pieza);
            gestion.setProveedoresByCodproveedor(proveedor);
            gestion.setProyectosByCodproyecto(proyecto);
            gestion.setCantidad(cantidad);
            gestion.setEstado(estado);
            session.update(gestion);
            transaction.commit();
            JOptionPane.showMessageDialog(null, "La gestión se ha editado correctamente");
        } catch (PersistenceException e) {
            JOptionPane.showMessageDialog(null, "No se ha podido editar la gestión, comprueba que los datos introducidos son correctos");
            e.printStackTrace();
            return false;
        }
        return true;
    }

    public void cerrarConexion() {
        session.close();
    }
}
