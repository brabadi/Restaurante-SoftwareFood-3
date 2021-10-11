
package co.unicauca.microkernel.common.entities;

/**
 *
 * @author braia
 */
public class Component {
    
    /**
     * Identificador del componenete
     */
    private String compID;
    /**
     * Nombre del componenete
     */
    private String compNombre;
    /**
     * Tipo de componente
     */
    private ComponentType compTipo;
    /**
     * Foto del componente
     */
    private byte[] compFoto;

    public Component() {
    }

    public Component(String compID, String compNombre, ComponentType compTipo, byte[] compFoto) {
        this.compID = compID;
        this.compNombre = compNombre;
        this.compTipo = compTipo;
        this.compFoto = compFoto;
    }

    public String getCompID() {
        return compID;
    }

    public void setCompID(String compID) {
        this.compID = compID;
    }

    public String getCompNombre() {
        return compNombre;
    }

    public void setCompNombre(String compNombre) {
        this.compNombre = compNombre;
    }

    public ComponentType getCompTipo() {
        return compTipo;
    }

    public void setCompTipo(ComponentType compTipo) {
        this.compTipo = compTipo;
    }

    public byte[] getCompFoto() {
        return compFoto;
    }

    public void setCompFoto(byte[] compFoto) {
        this.compFoto = compFoto;
    }
    
    
}
