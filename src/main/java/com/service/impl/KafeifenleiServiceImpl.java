package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.KafeifenleiDao;
import com.entity.KafeifenleiEntity;
import com.service.KafeifenleiService;
import com.entity.vo.KafeifenleiVO;
import com.entity.view.KafeifenleiView;

@Service("kafeifenleiService")
public class KafeifenleiServiceImpl extends ServiceImpl<KafeifenleiDao, KafeifenleiEntity> implements KafeifenleiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<KafeifenleiEntity> page = this.selectPage(
                new Query<KafeifenleiEntity>(params).getPage(),
                new EntityWrapper<KafeifenleiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<KafeifenleiEntity> wrapper) {
		  Page<KafeifenleiView> page =new Query<KafeifenleiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<KafeifenleiVO> selectListVO(Wrapper<KafeifenleiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public KafeifenleiVO selectVO(Wrapper<KafeifenleiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<KafeifenleiView> selectListView(Wrapper<KafeifenleiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public KafeifenleiView selectView(Wrapper<KafeifenleiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
