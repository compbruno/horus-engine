package engine.utils;

import org.joml.Matrix4f;
import org.joml.Vector3f;

public class Maths {
    public static Matrix4f createTransformationMatrix(Vector3f translation, float rx, float ry, float rz, float scale) {
        Matrix4f transformationMatrix = new Matrix4f()
            .translate(translation)
            .rotateXYZ((float) Math.toRadians(rx), (float) Math.toRadians(ry), (float) Math.toRadians(rz))
            .scale(scale);

        return transformationMatrix;
    }
}
