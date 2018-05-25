package demo.bwie.com.xm_lianxi.module;

import java.util.concurrent.TimeUnit;

import dagger.Module;
import dagger.Provides;
import demo.bwie.com.xm_lianxi.net.AdApi;
import demo.bwie.com.xm_lianxi.net.AdApiService;
import demo.bwie.com.xm_lianxi.net.Api;
import demo.bwie.com.xm_lianxi.net.CatagoryApi;
import demo.bwie.com.xm_lianxi.net.CatagoryApiService;
import demo.bwie.com.xm_lianxi.net.ListApi;
import demo.bwie.com.xm_lianxi.net.ListApiService;
import demo.bwie.com.xm_lianxi.net.LoginApi;
import demo.bwie.com.xm_lianxi.net.LoginApiService;
import demo.bwie.com.xm_lianxi.net.ProductCatagoryApi;
import demo.bwie.com.xm_lianxi.net.ProductCatagoryApiService;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

@Module
public class HttpModule {
    @Provides
    OkHttpClient.Builder provideOkHttpClientBuilder(){
        return new OkHttpClient.Builder()
                .connectTimeout(10, TimeUnit.SECONDS)
                .writeTimeout(20,TimeUnit.SECONDS)
                .readTimeout(20,TimeUnit.SECONDS);
    }
    @Provides
    LoginApi provideLoginApi(OkHttpClient.Builder builder){
        Retrofit retrofit=new Retrofit.Builder()
                .baseUrl(Api.BASEURL)
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .client(builder.build())
                .build();
        LoginApiService loginApiService=retrofit.create(LoginApiService.class);
        return LoginApi.getLoginApi(loginApiService);
    }

    @Provides
    AdApi provideAdApi(OkHttpClient.Builder builder){
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(Api.BASEURL)
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .client(builder.build())
                .build();
        AdApiService adApiService=retrofit.create(AdApiService.class);
        return AdApi.getAdApi(adApiService);
    }
    @Provides
    CatagoryApi provideCatagoryApi(OkHttpClient.Builder builder){
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(Api.BASEURL)
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .client(builder.build())
                .build();
        CatagoryApiService catagoryApiService=retrofit.create(CatagoryApiService.class);
        return CatagoryApi.getCatagoryApi(catagoryApiService);
    }

    @Provides
    ProductCatagoryApi provideproductCatagoryApi(OkHttpClient.Builder builder){
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(Api.BASEURL)
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .client(builder.build())
                .build();
        ProductCatagoryApiService productCatagoryApiService=retrofit.create(ProductCatagoryApiService.class);
        return ProductCatagoryApi.getProductCatagoryApi(productCatagoryApiService);
    }

    @Provides
    ListApi provideListApi(OkHttpClient.Builder builder){
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(Api.BASEURL)
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .client(builder.build())
                .build();
        ListApiService listApiService=retrofit.create(ListApiService.class);
       return ListApi.getListApi(listApiService);
    }

}
