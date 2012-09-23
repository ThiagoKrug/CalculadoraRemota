package calculadoraremota;

import org.apache.log4j.Logger;

/**
 * Inicia o servidor
 *
 * @author Bruno Vicelli
 * @author Matheus Dal Forno
 * @author Rafhael Rodrigues Cunha
 * @author Thiago Cassio Krug
 */
public class Main {

    public static Logger logger = Logger.getLogger(Main.class);

    public static void main(String argv[]) {
        Servidor s = new Servidor();
        s.iniciar();
    }
}
