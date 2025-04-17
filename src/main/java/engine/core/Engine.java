package engine.core;

import engine.input.Input;
import engine.utils.Time;

public class Engine {
    private Window window;

    private boolean running = true;

    public void run() {
        init();
        loop();
        cleanup();
    }

    private void init() {
        window = new Window(800, 600, "Horus Engine");
        window.create();
    }

    private void loop() {
        while (!window.shouldClose() && running) {
            Time.update();

            processInput();
            update();
            render();

            window.update();
        }
    }

    private void processInput() {
        if (Input.isKeyPressed(256)) { 
            System.out.println("Encerrando...");
            running = false;
        }
    }

    private void update() {
        // Lógica de atualização do jogo
    }

    private void render() {
        window.clear();
    }

    private void cleanup() {
        window.cleanup();
    }
}
