package demo.bwie.com.xm_lianxi.ui.homepage.contract;

import demo.bwie.com.xm_lianxi.bean.AdBean;
import demo.bwie.com.xm_lianxi.bean.CatagoryBean;
import demo.bwie.com.xm_lianxi.net.CatagoryApi;
import demo.bwie.com.xm_lianxi.ui.base.BaseContract;

public interface HomPageContract {
    interface View extends BaseContract.BaseView{
            void getAdSuccess(AdBean adBean);
            void getCatagorySuccess(CatagoryBean catagoryBean);
    }
    interface Presenter extends BaseContract.BasePresenter<View>{
        void getAd();
        void getCatagory();
    }
}
