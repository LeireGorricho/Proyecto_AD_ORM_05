package hibernate_bd;

import javax.persistence.*;

@Entity
@Table(name = "gestion", schema = "proyecto_ad3_orm", catalog = "")
public class GestionEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "codigo", nullable = false, length = 6)
    private String codigo;
    @Basic
    @Column(name = "cantidad", nullable = false)
    private int cantidad;
    @Basic
    @Column(name = "estado", nullable = false, length = 4)
    private String estado;
    @ManyToOne
    @JoinColumn(name = "codpieza", referencedColumnName = "codigo", nullable = false)
    private PiezasEntity piezasByCodpieza;
    @ManyToOne
    @JoinColumn(name = "codproyecto", referencedColumnName = "codigo", nullable = false)
    private ProyectosEntity proyectosByCodproyecto;
    @ManyToOne
    @JoinColumn(name = "codproveedor", referencedColumnName = "codigo", nullable = false)
    private ProveedoresEntity proveedoresByCodproveedor;

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
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

    public ProveedoresEntity getProveedoresByCodproveedor() {
        return proveedoresByCodproveedor;
    }

    public void setProveedoresByCodproveedor(ProveedoresEntity proveedoresByCodproveedor) {
        this.proveedoresByCodproveedor = proveedoresByCodproveedor;
    }
}
