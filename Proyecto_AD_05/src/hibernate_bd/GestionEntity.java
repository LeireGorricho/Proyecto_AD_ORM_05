package hibernate_bd;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "gestion", schema = "proyecto_ad3_orm", catalog = "")
@IdClass(GestionEntityPK.class)
public class GestionEntity implements Serializable {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "codproveedor", nullable = false, length = 6)
    private String codproveedor;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "codpieza", nullable = false, length = 6)
    private String codpieza;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "codproyecto", nullable = false, length = 6)
    private String codproyecto;
    @Basic
    @Column(name = "cantidad", nullable = false)
    private int cantidad;
    @Basic
    @Column(name = "estado", nullable = false, length = 4)
    private String estado;
    @ManyToOne
    @JoinColumn(name = "codproveedor", referencedColumnName = "codigo", nullable = false)
    private ProveedoresEntity proveedoresByCodproveedor;
    @ManyToOne
    @JoinColumn(name = "codpieza", referencedColumnName = "codigo", nullable = false)
    private PiezasEntity piezasByCodpieza;
    @ManyToOne
    @JoinColumn(name = "codproyecto", referencedColumnName = "codigo", nullable = false)
    private ProyectosEntity proyectosByCodproyecto;

    public String getCodproveedor() {
        return codproveedor;
    }

    public void setCodproveedor(String codproveedor) {
        this.codproveedor = codproveedor;
    }

    public String getCodpieza() {
        return codpieza;
    }

    public void setCodpieza(String codpieza) {
        this.codpieza = codpieza;
    }

    public String getCodproyecto() {
        return codproyecto;
    }

    public void setCodproyecto(String codproyecto) {
        this.codproyecto = codproyecto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public ProveedoresEntity getProveedoresByCodproveedor() {
        return proveedoresByCodproveedor;
    }

    public void setProveedoresByCodproveedor(ProveedoresEntity proveedoresByCodproveedor) {
        this.proveedoresByCodproveedor = proveedoresByCodproveedor;
    }

    public PiezasEntity getPiezasByCodpieza() {
        return piezasByCodpieza;
    }

    public void setPiezasByCodpieza(PiezasEntity piezasByCodpieza) {
        this.piezasByCodpieza = piezasByCodpieza;
    }

    public ProyectosEntity getProyectosByCodproyecto() {
        return proyectosByCodproyecto;
    }

    public void setProyectosByCodproyecto(ProyectosEntity proyectosByCodproyecto) {
        this.proyectosByCodproyecto = proyectosByCodproyecto;
    }
}
