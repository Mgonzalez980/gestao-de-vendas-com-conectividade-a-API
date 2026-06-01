# 🚀 Gestão de Vendas com Conectividade de API

Este projeto é uma API RESTful robusta desenvolvida em **Java** com **Spring Boot**, focada no gerenciamento integrado de vendas e recursos humanos.

O diferencial desta versão é a **conectividade inteligente entre entidades**: o sistema agora processa vendas vinculadas a funcionários específicos, automatizando a busca de dados e garantindo a integridade relacional entre os registros.

---

## 🛠️ Tecnologias Utilizadas

* **Linguagem:** Java 17+
* **Framework:** Spring Boot 3.x
* **Gerenciador de Dependências:** Maven
* **Banco de Dados:** H2 Database (Em memória)
* **Persistência:** Spring Data JPA / Hibernate

---

## 📋 Funcionalidades Principais

* **Gestão de Funcionários:** CRUD completo para cadastro e listagem de colaboradores.
* **Sistema de Vendas Inteligente:** * **Relacionamento `@ManyToOne`:** Cada venda é atrelada a um funcionário.
  * **Integração de Dados:** Ao realizar o POST de uma venda, a API consome os dados do funcionário pelo ID, unificando as informações.
  * **Cálculo Automático:** O valor total da venda (`valorTotalVenda`) é calculado automaticamente (`valorProduto` * `qtd`) pela camada de serviço (`Service`).

---

## 🏗️ Arquitetura do Relacionamento

O fluxo implementado segue a lógica de dependência entre objetos no Spring:


---

## 🚀 Como Executar

1. **Clone o repositório:**
   ```bash
   git clone [https://github.com/Mgonzalez980/gestao-de-vendas-com-conectividade-a-API.git](https://github.com/Mgonzalez980/gestao-de-vendas-com-conectividade-a-API.git)
