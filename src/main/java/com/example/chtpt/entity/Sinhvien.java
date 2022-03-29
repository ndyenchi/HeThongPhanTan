/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.chtpt.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity
@Table(name = "SINHVIEN")
public class Sinhvien implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "MASV")
    private String masv;
    @Basic(optional = false)
    @Column(name = "HO")
    private String ho;
    @Basic(optional = false)
    @Column(name = "TEN")
    private String ten;
    @Basic(optional = false)
    @Column(name = "CMND")
    private String cmnd;
    @Basic(optional = false)
    @Column(name = "NGAYSINH")
    @Temporal(TemporalType.DATE)
    private Date ngaysinh;
    @Basic(optional = false)
    @Column(name = "GIOITINH")
    private String gioitinh;
    @Basic(optional = false)
    @Column(name = "DIACHI")
    private String diachi;
    @Basic(optional = false)
    @Column(name = "EMAIL")
    private String email;
    @Basic(optional = false)
    @Column(name = "HINHANH")
    private String hinhanh;
    @Basic(optional = false)
    @Column(name = "SDT")
    private String sdt;
    @JoinColumn(name = "MALOP", referencedColumnName = "MALOP")
    @ManyToOne(optional = false)
    private Lop malop;

    public Sinhvien() {
    }

    public Sinhvien(String masv) {
        this.masv = masv;
    }

    public Sinhvien(String masv, String ho, String ten, String cmnd, Date ngaysinh, String gioitinh, String diachi, String email, String hinhanh, String sdt) {
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
    }

    public String getMasv() {
        return masv;
    }

    public void setMasv(String masv) {
        this.masv = masv;
    }

    public String getHo() {
        return ho;
    }

    public void setHo(String ho) {
        this.ho = ho;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getCmnd() {
        return cmnd;
    }

    public void setCmnd(String cmnd) {
        this.cmnd = cmnd;
    }

    public Date getNgaysinh() {
        return ngaysinh;
    }

    public void setNgaysinh(Date ngaysinh) {
        this.ngaysinh = ngaysinh;
    }

    public String getGioitinh() {
        return gioitinh;
    }

    public void setGioitinh(String gioitinh) {
        this.gioitinh = gioitinh;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getHinhanh() {
        return hinhanh;
    }

    public void setHinhanh(String hinhanh) {
        this.hinhanh = hinhanh;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public Lop getMalop() {
        return malop;
    }

    public void setMalop(Lop malop) {
        this.malop = malop;
    }


}
