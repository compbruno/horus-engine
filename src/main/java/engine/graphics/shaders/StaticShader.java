package engine.graphics.shaders;

public class StaticShader extends ShaderProgram {

    private static final String VERTEX_FILE = "src/main/resources/shaders/vertex.glsl";
    private static final String FRAGMENT_FILE = "src/main/resources/shaders/fragment.glsl";

    public StaticShader() {
        super(VERTEX_FILE, FRAGMENT_FILE);
    }

    @Override
    protected void bindAttributes() {
        super.bindAttribute(0, "position");
        bindAttribute(0, "position");
        bindAttribute(1, "textureCoords");
    }
}
