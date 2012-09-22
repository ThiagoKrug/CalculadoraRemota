package calculadoraremota;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import org.apache.log4j.Logger;
import rmi.IOperacoes;

/**
 * Classe Operaçoes
 * @author Rafhael Cunha, Matheus Dal Forno, Thiago Krug, Bruno Vicelli
 */
public class Operacoes extends UnicastRemoteObject implements IOperacoes {
    
    public static Logger logger = Logger.getLogger(Operacoes.class);

    /**
     * Método Construtor
     * @throws RemoteException 
     */
    public Operacoes() throws RemoteException {
        logger.info("Objeto de Operações vinculado");
    }

    @Override
    /**
     * Método soma
     * @param a
     * @param b
     * @return soma de a por b.
     * @throws RemoteException 
     */
    public double soma(double a, double b) throws RemoteException {
        return a + b;
    }

    @Override
    /**
     * Método subtrai
     * @param a
     * @param b
     * @return subtração de a por b.
     * @throws RemoteException 
     */
    public double subtrai(double a, double b) throws RemoteException {
        return a - b;
    }

    @Override
    /**
     * Método multiplica
     * @param a
     * @param b
     * @return mutiplicação de a por b.
     * @throws RemoteException 
     */
    public double multiplica(double a, double b) throws RemoteException {
        return a * b;
    }

    @Override
    /**
     * Método divide
     * @param a
     * @param b
     * @return divisão de a por b.
     * @throws RemoteException 
     */
    public double divide(double a, double b) throws RemoteException {
        return a / b;
    }
}
