/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tuan2;

/**
 *
 * @author Administrator
 */
public class NhanVien {

    String Manv;
    String HoTen;
    String NgayLV;
    String NamSinh;
    String PhongBan;

    public NhanVien() {
    }

    public NhanVien(String Manv, String HoTen, String NgayLV, String NamSinh, String PhongBan) {
        this.Manv = Manv;
        this.HoTen = HoTen;
        this.NgayLV = NgayLV;
        this.NamSinh = NamSinh;
        this.PhongBan = PhongBan;
    }

    public String getManv() {
        return Manv;
    }

    public String getHoTen() {
        return HoTen;
    }

    public String getNgayLV() {
        return NgayLV;
    }

    public String getNamSinh() {
        return NamSinh;
    }

    public String getPhongBan() {
        return PhongBan;
    }

}
