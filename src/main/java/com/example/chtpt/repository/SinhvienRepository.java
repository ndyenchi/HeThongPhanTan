package com.example.chtpt.repository;

import com.example.chtpt.entity.Lop;
import com.example.chtpt.entity.Sinhvien;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import javax.transaction.Transactional;
import java.util.Date;
import java.util.List;

public interface SinhvienRepository extends JpaRepository<Sinhvien, String> {
    @Modifying
    @Transactional
    @Query(value = "SELECT * FROM SINHVIEN t WHERE t.MASV=:id", nativeQuery = true)
    List<Sinhvien> selectbyID(@Param("id") String id);

    @Modifying
    @Transactional
    @Query(value = "INSERT INTO SINHVIEN (masv,ho,ten,cmnd, diachi, email, gioitinh,hinhanh,ngaysinh,sdt,malop )" +
            " VALUES  (:masv,:ho,:ten,:cmnd, :diachi, :email, :gioitinh,:hinhanh,:ngaysinh,:sdt,:malop)",nativeQuery = true)
    void insert(@Param("masv") String a, @Param("ho") String b, @Param("ten") String c,
                @Param("cmnd") String d, @Param("diachi") String e, @Param("email") String f,
                @Param("gioitinh") String g, @Param("hinhanh") String h,@Param("ngaysinh") Date i,
                @Param("sdt") String k, @Param("malop") String l);
    @Modifying
    @Transactional
    @Query(value = "SELECT * FROM SINHVIEN t WHERE t.MALOP=:maLop", nativeQuery = true)
    List<Sinhvien> getByMalop(@Param("maLop") String ma);

    @Modifying
    @Transactional
    @Query(value = "update  SINHVIEN   SET  HO =:ho ,TEN =:ten ,CMND =:cmnd ," +
            "DIACHI =:diachi ,EMAIL =:email ,GIOITINH =:gioitinh ,HINHANH =:hinhanh , NGAYSINH=:ngaysinh, SDT=:sdt " +
            "WHERE MASV=:id",nativeQuery = true)
    void editbyID( @Param("ho") String b, @Param("ten") String c,
                   @Param("cmnd") String d, @Param("diachi") String e, @Param("email") String f,
                   @Param("gioitinh") String g, @Param("hinhanh") String h,@Param("ngaysinh") Date i,
                   @Param("sdt") String k, @Param("id") String id);

}