package com.nminh.garage.Model2;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.Instant;
import lombok.Data;
import lombok.experimental.Accessors;
import javax.persistence.*;

public class NguoiDung {
    @Id
    @GeneratedValue(
            strategy = GenerationType.IDENTITY
    )

    int id;
    String hovaten;
    String avatar;
    String email;
    String sodienthoai;
    String matkhau;
    int gioitinh;
    String ghichu;
    Instant ngaytao;
    String lancuoidangnhap;

    @ManyToOne
    @JoinColumn(name = "dia_chi_id", nullable = false)
    private DiaChi diaChi;

    public NguoiDung() {
    }

    public NguoiDung(int id, String hovaten, String avatar, String email, String sodienthoai, String matkhau, int gioitinh, String ghichu, Instant ngaytao, String lancuoidangnhap) {
        this.id = id;
        this.hovaten = hovaten;
        this.avatar = avatar;
        this.email = email;
        this.sodienthoai = sodienthoai;
        this.matkhau = matkhau;
        this.gioitinh = gioitinh;
        this.ghichu = ghichu;
        this.ngaytao = ngaytao;
        this.lancuoidangnhap = lancuoidangnhap;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getHovaten() {
        return hovaten;
    }

    public void setHovaten(String hovaten) {
        this.hovaten = hovaten;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSodienthoai() {
        return sodienthoai;
    }

    public void setSodienthoai(String sodienthoai) {
        this.sodienthoai = sodienthoai;
    }

    public String getMatkhau() {
        return matkhau;
    }

    public void setMatkhau(String matkhau) {
        this.matkhau = matkhau;
    }

    public int getGioitinh() {
        return gioitinh;
    }

    public void setGioitinh(int gioitinh) {
        this.gioitinh = gioitinh;
    }

    public String getGhichu() {
        return ghichu;
    }

    public void setGhichu(String ghichu) {
        this.ghichu = ghichu;
    }

    public Instant getNgaytao() {
        return ngaytao;
    }

    public void setNgaytao(Instant ngaytao) {
        this.ngaytao = ngaytao;
    }

    public String getLancuoidangnhap() {
        return lancuoidangnhap;
    }

    public void setLancuoidangnhap(String lancuoidangnhap) {
        this.lancuoidangnhap = lancuoidangnhap;
    }
}
