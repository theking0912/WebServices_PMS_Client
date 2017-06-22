package example;

import PMS.PMSGetStoredServiceService;

/**
 * Created by theking on 2017-03-24.
 */
public class HelloWorldClient {
    public static void main(String[] argv) {
        String json = "";
        PMS.PMSGetStoredService service = new PMSGetStoredServiceService().getPMSGetStoredServicePort();
        json = service.getStoredItem("BJGY", "4713080").toString();
        System.out.println(json);
    }
}
