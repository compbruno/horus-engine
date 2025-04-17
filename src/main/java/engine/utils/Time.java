package engine.utils;

import static org.lwjgl.glfw.GLFW.*;

public class Time {
    private static double lastTime = 0;
    private static double deltaTime = 0;

    // Chame isso no início de cada frame (dentro do loop principal)
    public static void update() {
        double currentTime = glfwGetTime();
        deltaTime = currentTime - lastTime;
        lastTime = currentTime;
    }

    // Retorna o tempo decorrido desde o último update
    public static double getDeltaTime() {
        return deltaTime;
    }

    // Retorna o tempo total desde que o programa começou
    public static double getTime() {
        return glfwGetTime();
    }
}
