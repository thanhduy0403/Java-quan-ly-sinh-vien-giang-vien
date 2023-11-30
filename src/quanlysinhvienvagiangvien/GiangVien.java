/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlysinhvienvagiangvien;

import java.util.Date;

/**
 *
 * @author Administrator
 */
public class GiangVien extends ThanhVien{
    int soBaiBao,soDeTai;

    public GiangVien() {
    }

    public GiangVien(String ma, String ten, String namHoc, Date ngaySinh) {
        super(ma, ten, namHoc, ngaySinh);
    }

    public int getSoBaiBao() {
        return soBaiBao;
    }

    public void setSoBaiBao(int soBaiBao) {
        this.soBaiBao = soBaiBao;
    }

    public int getSoDeTai() {
        return soDeTai;
    }

    public void setSoDeTai(int soDeTai) {
        this.soDeTai = soDeTai;
    }
    
    @Override
    public double tinhThuong(){
        return soBaiBao*1000000+ soDeTai* 2000000;
    }
}
