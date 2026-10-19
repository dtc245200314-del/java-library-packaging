# Đóng gói và tái sử dụng thư viện Java — hoạt động 538

Hai dự án Maven riêng: `math-lib` cung cấp `com.codegym.Calculator`; `calculator-app` phụ thuộc vào JAR của thư viện. Maven reactor khai báo dependency chuẩn để hai module build theo đúng thứ tự, thay cho `systemPath` gắn với đường dẫn máy cá nhân.

Yêu cầu JDK 17+, Maven 3.9+. Tại thư mục gốc:

```sh
mvn clean package
```

Chạy trên Windows:

```powershell
java -cp "calculator-app/target/classes;math-lib/target/math-lib-1.0-SNAPSHOT.jar" com.codegym.Main
```

Linux/macOS thay dấu `;` của classpath bằng `:`. Thư viện đóng gói ở `math-lib/target/math-lib-1.0-SNAPSHOT.jar`. Khi dùng ngoài reactor, chạy `mvn install` tại gốc rồi khai báo dependency `com.codegym:math-lib:1.0-SNAPSHOT` trong ứng dụng mới.

Ứng dụng kiểm tra cộng, trừ, nhân, chia nguyên, chia số âm và chia 0. `NoSuchAlgorithmException` được giữ đúng chữ ký đề bài; trong API thực tế thường dùng `ArithmeticException` cho chia 0.

Nguồn: mã tự triển khai với trợ giúp Codex theo yêu cầu hoạt động CodeGym 538.
