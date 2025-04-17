package engine.core;

import engine.input.Input;
import engine.utils.Time;

public class Engine {
    private Window window;

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
        while (!window.shouldClose()) {
            Time.update();

            if (Input.isKeyPressed(256)) { // ESC
                System.out.println("Encerrando...");
                break;
            }

            window.update();
        }
    }

    private void cleanup() {
        window.cleanup();
    }
}
