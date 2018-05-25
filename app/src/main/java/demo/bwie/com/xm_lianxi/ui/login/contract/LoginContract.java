package demo.bwie.com.xm_lianxi.ui.login.contract;

import demo.bwie.com.xm_lianxi.bean.UserBean;
import demo.bwie.com.xm_lianxi.ui.base.BaseContract;

public interface LoginContract {
    interface View extends BaseContract.BaseView{
        void loginSuccess(UserBean userBean);
    }
    interface Presenter extends BaseContract.BasePresenter<View>{
        void login(String mobile, String password);
    }
}
