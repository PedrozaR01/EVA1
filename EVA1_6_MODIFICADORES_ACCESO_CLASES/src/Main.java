
import OtroPaquete.Main2;

//Demostración de niveles de acceso
// public private protected default

/**
 *
 * @author Roberto Antonio Pedroza Fernández
 */
public class Main {
    public int VarPub = 10;
    private int VarPriv = 20;
    protected int VarPro = 50;
    int VarDef = 100;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Main Principal = new Main();
        System.out.println(Principal.VarPub);
        System.out.println(Principal.VarPriv);
        System.out.println(Principal.VarPro);
        System.out.println(Principal.VarDef);
        
        Default Defe = new Default();
        System.out.println(Defe.VarPub);
        System.out.println(Defe.VarPro);
        System.out.println(Defe.VarDef);
        
        Secondary Sec = new Secondary();
        System.out.println(Sec.VarPub);
        System.out.println(Sec.VarPro);
        System.out.println(Sec.VarDef);
        
        DefaultSecond DeSe = new DefaultSecond();
        System.out.println(DeSe.VarPub);
        System.out.println(DeSe.VarPro);
        System.out.println(DeSe.VarDef);
        
        Main2 M2 = new Main2();
        System.out.println(M2.VarPub);
        
        DefaultSecond D2 = new DefaultSecond();
    }
    
}
class Default {
    public int VarPub = 10;
    private int VarPriv = 20;
    protected int VarPro = 50;
    int VarDef = 100;

}
