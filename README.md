# Práticas Java POO

Repositório de exercícios pessoais para praticar e aprender Programação Orientada a Objetos em Java.  
O objetivo principal é estudar, experimentar conceitos (classes, herança, interfaces, coleções, exceções, etc.) e manter commits diários para acompanhar a evolução.

Visite o repositório: [llercio/Praticas-Java-Poo](https://github.com/llercio/Praticas-Java-Poo)

## Objetivos
- Aprender e praticar conceitos de POO em Java.
- Fazer pequenos exercícios e projetos experimentais.
- Manter um ritmo de commits diários (daily commit) para treinar disciplina e acompanhar progresso.

## Estrutura sugerida do repositório
Organize os exercícios por pastas; ex.:
- `exercicios/` — pasta raiz com subpastas por exercício
  - `exercicios/ex01/` — exercício 1 (código fonte, README do exercício, etc.)
  - `exercicios/ex02/` — exercício 2
- `docs/` — observações, anotações ou resumos sobre o que foi aprendido

Adapte conforme suas preferências/IDE.

## Como rodar (exemplos simples)
Recomenda-se ter o JDK 11+ instalado. Você pode rodar arquivos ou projetos de várias formas:

1) Compilar e executar um único arquivo Java:
```bash
javac MinhaClasse.java
java MinhaClasse
```

2) Compilar uma pasta com vários arquivos:
```bash
javac -d out $(find . -name "*.java")
java -cp out pacote.Principal
```

3) Usar uma IDE (IntelliJ IDEA, Eclipse) — importar o diretório como projeto Java e rodar as classes com `main`.

Se usar Maven/Gradle, inclua instruções específicas por projeto.
