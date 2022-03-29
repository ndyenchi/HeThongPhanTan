package com.example.chtpt.repository;

import com.example.chtpt.entity.Khoa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import javax.transaction.Transactional;
import java.util.List;

public interface KhoaRepository extends JpaRepository<Khoa, String> {
    @Modifying
    @Transactional
    @Query(value = "SELECT * FROM KHOA t WHERE t.MAKHOA=:id", nativeQuery = true)
    List<Khoa> selectbyID(@Param("id") String id);

    @Modifying
    @Transactional
    @Query(value = "INSERT INTO Khoa (MAKHOA, TENKHOA ) VALUES  (:maKhoa, :tenKhoa)",nativeQuery = true)
    void insert(@Param("maKhoa") String ma, @Param("tenKhoa") String ten);

}