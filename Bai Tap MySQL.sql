# 1 Lop - N sinh vien
# 1 sinh vien - N Lop
# =>>> Sinh vien - Lop : N - N

# 1 khoa - N Lop
# 1 Lop - 1 khoa
# =>>> Khoa - Lop : 1 - N

# 1 Mon hoc - N sinh vien
# 1 sinh vien - N Mon hoc
# =>>> Sinh vien - Mon hoc : N - N

# VD1:Liệt kê danh sách các lớp của khoa, thông tin cần Malop, TenLop, MaKhoa
SELECT * FROM LOP;

# VD2: Lập danh sách sinh viên gồm: MaSV, HoTen, HocBong
SELECT * FROM bai_tap_vn.sinh_vien;
SELECT MaSV, HoTen, HocBong FROM SINH_VIEN;

# VD3: Lập danh sách sinh viên có học bổng. Danh sách cần MaSV, GioiTinh,
# HocBong 
SELECT MaSV, GioiTinh, HocBong FROM SINH_VIEN
WHERE HocBong > 0;

# VD4: Lập danh sách sinh viên nữ. Danh sách cần các thuộc tính của quan hệ SINH_VIEN
SELECT * FROM SINH_VIEN WHERE GioiTinh = 'Nu';

# VD5 (LOI):  Lập danh sách sinh viên có họ ‘Trần’ 
SELECT * FROM SINH_VIEN WHERE HoTen LIKE 'Tran *';

# VD6:  Lập danh sách sinh viên nữ có học bổng
SELECT * FROM SINH_VIEN WHERE GioiTinh = 'Nu' AND HocBong > 0;

# VD7:  Lập danh sách sinh viên nữ hoặc danh sách sinh viên có học bổng
SELECT * FROM SINH_VIEN WHERE GioiTinh = 'Nu' OR HocBong > 0;

# VD8: 8: Lập danh sách sinh viên có năm sinh từ 2001 đến 2003. Danh sách cần các
# thuộc tính của quan hệ SINH_VIEN
SELECT * FROM SINH_VIEN WHERE YEAR(NgaySinh) BETWEEN 2001 AND 2003;

# VD9: Liệt kê danh sách sinh viên được sắp xếp tăng dần theo MaSV
# ORDER BY .... : SẮP XẾP TĂNG
SELECT * FROM SINH_VIEN ORDER BY MaSV;

# VD10: Liệt kê danh sách sinh viên được sắp xếp giảm dần theo HocBong
# ORDER BY .... DESC : SẮP XẾP GIẢM
SELECT * FROM SINH_VIEN ORDER BY HocBong DESC;

# VD11:  Lập danh sách sinh viên có điểm thi môn CSDL>=8
SELECT * FROM SINH_VIEN 
INNER JOIN KET_QUA kq ON SINH_VIEN.MaSV = kq.MaSV 
WHERE MaMH = 'CSDL' AND DiemThi >= 8; 

# VD12: Lập danh sách sinh viên có học bổng của khoa CNTT. Thông tin cần: MaSV,
# HoTen, HocBong,TenLop
SELECT MaSV, HoTen, HocBong, TenLop FROM LOP
INNER JOIN SINH_VIEN sv ON LOP.MaLop = sv.MaLop
WHERE HocBong > 0 AND LOP.MaKhoa = "CN"; 

# VD13: Lập danh sách sinh viên có học bổng của khoa CNTT. Thông tin cần: MaSV,
# HoTen, HocBong,TenLop, TenKhoa
SELECT MaSV, HoTen, HocBong, TenLop, TenKhoa FROM ((LOP
INNER JOIN SINH_VIEN ON LOP.Malop = SINH_VIEN.MaLop) 
INNER JOIN KHOA ON LOP.MaKhoa = KHOA.MaKhoa)
WHERE HocBong > 0 AND KHOA.MaKhoa = 'CN';

# VD14: Cho biết số sinh viên của mỗi lớp
SELECT LOP.MaLop, TenLop, COUNT(MaSV) AS SL FROM LOP 
INNER JOIN SINH_VIEN ON LOP.MaLop = SINH_VIEN.MaLop GROUP BY LOP.MaLop, TenLop;

# VD15: Cho biết số lượng sinh viên của mỗi khoa
SELECT KHOA.MaKhoa, TenKhoa, Count(MaSV) as SLsinhvien FROM ((KHOA 
INNER JOIN LOP ON KHOA.Makhoa = LOP.MaKhoa) INNER JOIN SINH_VIEN ON LOP.MaLop =
SINH_VIEN.MaLop) GROUP BY KHOA.MaKhoa, TenKhoa;

# VD16: Cho biết số lượng sinh viên nữ của mỗi khoa.
SELECT Khoa.MaKhoa, TenKhoa, Count(MaSV) as SLsinhvien FROM ((SINH_VIEN
INNER JOIN Lop ON Lop.MaLop = SINH_VIEN.MaLop) INNER JOIN KHOA ON
KHOA.MaKhoa = LOP.MaKhoa) WHERE SINH_VIEN.GioiTinh = 'Nu' GROUP BY KHOA.MaKhoa, TenKhoa;

# VD17:  Cho biết tổng tiền học bổng của mỗi lớp
SELECT LOP.MaLop, TenLop, Sum(HocBong) as TongHB FROM (LOP INNER JOIN
SINH_VIEN ON Lop.MaLop = SINH_VIEN.MaLop) GROUP BY LOP.MaLop, TenLop;

# VD18:  Cho biết tổng số tiền học bổng của mỗi khoa
SELECT KHOA.MaKhoa, TenKhoa, Sum(HocBong) AS TongHB FROM ((LOP
INNER JOIN SINH_VIEN ON LOP.MaLop = SINH_VIEN.MaLop) INNER JOIN KHOA
ON KHOA.MaKhoa = LOP.MaKhoa) GROUP BY KHOA.MaKhoa, TenKhoa;

# VD19: Lập danh sánh những khoa có nhiều hơn 100 sinh viên. Danh sách cần:
# MaKhoa, TenKhoa, Soluong 
SELECT KHOA.MaKhoa, TenKhoa, COUNT(MaSV) AS SoLuong FROM ((LOP
INNER JOIN SINH_VIEN ON LOP.MaLop = SINH_VIEN.MaLop) INNER JOIN KHOA
ON KHOA.MaKhoa = LOP.MaKhoa) GROUP BY KHOA.MaKhoa, TenKhoa HAVING COUNT(MaSV) > 100;

# VD20: Lập danh sánh những khoa có nhiều hơn 50 sinh viên nữ. Danh sách cần:
# MaKhoa, TenKhoa, Soluong 
SELECT KHOA.MaKhoa, TenKhoa, COUNT(MaSV) AS SoLuong FROM ((LOP
INNER JOIN SINH_VIEN ON LOP.MaLop = SINH_VIEN.MaLop) INNER JOIN KHOA
ON KHOA.MaKhoa = LOP.MaKhoa) WHERE SINH_VIEN.GioiTinh = 'Nu' GROUP BY KHOA.MaKhoa, TenKhoa HAVING COUNT(MaSV) > 50;

# VD21:  Lập danh sách những khoa có tổng tiền học bổng >= 1.000.000. 
SELECT KHOA.MaKhoa, TenKhoa FROM 
KHOA INNER JOIN LOP ON KHOA.MaKhoa = LOP.MaKhoa
INNER JOIN SINH_VIEN ON LOP.MaLop = SINH_VIEN.MaLop WHERE SINH_VIEN.HocBong >= 1000000; 

# VD22: Lập danh sách sinh viên có học bổng cao nhất
SELECT * FROM SINH_VIEN 
WHERE HocBong >= ALL( SELECT HocBong FROM SINH_VIEN);

# VD23: Lập danh sách sinh viên có điểm thi môn CSDL cao nhất
SELECT SINH_VIEN.MaSV, HoTen, DiemThi FROM SINH_VIEN
INNER JOIN KET_QUA ON KET_QUA.MaSV = SINH_VIEN.MaSV
WHERE KET_QUA.MaMH = 'INT01' AND KET_QUA.DiemThi >= ALL(SELECT DiemThi FROM KET_QUA WHERE KET_QUA.MaMH = 'INT01');

# VD24:  Lập danh sách những sinh viên không có điểm thi môn CSDL
SELECT SINH_VIEN.MaSV, HoTen, DiemThi,MaMH FROM SINH_VIEN INNER JOIN
KET_QUA ON SINH_VIEN.MaSV = KET_QUA.MaSV WHERE SINH_VIEN.MaSV NOT In (Select
MaSV From KET_QUA Where MaMH = 'CSDL');

# VD25: Cho biết những khoa nào có nhiều sinh viên nhất
SELECT KHOA.MaKhoa, TenKhoa, Count(MaSV) AS SoLuongSV FROM 
(KHOA INNER JOIN LOP ON KHOA.MaKhoa = LOP.MaKhoa) INNER JOIN SINH_VIEN ON LOP.MaLop =SINH_VIEN.MaLop 
GROUP BY KHOA.MaKhoa, KHOA.TenKhoa HaVing Count(MaSV)>=All(Select Count(MaSV) FROM 
((SINH_VIEN INNER JOIN LOP ON LOP.Malop=SINH_VIEN.Malop) INNER JOIN KHOA ON KHOA.MaKhoa = LOP.MaKhoa) 
GROUP BY KHOA.Makhoa);




