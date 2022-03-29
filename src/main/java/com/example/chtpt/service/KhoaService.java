package com.example.chtpt.service;

import com.example.chtpt.dto.KhoaDto;
import com.example.chtpt.entity.Khoa;
import com.example.chtpt.repository.KhoaRepository;
import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

@Service
public class KhoaService {
    @Autowired
    private KhoaRepository repo;
    @Autowired
    ModelMapper modelMapper;
    private KhoaDto convertEntityToDto(Khoa user){
        modelMapper.getConfiguration()
                .setMatchingStrategy(MatchingStrategies.LOOSE);
        KhoaDto userLocationDTO = new KhoaDto();
        userLocationDTO = modelMapper.map(user, KhoaDto.class);
        return userLocationDTO;
    }

    private Khoa convertDtoToEntity(KhoaDto userLocationDTO){
        modelMapper.getConfiguration()
                .setMatchingStrategy(MatchingStrategies.LOOSE);
        Khoa user = new Khoa();
        user = modelMapper.map(userLocationDTO, Khoa.class);
        return user;
    }

    public List<KhoaDto> findAll() {
        return repo.findAll()
                .stream()
                .map(this::convertEntityToDto)
                .collect(Collectors.toList());
    }


    public <S extends Khoa> List<S> saveAll(Iterable<S> entities) {
        return repo.saveAll(entities);
    }

    public void flush() {
        repo.flush();
    }

    public <S extends Khoa> S saveAndFlush(S entity) {
        return repo.saveAndFlush(entity);
    }

    public <S extends Khoa> List<S> saveAllAndFlush(Iterable<S> entities) {
        return repo.saveAllAndFlush(entities);
    }

    public <S extends Khoa> S save(S entity) {
        return repo.save(entity);
    }

    public boolean existsById(String s) {
        return repo.existsById(s);
    }

    public long count() {
        return repo.count();
    }

    public void deleteById(String s) {
        repo.deleteById(s);
    }

    public void delete(Khoa entity) {
        repo.delete(entity);
    }

    public void deleteAll() {
        repo.deleteAll();
    }

    public KhoaDto selectbyID(String id){
        List<Khoa> e=repo.selectbyID(id);
        KhoaDto dto = modelMapper.map(e.get(0), KhoaDto.class);
        return dto;
    }
    public void insert(String maKhoa, String tenKhoa) {
        repo.insert(maKhoa,tenKhoa);
    }

}
