package demo.bwie.com.xm_lianxi.ui.classify.contract;


import demo.bwie.com.xm_lianxi.ui.base.BaseContract;

public interface AddCartContract {
    interface View extends BaseContract.BaseView {
        void onSuccess(String str);
    }

    interface Presenter extends BaseContract.BasePresenter<View> {
        void addCart(String uid, String pid, String token);
    }
}
