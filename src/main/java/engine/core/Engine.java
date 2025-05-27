package engine.core;

import engine.graphics.Loader;
import engine.models.RawModel;
import engine.models.TextureModel;
import engine.textures.ModelTexture;
import engine.graphics.Renderer;
import engine.graphics.shaders.StaticShader;
import engine.input.Input;
import engine.utils.Time;

public class Engine {
    private Loader loader;
    private Window window;
    private RawModel model;
    private TextureModel textureModel;
    private Renderer renderer;
    private boolean running = true;
    private StaticShader shader;

    public void run() {
        init();
        loop();
        cleanup();
    }

    private void init() {
        window = new Window(1024, 768, "Horus Engine");
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

        float[] textureCoords = {
            0, 1,
            0, 0,
            1, 1,
            1, 0
        };

        model = loader.loadToVAO(vertices, textureCoords, indices);
        ModelTexture texture = new ModelTexture(loader.loadTexture("shrek"));
        textureModel = new TextureModel(model, texture);
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

        renderer.render(textureModel);

        shader.stop();
    }

    private void cleanup() {
        shader.cleanup();
        loader.cleanUp();
        window.cleanup();
    }
}
