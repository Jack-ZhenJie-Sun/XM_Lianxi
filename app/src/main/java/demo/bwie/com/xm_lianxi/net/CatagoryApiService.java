package demo.bwie.com.xm_lianxi.net;

import demo.bwie.com.xm_lianxi.bean.CatagoryBean;
import io.reactivex.Observable;
import retrofit2.http.GET;

public interface CatagoryApiService {
    @GET("product/getCatagory")
    Observable<CatagoryBean> getCatagory();
}
