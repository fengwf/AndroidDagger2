package cn.woblog.androiddagger2;

import android.app.Application;

import javax.inject.Singleton;

import cn.woblog.androiddagger2.module.AppApplicationModule;
import dagger.Component;

/**
 * Created by renpingqing on 16/7/18.
 */
public class AppApplication extends Application {

    private ApplicationComponent component;

    @Override
    public void onCreate() {
        super.onCreate();
        component = DaggerAppApplication_ApplicationComponent.builder().appApplicationModule(new AppApplicationModule(this)).build();
        component.inject(this);
    }

    @Singleton
    @Component(modules = AppApplicationModule.class)
    public interface ApplicationComponent {
        void inject(MainActivity demoActivity);
        void inject(AppApplication application);
    }

    public ApplicationComponent component() {
        return component;
    }
}
