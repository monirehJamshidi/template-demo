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

