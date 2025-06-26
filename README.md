# 🚌 Transporter - Sistema de Venda de Passagens

![Java](https://img.shields.io/badge/Made%20with-Java-red?style=for-the-badge&logo=java)
![License](https://img.shields.io/badge/License-MIT-blue?style=for-the-badge)

## 📖 Sobre o Projeto

**Transporter** é uma aplicação desktop desenvolvida em **Java Swing** para simular um sistema de gerenciamento e venda de passagens de ônibus. O projeto foi criado como uma forma de aplicar conceitos de Programação Orientada a Objetos, manipulação de eventos e construção de interfaces gráficas (GUI).

A aplicação permite o cadastro de cidades e passageiros, a venda de passagens para uma viagem pré-definida e a visualização em tempo real das poltronas ocupadas e livres em um layout gráfico de um ônibus.

## ✨ Visão Geral da Aplicação

Aqui está uma demonstração da tela principal da aplicação em funcionamento.

![image](https://github.com/user-attachments/assets/790d6740-b8cc-412c-9c1b-15bbf9d59311)
## 🚀 Funcionalidades Principais

-   **Cadastro de Passageiros:** Adiciona novos passageiros ao sistema.
-   **Cadastro de Cidades:** Adiciona novas cidades que podem servir como origem ou destino.
-   **Venda de Passagens:** Realiza a venda de uma passagem, associando um passageiro a uma poltrona.
-   **Cancelamento de Passagens:** Libera uma poltrona previamente ocupada.
-   **Visualização de Poltronas:** Interface gráfica que exibe as 40 poltronas do ônibus, com cores que indicam sua disponibilidade (Verde para livre, Vermelho para ocupada).
-   **Listagem de Dados:** Telas para visualizar todos os passageiros, cidades e passagens vendidas, com ordenação alfabética.

## 🛠️ Tecnologias Utilizadas

-   **Linguagem:** Java 11
-   **Interface Gráfica:** Java Swing
-   **IDE:** Desenvolvido utilizando o construtor de interfaces do NetBeans.

## 📂 Estrutura do Projeto

O código-fonte está localizado no diretório `src/transporter` e segue a seguinte estrutura:

-   **Modelos (POJOs):**
    -   `Cidade.java`: Representa uma cidade.
    -   `Passageiro.java`: Representa um passageiro.
    -   `Passagem.java`: Representa uma passagem vendida.
-   **Telas (Views):**
    -   `TelaPrincipal.java`: A tela principal que centraliza a navegação e a visualização das poltronas.
    -   `TelaCadastro...java`: Telas para inserção de novos dados.
    -   `TelaVisualizar...java`: Telas para listagem de dados existentes.
    -   `TelaVendaPassagem.java`: Tela responsável pela lógica de venda.
    -   `TelaSobre.java`: Informações sobre o autor.
-   **Recursos:**
    -   `src/imagens`: Contém os ícones utilizados na interface gráfica.

## 👨‍💻 Autor

-   **Caio Akihiro Garcia Nishimura** - `https://www.linkedin.com/in/caio-nishimura/`
