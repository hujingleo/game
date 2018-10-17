package io.renren.modules.generator.controller;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import io.renren.modules.generator.utils.BaseResp;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import io.renren.modules.generator.entity.PetEntity;
import io.renren.modules.generator.service.PetService;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.R;

import javax.servlet.http.HttpServletRequest;


/**
 * 
 *
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2018-10-17 23:34:14
 */
@RestController
@RequestMapping("game/pet")
public class PetController {
    @Autowired
    private PetService petService;

//    /**
//     * 列表
//     */
    @RequestMapping("/list")
//    @RequiresPermissions("generator:pet:list")
    public BaseResp list(HttpServletRequest request){
        List<PetEntity> list = petService.selectList(new EntityWrapper<PetEntity>());
        return BaseResp.ok(list);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    @RequiresPermissions("generator:pet:info")
    public R info(@PathVariable("id") Integer id){
			PetEntity pet = petService.selectById(id);

        return R.ok().put("pet", pet);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    @RequiresPermissions("generator:pet:save")
    public R save(@RequestBody PetEntity pet){
			petService.insert(pet);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @RequiresPermissions("generator:pet:update")
    public R update(@RequestBody PetEntity pet){
			petService.updateById(pet);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @RequiresPermissions("generator:pet:delete")
    public R delete(@RequestBody Integer[] ids){
			petService.deleteBatchIds(Arrays.asList(ids));

        return R.ok();
    }

}
