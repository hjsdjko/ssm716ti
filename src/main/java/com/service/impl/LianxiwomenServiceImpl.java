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


import com.dao.LianxiwomenDao;
import com.entity.LianxiwomenEntity;
import com.service.LianxiwomenService;
import com.entity.vo.LianxiwomenVO;
import com.entity.view.LianxiwomenView;

@Service("lianxiwomenService")
public class LianxiwomenServiceImpl extends ServiceImpl<LianxiwomenDao, LianxiwomenEntity> implements LianxiwomenService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<LianxiwomenEntity> page = this.selectPage(
                new Query<LianxiwomenEntity>(params).getPage(),
                new EntityWrapper<LianxiwomenEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<LianxiwomenEntity> wrapper) {
		  Page<LianxiwomenView> page =new Query<LianxiwomenView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<LianxiwomenVO> selectListVO(Wrapper<LianxiwomenEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public LianxiwomenVO selectVO(Wrapper<LianxiwomenEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<LianxiwomenView> selectListView(Wrapper<LianxiwomenEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public LianxiwomenView selectView(Wrapper<LianxiwomenEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
