package calculadoraremota;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import org.apache.log4j.Logger;
import rmi.IOperacoes;

/**
 *
 * @author thiago
 */
public class Operacoes extends UnicastRemoteObject implements IOperacoes {
    
    public static Logger logger = Logger.getLogger(Operacoes.class);

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
