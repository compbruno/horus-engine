# 🌀 Horus Engine

**Horus Engine** é uma game engine modular desenvolvida em Java com **LWJGL 3** e **Gradle**, com foco em suportar múltiplos estilos de jogo, incluindo:

- 🎮 Jogos em 2D e 3D  
- 🔭 Visão isométrica  
- 🧍 Primeira pessoa (FPS)  
- ↔️ Side-scroller  

> Projeto pessoal de aprendizado e experimentação com arquitetura de game engines.

---

## 📁 Estrutura do Projeto

```
src/
└── main/
    └── java/
        └── engine/
            ├── core/        # Loop principal, Engine, Window
            ├── input/       # Sistema de Input (teclado, mouse)
            └── utils/       # Utilitários como classe Time
```

---

## 🚀 Como rodar

1. Clone o repositório:

```bash
git clone https://github.com/compbruno/horus-engine.git
cd horus-engine
```

2. Compile e rode:

```bash
./gradlew run
```

> Se estiver no Windows, pode usar `gradlew.bat run`.

---

## 🧱 Tecnologias usadas

- Java 17+
- Gradle
- LWJGL 3 (OpenGL, GLFW, OpenAL, stb, assimp)

---

## ⏱ Delta Time

A engine utiliza um sistema de tempo (`Time.java`) para garantir que o jogo rode de forma consistente, independente da taxa de quadros (FPS). Isso significa que o movimento e animações não ficam mais rápidos ou lentos em máquinas diferentes.

---

## ✍️ Autor

**Bruno** – Desenvolvedor e entusiasta de engines.  
[GitHub](https://github.com/compbruno)

---

## 📌 TODOs

- [ ] Sistema de cena e renderização
- [ ] Sistema de entidades e componentes
- [ ] Importação de assets
- [ ] Física básica
- [ ] UI e HUD

---

## 📜 Licença

Este projeto está sob a licença MIT.
