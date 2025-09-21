[🇬🇧 English](./README.md) | [🇩🇪 Deutsch](./README.de.md)

# فارسی 🇮🇷
## معرفی📌 نمونه Template – اسپرینگ بوت + String Template Expression در جاوا 21
این پروژه نحوه استفاده از String Template Expressions (قابلیت پیش‌نمایش جاوا 21) را در یک Spring Boot REST API نشان می‌دهد.
با این روش می‌توان پیام‌ها و پاسخ‌های JSON را راحت‌تر و خواناتر تولید کرد.

## تکنولوژی‌ها🚀 ویژگی‌ها
- Spring Boot 3.x + Java 21

- API با پارامتر ورودی از طریق Query

- استفاده از STR برای ساخت رشته‌ها

- لاگ‌نویسی ساده‌تر با Template Expression

- برگرداندن JSON به عنوان پاسخ


درخواست:

http://localhost:8080/user?name=Monire&age=30


پاسخ:

{
"name": "Monire",
"age": 30,
"message": "Welcome Monire, you are 30 years old!"
}


لاگ:

INFO  ... Generating response for user Monire with age 30


## تعریف
در جاوا 21 یک قابلیت پیش‌نمایشی (Preview Feature) به نام String Template Expressions معرفی شده که خیلی شبیه به string interpolation در زبان‌هایی مثل Kotlin، Python یا JavaScript عمل می‌کند.

### 1. مشکل قدیمی
قبلاً اگر می‌خواستیم متغیرها را داخل رشته چاپ کنیم باید از + یا String.format یا MessageFormat استفاده می‌کردیم:

    String name = "Monire";
    int age = 30;

    String text1 = "Name: " + name + ", Age: " + age;
    String text2 = String.format("Name: %s, Age: %d", name, age);

این کار هم طولانی می‌شد و هم خوانایی کد را کم می‌کرد.

### حالت 2. String Templates در Java 21
در جاوا 21 می‌توانیم از template expression استفاده کنیم:

 String name = "Monire";
 int age = 30;

 String result = STR."Name: \{name}, Age: \{age}";
 System.out.println(result);

خروجی:

Name: Monire, Age: 30


### 3. چرا STR. ؟
در جاوا 21 سه نوع Template Processor معرفی شده‌اند:
- STR → تبدیل ساده به String

- FMT → فرمت پیشرفته (مثل String.format)

- RAW → رشته خام بدون پردازش escape sequences

مثال FMT:

 String name = "Monire";
 int age = 30;

 String formatted = FMT."Name: %s, Age: %d".formatted(name, age);
 System.out.println(formatted);
