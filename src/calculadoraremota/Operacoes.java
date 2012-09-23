package calculadoraremota;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import org.apache.log4j.Logger;
import rmi.IOperacoes;

/**
 * Classe que implementa os métodos da interface {@link IOperacoes}. É a
 * responsável pelos cálculos vindos do cliente.
 *
 * @author Bruno Vicelli
 * @author Matheus Dal Forno
 * @author Rafhael Rodrigues Cunha
 * @author Thiago Cassio Krug
 */
public class Operacoes extends UnicastRemoteObject implements IOperacoes {

    public static Logger logger = Logger.getLogger(Operacoes.class);

    /**
     * Método construtor
     *
     * @throws RemoteException
     */
    public Operacoes() throws RemoteException {
        logger.info("Objeto de Operações vinculado");
    }

    @Override
    public double soma(double a, double b) throws RemoteException {
        return a + b;
    }

    @Override
    public double subtrai(double a, double b) throws RemoteException {
        return a - b;
    }

    @Override
    public double multiplica(double a, double b) throws RemoteException {
        return a * b;
    }

    @Override
    public double divide(double a, double b) throws RemoteException {
        return a / b;
    }
}
