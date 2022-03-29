package com.example.chtpt.repository;

import com.example.chtpt.entity.Lop;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;
@Repository
public interface LopRepository extends JpaRepository<Lop, String> {
    @Modifying
    @Transactional
    @Query(value = "SELECT * FROM LOP t WHERE t.MALOP=:id", nativeQuery = true)
    List<Lop> selectbyID(@Param("id") String id);

    @Modifying
    @Transactional
    @Query(value = "INSERT INTO LOP (MALOP, TENLOP, MAKHOA ) VALUES  (:maLop, :tenLop,:maKhoa)",nativeQuery = true)
    void insert(@Param("maLop") String ma, @Param("tenLop") String ten, @Param("maKhoa") String maKhoa);
}