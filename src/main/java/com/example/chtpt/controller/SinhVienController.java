package com.example.chtpt.controller;

import com.example.chtpt.dto.SinhvienDto;
import com.example.chtpt.entity.Sinhvien;
import com.example.chtpt.service.SinhVienService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/SinhVien/")
public class SinhVienController {
    @Autowired
    private SinhVienService sinhVienService;

    // lấy toàn bộ danh sách
    @GetMapping("ListAll")
    public List<SinhvienDto> ListAll(){
        return sinhVienService.findAll();
    }
    @GetMapping("{maKhoa}")
    public SinhvienDto get1(@PathVariable String maKhoa) {
        SinhvienDto dto=sinhVienService.selectbyID(maKhoa);
        return dto;
    }
    @PostMapping("edit/{masv}")
    public void edit(@PathVariable String masv,@RequestBody SinhvienDto Sinhvien) {
        sinhVienService.edit(Sinhvien, masv);
    }
    @DeleteMapping("delete/{maSV}")
    public void delete (@PathVariable String maSV){
        sinhVienService.deleteById(maSV);
    }
    @PostMapping("insert")
    public void insert ( @RequestBody SinhvienDto d){
        sinhVienService.insert(d.getMalopMalop(),d.getMasv(),d.getHo(),d.getTen(),d.getDiachi(),
        d.getNgaysinh(),d.getSdt(),d.getEmail(),d.getGioitinh(),d.getCmnd()
                ,d.getMalopTenlop(),d.getHinhanh());
    }
    // lấy toàn bộ danh sách sinh viên theo mã lop
    @GetMapping("List/{maLop}")
    public List<SinhvienDto> getByMaLop(@PathVariable String maLop){
        List<SinhvienDto> dto=sinhVienService.getByMalop(maLop);
        return dto;
    }
}
