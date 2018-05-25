package demo.bwie.com.xm_lianxi.ui.classify.contract;

import demo.bwie.com.xm_lianxi.bean.CatagoryBean;
import demo.bwie.com.xm_lianxi.bean.ProductCatagoryBean;
import demo.bwie.com.xm_lianxi.ui.base.BaseContract;

public interface ClassifyContract {
    interface View extends BaseContract.BaseView {
        void getProductCatagorySuccess(ProductCatagoryBean productCatagoryBean);

        void getCatagorySuccess(CatagoryBean catagoryBean);
    }

    interface Presenter extends BaseContract.BasePresenter<View> {
        void getProductCatagory(String cid);

        void getCatagory();
    }
}
