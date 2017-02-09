package atm;

import javax.swing.JOptionPane;

/**
 *
 * @author faizaaulia
 */
public class setor {
    private int saldo;
    public void menabung (int tab, int s)
    {
        if(s%100!=0)
            JOptionPane.showMessageDialog(null, "Mesin ATM BRI tidak menerima uang koin \n Silahkan Ulangi Kembali !", "Transaksi Gagal",0);
        else if(s<50000)
            JOptionPane.showMessageDialog(null, "Besaran minimal setor tunai adalah Rp.50.000,00", "ERROR",0);
        else if(s>=50000)
            saldo = tab+s;
            JOptionPane.showMessageDialog(null, "Saldo anda saat ini sebesar : " + saldo);
    }

    public int getsaldo(){
        return saldo;
    }
}
