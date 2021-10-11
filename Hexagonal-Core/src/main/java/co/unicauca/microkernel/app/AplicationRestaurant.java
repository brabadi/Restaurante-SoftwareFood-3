
package co.unicauca.microkernel.app;

//
import co.unicauca.microkernel.common.entities.PedEstado;
import co.unicauca.microkernel.common.entities.Pedido;
import co.unicauca.microkernel.common.entities.PlatoEjecutivo;
import co.unicauca.microkernel.server.access.FactoryRepository;
import co.unicauca.microkernel.server.access.IRestaurantRepository;
import co.unicauca.microkernel.server.domain.server.RestaurantService;
//

import co.unicauca.microkernel.server.infra.RestaurantServerSocket;

/**
 *
 * @author braia
 */
public class AplicationRestaurant {

    /**
     * En la funcion main se crea el socket.
     * 
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        
        RestaurantServerSocket server = new RestaurantServerSocket();

        server.start(); 
//        final RestaurantService service;
//        IRestaurantRepository repository = FactoryRepository.getInstance().getRepository();
//        service = new RestaurantService(repository);
               
//        Pedido pedido = new Pedido(200, 12345670, 1000, null, 2, "2/10/2021", "4:43 pm", PedEstado.CREADO, 50000);                  
//        service.savePedido(pedido, 101);
//        repository.savePedido(pedido, 101);
        
    }
}
