package com.forezp.service.impl;

import com.forezp.service.SchedualServiceHi;
import org.springframework.stereotype.Component;

/**
 * ClassDescribe:
 * Author :wangzhanhua
 * Date: 2017-09-23
 * Since
 * To change this template use File | Settings | File Templates.
 */
@Component
public class SchedualServiceHiHystric implements SchedualServiceHi {
    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry "+name;
    }
}
