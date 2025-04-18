# Practice – Spring Boot Multi‑Module Playground

> **Purpose**  : 기록형 실습 프로젝트 – 백엔드 기초부터 실무 감각까지 단계별로 Spring Boot · Security · JPA · Redis · Docker · AWS 를 모듈 단위로 차근차근 쌓아가는 Learning Tracker 레포입니다.

---

## 🏗 현재 모듈 상황

| Module | Description | Status |
|--------|-------------|--------|
| **common** | 공통 유틸리티·전역 예외·DTO | ✅ 초기화
| **spring‑boot** | Web + JPA 실습 (Hello / Greeting / User 도메인) | 🚧 Level 2 진행 중
| *(예정)* security‑jwt | Spring Security + JWT 인증 | ⏳ To Do
| *(예정)* redis-cache | Redis & Caffeine 캐싱 실습 | ⏳

> 모듈을 `settings.gradle` 의 `include '...'` 로 추가하고, 각 모듈 `build.gradle` 에 필요한 의존성을 선언합니다.
>
> 진행 상황에 따라 모듈이 더 추가될 예정
---

## ⚙ Tech Stack

- **Java 17**  ·  **Gradle 8.13**  (multi‑module)
- **Spring Boot 3.2.4**  – Web, Data JPA
- **H2 in‑memory**  (dev) / MySQL 8 (docker‑compose)
- **Lombok**, **MapStruct**  (code generation)
- **JUnit 5**  ·  **AssertJ**  (test)
- **[Notion](https://www.notion.so/1ca981230d5b8060ba24e78379f20365)**

---

## 📁 Project Structure

```
Practice/
 ├─ build.gradle          # Root – 공통 설정
 ├─ settings.gradle       # include 'common', 'spring-boot', ...
 ├─ common/
 │   ├─ src/main/java/com/example/common/…
 │   └─ build.gradle      # java‑library 모듈
 └─ spring-boot/
     ├─ src/main/java/com/example/springboot/
     │   ├─ GreetingController / Service
     │   ├─ user/ (Entity · DTO · Repository · Service · Controller)
     │   └─ SpringBootApplication
     ├─ src/main/resources/application.yml
     └─ build.gradle      # Boot 모듈
```

---

## 🚀 Getting Started



---

## 📡 REST API Snapshot

| Method | Endpoint | Description                   |
|--------|----------|-------------------------------|
| GET | `/hello` | Health‑check – "Hello Boot!"  |
| GET | `/greet` | Greeting 서비스 – "Hello, world" |
| POST | `/users` | Create user (JSON body)       |
| GET | `/users/{id}` | Find user by id               |

> *Full swagger spec will be added when `security-jwt` 모듈에서 SpringDoc OpenAPI 를 적용할 예정.*

---

## 🗄 Database

| Profile | DB | URL |
|---------|----|-----|
| **dev** | H2 memory | `jdbc:h2:mem:practice` |
| **local** | MySQL 8 | `jdbc:mysql://localhost:3306/practice` |
| **prod** | (예정) AWS RDS | `jdbc:mysql://prod-rds:3306/practice` |

- **Flyway** : `src/main/resources/db/migration` 에 버전 스크립트 관리

---

## 🧪 Tests

> 통합 테스트는 Testcontainers MySQL 로 환경 격리 예정.

---

## 🔜 Roadmap

- [ ] **security-jwt** 모듈 – JWT 로그인·필터 · Google OAuth2
- [ ] **JPA Level 3** – QueryDSL & N+1 최적화
- [ ] **redis-cache** 모듈 – Cache‑Aside & SortedSet 랭킹 API
- [ ] **docker-aws** 모듈 – ECS + GitHub Actions Blue‑Green 배포
- [ ] **Testing & TDD** 모듈 – TestContainers + JaCoCo 80 %


