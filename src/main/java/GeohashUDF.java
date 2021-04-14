import ch.hsr.geohash.GeoHash;
import org.apache.hadoop.hive.ql.exec.Description;
import org.apache.hadoop.hive.ql.exec.UDF;

// Description of the UDF
@Description(
        name="GeohashUDF",
        value="returns 4 char length geohash.",
        extended="select GeohashUDF(deviceplatform) from hivesampletable limit 10;"
)
public class GeohashUDF extends UDF {
    // Accept a string input
    public String evaluate(Double lat, Double lng, int precision) {
        //geoHashStringWithCharacterPrecision method of GeoHash class
        //gets latitude, longitude and geohash string length.
        //Depending on string length, precision of geohash. The longer the string, the more precise geohash it is.
        //The value 4 is hardcoded here for geohash length, as the task requires it.
        String geoHashString = GeoHash.geoHashStringWithCharacterPrecision(
                lat,
                lng,
                precision);
        return geoHashString;
    }
}
