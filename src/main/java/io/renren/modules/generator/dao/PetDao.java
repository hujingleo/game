package io.renren.modules.generator.dao;

import io.renren.modules.generator.entity.PetEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 
 * 
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2018-10-17 23:34:14
 */
@Mapper
public interface PetDao extends BaseMapper<PetEntity> {
	
}
