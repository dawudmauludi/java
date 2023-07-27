/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
    package latihandasar;
    import javax.swing.JOptionPane;
/**
 *
 * @author RPL
 */
public class LatihanDasar {
    public static void main(String[] args) {
        System.out.print("Penambahan Sederhana");
        int angkaSatu = Integer.valueOf(JOptionPane.showInputDialog(null, "Masukan Angka Pertama","Angka Ke-1",1));
        int angkaDua = Integer.valueOf(JOptionPane.showInputDialog(null, "Masukan Angka Kedua","Angka Ke-2",1));
    
    int Jumlah = angkaSatu + angkaDua;
    System.out.println("Angka Ke-1:" + angkaSatu);
    System.out.println("Angka Ke-2:" + angkaDua);
    System.out.println("Jumlah angka Ke-1 dan Angka Ke-2:" + Jumlah);
    
    }
}
