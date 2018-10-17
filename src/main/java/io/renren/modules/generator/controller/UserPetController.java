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

import io.renren.modules.generator.entity.UserPetEntity;
import io.renren.modules.generator.service.UserPetService;
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
@RequestMapping("generator/userpet")
public class UserPetController {
    @Autowired
    private UserPetService userPetService;

    /**
     * 列表
     */
//    @RequestMapping("/list")
//    @RequiresPermissions("generator:userpet:list")
//    public R list(@RequestParam Map<String, Object> params){
//        PageUtils page = userPetService.queryPage(params);
//
//        return R.ok().put("page", page);
//    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    @RequiresPermissions("generator:userpet:info")
    public R info(@PathVariable("id") Integer id){
			UserPetEntity userPet = userPetService.selectById(id);

        return R.ok().put("userPet", userPet);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    @RequiresPermissions("generator:userpet:save")
    public R save(@RequestBody UserPetEntity userPet){
			userPetService.insert(userPet);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @RequiresPermissions("generator:userpet:update")
    public R update(@RequestBody UserPetEntity userPet){
			userPetService.updateById(userPet);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @RequiresPermissions("generator:userpet:delete")
    public R delete(@RequestBody Integer[] ids){
			userPetService.deleteBatchIds(Arrays.asList(ids));

        return R.ok();
    }

}
