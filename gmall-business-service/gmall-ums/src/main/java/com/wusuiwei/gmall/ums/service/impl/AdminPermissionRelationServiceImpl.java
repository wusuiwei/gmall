package com.wusuiwei.gmall.ums.service.impl;

import com.wusuiwei.gmall.ums.mapper.AdminPermissionRelationMapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 后台用户和权限关系表(除角色中定义的权限以外的加减权限) 服务实现类
 * </p>
 *
 * @author wusuiwei
 * @since 2020-03-31
 */
@Service
public class AdminPermissionRelationServiceImpl extends ServiceImpl<AdminPermissionRelationMapper, AdminPermissionRelation> implements IService<AdminPermissionRelation> {

}
