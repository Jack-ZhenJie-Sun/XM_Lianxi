package demo.bwie.com.xm_lianxi.net;



import demo.bwie.com.xm_lianxi.bean.GetCartsBean;
import io.reactivex.Observable;

public class GetCartApi {
    private static GetCartApi getCartApi;
    private GetCartApiService getCartApiService;

    private GetCartApi(GetCartApiService getCartApiService) {
        this.getCartApiService = getCartApiService;
    }

    public static GetCartApi getGetCartApi(GetCartApiService getCartApiService) {
        if (getCartApi == null) {
            getCartApi = new GetCartApi(getCartApiService);
        }
        return getCartApi;
    }

    public Observable<GetCartsBean> getCatagory(String uid, String token) {
        return getCartApiService.getCart(uid, token);
    }

}
