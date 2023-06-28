
package bos;


import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.services.bos.BosClient;
import com.baidubce.services.bos.BosClientConfiguration;

public class BosConnect {

    public static void main(String[] args) {
        BosClientConfiguration config = new BosClientConfiguration();
        config.setCredentials(new DefaultBceCredentials("111", "222"));
        config.setEndpoint("test");
        BosClient client = new BosClient(config);
    }
}
