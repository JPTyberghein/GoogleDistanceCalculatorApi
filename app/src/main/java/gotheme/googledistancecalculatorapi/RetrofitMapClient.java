package gotheme.googledistancecalculatorapi;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Dell on 24/03/2017.
 */

public class RetrofitMapClient {
    private static Retrofit retrofit = null;

    /*Retrofit needs a base URL to build its instance,*/
    public static Retrofit getClient(String baseUrl) {
        if (retrofit==null) {
            retrofit = new Retrofit.Builder()
                    .baseUrl(baseUrl)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;
    }
}
