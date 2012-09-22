package calculadoraremota;

import org.apache.log4j.Logger;

/**
 *
 * @author Rafhael Cunha, Matheus Dal Forno, Thiago Krug, Bruno Vicelli
 */
public class Main {
    
    public static Logger logger = Logger.getLogger(Main.class);

    public static void main(String argv[]) {
        Servidor s = new Servidor();
        s.iniciar();
    }
}
