/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.chtpt.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name = "LOP")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Lop implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "MALOP")
    private String malop;
    @Basic(optional = false)
    @Column(name = "TENLOP")
    private String tenlop;
    @JoinColumn(name = "MAKHOA", referencedColumnName = "MAKHOA")
    @ManyToOne(optional = false)
    private Khoa makhoa;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "malop")
    private Collection<Sinhvien> sinhvienCollection;

}
