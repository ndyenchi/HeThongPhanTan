package com.example.chtpt.controller;

import com.example.chtpt.dto.KhoaDto;
import com.example.chtpt.entity.Khoa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.chtpt.service.KhoaService;


import java.util.List;

@RestController
@RequestMapping("/Khoa/")
public class KhoaController {
    @Autowired
    private KhoaService khoaService;
    // lấy toàn bộ danh sách
    @GetMapping("ListAll")
    public List<KhoaDto> ListAll(){
        return khoaService.findAll();
    }
    @GetMapping("{maKhoa}")
    public KhoaDto get1(@PathVariable String maKhoa) {
        KhoaDto dto=khoaService.selectbyID(maKhoa);
        return dto;
    }
    //sửa danh sách theo mã
    @PostMapping("/edit")
    public void edit(@RequestBody Khoa khoa) {
        khoaService.save(khoa);
    }
    @DeleteMapping("delete/{maKhoa}")
    public void delete (@PathVariable String maKhoa){
        khoaService.deleteById(maKhoa);
    }
    @PostMapping("insert")
    public void insert (@RequestBody Khoa khoa){
        khoaService.insert(khoa.getMakhoa(),khoa.getTenkhoa());
    }

}
