package calculadoraremota;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import org.apache.log4j.Logger;

/**
 * Classe Servidor 
 * @author Rafhael Cunha, Matheus Dal Forno, Thiago Krug, Bruno Vicelli
 */
public class Servidor {
    
    public static Logger logger = Logger.getLogger(Servidor.class);

    public final static String HOST_URL = "rmi://127.0.0.1/Operacoes";

    public void iniciar() {
        try {
            logger.info("Iniciando Servidor...");
            logger.info("Registrando serviço...");
            LocateRegistry.createRegistry(Registry.REGISTRY_PORT);
            logger.info("Vinculando objeto...");
            Naming.rebind(HOST_URL, new Operacoes());
        } catch (MalformedURLException | RemoteException e) {
            logger.fatal("Ocorreu um problema ao iniciar o Servidor!", e);
        }
    }
}