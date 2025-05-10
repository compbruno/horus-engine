package engine.core;

import engine.graphics.Loader;
import engine.graphics.RawModel;
import engine.graphics.Renderer;
import engine.graphics.shaders.StaticShader;
import engine.input.Input;
import engine.utils.Time;

public class Engine {
    private Loader loader;
    private Window window;
    private RawModel model;
    private Renderer renderer;
    private boolean running = true;
    private StaticShader shader;

    public void run() {
        init();
        loop();
        cleanup();
    }

    private void init() {
        window = new Window(800, 600, "Horus Engine");
        window.create();
        shader = new StaticShader();
        loader = new Loader();
        renderer = new Renderer();

        float[] vertices = {
            -0.5f,  0.5f, 0.0f, // V0
            -0.5f, -0.5f, 0.0f, // V1
            0.5f, 0.5f, 0.0f,   // V2
            0.5f, -0.5f, 0.0f   // V3
       };

       int[] indices = {
            0, 1, 2,
            1, 3, 2
        };

        model = loader.loadToVAO(vertices, indices);
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
        shader.start();
        renderer.render(model);
        shader.stop();
    }

    private void cleanup() {
        shader.cleanup();
        loader.cleanUp();
        window.cleanup();
    }
}
