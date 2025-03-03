# Xác định dải giá trị của Digital Number

## 1. Giá trị đầu vào (Digital Number)
Giả sử digital number có giá trị từ `min` đến `max`.
Nếu chưa rõ, bạn có thể duyệt qua toàn bộ mảng và tìm ra giá trị nhỏ nhất và lớn nhất.

## 2. Chuẩn hóa Digital Number
Mỗi giá trị `x` trong khoảng `[min, max]` được chuẩn hóa thành `t` trong khoảng `[0, 1]` theo công thức:

```
t = (x - min) / (max - min)
```

- `t = 0` tương ứng với giá trị thấp nhất.
- `t = 1` tương ứng với giá trị cao nhất.

## 3. Xây dựng Colormap Liên Tục

Colormap liên tục ánh xạ giá trị chuẩn hóa `t` sang màu RGB. Có thể làm theo hai cách:

### a. Sử dụng Colormap Chuẩn (Predefined)
Nhiều colormap chuẩn được sử dụng trong xử lý ảnh, như Jet, Viridis, Hot, Cool,…
Thường các thư viện như Matplotlib trong Python có sẵn các colormap này.

### b. Xây dựng Colormap Tùy Chỉnh
Giả sử nội suy giữa 3 điểm mốc:
- `t = 0`: Xanh Dương (`RGB(0, 0, 255)`)
- `t = 0.5`: Xanh Lá (`RGB(0, 255, 0)`)
- `t = 1`: Đỏ (`RGB(255, 0, 0)`)

Quy trình nội suy:

- Nếu `t` nằm giữa `[0, 0.5]`, nội suy tuyến tính giữa Xanh Dương và Xanh Lá.
- Nếu `t` nằm giữa `[0.5, 1]`, nội suy giữa Xanh Lá và Đỏ.

Công thức nội suy tuyến tính:

```
C(t) = C_low + (t - t_low) / (t_high - t_low) * (C_high - C_low)
```

Trong đó:
- `C(t)`: Giá trị kênh màu tại `t`.
- `C_low` và `C_high`: Giá trị kênh màu tại các điểm `t_low` và `t_high`.

Hàm `lerp(a, b, tNorm)` nội suy tuyến tính giữa `a` và `b`:

```
lerp(a, b, tNorm) = a + tNorm * (b - a)
```

## 4. Quy trình ánh xạ màu

### Trường hợp `t <= 0.5`

Chuẩn hóa `t` thành `tNorm`:
```
tNorm = t / 0.5
```
Tính các kênh màu:
```
red = lerp(0, 0, tNorm)  // luôn 0
green = lerp(0, 255, tNorm)  // từ 0 đến 255
blue = lerp(255, 0, tNorm)  // từ 255 xuống 0
```
Kết quả:
- `t = 0`: RGB = `(0, 0, 255)` → Xanh Dương.
- `t = 0.5`: RGB = `(0, 255, 0)` → Xanh Lá.

### Trường hợp `t > 0.5`

Chuẩn hóa `t` thành `tNorm`:
```
tNorm = (t - 0.5) / 0.5
```
Tính các kênh màu:
```
red = lerp(0, 255, tNorm)  // từ 0 đến 255
green = lerp(255, 0, tNorm)  // từ 255 xuống 0
blue = 0  // luôn 0
```
Kết quả:
- `t = 0.5`: RGB = `(0, 255, 0)` → Xanh Lá.
- `t = 1`: RGB = `(255, 0, 0)` → Đỏ.

## 5. Tổng kết
Hàm `getColorFromColormap(t)` ánh xạ giá trị `t` thành màu từ Xanh Dương qua Xanh Lá đến Đỏ.

- `t <= 0.5`: Nội suy từ Xanh Dương `(0,0,255)` đến Xanh Lá `(0,255,0)`.
- `t > 0.5`: Nội suy từ Xanh Lá `(0,255,0)` đến Đỏ `(255,0,0)`.

Cách tiếp cận này giúp biểu diễn Digital Number bằng màu sắc trực quan và dễ hiểu.

