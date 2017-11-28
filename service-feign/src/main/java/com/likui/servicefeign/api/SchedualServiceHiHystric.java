package com.likui.servicefeign.api;

import org.springframework.stereotype.Component;

/**
 * @author Kui.Li likui@23mofang.com
 * @date 2017/11/28 0028
 */
@Component
public class SchedualServiceHiHystric implements SchedualServiceHi {
    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry," + name;
    }
}
