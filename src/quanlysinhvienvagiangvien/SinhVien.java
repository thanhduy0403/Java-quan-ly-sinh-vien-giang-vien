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
public class SinhVien extends ThanhVien{
    float diemTB;

    public SinhVien() {
    }

    public SinhVien(String ma, String ten, String namHoc, Date ngaySinh) {
        super(ma, ten, namHoc, ngaySinh);
    }

   

    public float getDiemTB() {
        return diemTB;
    }

    public void setDiemTB(float diemTB) {
        this.diemTB = diemTB;
    }
    
    @Override
    public double tinhThuong(){
        if(diemTB >= 9 ){
            return 5000000;
        }else if(diemTB <=8 || diemTB < 9){
            return 3000000;
        }
        return 0;
    }
}
