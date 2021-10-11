
package co.unicauca.microkernel.server.domain.server;



import co.unicauca.microkernel.common.entities.Component;
import co.unicauca.microkernel.common.entities.Pedido;
import co.unicauca.microkernel.common.infra.JsonError;
import co.unicauca.microkernel.server.access.IRestaurantRepository;
import com.google.gson.Gson;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author braia
 */
public class RestaurantService {

    /**
     * repositorio de restaurante, via de comunicacion a bajo nivel
     */
    IRestaurantRepository repositorio;

    /**
     * constructor parametrizado que hace inyeccion de dependencias
     *
     * @param repositorio repositorio a la base de datos, tipo IPlatoRepositorio
     */
    public RestaurantService(IRestaurantRepository repositorio) {
        this.repositorio = repositorio;
    }
    
    
    /**
     * Recibe un componente, enviando la solicitud a la capa de bajo nivel para guardar 
     * un Componente en la base datos llegado por parametro.
     * 
     * @param id_component identifiacdor del componente
     * @return devuelve el identifiacdor del componente en  caso de exito o error en caso contrario.
     */  
    public String saveComponent(Component component){
         List<JsonError> errors = new ArrayList<>();
  
        // Validaciones y reglas de negocio
        if (component.getCompID().isEmpty() || component.getCompNombre().isEmpty()
                || String.valueOf(component.getCompTipo()).isEmpty()) {
           errors.add(new JsonError("400", "BAD_REQUEST","id, nombres componente y el tipo de componeente son obligatorio "));
        }
         
        // Que no esté repetido
         Component resultComponent = this.findComponent(component.getCompID());
        if (resultComponent != null){
            errors.add(new JsonError("400", "BAD_REQUEST"," El componente ya esta registrado. "));
        }
        
       if (!errors.isEmpty()) {
            Gson gson = new Gson();
            String errorsJson = gson.toJson(errors);
            return errorsJson;
        }             
       return repositorio.saveComponent(component);
    }
    
    /**
     * Encuentra un componente enviando la solicitud a la capa de bajo nivel consultando
     * en la base datos.
     * 
     * @param id_component identifiacdor del componente
     * @return devuelve el componente si lo encuentra o nulo en caso contrario
     */    
    public Component findComponent(String id_component){
        return repositorio.finComponent(id_component);
    }
    
    /**
     * lista los componentes guardados,  envia la solicitud a la capa de
     * bajo nivel para consultar y sacar los componentes existentes en la base de datos.
     *
     * @return string de confirmacion de listado exitoso o Fallo en caso contrario.
     */
    public String listarComponents(){
        return repositorio.listarComponentes();
    }
    
    /**
     * lista los restaurantes guardados  enviando la solicitud a la capa de
     * bajo nivel para consultar y sacar los retaurantes existentes en la base de datos.
     *
     * @return string de confirmacion de listado exitoso o Fallo en caso contrario.
     */
    public String listarRestaurantes(){
        return repositorio.listarRestaurantes();
    }
    
    /**
     * lista los Clientes guardados  enviando la solicitud a la capa de
     * bajo nivel para consultar y sacar los cliente existentes en la base de datos.
     *
     * @return string de confirmacion de listado exitoso o Fallo en caso contrario.
     */
    public String findCustomer() {
        return repositorio.findCustomer();
    }
    
    /**
     * Actualzia un platoEjcutivo en la base de datos
     *
     * @param IDplatoEJ id del plato ejecutivo
     * @param ResNIT id del restaurante al cual pertenece el plato.
     * @param diaSemana dia de la semana.
     * @param AlmEjeDia_comp1 componente de tipo entrada
     * @param AlmEjeDia_comp2 componente de tipo princicpio
     * @param AlmEjeDia_comp3 componente de tipo proteina
     * @param AlmEjeDia_comp4 componente de tipo bebida.
     * @param precio es costo del plato.
     * @return mensaje de error o exito en caso contrario.
     */
    public String updatePlatoEjecutivo( String  IDplatoEJ, String  ResNIT,  String  diaSemana,  String  AlmEjeDia_comp1,  String  AlmEjeDia_comp2,  String  AlmEjeDia_comp3,String  AlmEjeDia_comp4,  String  precio) {
        //hacer validaciones, conversion del valor
        return repositorio.updatePlatoEjecutivo(IDplatoEJ,ResNIT,diaSemana, AlmEjeDia_comp1,AlmEjeDia_comp2, AlmEjeDia_comp3,AlmEjeDia_comp4,precio);
    }
    
    /**
     * lista los platosEjecutivos guardados  enviando la solicitud a la capa de
     * bajo nivel para consultar y sacar los platos ejecutivos existentes en la base de datos.
     *
     * @return string de confirmacion de listado exitoso o Fallo en caso contrario.
     */
    public String listarAlmuerzoEjeDia(){
        return repositorio.listarAlmuerzoEjeDia();
    }
    
    

    /**
     * Recibe un pedido, enviando la solicitud a la capa de bajo nivel para guardar 
     * el en la base datos llegado por parametro.
     * @param pedido objeto a guardar
     * @param id_PlaEjeDia identificador del plato ejecutivo que compone el pedido
     * @return identificador del pedido o mensaje de fallo en caso contrario
     */
    public String savePedido(Pedido pedido, int id_PlaEjeDia ){
       List<JsonError> errors = new ArrayList<>();
  
        // Validaciones y reglas de negocio
        if (String.valueOf(pedido.getPed_Id()).isEmpty() || pedido.getPed_Cantidad() < 1){ 
            errors.add(new JsonError("400", "BAD_REQUEST","id y cantidad son obligatorias "));
        }
         
        // Que no esté repetido
         Pedido resultPedido = this.findPedido(String.valueOf(pedido.getPed_Id()));
        if (resultPedido != null){
            errors.add(new JsonError("400", "BAD_REQUEST"," El Pedido ya esta registrado. "));
        }
        
       if (!errors.isEmpty()) {
            Gson gson = new Gson();
            String errorsJson = gson.toJson(errors);
            return errorsJson;
        }        
       return repositorio.savePedido(pedido, id_PlaEjeDia);
    }
    
     /**
     * Encuentra un pedido enviando la solicitud a la capa de bajo nivel que consulta
     * en la base datos.
     * 
     * @param id_pedido identifiacdor del pedido
     * @return devuelve el pedido si lo encuentra o nulo en caso contrario
     */  
    public Pedido findPedido(String id_pedido){
        return repositorio.finPedido(id_pedido);
    }
    
     /**
     * lista los pedido guardados,  enviando la solicitud a la capa de
     * bajo nivel para consultar y sacar los pedidos existentes en la base de datos.
     *
     * @return string de confirmacion de listado exitoso o Fallo en caso contrario.
     */
    public String listarPedido(){
        return repositorio.listarPedido();
    }
    
  
}
