package com.wlqq.chmatch.filter.server.facade;

import com.wlqq.chmatch.filter.client.api.CHMatchDriverMessageFilter;
import com.wlqq.chmatch.filter.server.service.DriverMessageFilterService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.Collections;
import java.util.List;

/**
 * Created by sher on 2017/9/10.
 */
@Component
public class CHMatchDriverMessageFilterDispatcher implements CHMatchDriverMessageFilter {


    private static final Logger LOGGER = LoggerFactory.getLogger(CHMatchDriverMessageFilterDispatcher.class);


    @Resource
    DriverMessageFilterService driverMessageFilterService;


    @Override
    public List<Long> driverMessageFilter(long shipperId, List<Long> driverIds) {

        if(shipperId < 0 || driverIds == null || driverIds.size() == 0) {
            LOGGER.warn("driverMessageFilter request param error, shipperId: {} driverIds: {} ",shipperId,driverIds);
            return Collections.emptyList();
        }

        return driverMessageFilterService.driverMessageFilter(shipperId,driverIds);

    }

}
