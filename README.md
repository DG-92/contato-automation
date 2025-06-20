# Projeto de Automação Mobile com Appium, Java e Selenium<br>
<br>
Este projeto contém testes automatizados para aplicações mobile utilizando **Appium**, **Java** e **Selenium**.<br>
<br>
---<br>
<br>
## Pré-requisitos<br>
<br>
Antes de começar, você precisa ter instalado e configurado o seguinte ambiente:<br>
<br>
- [Java JDK 11+](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html)  <br>
- [Maven](https://maven.apache.org/install.html)  <br>
- [Node.js](https://nodejs.org/en/) (para Appium CLI)  <br>
- [Appium Server](https://appium.io/) (desktop ou via CLI)  <br>
- [Android Studio](https://developer.android.com/studio) com SDK e AVD (emulador Android) configurado ou dispositivo físico Android conectado  <br>
- [Git](https://git-scm.com/downloads) (opcional, para clonar o projeto)<br>
<br>
---<br>
<br>
## Passo a passo para configuração<br>
<br>
### 1. Clonar o projeto (opcional)<br>
<br>
```bash<br>
git clone https://github.com/DG-92/contato-automation<br>
cd contato-automation<br>
```<br>
<br>
### 2. Instalar dependências Java com Maven<br>
Na pasta do projeto, execute:<br>
<br>
```bash<br>
mvn clean install<br>
```<br>
<br>
Isso irá baixar todas as dependências definidas no pom.xml (Appium Java client, Selenium, TestNG etc).<br>
<br>
### 3. Instalar e iniciar o Appium Server<br>
Você pode iniciar o Appium de duas formas:<br>
<br>
- **Appium Desktop**: Abra o Appium Desktop e clique em "Start Server".<br>
- **Linha de comando (CLI)**:<br>
```bash<br>
npm install -g appium<br>
appium<br>
```<br>
<br>
Por padrão, o Appium server fica disponível em `http://127.0.0.1:4723/wd/hub`.<br>

# Perguntas e Respostas sobre Testes de Software e Desenvolvimento Ágil

---

### 1) O cliente adquiriu um novo modelo de máquina de cartão de crédito que aceita as bandeiras Visa, Master, Elo, Amex e Hiper e executa duas operações para cada bandeira: débito e crédito. Quantos testes serão necessários para validação dessa máquina e qual técnica deve ser utilizada?

Serão necessários 10 testes, pois temos 5 bandeiras multiplicadas por 2 operações (débito e crédito). A técnica recomendada é o teste de caixa preta utilizando particionamento equivalente, que ajuda a selecionar representações de classes de entrada para garantir cobertura eficiente sem redundância.

---

### 2) A bandeira Visa disponibilizou um novo range de bins no mercado que possui seis dígitos de 232425 a 232460. Quais os testes deverão ser feitos desse range de bins para confirmar que está funcionando?

Os testes devem cobrir os limites inferior e superior do range, além de valores logo fora desses limites para garantir que o sistema lide corretamente com os casos. Portanto, devem ser testados os bins: 232424, 232425, 232459, 232460 e 232461.

---

### 3) Cite uma abordagem de desenvolvimento ágil e explique-a.

Uma abordagem comum é o Scrum, que organiza o trabalho em ciclos curtos chamados sprints (geralmente de 2 a 4 semanas), permitindo entregas incrementais. Ele inclui reuniões diárias para alinhamento da equipe e promove colaboração, flexibilidade e entregas contínuas de valor ao cliente.

---

### 4) O que é CI/CD?

CI (Continuous Integration) é o processo de integração contínua do código desenvolvido por vários programadores em um repositório compartilhado, com builds e testes automatizados para detectar erros rapidamente.  
CD (Continuous Delivery / Continuous Deployment) é a automação da entrega do software para ambientes de teste e produção, garantindo que o sistema esteja sempre pronto para ser lançado. Continuous Deployment leva a entrega automática para produção após aprovação.

---

### 5) O que é TDD, BDD e ATDD e quando são aplicadas?

- **TDD (Test-Driven Development):** Técnica onde os testes são escritos antes do código, guiando o desenvolvimento. Foca em garantir qualidade e design do código.  
- **BDD (Behavior-Driven Development):** Extensão do TDD que usa linguagem natural para descrever o comportamento esperado do sistema, facilitando comunicação entre equipe técnica e de negócio.  
- **ATDD (Acceptance Test-Driven Development):** Baseia-se em critérios de aceitação definidos pelo cliente, escritos antes do desenvolvimento para garantir que os requisitos sejam atendidos.  

Essas práticas são aplicadas para melhorar a qualidade do software, alinhamento com o negócio e reduzir defeitos.

---

### 6) Cite uma heurística de testes utilizada para front-end e back-end e explique-as.

- **Front-end:** Heurística de Usabilidade, que avalia se a interface do usuário é intuitiva, consistente e fácil de usar, melhorando a experiência e reduzindo erros.  
- **Back-end:** Heurística de Robustez, que verifica se o sistema trata corretamente entradas inválidas, falhas e erros inesperados, garantindo estabilidade e segurança.

---

### 7) Cite ferramentas de testes automatizados para Desktop, Web, APIs e Mobile.

- **Desktop:** WinAppDriver, AutoIt, Sikuli  
- **Web:** Selenium WebDriver, Cypress, Playwright  
- **API:** Postman, RestAssured, SoapUI  
- **Mobile:** Appium, Espresso (Android), XCUITest (iOS)

---

*Este documento foi criado para responder perguntas comuns sobre testes e desenvolvimento ágil, servindo como referência rápida para profissionais da área.*
