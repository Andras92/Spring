package responses;

import jdk.jfr.DataAmount;
import lombok.Data;

@Data
public class Shop {
    protected String id;
    protected String name;
    protected String category;
    protected String settlement;
    protected String zip;
    protected String address;

}
