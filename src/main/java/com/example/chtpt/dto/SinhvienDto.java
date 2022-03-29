package com.example.chtpt.dto;

import lombok.*;

import java.io.Serializable;
import java.util.Date;

@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
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
}
