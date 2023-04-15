DROP DATABASE IF EXISTS SQL_CoBan;

CREATE DATABASE SQL_CoBan;

USE SQL_CoBan;

-- Khoa(MaKhoa, TenKhoa)
CREATE TABLE Khoa (
	MaKhoa	VARCHAR (100)	NOT NULL,
    TenKhoa	VARCHAR (100)	NOT NULL,
    
    CONSTRAINT PK_MaKhoa	PRIMARY KEY (MaKhoa)
);

-- Lop(MaLop, TenLop, MaKhoa)
CREATE TABLE Lop (
	MaLop	VARCHAR (100)	NOT NULL,
    TenLop	VARCHAR (100)	NOT NULL, 
    MaKhoa	VARCHAR (100)	NOT NULL,
    
    CONSTRAINT PK_MaLop		PRIMARY KEY (MaLop),
    CONSTRAINT FK_MaKhoa 	FOREIGN KEY (MaKhoa)	REFERENCES Khoa(MaKhoa)
);

-- SinhVien(MaSV, HoTen, GioiTinh, NgaySinh, MaLop, HocBong) 
-- 0: Nam, 1: Nữ, 2: khác
CREATE TABLE SinhVien (
	MaSV		VARCHAR (100)	NOT NULL, 
    HoTen		VARCHAR (100)	NOT NULL, 
    GioiTinh	TINYINT			NOT NULL, 
    NgaySinh	DATE			NOT NULL, 
    MaLop		VARCHAR (100)	NOT NULL, 
    HocBong		TINYINT			NOT NULL,
    
	CONSTRAINT PK_MaSV		PRIMARY KEY (MaSV),
    CONSTRAINT FK_MaLop 	FOREIGN KEY (MaLop)	REFERENCES Lop(MaLop)
);

-- MonHoc(MaMH, TenMH, SoTiet)
CREATE TABLE MonHoc (
	MaMH	VARCHAR (100)	NOT NULL, 
    TenMH	VARCHAR (100)	NOT NULL, 
    SoTiet	INT				NOT NULL,
    
    CONSTRAINT PK_MaMH		PRIMARY KEY (MaMH)
);

-- KetQua(MaSV, MaMH, DiemThi)
CREATE TABLE KetQua (
	MaSV	VARCHAR (100)	NOT NULL, 
    MaMH	VARCHAR (100)	NOT NULL, 
    DiemThi	DOUBLE (3,2)	NOT NULL,
    
    CONSTRAINT FK_MaSV 	FOREIGN KEY (MaSV)	REFERENCES SinhVien(MaSV),
    CONSTRAINT FK_MaMH 	FOREIGN KEY (MaMH)	REFERENCES MonHoc(MaMH)
);

-- Ví dụ 1: Liệt kê danh sách các lớp của khoa, thông tin cần Malop, TenLop, MaKhoa
SELECT * FROM LOP;

-- Ví dụ 2: Lập danh sách sinh viên gồm: MaSV, HoTen, HocBong
SELECT MaSV, HoTen, HocBong FROM SINHVIEN;

-- Ví dụ 3: Lập danh sách sinh viên có học bổng. Danh sách cần MaSV, GioiTinh, HocBong
SELECT MaSV, GioiTinh, HocBong
FROM SINHVIEN
WHERE HocBong > 0;

-- Ví dụ 5: Lập danh sách sinh viên có họ ‘Trần’ 
SELECT * FROM SinhVien
WHERE HoTen LIKE "Trần%";
 
 -- Ví dụ 6: Lập danh sách sinh viên nữ có học bổng 
SELECT * FROM SINHVIEN
WHERE	GioiTinh = 1 AND HocBong > 0;

-- Ví dụ 7: Lập danh sách sinh viên nữ hoặc danh sách sinh viên có học bổng 
SELECT * FROM SINHVIEN
WHERE	GioiTinh = 1 OR HocBong > 0;

-- Ví dụ 8: Lập danh sách sinh viên có năm sinh từ 2001 đến 2003. Danh sách cần các thuộc tính của quan hệ SinhVien
SELECT * FROM SINHVIEN
WHERE YEAR(NgaySinh) >= 2001 AND YEAR(NgaySinh) <= 2003;

-- Ví dụ 9: Liệt kê danh sách sinh viên được sắp xếp tăng dần theo MaSV
SELECT * FROM SINHVIEN
ORDER BY MASV;

-- Ví dụ 10: Liệt kê danh sách sinh viên được sắp xếp giảm dần theo HocBong
SELECT * FROM SINHVIEN
ORDER BY HocBong DESC;

-- Ví du11: Lập danh sách sinh viên có điểm thi môn OOP >=8
SELECT SV.MaSV, SV.HoTen, SV.MaLop, KQ.MaMH, KQ.Diemthi
FROM SINHVIEN SV JOIN KETQUA KQ
ON SV.MaSV = KQ.MaSV
WHERE KQ.MaMH LIKE 'OOP' AND KQ.DiemThi >= 8;

-- Ví du 12: Lập danh sách sinh viên có học bổng của khoa CNTT. Thông tin cần: MaSV, HoTen, HocBong,TenLop
SELECT MaSV, HoTen, HocBong, l.TenLop
FROM sinhvien sv JOIN lop l ON sv.MaLop = l.MaLop
JOIN khoa k on l.MaKhoa = k.MaKhoa
WHERE HocBong > 0 AND k.MaKhoa LIKE 'CNTT';

-- Ví du 13: Lập danh sách sinh viên có học bổng của khoa CNTT. Thông tin cần: MaSV, HoTen, HocBong,TenLop, TenKhoa
SELECT MaSV, HoTen, HocBong, l.TenLop, k.TenKhoa
FROM sinhvien sv JOIN lop l ON sv.MaLop = l.MaLop
JOIN khoa k on l.MaKhoa = k.MaKhoa
WHERE HocBong > 0 AND k.MaKhoa LIKE 'CNTT';

-- Ví dụ 14: Cho biết số sinh viên của mỗi lớp, lớp không có sinh viên in ra 0
SELECT l.MaLop, l.TenLop, COUNT(sv.MaSV) AS Tong_SinhVien
FROM sinhvien sv RIGHT JOIN lop l ON sv.MaLop = l.MaLop
GROUP BY l.MaLop;

-- Thử ------------
SELECT l.MaLop, l.TenLop, sv.MaSV
FROM sinhvien sv RIGHT JOIN lop l ON sv.MaLop = l.MaLop
ORDER BY MaLop;

-- Ví dụ 15: Cho biết số lượng sinh viên của mỗi khoa
SELECT k.MaKhoa, k.TenKhoa, COUNT(MaSV) AS Tong_SV
FROM khoa k LEFT JOIN lop l ON k.MaKhoa = l.MaKhoa
LEFT JOIN sinhvien sv ON l.MaLop = sv.MaLop
GROUP BY k.MaKhoa;

-- Ví dụ 16: Cho biết số lượng sinh viên nữ của mỗi khoa
SELECT k.MaKhoa, k.TenKhoa, COUNT(MaSV) AS Tong_SV_Nu
FROM khoa k LEFT JOIN lop l ON k.MaKhoa = l.MaKhoa
LEFT JOIN sinhvien sv ON l.MaLop = sv.MaLop
WHERE sv.GioiTinh = 1
GROUP BY k.MaKhoa;

-- Bổ sung với những khoa không có sinh viên nữ thì in ra là 0 ( Mặc định khoa phải có lớp, lớp phải có sinh viên)
-- Tìm kiếm những lớp có sinh viên nữ
SELECT k.MaKhoa, k.TenKhoa, COUNT(MaSV) AS Tong_SV_Nu
FROM khoa k JOIN lop l ON k.MaKhoa = l.MaKhoa
JOIN sinhvien sv ON l.MaLop = sv.MaLop
WHERE sv.GioiTinh = 1
GROUP BY k.MaKhoa

UNION 
-- Tìm kiếm các lớp không có sinh viên nữ
SELECT MaKhoa, TenKhoa, 0 AS Tong_SV_Nu
FROM (
	SELECT k.MaKhoa, k.TenKhoa, l.MaLop
    FROM khoa k JOIN lop l ON k.MaKhoa = l.MaKhoa
	JOIN sinhvien sv ON l.MaLop = sv.MaLop
    WHERE l.MaLop NOT IN 
						(SELECT distinct sinhvien sv FROM sinhvien sv WHERE sv.GioiTinh = 1 )
) T;

-- Ví dụ 17: Cho biết tổng học bổng của mỗi lớp
SELECT l.MaLop, l.TenLop, sum(sv.HocBong) AS Tong_HocBong
FROM lop l JOIN sinhvien sv
ON l.MaLop = sv.MaLop
GROUP BY l.MaLop;

-- Ví dụ 18: Cho biết tổng số  học bổng của mỗi khoa
SELECT k.MaKhoa, k.TenKhoa, sum(sv.HocBong) AS Tong_HocBong
FROM khoa k JOIN lop l ON k.MaKhoa = l.MaKhoa
JOIN sinhvien sv ON l.MaLop = sv.MaLop
GROUP BY k.MaKhoa;

-- Ví dụ 19: Lập danh sánh những khoa có nhiều hơn 3 sinh viên. Danh sách cần: MaKhoa, TenKhoa, Soluong
SELECT k.MaKhoa, k.TenKhoa, count(k.MaKhoa) AS Soluong_SinhVien
FROM khoa k JOIN lop l ON k.MaKhoa = l.MaKhoa
JOIN sinhvien sv ON l.MaLop = sv.MaLop
GROUP BY k.MaKhoa
HAVING count(k.MaKhoa) > 3;

-- Ví dụ 20:  Lập danh sánh những khoa có từ 1 sinh viên nữ trở lên. Danh sách cần: MaKhoa, TenKhoa, Soluong
SELECT k.MaKhoa, k.TenKhoa, sum(k.MaKhoa) AS Soluong_SinhVienNu
FROM khoa k JOIN lop l ON k.MaKhoa = l.MaKhoa
JOIN sinhvien sv ON l.MaLop = sv.MaLop
WHERE sv.GioiTinh = 1
GROUP BY k.MaKhoa
HAVING count(k.MaKhoa) > 0;

-- Ví dụ 21:  Lập danh sách những khoa có học bổng >=1
SELECT k.MaKhoa, k.TenKhoa, sum(sv.HocBong) AS Tong_HocBong
FROM khoa k JOIN lop l ON k.MaKhoa = l.MaKhoa
JOIN sinhvien sv ON l.MaLop = sv.MaLop
GROUP BY k.MaKhoa
HAVING sum(sv.HocBong)  >= 1;

-- Ví dụ22: Lập danh sách sinh viên có học bổng cao nhất
SELECT * FROM sinhvien
WHERE HocBong >= ALL (
					SELECT HocBong FROM sinhvien);

-- Ví dụ 23: Lập danh sách sinh viên có điểm thi môn web cao nhất
SELECT sv.*,  kq.DiemThi AS ThuKhoa_Web
FROM sinhvien sv JOIN ketqua kq
ON sv.MaSV = kq.MaSV
WHERE  kq.MaMH LIKE 'WEB' AND kq.DiemThi >= ALL (SELECT DiemThi FROM ketqua kq WHERE kq.MaMH LIKE 'WEB');

-- Ví dụ 24: Lập danh sách những sinh viên không có điểm thi môn OOP
-- Gồm: Sinh viên không học môn OOP và những sinh viên có học nhưng không có điểm
-- Sinh viên không học OOP 
SELECT sv.MaSV, sv.HoTen, sv.MaLop, kq.MaMH
FROM sinhvien sv JOIN ketqua kq ON sv.MaSV = kq.MaSV
WHERE kq.MaMH NOT LIKE 'OOP'

UNION
-- Sinh viên học OOP nhưng không có điểm (điểm = 0) 
SELECT sv.MaSV, sv.HoTen, sv.MaLop, kq.MaMH
FROM sinhvien sv JOIN ketqua kq ON sv.MaSV = kq.MaSV
WHERE kq.MaMH LIKE 'OOP' AND kq.DiemThi = 0;

-- Ví dụ 25: Cho biết những khoa nào có nhiều sinh viên nhất
-- Điều kiện COUNT(k.MaKhoa) >= ALL để lọc ra khoa có số lượng sinh viên lớn hơn tất cả các khoa còn lại
SELECT k.MaKhoa, k.TenKhoa, COUNT(k.MaKhoa) AS Tong_SV
FROM khoa k JOIN lop l ON k.MaKhoa = l.MaKhoa
JOIN sinhvien sv ON l.MaLop = sv.MaLop
GROUP BY k.MaKhoa
HAVING COUNT(k.MaKhoa) >= ALL (SELECT COUNT(k.MaKhoa) AS Tong_SV
								FROM khoa k JOIN lop l ON k.MaKhoa = l.MaKhoa
								JOIN sinhvien sv ON l.MaLop = sv.MaLop
								GROUP BY k.MaKhoa
								);

 SELECT k.MaKhoa FROM khoa k                           
