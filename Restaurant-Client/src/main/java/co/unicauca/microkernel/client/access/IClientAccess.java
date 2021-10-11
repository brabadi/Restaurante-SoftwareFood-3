/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.unicauca.microkernel.client.access;

import co.unicauca.microkernel.common.entities.Component;
import co.unicauca.microkernel.common.entities.Customer;
import co.unicauca.microkernel.common.entities.Pedido;
import co.unicauca.microkernel.common.entities.PlatoEjecutivo;
import co.unicauca.microkernel.common.entities.Restaurant;
import java.util.List;


/**
 *
 * @author braia
 * Se usa IClienteAccess para hacer solicitudes al servidor el cual
 * trabajara la base de datos.
 */

public interface IClientAccess {

    /**
     * El administrador solicita registrar un componente el cual sera enviado a
     * la aplicacion Restaurant-Server
     *
     * @param component componente que se quiere se envia para el almacenamiento
     * @return el identificador del componente que se guardo o FALLO en caso
     * contrario.
     * @throws Exception
     */
    public String saveComponent(Component component) throws Exception;

    /**
     * El cliente solicita un componente especifico.
     *
     * @param id_component identifiacdor del componente del cual se solicita
     * @return un objeto Component.
     * @throws Exception
     */
    public Component findComponent(String id_component) throws Exception;

    /**
     * El administrador solicita listar todos los componentes registrados en su
     * restaurante.
     *
     * @return lista de componentes
     * @throws Exception
     */
    public List<Component> listarComponents() throws Exception;

    /**
     * EL cliente(comprador) solicita listar todos los restaurantes disponibles
     * en la aplicacion
     *
     * @return lista de restaurantes
     * @throws Exception
     */
    public List<Restaurant> listarRestaurants() throws Exception;

    /**
     * Se solicita la encontrar un cliente para validar su login administrador o
     * comprador
     *
     * @return lista de clientes
     * @throws Exception
     */
    public List<Customer> findCustomer() throws Exception;

    /**
     * El administrador solcita actualizar un plato ejecutivo
     *
     * @param IDplatoEJ id del plato ejecutivo
     * @param ResNIT id del restaurante al cual pertenece el plato
     * @param diaSemana dia de la semana en el que se brinda el plato
     * @param entrada componente entrada
     * @param principio componente principio
     * @param proteina componente proteina
     * @param bebida componente bebida
     * @param precio costo del plato ejecutivo
     * @return true o false deacuerddo al exito de actuazlizacion.
     * @throws Exception
     */
    public boolean updateAlmuerzoEjecutivoDia(String IDplatoEJ, String ResNIT, String diaSemana, String entrada, String principio, String proteina, String bebida, String precio) throws Exception;

    /**
     * El cliente solicita listar el almuerzo ejecutivo del dia
     *
     * @return una lista de los platos ejecutivos.
     * @throws Exception
     */
    public List<PlatoEjecutivo> listarAlmuerzoEjeDia() throws Exception;
    
    /**
     * El cliente solicita guardar un pedido
     * @param pedido objeto pedido que el cliente solicita guardar
     * @return identifiacador del pedido gurdado, o mensaje de fallo en caso contrario
     * @throws Exception 
     */
    public String savePedido(Pedido pedido) throws Exception;
    
    /**
     * Listar El administrador solicita listar los pedidos registrados a su restaurante
     * @return lista de pedidos
     * @throws Exception 
     */
    public List<Pedido> listarPedido() throws Exception;
}
