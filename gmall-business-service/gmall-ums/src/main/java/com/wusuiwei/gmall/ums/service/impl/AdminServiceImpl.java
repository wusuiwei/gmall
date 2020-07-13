package com.wusuiwei.gmall.ums.service.impl;

import com.baomidou.mybatisplus.extension.service.IService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wusuiwei.gmall.ums.mapper.AdminMapper;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;

/**
 * <p>
 * 后台用户表 服务实现类
 * </p>
 *
 * @author wusuiwei
 * @since 2020-03-31
 */
@Service
@Component
public class AdminServiceImpl extends ServiceImpl<AdminMapper, Admin> implements IService<Admin> {

}
