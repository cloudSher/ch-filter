package com.wlqq.chmatch.filter.rule.core;

import org.jeasy.rules.api.*;

/**
 * Created by sher on 2017/9/10.
 */
public class FilterRuleContext {


    private Facts facts;

    private Rules rules;


    Object getFacts(){
     return null;
    }


    public void setFact(String key,Object val){
        facts.put(key,val);
    }





}
