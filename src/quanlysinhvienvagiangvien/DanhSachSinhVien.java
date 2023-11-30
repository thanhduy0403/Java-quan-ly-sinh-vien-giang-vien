/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlysinhvienvagiangvien;

import java.io.BufferedReader;
import java.io.FileReader;
import java.nio.Buffer;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Administrator
 */
public class DanhSachSinhVien {

    ArrayList<ThanhVien> arr = new ArrayList<>();

    // them vao danh sach
    public void themVaoDS(ThanhVien tv) {
        arr.add(tv);
    }
    
    //xoa theo ma
    public boolean xoaTheoMa(String ma) {
        for (ThanhVien tv : arr) {
            if (tv.getMa().equalsIgnoreCase(ma)) {
                arr.remove(tv);
                return true;
            }
        }
        return false;
    }
    
    // tim kiem theo ma 
    public ThanhVien timKiem(String ma ){
        for (ThanhVien tv : arr){
            if(tv.getMa().equalsIgnoreCase(ma)){
                return tv;
            }
        }
        return null;
    }
    // lay danh sach luong max
    public double luongMax(){
        double max = 0;
        for (ThanhVien tv : arr){
            if(tv.tinhThuong()> max){
                max = tv.tinhThuong();
            }
        }
        return max;
    }
    public ArrayList<ThanhVien> layDSLuongMax(){
        ArrayList <ThanhVien> b = new ArrayList<>();
            for(ThanhVien tv :arr){
                if(tv.tinhThuong() == luongMax()){
                    b.add(tv);
                }
            }
        return b;
    }
  
    // doc file
    public void docFile(String tenFile){
        try {
            FileReader fr =  new FileReader(tenFile);
            BufferedReader br =  new BufferedReader(fr);
            String line = "";
            while (true) {                
                line = br.readLine();
                if(line == null){
                    break;
                }
                String s [] = line.split(",");
                String ma = s[1];
                String ten = s[2];
                String namHoc = s[3];
                Date  ngaySinh = ThanhVien.chuyenChuoiThanhNgay(s[4]);
                if(s[0].equalsIgnoreCase("1")){
                    float diemTB = Float.parseFloat(s[5]);
                    SinhVien sv  = new SinhVien(ma, ten, namHoc, ngaySinh);
                    themVaoDS(sv);
                }else {
                    int soBaiBao =Integer.parseInt(s[6]);
                    int soDeTai = Integer.parseInt(s[7]);
                    GiangVien gv = new GiangVien(ma, ten, namHoc, ngaySinh);
                    themVaoDS(gv);
                }
            }
            br.close(); fr.close();
        } catch (Exception e) {
        }
    }
    
}
