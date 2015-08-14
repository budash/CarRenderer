package ua.dp.budash.carrenderer;

import min3d.core.Object3dContainer;
import min3d.core.RendererActivity;
import min3d.parser.IParser;
import min3d.parser.Parser;
import min3d.vos.Light;

/**
 * Created by Mika on 14.08.2015.
 */
public class CarRendererMin3dActivity extends RendererActivity {

    private final float CAM_RADIUS_X = 20;
    private final float CAM_RADIUS_Y = 15;
    private final float CAM_RADIUS_Z = 30;
    private final float ROTATION_SPEED = 1;
    private Object3dContainer car;
    private float degrees;

    @Override
    public void initScene() {

        scene.lights().add(new Light());

        IParser parser = Parser.createParser(Parser.Type.MAX_3DS,
                getResources(), getPackageName() + ":raw/camaro_mika", false);
        parser.parse();

        car = parser.getParsedObject();
        car.scale().x = car.scale().y = car.scale().z  = 3f;
        car.position().y = -20;
        scene.addChild(car);

        scene.camera().target = car.position();
    }

    @Override
    public void updateScene() {
        float radians = degrees * ((float)Math.PI / 180);

        scene.camera().position.x = (float)Math.cos(radians) * CAM_RADIUS_X;
        scene.camera().position.y = (float)Math.sin(radians) * CAM_RADIUS_Y;
        scene.camera().position.z = (float)Math.sin(radians) * CAM_RADIUS_Z;

        degrees += ROTATION_SPEED;
    }
}
