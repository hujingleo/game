package io.renren.modules.generator.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.Query;

import io.renren.modules.generator.dao.SettingDao;
import io.renren.modules.generator.entity.SettingEntity;
import io.renren.modules.generator.service.SettingService;


@Service("settingService")
public class SettingServiceImpl extends ServiceImpl<SettingDao, SettingEntity> implements SettingService {


}
