package com.example.chtpt.service;

import com.example.chtpt.dto.LopDto;
import com.example.chtpt.dto.SinhvienDto;
import com.example.chtpt.entity.Lop;
import com.example.chtpt.entity.Sinhvien;
import com.example.chtpt.repository.SinhvienRepository;
import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;
@Service
public class SinhVienService {
    @Autowired
    private SinhvienRepository repo;
    @Autowired
    private ModelMapper modelMapper;

    private SinhvienDto convertEntityToDto(Sinhvien user){
        modelMapper.getConfiguration()
                .setMatchingStrategy(MatchingStrategies.LOOSE);
        SinhvienDto userLocationDTO = new SinhvienDto();
        userLocationDTO = modelMapper.map(user, SinhvienDto.class);
        return userLocationDTO;
    }

    private Sinhvien convertDtoToEntity(SinhvienDto userLocationDTO){
        modelMapper.getConfiguration()
                .setMatchingStrategy(MatchingStrategies.LOOSE);
        Sinhvien user = new Sinhvien();
        user = modelMapper.map(userLocationDTO, Sinhvien.class);
        return user;
    }

    public List<SinhvienDto> findAll() {
        return repo.findAll()
                .stream()
                .map(this::convertEntityToDto)
                .collect(Collectors.toList());
    }

    public <S extends Sinhvien> S save(S entity) {

        return repo.save(entity);
    }

    public void deleteById(String s) {
        repo.deleteById(s);
    }

    public void delete(Sinhvien entity) {
        repo.delete(entity);
    }

    public SinhvienDto selectbyID(String id){
        List<Sinhvien> e=repo.selectbyID(id);
        SinhvienDto dto = modelMapper.map(e.get(0), SinhvienDto.class);
        return dto;
    }
    public void insert(String malop,String masv, String ho, String ten, String diachi, Date ngaysinh,
                       String sdt,String email, String gioitinh,  String cmnd, String tenlop, String hinhanh) {
        SinhvienDto dto=new SinhvienDto(masv, ho, ten,cmnd,ngaysinh,gioitinh,diachi,email,hinhanh,sdt,malop,tenlop);
        Sinhvien e= convertDtoToEntity(dto);
        repo.insert(e.getMasv(),e.getHo(),e.getTen(),e.getCmnd(),e.getDiachi(),e.getEmail(),
        e.getGioitinh(),e.getHinhanh(),e.getNgaysinh(),e.getSdt(), e.getMalop().getMalop());
    }
    public List<SinhvienDto> getByMalop(String maLop){
        return repo.getByMalop(maLop).stream()
                .map(this::convertEntityToDto)
                .collect(Collectors.toList());
    }
    public void edit(SinhvienDto sv, String masv){
        repo.editbyID(sv.getHo(), sv.getTen(),sv.getCmnd(),sv.getDiachi(),
                sv.getEmail(),sv.getGioitinh(), sv.getHinhanh(), sv.getNgaysinh(), sv.getSdt(), masv);

    }
}


