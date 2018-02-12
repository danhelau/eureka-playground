package hello;

import com.netflix.client.config.IClientConfig;
import com.netflix.loadbalancer.*;
import com.netflix.niws.loadbalancer.DiscoveryEnabledNIWSServerList;
import com.netflix.niws.loadbalancer.EurekaNotificationServerListUpdater;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.context.annotation.Bean;

//@EnableDiscoveryClient
//@Configuration
public class BootifulClientConfiguration {

    @Autowired
    IClientConfig ribbonClientConfig;

//    @Autowired
//    DiscoveryClient discoveryClient;

/*

    @Bean
    public EurekaNotificationServerListUpdater getEurekaNotificationServerListUpdater () {
        return new EurekaNotificationServerListUpdater();
    }

    @Bean
    public ILoadBalancer getDynamicServerListLoadBalancer () {
        return new DynamicServerListLoadBalancer();
    }
    @Bean
    public ServerList getDiscoveryEnabledNIWSServerList () {
        return new DiscoveryEnabledNIWSServerList();
    }

    @Bean
    public IPing ribbonPing(IClientConfig config) {
        return new PingUrl();
    }

    @Bean
    public IRule ribbonRule(IClientConfig config) {
        return new AvailabilityFilteringRule();
    }
*/

}

