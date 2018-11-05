package com.itheima.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.itheima.service.DubboxService;
@Service
public class DubboxServiceImpl implements DubboxService {
    @Override
    public String method() {
        return "哈哈";
    }
}
