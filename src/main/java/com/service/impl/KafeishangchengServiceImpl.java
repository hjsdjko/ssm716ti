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


import com.dao.KafeishangchengDao;
import com.entity.KafeishangchengEntity;
import com.service.KafeishangchengService;
import com.entity.vo.KafeishangchengVO;
import com.entity.view.KafeishangchengView;

@Service("kafeishangchengService")
public class KafeishangchengServiceImpl extends ServiceImpl<KafeishangchengDao, KafeishangchengEntity> implements KafeishangchengService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<KafeishangchengEntity> page = this.selectPage(
                new Query<KafeishangchengEntity>(params).getPage(),
                new EntityWrapper<KafeishangchengEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<KafeishangchengEntity> wrapper) {
		  Page<KafeishangchengView> page =new Query<KafeishangchengView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<KafeishangchengVO> selectListVO(Wrapper<KafeishangchengEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public KafeishangchengVO selectVO(Wrapper<KafeishangchengEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<KafeishangchengView> selectListView(Wrapper<KafeishangchengEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public KafeishangchengView selectView(Wrapper<KafeishangchengEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
