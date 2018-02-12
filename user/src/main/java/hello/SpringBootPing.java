package hello;

import com.netflix.loadbalancer.PingUrl;

public class SpringBootPing extends PingUrl {
    @Override
    public String getPingAppendString() {
        return "/info";
    }
}