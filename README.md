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


###Respostas das perguntas
