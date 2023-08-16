package app;


// SuppressWarnings не видна в рантайме, поэтому её нельзя захватить с помощью рефлексии
@Product(name = "orange", quota = 12)
@SuppressWarnings("unused")
public class ProductInfo {
    @Deprecated
    public String getData() {
        return "No data...";
    }

    public String getField() {
        return "No data...";
    }
}
