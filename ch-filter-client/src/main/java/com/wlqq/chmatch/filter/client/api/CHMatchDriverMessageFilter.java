package com.wlqq.chmatch.filter.client.api;

import java.util.List;

/**
 * Created by sher on 2017/9/10.
 */
public interface CHMatchDriverMessageFilter {


    /**
     * 车货匹配2.0 过滤司机列表接口
     *
     * 1，过滤新注册的货主不匹配新注册的司机
     * 2，过滤超过100名的司机
     * @param shipperId
     * @param driverIds
     * @return
     */
    List<Long> driverMessageFilter(long shipperId,List<Long> driverIds);

}
