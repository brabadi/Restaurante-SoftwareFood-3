package co.unicauca.microkernel.server.access;

import co.unicauca.microkernel.common.entities.Component;
import co.unicauca.microkernel.common.entities.Pedido;

/**
 *
 * @author braia
 */
public interface IRestaurantRepository {

    /**
     * Encuentra un cliente en la tabla cliente
     *
     * @return el valor del id del clienteen caso de exito
     */
    public String findCustomer();

    /**
     * Funcion que guardar un componente en la base de datos
     *
     * @param component es el objeto de tipo Componente que se guarda
     * @return el Id del componente del cual se ha gardado
     */
    public String saveComponent(Component component);

    /**
     * Funcion que encuentra un componente en especifico en la tabla Componente
     *
     * @param id_component es el identificador o id del componente.
     * @return el objeto componente encontrado o null de lo contrario.
     */
    public Component finComponent(String id_component);

    /**
     * Funcion que guarda en una lista todos los componentes registrados de la
     * tabla Component.
     *
     * @return una cadena de exito o fallo al invocar el JSon del la lista de
     * componentes.
     */
    public String listarComponentes();

    /**
     * Funcion que guarda en una lista todos los restaurnates registrados de la
     * tabla Restaurant.
     *
     * @return una cadena de exito o fallo al invocar el JSon del la lista de
     * Component.
     */
    public String listarRestaurantes();

    /**
     * Realiza la actualizacion de un plato ejecutivo en la tabla almuerzoejedia
     *
     * @param IDplatoEJ id del plato ejecutivo
     * @param ResNIT id del restaurante al cual pertenece el plato.
     * @param diaSemana dia de la semana.
     * @param AlmEjeDia_comp1 componente de tipo entrada
     * @param AlmEjeDia_comp2 componente de tipo princicpio
     * @param AlmEjeDia_comp3 componente de tipo proteina
     * @param AlmEjeDia_comp4 componente de tipo bebida.
     * @param precio es costo del plato.
     * @return mensaje de fallo o exito de la actualizacion.
     */
    public String updatePlatoEjecutivo(String IDplatoEJ, String ResNIT, String diaSemana, String AlmEjeDia_comp1, String AlmEjeDia_comp2, String AlmEjeDia_comp3, String AlmEjeDia_comp4, String precio);

    /**
     * Lista los almuerzos ejecutivos del dia
     *
     * @return mensaje de fallo o exito.
     */
    public String listarAlmuerzoEjeDia();
    
   /**
    * Realiza el guardado de un peddo en la base de datos
    * @param pedido pedido que se va a guardar
    * @param id_PlaEjeDia identificador de un plato ejecutivo, esta se usa para armar un pedido
    *                     debido a que en el Json solo viene un identificador del plato ejecutvio
    *                     pero se necesita es un objeto PLatoEjecutivo y es por ellos que se usa 
    *                     este id para consultar la base de datos y guardar ese objeto que conforma
    *                     un pedido
    * @return id, el identificador del pedido que se guardo, o error en caso d fallo
    */
    public String savePedido(Pedido pedido, int id_PlaEjeDia);
    
    /**
     * Lista los pedidos almacenados en la base de datos
     * @return mensaje de fallo o exito.
     */
    public String listarPedido();
    
    /**
     * Consulta en la base de datos un pedido en especifico
     * @param id_pedido identifacador del pedido que se busca
     * @return objeto de tipo pedido
     */   
    public Pedido finPedido(String id_pedido);

}
