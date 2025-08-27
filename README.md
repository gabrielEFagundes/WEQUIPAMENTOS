# WEQUIPAMENTOS

**Controle de Equipamentos para a empresa WEG**

Este projeto tem como objetivo gerenciar o controle de equipamentos utilizados dentro da empresa WEG, oferecendo funcionalidades para cadastro, consulta, atualização e administração dos ativos de forma eficiente e segura.

---

## 📋 Descrição

O WEQUIPAMENTOS é uma aplicação desenvolvida em Java para apoiar processos internos relacionados ao controle de equipamentos, registro de movimentações, manutenção e acompanhamento de histórico. Ideal para empresas que buscam digitalizar e centralizar informações sobre seus ativos, garantindo rastreabilidade e agilidade na gestão.

---

## ⚙️ Requisitos e Dependências

- **Java 8 ou superior**
- **Banco de dados relacional** (MySQL, PostgreSQL ou outro compatível)
- **Maven** (para gerenciamento de dependências)
- Bibliotecas Java necessárias (definidas no arquivo `pom.xml`)
- (Opcional) Servidor de aplicação, como Tomcat ou Jetty

---

## 🚀 Instalação, Configuração e Execução

### 1. Clone o repositório

```bash
git clone https://github.com/gabrielEFagundes/WEQUIPAMENTOS.git
cd WEQUIPAMENTOS
```

### 2. Configure o banco de dados

- Crie um banco de dados para o sistema (ex: `wequipamentos_db`)
- Atualize as credenciais de acesso no arquivo de configuração da aplicação (exemplo: `src/main/resources/application.properties`):

  ```
  spring.datasource.url=jdbc:mysql://localhost:3306/wequipamentos_db
  spring.datasource.username=SEU_USUARIO
  spring.datasource.password=SUA_SENHA
  ```

### 3. Instale as dependências

```bash
mvn install
```

### 4. Execute a aplicação

```bash
mvn spring-boot:run
```

Ou, caso utilize um servidor de aplicação, gere o arquivo `.war` e faça o deploy.

---

## 💡 Exemplos de Uso

- **Cadastrar novo equipamento:** Acesse a interface web e preencha o formulário de cadastro.
- **Consultar equipamentos:** Utilize o menu de busca para localizar ativos por nome, tipo ou status.
- **Registrar movimentações:** Atualize o histórico de uso e localização dos equipamentos.
- **Gerenciar manutenções:** Adicione registros de manutenção para controle preventivo.

---

## 🤝 Como Contribuir

1. Faça um fork do projeto
2. Crie uma branch para sua feature ou correção:
   ```
   git checkout -b minha-feature
   ```
3. Commit suas alterações:
   ```
   git commit -m "Descrição da alteração"
   ```
4. Envie para o repositório remoto:
   ```
   git push origin minha-feature
   ```
5. Abra um Pull Request

Consulte o arquivo [CONTRIBUTING.md](CONTRIBUTING.md) para mais detalhes.

---

## 📄 Licença

Este projeto está sob a licença MIT. Consulte o arquivo [LICENSE](LICENSE) para mais informações.

---

## 🗺️ Roadmap Futuro

- Integração com sistemas de inventário corporativo
- Relatórios avançados de uso e manutenção
- API REST para integrações externas
- Dashboard com gráficos e indicadores
- Autenticação e autorização por níveis de acesso

---

## 📞 Dúvidas ou Sugestões?

Abra uma issue ou entre em contato pelo [GitHub Issues](https://github.com/gabrielEFagundes/WEQUIPAMENTOS/issues).

---
