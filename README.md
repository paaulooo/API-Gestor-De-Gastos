# 💸 Gestor de Gastos REST API

API REST para controle de gastos pessoais, desenvolvida com Spring Boot.  
Permite registrar, listar, filtrar e deletar despesas.

---

## 🔧 Tecnologias Utilizadas

- ✅ Java 17  
- ✅ Spring Boot  
- ✅ Spring Web  
- ✅ Spring Data JPA  
- ✅ PostgreSQL  
- ✅ Lombok  
- ✅ Maven  
- ✅ Postman (para testes)

---

## 📦 Funcionalidades

- ✅ Criar despesa  
- ✅ Listar todas as despesas  
- ✅ Filtrar por data, categoria ou descrição  
- ✅ Remover despesa  
- ✅ Validação automática dos dados  
- ✅ Enum para categorias

---

## 📄 Exemplo de saida em JSON (POST /expenses)

```json
{
  "description": "Supermercado",
  "amount": 150.75,
  "date": "2025-08-01",
  "category": "FOOD"
}
