🚀 Selenide UI Tests for the Website Footer

<p align="center"> <img src="https://img.shields.io/badge/Java-17+-blue?style=for-the-badge&logo=openjdk" alt="Java Badge"/> <img src="https://img.shields.io/badge/Selenide-v6+-33CC33?style=for-the-badge&logo=selenium" alt="Selenide Badge"/> <img src="https://img.shields.io/badge/JUnit%205-E35C5C?style=for-the-badge&logo=junit5" alt="JUnit 5 Badge"/> </p>

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

src/test/java/
├── helper/              # Вспомогательные классы (например, FooterChecker)
├── pages/               # Page Objects (ContactFooterPage, CookieBannerPage, BasePage и т.д.)
├── test/                # Тестовые классы
│   ├── BaseTest.java    # Базовый класс для конфигурации Selenide (@BeforeAll)
│   ├── CareerPageFooterTest.java
│   ├── ContactPageFooterTest.java
│   └── OnlyDigitalPagesFooterParametrizedTest.java # Параметризованный тест для группы страниц
└── testdata/            # Тестовые данные (TestData.java)

⚙️ Stack

    Язык программирования: Java 

    Фреймворк: Selenide

    Тестовый фреймворк: JUnit 5

    Сборка: Maven