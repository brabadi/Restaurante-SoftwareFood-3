/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import co.unicauca.microkernel.client.access.ClientAccessSocket;
import co.unicauca.microkernel.client.access.IClientAccess;
import co.unicauca.microkernel.client.domain.ClientService;
import co.unicauca.microkernel.common.entities.Component;
import co.unicauca.microkernel.common.entities.ComponentType;
import co.unicauca.microkernel.common.entities.Customer;
import co.unicauca.microkernel.common.entities.DiaEnum;
import co.unicauca.microkernel.common.entities.PedEstado;
import co.unicauca.microkernel.common.entities.Pedido;
import co.unicauca.microkernel.common.entities.PlatoEjecutivo;
import co.unicauca.microkernel.common.entities.Restaurant;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.swing.JOptionPane;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author juan jose
 */
public class RestauranteTest {

    public RestauranteTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test que solicita el servicio de listar los componenetes registrados, en
     * caso de que el tamaño de la lista que contiene los componenetes es cero
     * entonces el metodo no pasa la prueba
     *
     * @throws Exception
     */
    @Test
    public void testListarComponentes() throws Exception {

        Boolean encontrado = false;

        IClientAccess service = new ClientAccessSocket();
        ClientService cliente = new ClientService(service);

        List<Component> componentes = cliente.listarComponents();
        if (componentes.size() > 0) {
            encontrado = true;
        }
        assertEquals(true, encontrado);
    }

    /**
     * Test que solicita el servicio de listar los restaurantes de la ciudad, en
     * caso de que el tamaño de la lista que contiene los restaurantes es cero
     * entonces el metodo no pasa la prueba
     *
     * @throws Exception
     */
    @Test
    public void testListarRestarants() throws Exception {

        Boolean encontrado = false;

        IClientAccess service = new ClientAccessSocket();
        ClientService cliente = new ClientService(service);

        List<Restaurant> restaurants = cliente.listarRestaurants();
        if (restaurants.size() > 0) {
            encontrado = true;
        }
        assertEquals(true, encontrado);
    }

    /**
     * Test de Guardar un nuevo componente, se crea un objeto de tipo componente
     * con los respectivos valores de sus atributos y se envia por medio de los
     * servicios de los sockets, donde retornara el id del componente en caso de
     * enviado se encuentre en la base de datos la prueba se ejecutara. Se debe
     * eliminar manualmente el componente que se inserta en esta prueba para que
     * funcione ya que no se ha implementado el metodo de eliminar componente
     */
    @Test
    public void testAgregarComponente() throws Exception {

        String id;
        String nombre;
        String tipo;
        Boolean encontrado = false;

        id = "100";
        nombre = "prueba";
        tipo = "ENTRADA";
        File ruta = new File("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQXrltdz-_5wXAgnaRcILKZhG37qA0jhukoyw&usqp=CAU");
        byte[] foto = new byte[(int) ruta.length()];
        IClientAccess service = new ClientAccessSocket();
        ClientService cliente = new ClientService(service);

        Component component = new Component(id, nombre, ComponentType.valueOf(tipo), foto);

        try {
            String resultComponent = service.saveComponent(component);

        } catch (Exception e) {
            System.out.println("El Componente Ingresado ya esta registrado" + e.getMessage());
        }

        List<Component> componentes = cliente.listarComponents();
        if (componentes.size() > 0) {
            for (Component ls : componentes) {
                if (String.valueOf(ls.getCompID()).equals(id)) {
                    encontrado = true;
                }
            }
        }
        assertEquals(true, encontrado);
    }

    /**
     * Test de actualizar unplato ejecutivo Se crea un objeto de tipo plato
     * ejecutivo con los respectivos valores del objeto, el metodo de la app
     * retorna un boolean en caso de true entonces se actualiza correctamente el
     * plato ejecutivo en caso contrario no y la prueba ejecutiva no pasa.
     *
     * @throws Exception
     */
    @Test
    public void testUpdatePlato() throws Exception {

        Boolean encontrado = false;

        IClientAccess service = new ClientAccessSocket();
        ClientService cliente = new ClientService(service);

        encontrado = cliente.updateAlmuerzoEjecutivoDia("102", "1001", "JUEVES", "5", "6", "7", "8", "6000");

        assertEquals(true, encontrado);
    }

    /**
     * Test que solicita el servicio de listar los almuerzos ejecutivos del dia,
     * en caso de que el tamaño de la lista que contiene los almuerzos
     * ejecutivos es cero entonces el metodo no pasa la prueba
     *
     * @throws Exception
     */
    @Test
    public void testlistarAlmuerzoEjeDia() throws Exception {

        Boolean encontrado = false;

        IClientAccess service = new ClientAccessSocket();
        ClientService cliente = new ClientService(service);

        List<PlatoEjecutivo> platosEjecutivos = cliente.listarAlmuerzoEjeDia();
        if (platosEjecutivos.size() > 0) {
            encontrado = true;
        }
        assertEquals(true, encontrado);
    }

    /**
     * Test de prueba del metodo de la interfaz IclienteAcces se compara un id
     * ya registrado en la base de datos con el valor devuelto por metodo que
     * solicita el servicio por medio de los sockets al servidor.
     *
     * @throws Exception
     */
    @Test
    public void testFindCustomer() throws Exception {

        int encontrar = 12345670;
        int encontrado = 0;

        IClientAccess service = new ClientAccessSocket();
        ClientService cliente = new ClientService(service);

        List<Customer> cus = new ArrayList<Customer>();
        cus = cliente.findCustomer();
        if (cus.size() > 0) {
            for (Iterator<Customer> iterator = cus.iterator(); iterator.hasNext();) {
                Customer next = iterator.next();
                // System.out.println(next.getCus_id() + " - " + next.getCus_nombre());

                if (next.getCus_id() == 12345670) {
                    encontrado = next.getCus_id();

                }
            }
        }
        assertEquals(encontrar, encontrado);
    }

    /**
     * Test de Guardar un nuevo pedido, se crea un objeto de tipo pedido con los
     * respectivos valores de sus atributos y se envia por medio de los
     * servicios de los sockets, donde retornara el id del pedido o mensaje de
     * error si hubo fallos. Se compara el id del pedido guardado, con el id
     * sacado de la base de datos en caso de ser iguales la prueba se ejecutara
     * de forma correcta.
     *
     * @throws Exception
     */
    
    @Test
    public void testGuardarPedido() throws Exception {

        IClientAccess service = new ClientAccessSocket();
        ClientService servicioRestaurante = new ClientService(service);

        PlatoEjecutivo plato = servicioRestaurante.listarAlmuerzoEjeDia().get(0);
        System.out.println("Plato: " + plato.getIDplatoEJ());
        String result = "";
        List<Pedido> lsPedido = servicioRestaurante.listarPedido();
        System.out.println("Tamnio de la lista: " + lsPedido.size());
        int ultimoId = lsPedido.get(lsPedido.size() - 1).getPed_Id() + 1;
        System.out.println("Ulitmo Id: " + ultimoId);
        String resultGuardado = "";

        Pedido pedido = new Pedido(ultimoId, 12345670, 1000, plato, 2, "2/10/2021", "4:43 pm", PedEstado.CREADO, 50000);
        System.out.println("Id pedido: " + pedido.getPed_Id());
        try {
            result = servicioRestaurante.savePedido(pedido);
            System.out.println("Pedido test guardado: " + result);

        } catch (Exception e) {
            System.out.println("Ocurrio un error al guardar el pedido Test");
        }
        System.out.println("Valor de result: " + result);
        List<Pedido> lsPedidoActualizado = servicioRestaurante.listarPedido();
        boolean encontrado = false;
        if (lsPedidoActualizado.size() > 0) {
            for (Pedido ls : lsPedidoActualizado) {
                if (ls.getPed_Id() == ultimoId) {
                    encontrado = true;
                }
            }
        }
        assertEquals(true, encontrado);
    }

    /**
     * Test que solicita el servicio de listar todos los pedidos,
     * en caso de que el tamaño de la lista que contiene los pedidos es
     * cero entonces el metodo no pasa la prueba
     *
     * @throws Exception
     */
    
    @Test
    public void testListarPedidos() throws Exception {

        Boolean encontrado = false;

        IClientAccess service = new ClientAccessSocket();
        ClientService cliente = new ClientService(service);

        List<Pedido> pedidos = cliente.listarPedido();
        if (pedidos.size() > 0) {
            encontrado = true;
        }
        assertEquals(true, encontrado);
    }

}
