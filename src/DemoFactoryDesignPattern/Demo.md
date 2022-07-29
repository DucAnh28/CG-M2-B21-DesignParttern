Mẫu thiết kế Factory Method hoặc Factory Pattern được sử dụng để xác định một interface hoặc lớp trừu tượng (abstract)
để tạo một đối tượng nhưng để cho các lớp con quyết định lớp nào sẽ khởi tạo.
Nói cách khác, các lớp con chịu trách nhiệm tạo ra thể hiện của lớp.

Lợi thế của Factory Design Pattern
Mẫu thiế kế Factory Method cho phép các lớp con chọn kiểu đối tượng cần tạo.
Mở rộng code dễ dàng hơn (Khi muốn mở rộng thêm 1 loại class con khác, ta chỉ việc thêm mới nó và sửa đầu vào trong Factory Method là được).
Nó thúc đẩy sự liên kết lỏng lẻo bằng cách loại bỏ sự cần thiết phải ràng buộc các lớp cụ thể vào code.
Điều đó có nghĩa là code chỉ tương tác với interface hoặc lớp abstract, để nó sẽ làm việc với bất kỳ lớp nào implements
interface đó hoặc extends lớp abstract.