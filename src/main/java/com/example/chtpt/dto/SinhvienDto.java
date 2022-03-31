package com.example.chtpt.dto;

import lombok.*;

import java.io.Serializable;
import java.util.Date;

@Data

public class SinhvienDto implements Serializable {
    private  String masv;
    private  String ho;
    private  String ten;
    private  String cmnd;
    private  Date ngaysinh;
    private  String gioitinh;
    private  String diachi;
    private  String email;
    private  String hinhanh;
    private  String sdt;
    private  String malopMalop;
    private  String malopTenlop;

    public SinhvienDto() {
    }

    public SinhvienDto(String masv, String ho, String ten, String cmnd, Date ngaysinh, String gioitinh, String diachi, String email, String hinhanh, String sdt, String malopMalop, String malopTenlop) {
        this.masv = masv;
        this.ho = ho;
        this.ten = ten;
        this.cmnd = cmnd;
        this.ngaysinh = ngaysinh;
        this.gioitinh = gioitinh;
        this.diachi = diachi;
        this.email = email;
        this.hinhanh = hinhanh;
        this.sdt = sdt;
        this.malopMalop = malopMalop;
        this.malopTenlop = malopTenlop;
    }

    public void setMasv(String masv) {
        this.masv = masv;
    }

    public void setHo(String ho) {
        this.ho = ho;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public void setCmnd(String cmnd) {
        this.cmnd = cmnd;
    }

    public void setNgaysinh(Date ngaysinh) {
        this.ngaysinh = ngaysinh;
    }

    public void setGioitinh(String gioitinh) {
        this.gioitinh = gioitinh;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setHinhanh(String hinhanh) {
        this.hinhanh = hinhanh;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public void setMalopMalop(String malopMalop) {
        this.malopMalop = malopMalop;
    }

    public void setMalopTenlop(String malopTenlop) {
        this.malopTenlop = malopTenlop;
    }

    public String getMasv() {
        return masv;
    }

    public String getHo() {
        return ho;
    }

    public String getTen() {
        return ten;
    }

    public String getCmnd() {
        return cmnd;
    }

    public Date getNgaysinh() {
        return ngaysinh;
    }

    public String getGioitinh() {
        return gioitinh;
    }

    public String getDiachi() {
        return diachi;
    }

    public String getEmail() {
        return email;
    }

    public String getHinhanh() {
        return hinhanh;
    }

    public String getSdt() {
        return sdt;
    }

    public String getMalopMalop() {
        return malopMalop;
    }

    public String getMalopTenlop() {
        return malopTenlop;
    }
}
