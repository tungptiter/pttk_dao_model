package com.nminh.garage.Model2;

import com.nminh.garage.model.ThanhVien;

import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import java.time.Instant;

public class KhachHang {


    int id;
    String hovaten;


    @OneToOne
    @JoinColumn(name = "nguoi_dung_id")
    NguoiDung nguoiDung;



}
