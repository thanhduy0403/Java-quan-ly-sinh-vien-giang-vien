/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlysinhvienvagiangvien;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Administrator
 */
public abstract class ThanhVien implements IThanhVien{
    String ma,ten,namHoc;
    Date ngaySinh;

    public ThanhVien() {
    }

    public ThanhVien(String ma, String ten, String namHoc, Date ngaySinh) {
        this.ma = ma;
        this.ten = ten;
        this.namHoc = namHoc;
        this.ngaySinh = ngaySinh;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getNamHoc() {
        return namHoc;
    }

    public void setNamHoc(String namHoc) {
        this.namHoc = namHoc;
    }

    public Date getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    @Override
    public String toString() {
        return "ThanhVien{" + "ma=" + ma + ", ten=" + ten + ", namHoc=" + namHoc + ", ngaySinh=" + ngaySinh + '}';
    }

    @Override
    public double tinhThuong() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public static Date chuyenChuoiThanhNgay(String str){
        try {
            return new SimpleDateFormat("dd/MM/yyyy").parse(str);
        } catch (Exception e) {
        }
        return null;
    }
    
}
