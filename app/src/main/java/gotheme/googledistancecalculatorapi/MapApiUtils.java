package gotheme.googledistancecalculatorapi;

/**
 * Created by Dell on 24/03/2017.
 */

public class MapApiUtils {

        private MapApiUtils() {}

        /*
        * BaseUrl of this application
        * */
        public static final String BASE_URL = "https://maps.googleapis.com/maps/";

        public static IRetrofitMaps getAPIService() {

            return RetrofitMapClient.getClient(BASE_URL).create(IRetrofitMaps.class);
        }


}
