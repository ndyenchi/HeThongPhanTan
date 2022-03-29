package com.example.chtpt.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
public class KhoaDto implements Serializable {
    private  String makhoa;
    private  String tenkhoa;

    public String getMakhoa() {
        return makhoa;
    }

    public String getTenkhoa() {
        return tenkhoa;
    }

    public KhoaDto() {
        super();
    }
}
