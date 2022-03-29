/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.chtpt.entity;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "KHOA")

public class Khoa implements Serializable {

    @Id
    @Basic(optional = false)
    @Column(name = "MAKHOA")
    private String makhoa;
    @Basic(optional = false)
    @Column(name = "TENKHOA")
    private String tenkhoa;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "makhoa")
    private Collection<Lop> lopCollection;

    public Khoa() {
    }

    public Khoa(String makhoa) {
        this.makhoa = makhoa;
    }

    public Khoa(String makhoa, String tenkhoa) {
        this.makhoa = makhoa;
        this.tenkhoa = tenkhoa;
    }

    public String getMakhoa() {
        return makhoa;
    }

    public void setMakhoa(String makhoa) {
        this.makhoa = makhoa;
    }

    public String getTenkhoa() {
        return tenkhoa;
    }

    public void setTenkhoa(String tenkhoa) {
        this.tenkhoa = tenkhoa;
    }

    public Collection<Lop> getLopCollection() {
        return lopCollection;
    }

    public void setLopCollection(Collection<Lop> lopCollection) {
        this.lopCollection = lopCollection;
    }


}
