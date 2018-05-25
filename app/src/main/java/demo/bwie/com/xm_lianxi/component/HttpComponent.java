package demo.bwie.com.xm_lianxi.component;

import android.app.ListActivity;

import demo.bwie.com.xm_lianxi.ui.classify.ClassifyFragment;
import demo.bwie.com.xm_lianxi.ui.homepage.HomePageFragment;
import demo.bwie.com.xm_lianxi.ui.login.LoginActivity;

public interface HttpComponent {
    void inject(LoginActivity loginActivity);

    void inject(HomePageFragment homePageFragment);

    void inject(ClassifyFragment classifyFragment);

    void inject(ListActivity listActivity);

    void inject(ListDetailsActivity listDetailsActivity);

    void inject(ShopCartActivity shopCartActivity);
}
