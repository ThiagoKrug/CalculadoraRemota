package calculadoraremota;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/**
 *
 * @author thiago
 */
public class ArrancaServidor {
    final static String HOST_URL = "rmi://127.0.0.1/ServidorMat";

    public static void main(String argv[]) {
        try {
            System.out.println("Arrancando servidor...");
            //Naming.rebind("ServidorMat_1", new ServidorMat());
            LocateRegistry.createRegistry(Registry.REGISTRY_PORT);
            Naming.rebind(HOST_URL, new ServidorMat());
        } catch (Exception e) {
            System.out.println("Ocorreu um problema no arranque do servidor.\n" + e.toString());
        }
    }
}