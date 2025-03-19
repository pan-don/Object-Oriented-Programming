package Guided;
import Guided.HargaBuku.ClassHarga;
import Guided.HargaToken.ClassToken;

/**
 *
 * @author AfanRamadhan
 */
public class TestPackage {

    public static void main(String args[]) {
        ClassHarga harga = new ClassHarga();
        ClassToken token = new ClassToken();
        
        harga.info();
        token.info();
    }
}
