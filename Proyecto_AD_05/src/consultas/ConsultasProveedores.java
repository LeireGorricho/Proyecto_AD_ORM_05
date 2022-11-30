package consultas;

import hibernate_bd.HibernateUtil;
import hibernate_bd.ProveedoresEntity;
import org.hibernate.ObjectNotFoundException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import java.util.ArrayList;
import java.util.List;

public class ConsultasProveedores {
    Session session = null;
    List<ProveedoresEntity> proveedores =new ArrayList<ProveedoresEntity>();

    public ConsultasProveedores() {

        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        session = sessionFactory.openSession();
    }

    public List<ProveedoresEntity> recuperarDatosProveedores() {
        try {
            Query q = session.createQuery("from ProveedoresEntity");
            List<ProveedoresEntity> lista = q.list();
            proveedores.addAll(lista);

        } catch (ObjectNotFoundException o) {
            System.out.println("ERROR");
        }
        session.close();
        return proveedores;
    }
}
