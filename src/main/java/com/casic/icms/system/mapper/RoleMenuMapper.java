package com.casic.icms.system.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.casic.icms.system.entity.RoleMenu;

/**
 * @author MrBird
 */
public interface RoleMenuMapper extends BaseMapper<RoleMenu> {
    /**
     * 递归删除菜单/按钮
     *
     * @param menuId menuId
     */
    void deleteRoleMenus(String menuId);
}
