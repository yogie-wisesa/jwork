/**
 * @author Yogie Wisesa
 * @version 24/6/21
 * 
 * class fee calculator untuk menghitung total fee dengan threading
 */
package yogiewisesa.jwork;
import java.util.ArrayList;

public class FeeCalculator implements Runnable{

    /**
     * method run untuk menjalankan fungsi penghitungan
     */
    public void run(){
        ArrayList<Invoice> list = DatabaseInvoice.getInvoiceDatabase();
        for (Invoice i : list){
            System.out.println("calculating invoice id: "+ i.getId());
            i.setTotalFee();
            System.out.println("finished calculating invoice id: "+ i.getId());
        }
    }
}
