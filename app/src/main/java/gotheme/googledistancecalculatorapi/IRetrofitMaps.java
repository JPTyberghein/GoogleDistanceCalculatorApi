package gotheme.googledistancecalculatorapi;

/**
 * Created by Dell on 24/03/2017.
 */

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;


/**
 * Created by navneet on 17/7/16.
 */
public interface IRetrofitMaps {

    /*
     * Retrofit get annotation with our URL
     * And our method that will return us details of location
     */
    @GET("api/directions/json?key=AIzaSyC64ltvsK4PmwzVGtLka9F5dvdt7FiMBxU")
    Call<Example> getDistanceDuration(@Query("units") String units, @Query("origin") String origin, @Query("destination") String destination, @Query("mode") String mode);

}
