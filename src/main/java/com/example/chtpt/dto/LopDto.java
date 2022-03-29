package com.example.chtpt.dto;

import lombok.*;

import java.io.Serializable;

@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class LopDto implements Serializable {
    private  String malop;
    private  String tenlop;
    private  String makhoa;
}
