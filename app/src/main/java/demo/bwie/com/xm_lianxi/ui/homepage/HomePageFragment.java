package demo.bwie.com.xm_lianxi.ui.homepage;

import android.view.View;

import com.sunfusheng.marqueeview.MarqueeView;

import java.util.ArrayList;
import java.util.List;

import demo.bwie.com.xm_lianxi.R;
import demo.bwie.com.xm_lianxi.bean.AdBean;
import demo.bwie.com.xm_lianxi.bean.CatagoryBean;
import demo.bwie.com.xm_lianxi.ui.base.BaseFragment;
import demo.bwie.com.xm_lianxi.ui.homepage.contract.HomPageContract;
import demo.bwie.com.xm_lianxi.ui.homepage.presenter.HomePagePresenter;

public class HomePageFragment extends BaseFragment<HomePagePresenter>implements HomPageContract.View,View.OnClickListener{
    private MarqueeView marqueeView;
    @Override
    public void onClick(View v) {

    }

    @Override
    public int getContentLayout() {
        return R.layout.fragment_home;
    }

    @Override
    public void inject() {

    }

    @Override
    public void initView(View view) {
        marqueeView = view.findViewById(R.id.marqueeView);
        List<String> info = new ArrayList<>();
        info.add("1. 大家好，我是孙福生。");
        info.add("2. 欢迎大家关注我哦！");
        info.add("3. GitHub帐号：sfsheng0322");
        info.add("4. 新浪微博：孙福生微博");
        info.add("5. 个人博客：sunfusheng.com");
        info.add("6. 微信公众号：孙福生");
        marqueeView.startWithList(info);
    }

    @Override
    public void getAdSuccess(AdBean adBean) {

    }

    @Override
    public void getCatagorySuccess(CatagoryBean catagoryBean) {

    }
}
