package demo.bwie.com.xm_lianxi.net;

import demo.bwie.com.xm_lianxi.bean.AdBean;
import io.reactivex.Observable;

public class AdApi {
    private static AdApi adApi;
    private AdApiService adApiService;
    private AdApi(AdApiService adApiService){
        this.adApiService=adApiService;
    }
    public static AdApi getAdApi(AdApiService adApiService){
        if (adApi==null){
            adApi=new AdApi(adApiService);
        }
        return adApi;
    }
    public Observable<AdBean> getAd(){
        return adApiService.getAd();
    }
}
