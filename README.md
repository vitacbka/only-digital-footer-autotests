🚀 Selenide UI Tests for the Website Footer

<p align="center"> <img src="https://img.shields.io/badge/Java-17+-blue?style=for-the-badge&logo=openjdk" alt="Java Badge"/> <img src="https://img.shields.io/badge/Selenide-v6+-33CC33?style=for-the-badge&logo=selenium" alt="Selenide Badge"/> <img src="https://img.shields.io/badge/JUnit%205-E35C5C?style=for-the-badge&logo=junit5" alt="JUnit 5 Badge"/> </p>

⚙️ Stack

    Язык программирования: Java 

    Фреймворк: Selenide

    Тестовый фреймворк: JUnit 5

    Сборка: Maven

✨ О проекте

Этот проект содержит UI-автотесты, написанные на Java с использованием фреймворка Selenide и тестового фреймворка JUnit 5.

Основная цель тестов — обеспечить стабильность и консистентность элементов футера (подвала) на различных страницах веб-сайта.

Тесты проверяют:

    ✅ Наличие иконки Behance, DProfile, Telegram, VK.

    ✅ Корректность текста копирайта.

    ✅ Наличие и соответствие текста баннера 'Creative Digital Production'.

    ✅ Доступность ссылки 'Политика конфиденциальности'.

📁 Структура проекта

Проект организован по стандартной структуре для Selenide/JUnit проектов:


| Папка | Назначение | Файлы |
|-------|------------|-------|
| `helper/` | Вспомогательные классы | `FooterChecker.java` |
| `pages/` | Page Objects | `BasePage.java`, `ContactFooterPage.java`, `CookieBannerPage.java` |
| `test/` | Тестовые классы | `BaseTest.java`, `CareerPageFooterTest.java`, `ContactPageFooterTest.java`, `OnlyDigitalPagesFooterParametrizedTest.java` |
| `testdata/` | Тестовые данные | `TestData.java` |
