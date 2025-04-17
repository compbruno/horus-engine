package engine.input;

import org.lwjgl.glfw.GLFWKeyCallbackI;
import org.lwjgl.glfw.GLFWCursorPosCallbackI;

public class Input {

    // Teclas pressionadas
    private static boolean[] keys = new boolean[350]; // GLFW tem códigos até ~349

    // Posição do mouse
    private static double mouseX, mouseY;

    // Callback de teclado
    public static GLFWKeyCallbackI keyCallback = (window, key, scancode, action, mods) -> {
        if (key >= 0 && key < keys.length) {
            keys[key] = action != 0; // PRESS or REPEAT = true, RELEASE = false
        }
    };

    // Callback de movimento do mouse
    public static GLFWCursorPosCallbackI mouseMoveCallback = (window, xpos, ypos) -> {
        mouseX = xpos;
        mouseY = ypos;
    };

    // Verifica se uma tecla está pressionada
    public static boolean isKeyPressed(int keyCode) {
        return keyCode >= 0 && keyCode < keys.length && keys[keyCode];
    }

    // Coordenadas do mouse
    public static double getMouseX() {
        return mouseX;
    }

    public static double getMouseY() {
        return mouseY;
    }
}
