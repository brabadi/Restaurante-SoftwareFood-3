
package co.unicauca.microkernel.common.entities;

/**
 *
 * @author Rivera
 */


public class Pedido {
    /*
    Identificador del pedido
    */
    private int ped_Id;
    /**
     * Identificador del cleinte quien pide el pedido
     */
    private int cli_Id;
    /**
     * Identificador del reataurante en donde se realiza el pedido
     */
    private int res_Nit;
    /**
     * Plato ejecutivo que se solicita en el pedido
     */
    private PlatoEjecutivo plaEje_Dia;
    /*
    Cantidad de pedidos que se realizan
    */
    private int ped_Cantidad;
    /**
     *Fecha en el que se realiza el pedido, esta fecha es tomada del sistema
     */
    private String ped_fecha;
    /**
     * Hora en el que se realiza el pedido, hora estipulada por el sistema
     */
    private String ped_Hora;
    /**
     * Estado en el que se encuentra un pedido
     */
    private PedEstado ped_Estado;
    /**
     * Precio total a pagar por el pedido realizado
     */
    private int ped_PrecioTotal;

    public Pedido() {
    }

    public Pedido(int ped_Id, int cli_Id, int res_Nit, PlatoEjecutivo plaEje_Dia, int ped_Cantidad, String ped_fecha, String ped_Hora, PedEstado ped_Estado, int ped_PrecioTotal) {
        this.ped_Id = ped_Id;
        this.cli_Id = cli_Id;
        this.res_Nit = res_Nit;
        this.plaEje_Dia = plaEje_Dia;
        this.ped_Cantidad = ped_Cantidad;
        this.ped_fecha = ped_fecha;
        this.ped_Hora = ped_Hora;
        this.ped_Estado = ped_Estado;
        this.ped_PrecioTotal = ped_PrecioTotal;
    }

    public int getPed_Id() {
        return ped_Id;
    }

    public void setPed_Id(int ped_Id) {
        this.ped_Id = ped_Id;
    }

    public int getCli_Id() {
        return cli_Id;
    }

    public void setCli_Id(int cli_Id) {
        this.cli_Id = cli_Id;
    }

    public int getRes_Nit() {
        return res_Nit;
    }

    public void setRes_Nit(int res_Nit) {
        this.res_Nit = res_Nit;
    }

    public PlatoEjecutivo getPlaEje_Dia() {
        return plaEje_Dia;
    }

    public void setPlaEje_Dia(PlatoEjecutivo plaEje_Dia) {
        this.plaEje_Dia = plaEje_Dia;
    }

    public int getPed_Cantidad() {
        return ped_Cantidad;
    }

    public void setPed_Cantidad(int ped_Cantidad) {
        this.ped_Cantidad = ped_Cantidad;
    }

    public String getPed_fecha() {
        return ped_fecha;
    }

    public void setPed_fecha(String ped_fecha) {
        this.ped_fecha = ped_fecha;
    }

    public String getPed_Hora() {
        return ped_Hora;
    }

    public void setPed_Hora(String hora) {
        this.ped_Hora = hora;
    }

    public PedEstado getPed_Estado() {
        return ped_Estado;
    }

    public void setPed_Estado(PedEstado ped_Estado) {
        this.ped_Estado = ped_Estado;
    }

    public int getPed_PrecioTotal() {
        return ped_PrecioTotal;
    }

    public void setPed_PrecioTotal(int ped_PrecioTotal) {
        this.ped_PrecioTotal = ped_PrecioTotal;
    }
    
    
  
}
