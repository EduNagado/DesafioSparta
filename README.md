# DesafioSparta

## 📋 Sobre o Projeto
Uma API RESTful que calcula a taxa de administração paga por cada cotista de um fundo de investimento.

## Tecnologias utilizadas

- Java 21
- Spring Boot 3.5.6
- Spring Web
- Spring Data JPA
- Spring Validation
- SpringDoc OpenAPI
- Oracle JDBC (ojdbc11)
- Gadle

## Pré-requisitos
- JDK 21
- Gradle 8+

## Como rodar a aplicação
### Clone o repositório:
```bash
git clone https://github.com/EduNagado/DesafioSparta.git
```
### Execute a aplicação usando Gradle:
```bash
./gradlew bootRun
```
### A aplicação estará disponível em
```bash
http://localhost:8080/swagger-ui/index.html#/
```

## 📊 Endpoints da API

### Cotistas
| Método | Endpoint | Descrição |
|--------|----------|-----------|
| GET | `/cotista` | Lista todos os cotistas |
| POST | `/cotista` | Cria um novo cotista |

### Cotas
| Método | Endpoint | Descrição |
|--------|----------|-----------|
| GET | `/cota` | Lista todos as cotas |
| POST | `/cota` | Cria uma nova cota |

### Negociação Diária
| Método | Endpoint | Descrição |
|--------|----------|-----------|
| GET | `/NegociacaoDiaria` | Lista todas as negociações diárias |
| POST | `/NegociacaoDiaria` | Registra uma nova negociação diária (vinculada a cotista e cota) |


### Taxa
| Método | Endpoint | Descrição |
|--------|----------|-----------|
| GET | `/taxa` | Lista todos as taxas |
| POST | `/taxa` | Cria uma nova taxa |


### Taxa de Administração
| Método | Endpoint | Descrição |
|--------|----------|-----------|
| GET | `/Calculo?taxaId={id}` | Calcula a taxa de administração para todos os Cotistas |



