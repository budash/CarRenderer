package ua.dp.budash.carrenderer;

import android.content.Context;

import com.monyetmabuk.rajawali.tutorials.examples.AExampleFragment;

import org.rajawali3d.Object3D;
import org.rajawali3d.lights.PointLight;
import org.rajawali3d.loader.ALoader;
import org.rajawali3d.loader.Loader3DSMax;
import org.rajawali3d.loader.async.IAsyncLoaderCallback;
import org.rajawali3d.materials.Material;
import org.rajawali3d.materials.textures.ATexture;
import org.rajawali3d.materials.textures.Texture;
import org.rajawali3d.surface.IRajawaliSurfaceRenderer;

/**
 * Created by Mika on 16.08.2015.
 */
public class CarRajawaliFragment extends AExampleFragment{
    @Override
    public IRajawaliSurfaceRenderer createRenderer() {
        return new BasicRenderer(getActivity());
    }

    private final class BasicRenderer extends AExampleRenderer implements IAsyncLoaderCallback {

        private Object3D mCar;

        public BasicRenderer(Context context) {
            super(context);
        }

        @Override
        protected void initScene() {
            try {

                PointLight light = new PointLight();
                light.setPosition(-2, 1, -4);
                light.setPower(3.5f);
                getCurrentScene().addLight(light);

                Loader3DSMax loader3DSMax = new Loader3DSMax(this, R.raw.camaro_mika);
                loadModel(loader3DSMax, this, R.raw.camaro_mika);

            } catch (Exception e) {
                e.printStackTrace();
            }

            getCurrentCamera().enableLookAt();
            getCurrentCamera().setLookAt(0, 0, 0);
            getCurrentCamera().setZ(6);
        }

       /* @Override
        public void onRender(final long elapsedTime, final double deltaTime) {
            super.onRender(elapsedTime, deltaTime);
            mSphere.rotate(Vector3.Axis.Y, 1.0);
        }*/

        private void addTexture(String childName, String textureName, int drawableId) {
            try {
                Material material = new Material();
                material.enableLighting(true);
                material.addTexture(new Texture(textureName, drawableId));
                material.setColorInfluence(0);
                mCar.getChildByName(childName).setMaterial(material);
            } catch (ATexture.TextureException e){

            }
        }

        @Override
        public void onModelLoadComplete(ALoader loader) {
            Loader3DSMax loader3DSMax = (Loader3DSMax) loader;
            mCar = loader3DSMax.getParsedObject();

            //addTexture();

            getCurrentScene().addChild(mCar);

        }

        @Override
        public void onModelLoadFailed(ALoader loader) {

        }
    }
}


