# 📘 ProjetosJava

Este repositório contém diversos projetos desenvolvidos em **Java** como parte de atividades e avaliações de disciplinas de programação. Eles abrangem exercícios de Programação Orientada a Objetos (POO), desenvolvimento web com JavaServer Pages (JSP) integrado ao banco de dados MySQL, e um projeto final de POO que consiste em um jogo de labirinto. Todos os projetos foram criados utilizando o **Eclipse Luna**.

---

## 🛠️ Requisitos

- **JDK** (Java Development Kit) instalado (versão compatível com Eclipse Luna, como JDK 8).
- **Eclipse Luna** (ou outra IDE compatível com Java e JSP).
- **MySQL Server** instalado e configurado (para projetos com banco de dados: Projeto01, Projeto03 e Prova).
- **Conector MySQL para Java** (MySQL Connector/J) adicionado ao projeto (para projetos com banco de dados).
- **Servidor web** como Apache Tomcat configurado no Eclipse (para projetos JSP: Projeto01, Projeto03 e Prova).
- Sistema operacional compatível (Windows, Linux ou macOS).

---

## 📂 Estrutura do Repositório

O repositório contém várias pastas, cada uma correspondendo a um projeto ou atividade:  
- **PrimeiraListaPOO, SegundaListaPOO, TerceiraListaPOO e QuartaListaPOO**: Contêm as resoluções de listas de exercícios variados da disciplina de Programação Orientada a Objetos, com códigos-fonte em Java.  
- **ProjetoFinal**: Contém o projeto final da disciplina de POO, um jogo de labirinto com 5 níveis de dificuldade, onde o jogador ("*") deve navegar por espaços vazios até a saída ("X"), usando as teclas "asdw".  
- **Projeto01**: Um projeto simples em JSP com integração ao MySQL, contendo os arquivos JSP, classes Java e scripts SQL para um site que cadastra e consulta clientes.  
- **Projeto03**: Outro projeto em JSP com MySQL, com os arquivos JSP, classes Java e scripts SQL para um site que cadastra e consulta clientes e fornecedores.  
- **Prova**: Projeto da prova prática da disciplina Linguagem de Programação para Internet II, desenvolvido em JSP com MySQL, contendo os arquivos JSP, classes Java e scripts SQL para um site que cadastra e consulta vírus e doenças.

---

## ▶️ Como Executar os Códigos

### Projetos de POO (PrimeiraListaPOO, SegundaListaPOO, TerceiraListaPOO, QuartaListaPOO)
1. Abra a pasta do projeto desejado no Eclipse Luna.
2. Importe o projeto: `File > Import > General > Existing Projects into Workspace`.
3. Compile e execute o projeto clicando com o botão direito no arquivo principal e selecionando `Run As > Java Application`.

### ProjetoFinal (Jogo Labirinto)
1. Abra a pasta `ProjetoFinal` no Eclipse Luna.
2. Importe o projeto: `File > Import > General > Existing Projects into Workspace`.
3. Compile e execute o projeto clicando com o botão direito no arquivo principal e selecionando `Run As > Java Application`.
4. Use as teclas "a" (esquerda), "s" (baixo), "d" (direita) e "w" (cima) para mover o personagem "*". Pressione "Enter" após cada movimento (devido a uma limitação não resolvida).

### Projetos JSP (Projeto01, Projeto03, Prova)
1. Configure o MySQL: crie o banco de dados e execute os scripts SQL (se disponíveis na pasta do projeto) para criar as tabelas.
2. Abra a pasta do projeto desejado no Eclipse Luna.
3. Importe o projeto: `File > Import > General > Existing Projects into Workspace`.
4. Adicione o MySQL Connector/J ao projeto: `Project > Properties > Java Build Path > Libraries > Add External JARs`.
5. Ajuste a string de conexão com o MySQL (usuário, senha, host, etc.) no código ou arquivo de configuração.
6. Configure o Apache Tomcat no Eclipse: `Window > Preferences > Server > Runtime Environments > Add > Apache Tomcat`.
7. Execute o projeto: clique com o botão direito no projeto e selecione `Run As > Run on Server`.

---

## 📥 Como Baixar o Repositório

1. Clique no botão verde "Code" no topo da página do GitHub.
2. Selecione "Download ZIP" e extraia o arquivo no seu computador.
3. Ou use o Git: `git clone https://github.com/cstavaresj/ProjetosJava.git`

---
