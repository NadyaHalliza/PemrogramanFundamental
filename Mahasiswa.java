package latihanmethod;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.time.Period;

public class Mahasiswa extends JFrame {
    private JTextField tfNama;
    private JComboBox Tanggal;
    private JComboBox Bulan;
    private JComboBox Tahun;
    private JTextArea taAlamat;
    private JButton Submit;
    private JTextArea textAreaNama;
    private JTextArea textAreaTL;
    private JTextArea textAreaAlamat;
    private JTextArea textAreaUsia;
    private JPanel panel;

    public Mahasiswa() {
        this.setContentPane(panel);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.pack();

        Submit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String Nama = tfNama.getText();
                int tlTanggal = Integer.parseInt((String) Tanggal.getSelectedItem());
                int tlBulan = Bulan.getSelectedIndex() + 1;
                int tlTahun = Integer.parseInt((String) Tahun.getSelectedItem());
                String Alamat = taAlamat.getText();

                textAreaNama.setText("Nama :" + " " + Nama);
                textAreaTL.setText("Tanggal Lahir :" + " " + tlTanggal + " " + Bulan.getSelectedItem() + " " + tlTahun);
                textAreaAlamat.setText("Alamat :" + " " + Alamat);

                LocalDate birthdate = LocalDate.of(tlTahun, tlBulan, tlTanggal);
                LocalDate currentDate = LocalDate.now();
                Period period = Period.between(birthdate, currentDate);

                int years = period.getYears();
                int months = period.getMonths();
                int days = period.getDays();

                textAreaUsia.setText("Usia          :" + " " + years + " tahun, " + months + " bulan, " + days + " hari");
            }
        });
    }

    public static void main(String[] args) {
        Mahasiswa Mahasiswa = new Mahasiswa();
        Mahasiswa.setVisible(true);
    }
}
