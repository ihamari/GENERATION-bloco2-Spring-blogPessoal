# 📝 Blog Pessoal - Back-End

API REST desenvolvida em **Java com Spring Boot**, responsável pela gestão de usuários, postagens e temas do Blog Pessoal.

Este repositório corresponde ao back-end do projeto, que oferece os dados e funcionalidades para o front-end consumir.

## 🚀 Deploy
https://generation-spring-blogpessoal-ihamari.onrender.com/

## 🔗 Front-End do Projeto
👉 [Repositório Front-End](https://github.com/ihamari/blogpessoal-projeto-react)

## 🛠️ Tecnologias e Ferramentas
- Java 17
- Spring Boot
- Spring Data JPA
- Spring Security + JWT
- Hibernate
- MySQL
- Maven
- Swagger (documentação da API)
- Deploy: *(Render ou outro, se tiver)*

## 💻 Funcionalidades
- ✅ Cadastro e autenticação de usuários (JWT)
- ✅ CRUD de postagens
- ✅ CRUD de temas
- ✅ Associação de postagens aos temas
- ✅ Validações, segurança e autenticação
- ✅ Documentação da API com Swagger

## 🔑 Autenticação
O projeto utiliza **JWT (JSON Web Token)** para autenticação.

Após realizar o login, é gerado um token que deve ser enviado no cabeçalho de todas as requisições protegidas

## 🔗 Principais Endpoints
/usuarios — Cadastro e autenticação de usuários <br>
/postagens — CRUD de postagens <br>
/temas — CRUD de temas <br>
/auth/login — Login e geração de token JWT <br>
