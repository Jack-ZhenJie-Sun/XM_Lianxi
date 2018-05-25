package demo.bwie.com.xm_lianxi.ui.classify.contract;



import java.util.List;

import demo.bwie.com.xm_lianxi.bean.ProductsBean;
import demo.bwie.com.xm_lianxi.ui.base.BaseContract;

public interface ListContract {
    interface View extends BaseContract.BaseView {
        void onSuccess(List<ProductsBean.DataBean> list);
    }

    interface Presenter extends BaseContract.BasePresenter<View> {
        void getProducts(String pscid);
    }
}
