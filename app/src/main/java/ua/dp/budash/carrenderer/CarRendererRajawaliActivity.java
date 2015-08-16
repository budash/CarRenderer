package ua.dp.budash.carrenderer;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;

import com.monyetmabuk.rajawali.tutorials.examples.AExampleFragment;

/**
 * Created by Mika on 16.08.2015.
 */
public class CarRendererRajawaliActivity extends FragmentActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if(savedInstanceState == null){
            Fragment f = new CarRajawaliFragment();
            Bundle b = new Bundle();
            b.putString(AExampleFragment.BUNDLE_EXAMPLE_URL, "no url");
            b.putString(AExampleFragment.BUNDLE_EXAMPLE_TITLE, "car renderer");
            f.setArguments(b);
            getSupportFragmentManager().beginTransaction().replace(android.R.id.content, f).commit();
        }
    }
}
