/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tuan2;

/**
 *
 * @author Administrator
 */
public class KhachHang {

    String MaKH;
    String HoTen;
    String SDT;
    String Email;

    public KhachHang() {
    }

    public KhachHang(String MaKH, String HoTen, String SDT, String Email) {
        this.MaKH = MaKH;
        this.HoTen = HoTen;
        this.SDT = SDT;
        this.Email = Email;
    }

    public String getMaKH() {
        return MaKH;
    }

    public String getHoTen() {
        return HoTen;
    }

    public String getSDT() {
        return SDT;
    }

    public String getEmail() {
        return Email;
    }

}
