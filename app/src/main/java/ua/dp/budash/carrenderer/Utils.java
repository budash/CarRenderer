package ua.dp.budash.carrenderer;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Mika on 14.08.2015.
 */
public class Utils {

    public static final String EMPTY_STR = "empty";

    private static Map<String, String> sResources = new HashMap<>();

    static {
        fillResNames();
    }


    public static String getResourceFrom3ds(String resName){
        if(sResources.containsKey(resName)){
            return sResources.get(resName);
        } else {
            return EMPTY_STR;
        }
    }


    public static final void fillResNames(){
        sResources.put("BOTTOM.png", "bottom.png");
        sResources.put("BRAKDISC.png", "brakdisc.png");
        sResources.put("CAMARO 1.png", "camaro_1.png");
        sResources.put("CAMARO 2.png", "camaro_2.png");
        sResources.put("CAMARO 3.png", "camaro_3.png");
        sResources.put("CAMARO 4.png", "camaro_4.png");
        sResources.put("CAMARO B.png", "camaro_b.png");
        sResources.put("CAMARO H.png", "camaro_h.png");
        sResources.put("CAMARO I.png", "camaro_i.png");
        sResources.put("CAMARO M.png", "camaro_m.png");
        sResources.put("CAMARO R.png", "camaro_r.png");
        sResources.put("DOORLIN1.png", "door1.png");
        sResources.put("DOORLINE.png", "door2.png");
        sResources.put("DRIVER.png", "driver_.png");
        sResources.put("LICENSE .png", "lic1.png");
        sResources.put("LICENSE.png", "lic2.png");
        sResources.put("Lines1.png", "l1.png");
        sResources.put("Lines2.png", "l2.png");
        sResources.put("TIRE BUM.png", "t_b.png");
        sResources.put("TIRE.png", "t.png");
        sResources.put("TIREBACK.png", "t_back.png");
    }


}
