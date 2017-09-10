package com.wlqq.chmatch.filter.server.service;

import java.util.List;

/**
 * Created by sher on 2017/9/10.
 */
public interface DriverMessageFilterService {




    List<Long> driverMessageFilter(long shipperId,List<Long> driverIds);
}
