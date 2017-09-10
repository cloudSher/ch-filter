package com.wlqq.chmatch.filter.server.service.impl;

import com.wlqq.chmatch.filter.server.service.DriverMessageFilterService;
import com.wlqq.chmatch.filter.server.support.user.CHMatchUserMessageHandler;
import com.wlqq.chmatch.uc.common.entity.UCenterUserMsg;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by sher on 2017/9/10.
 */

@Component
public class DriverMessageFilterServiceImpl implements DriverMessageFilterService {


    @Resource
    CHMatchUserMessageHandler userMessageHandler;


    @Override
    public List<Long> driverMessageFilter(long shipperId, List<Long> driverIds) {

        List<UCenterUserMsg> userMsgs = userMessageHandler.getUserMsgs(null);

        return null;
    }
}
