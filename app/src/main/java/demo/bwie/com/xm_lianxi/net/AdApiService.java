package demo.bwie.com.xm_lianxi.net;

import demo.bwie.com.xm_lianxi.bean.AdBean;
import io.reactivex.Observable;
import retrofit2.http.GET;

public interface AdApiService {
//    @GET("ad/getAd")
    Observable<AdBean> getAd();
}
