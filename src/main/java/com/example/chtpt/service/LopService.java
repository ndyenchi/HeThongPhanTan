package com.example.chtpt.service;

import com.example.chtpt.dto.LopDto;
import com.example.chtpt.entity.Lop;
import com.example.chtpt.repository.LopRepository;
import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
@Service
public class LopService {
    @Autowired
    private LopRepository repo;
    @Autowired
    private ModelMapper modelMapper;

    private LopDto convertEntityToDto(Lop user){
        modelMapper.getConfiguration()
                .setMatchingStrategy(MatchingStrategies.LOOSE);
        LopDto userLocationDTO = new LopDto();
        userLocationDTO = modelMapper.map(user, LopDto.class);
        return userLocationDTO;
    }

    private Lop convertDtoToEntity(LopDto userLocationDTO){
        modelMapper.getConfiguration()
                .setMatchingStrategy(MatchingStrategies.LOOSE);
        Lop user = new Lop();
        user = modelMapper.map(userLocationDTO, Lop.class);
        return user;
    }

    public List<LopDto> findAll() {
        return repo.findAll()
                .stream()
                .map(this::convertEntityToDto)
                .collect(Collectors.toList());
    }

    public void flush() {
        repo.flush();
    }
    public <S extends Lop> S save(S entity) {
        return repo.save(entity);
    }
    public long count() {
        return repo.count();
    }
    public void deleteById(String s) {
        repo.deleteById(s);
    }
    public void delete(Lop entity) {
        repo.delete(entity);
    }

    public LopDto selectbyID(String id){
        List<Lop> e=repo.selectbyID(id);
        LopDto dto = modelMapper.map(e.get(0), LopDto.class);
        return dto;
    }
    public void insert(String malop, String tenlop, String makhoa) {
        LopDto dto=new LopDto(malop,tenlop,makhoa);
        Lop en= convertDtoToEntity(dto);
        repo.insert(en.getMalop(),en.getTenlop(),en.getMakhoa().getMakhoa());
    }
   
}
