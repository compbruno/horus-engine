package engine.core;

import engine.graphics.Loader;
import engine.graphics.RawModel;
import engine.graphics.Renderer;
import engine.input.Input;
import engine.utils.Time;

public class Engine {
    private Window window;

    private boolean running = true;

    private RawModel model;

    private Renderer renderer;

    private Loader loader;

    public void run() {
        init();
        loop();
        cleanup();
    }

    private void init() {
        window = new Window(800, 600, "Horus Engine");
        window.create();
        
        loader = new Loader();
        renderer = new Renderer();

        float[] vertices = {
            // Left top
            -0.5f,  0.5f, 0.0f,
            -0.5f, -0.5f, 0.0f,
            0.5f, 0.5f, 0.0f,
            // Right bottom
            -0.5f, -0.5f, 0.0f,
            0.5f, -0.5f, 0.0f,
            0.5f, 0.5f, 0.0f,
       };

       model = loader.loadToVAO(vertices);
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

        renderer.render(model);
    }

    private void cleanup() {
        loader.cleanUp();
        window.cleanup();
    }
}
