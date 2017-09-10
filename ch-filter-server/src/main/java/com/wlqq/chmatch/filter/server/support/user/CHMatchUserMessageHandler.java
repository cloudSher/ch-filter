package com.wlqq.chmatch.filter.server.support.user;

import com.wlqq.chmatch.uc.client.api.CHMatchUCenterUserMessageService;
import com.wlqq.chmatch.uc.common.entity.UCenterUserMsg;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by sher on 2017/9/10.
 */
@Component
public class CHMatchUserMessageHandler {



    @Resource
    private CHMatchUCenterUserMessageService userMessageService;


    public List<UCenterUserMsg> getUserMsgs(String uids){
        return userMessageService.getUserMsgs(uids);
    }


}
