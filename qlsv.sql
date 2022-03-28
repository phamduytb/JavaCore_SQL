create database qlsv;
use qlsv;

CREATE TABLE `qlsv`.`khoa` (
  `MaKhoa` VARCHAR(10) NOT NULL,
  `TenKhoa` VARCHAR(45) NULL,
  PRIMARY KEY (`MaKhoa`));
  
CREATE TABLE `qlsv`.`lop` (
  `MaLop` INT NOT NULL,
  `TenLop` VARCHAR(45) NULL,
  `MaKhoa` VARCHAR(10) NULL,
  PRIMARY KEY (`MaLop`),
  INDEX `fk_khoa_lop_idx` (`MaKhoa` ASC),
  CONSTRAINT `fk_khoa_lop`
    FOREIGN KEY (`MaKhoa`)
    REFERENCES `qlsv`.`khoa` (`MaKhoa`));
    
CREATE TABLE `qlsv`.`sinhvien` (
  `MaSV` INT NOT NULL,
  `HoTen` VARCHAR(45) NULL,
  `GioiTinh` VARCHAR(3) NULL,
  `NgaySinh` DATE NULL,
  `MaLop` INT NULL,
  `HocBong` INT NULL,
  PRIMARY KEY (`MaSV`),
  INDEX `fk_lop_sv_idx` (`MaLop` ASC),
  CONSTRAINT `fk_lop_sv`
    FOREIGN KEY (`MaLop`)
    REFERENCES `qlsv`.`lop` (`MaLop`));
    
CREATE TABLE `qlsv`.`monhoc` (
  `MaMH` VARCHAR(10) NOT NULL,
  `TenMH` VARCHAR(45) NULL,
  `SoTiet` INT NULL,
  PRIMARY KEY (`MaMH`));
  
CREATE TABLE `qlsv`.`ketqua` (
  `MaSV` INT NULL,
  `MaMH` VARCHAR(10) NULL,
  `DiemThi` FLOAT NULL,
  INDEX `fk_sv_kq_idx` (`MaSV` ASC),
  INDEX `fk_mh_kq_idx` (`MaMH` ASC),
  CONSTRAINT `fk_sv_kq`
    FOREIGN KEY (`MaSV`)
    REFERENCES `qlsv`.`sinhvien` (`MaSV`),
  CONSTRAINT `fk_mh_kq`
    FOREIGN KEY (`MaMH`)
    REFERENCES `qlsv`.`monhoc` (`MaMH`));
    
insert into khoa(MaKhoa, TenKhoa)
values ('ATTT', 'khoa an toan thong tin'), ('DTVT', 'khoa dien tu vien thong'), 
		('CNTT', 'khoa cong nghe thong tin');
        
insert into lop(MaLop, TenLop, MaKhoa)
values ('1', 'CT01', 'CNTT'), ('2', 'CT02', 'CNTT'),
		('3', 'AT01', 'ATTT'), ('4', 'DT01', 'DTVT');

insert into sinhvien(MaSV, HoTen, GioiTinh, NgaySinh, MaLop, HocBong)
values (0001, 'Nguyen Van A', 'Nam', '1998-01-02', 2, 1), (0002, 'Tran Thi B', 'Nu', '1999-03-05', 2, 2),
		(0003, 'Nguyen Thi C', 'Nu', '1998-06-02', 1, 2), (0004, 'Hoang Van D', 'Nam', '1997-09-10', 3, 0);

insert into monhoc(MaMH, TenMH, SoTiet)
values ('KTLT', 'Ky thuat lap trinh', 45), ('CTDLGT', 'Cau truc du lieu va giai thuat', 50), 
		('ATHDH', 'An toan he dieu hanh', 52), ('KTTSL', 'Ky thuat truyen so lieu', 40);
        
insert into ketqua(MaSV, MaMH, DiemThi)
values (0001, 'ATHDH', 9), (0002, 'KTLT', 8.5), 
		(0003, 'CTDLGT', 8), (0004, 'KTTSL', 8.5);
        
select * from lop;

select MaSV, HoTen, HocBong from sinhvien;

select MaSV, HoTen, HocBong from sinhvien where HocBong>0;

select * from sinhvien where GioiTinh='Nu';

select * from sinhvien where HoTen like 'Tran%';

select * from sinhvien where GioiTinh='Nu' or HocBong>0;

select * from sinhvien where year(NgaySinh) between 1998 and 1999;

select * from sinhvien order by MaSV ASC;

select * from sinhvien order by HocBong DESC;

select * from sinhvien inner join ketqua on sinhvien.MaSV= ketqua.MaSV 
where MaMH='KTLT' and DiemThi >=8;

select MaSV, HoTen, HocBong, TenLop from sinhvien inner join lop on sinhvien.MaLop=lop.MaLop
where sinhvien.HocBong>0 and lop.MaKhoa='CNTT';










        

