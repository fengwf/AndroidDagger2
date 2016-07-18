package cn.woblog.androiddagger2.module;

import android.content.Context;
import android.location.LocationManager;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import static android.content.Context.LOCATION_SERVICE;

/**
 * Created by renpingqing on 16/7/18.
 */
@Module
public class AppApplicationModule {

    private final Context context;

    public AppApplicationModule(Context context) {
        this.context=context;
    }

    //标示这个方法可以提供LocationManager
    @Provides
    @Singleton
    LocationManager provideLocationManager() {
        return (LocationManager) context.getSystemService(LOCATION_SERVICE);
    }
}
