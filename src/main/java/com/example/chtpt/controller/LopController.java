package com.example.chtpt.controller;

import com.example.chtpt.dto.KhoaDto;
import com.example.chtpt.dto.LopDto;
import com.example.chtpt.entity.Khoa;
import com.example.chtpt.entity.Lop;
import com.example.chtpt.service.KhoaService;
import com.example.chtpt.service.LopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
@RestController
@RequestMapping("/Lop/")
public class LopController {
    @Autowired
    private LopService lopService;

    // lấy toàn bộ danh sách
    @GetMapping("ListAll")
    public List<LopDto> ListAll(){
        return lopService.findAll();
    }
    @GetMapping("{maKhoa}")
    public LopDto get1(@PathVariable String maKhoa) {
        LopDto dto=lopService.selectbyID(maKhoa);
        return dto;
    }
    //sửa danh sách theo mã
    @PostMapping("/edit")
    public void edit(@RequestBody Lop lop) {
        lopService.save(lop);
    }
    @DeleteMapping("delete/{maLop}")
    public void delete (@PathVariable String maLop){
        lopService.deleteById(maLop);
    }
    @PostMapping("insert")
    public void insert ( @RequestBody LopDto dto){
        lopService.insert(dto.getMalop(), dto.getTenlop(), dto.getMakhoa());
    }

}
