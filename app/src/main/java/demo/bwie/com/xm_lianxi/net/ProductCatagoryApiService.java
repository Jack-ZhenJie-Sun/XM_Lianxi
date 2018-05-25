package demo.bwie.com.xm_lianxi.net;



import demo.bwie.com.xm_lianxi.bean.ProductCatagoryBean;
import io.reactivex.Observable;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;


public interface ProductCatagoryApiService {

    @FormUrlEncoded
    @POST("product/getProductCatagory")
    Observable<ProductCatagoryBean> getProductCatagory(@Field("cid") String cid);
}
