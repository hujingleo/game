package io.renren.modules.generator.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.Query;

import io.renren.modules.generator.dao.UserPetDao;
import io.renren.modules.generator.entity.UserPetEntity;
import io.renren.modules.generator.service.UserPetService;


@Service("userPetService")
public class UserPetServiceImpl extends ServiceImpl<UserPetDao, UserPetEntity> implements UserPetService {



}
