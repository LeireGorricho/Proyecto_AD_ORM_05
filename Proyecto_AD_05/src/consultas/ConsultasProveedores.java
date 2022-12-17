package consultas;

import hibernate_bd.HibernateUtil;
import hibernate_bd.ProveedoresEntity;
import org.hibernate.ObjectNotFoundException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import javax.persistence.PersistenceException;
import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class ConsultasProveedores {
    Session session = null;
    List<ProveedoresEntity> proveedores =new ArrayList<ProveedoresEntity>();

    public ConsultasProveedores() {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        session = sessionFactory.openSession();
    }

    public ProveedoresEntity recuperarProveedor(String codigo) {
        ProveedoresEntity proveedor = new ProveedoresEntity();
        proveedor = session.load(ProveedoresEntity.class, codigo);
        return proveedor;
    }

    public List<ProveedoresEntity> recuperarDatosProveedores() {
        proveedores.clear();
        try {
            Query q = session.createQuery("from ProveedoresEntity");
            List<ProveedoresEntity> lista = q.list();
            proveedores.addAll(lista);

        } catch (ObjectNotFoundException o) {
            System.out.println("ERROR");
        }
        return proveedores;
    }

    public boolean nuevoProveedor(String codigo, String nombre, String apellidos, String direccion) {
        ProveedoresEntity proveedor = new ProveedoresEntity();
        Transaction tx = session.beginTransaction();
        proveedor.setCodigo(codigo);
        proveedor.setNombre(nombre);
        proveedor.setApellidos(apellidos);
        proveedor.setDireccion(direccion);
        proveedor.setEstado("ALTA");
        session.save(proveedor);
        try {
            tx.commit();
            JOptionPane.showMessageDialog(null, "El proveedor se ha añadido correctamente");
        } catch (PersistenceException e) {
            JOptionPane.showMessageDialog(null, "No se ha podido añadir el proveedor, comprueba que los datos introducidos son correctos");
            return false;
        }
        return true;
    }

    public void eliminarProveedor(String codigo) {
        ProveedoresEntity pro = new ProveedoresEntity();
        Transaction tx = session.beginTransaction();
        pro = session.load(ProveedoresEntity.class, codigo);
        pro.setEstado("BAJA");
        tx.commit();
        session.update(pro);
    }

    public boolean modificarProveedor(String codigo, String nombre, String apellidos, String direccion, String estado) {
        ProveedoresEntity proveedor = new ProveedoresEntity();
        Transaction tx = session.beginTransaction();
        proveedor.setCodigo(codigo);
        proveedor.setNombre(nombre);
        proveedor.setApellidos(apellidos);
        proveedor.setDireccion(direccion);
        proveedor.setEstado(estado);
        session.update(proveedor);
        try {
            tx.commit();
            JOptionPane.showMessageDialog(null, "El proveedor se ha editado correctamente");
        } catch (PersistenceException e) {
            JOptionPane.showMessageDialog(null, "No se ha podido editar el proveedor, comprueba que los datos introducidos son correctos");
            return false;
        }
        return true;
    }

    public List<ProveedoresEntity> cargarAltas() {
        List<ProveedoresEntity> proveedores = new ArrayList<ProveedoresEntity>();
        Query q = session.createQuery("from ProveedoresEntity where estado = 'ALTA'");
        proveedores = q.list();
        return proveedores;
    }

    public void cerrarConexion() {
        session.close();
    }
}
