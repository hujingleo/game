package io.renren.modules.generator.controller;

import java.util.Arrays;
import java.util.Map;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import io.renren.modules.generator.entity.SettingEntity;
import io.renren.modules.generator.service.SettingService;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.R;



/**
 * 
 *
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2018-10-17 23:34:14
 */
@RestController
@RequestMapping("generator/setting")
public class SettingController {
    @Autowired
    private SettingService settingService;

    /**
     * 列表
     */
//    @RequestMapping("/list")
//    @RequiresPermissions("generator:setting:list")
//    public R list(@RequestParam Map<String, Object> params){
//        PageUtils page = settingService.queryPage(params);
//
//        return R.ok().put("page", page);
//    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    @RequiresPermissions("generator:setting:info")
    public R info(@PathVariable("id") Integer id){
			SettingEntity setting = settingService.selectById(id);

        return R.ok().put("setting", setting);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    @RequiresPermissions("generator:setting:save")
    public R save(@RequestBody SettingEntity setting){
			settingService.insert(setting);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @RequiresPermissions("generator:setting:update")
    public R update(@RequestBody SettingEntity setting){
			settingService.updateById(setting);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @RequiresPermissions("generator:setting:delete")
    public R delete(@RequestBody Integer[] ids){
			settingService.deleteBatchIds(Arrays.asList(ids));

        return R.ok();
    }

}
