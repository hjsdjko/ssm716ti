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


import com.dao.DiscusskafeishangchengDao;
import com.entity.DiscusskafeishangchengEntity;
import com.service.DiscusskafeishangchengService;
import com.entity.vo.DiscusskafeishangchengVO;
import com.entity.view.DiscusskafeishangchengView;

@Service("discusskafeishangchengService")
public class DiscusskafeishangchengServiceImpl extends ServiceImpl<DiscusskafeishangchengDao, DiscusskafeishangchengEntity> implements DiscusskafeishangchengService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscusskafeishangchengEntity> page = this.selectPage(
                new Query<DiscusskafeishangchengEntity>(params).getPage(),
                new EntityWrapper<DiscusskafeishangchengEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscusskafeishangchengEntity> wrapper) {
		  Page<DiscusskafeishangchengView> page =new Query<DiscusskafeishangchengView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscusskafeishangchengVO> selectListVO(Wrapper<DiscusskafeishangchengEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscusskafeishangchengVO selectVO(Wrapper<DiscusskafeishangchengEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscusskafeishangchengView> selectListView(Wrapper<DiscusskafeishangchengEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscusskafeishangchengView selectView(Wrapper<DiscusskafeishangchengEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
