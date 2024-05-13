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


import com.dao.DiscusslianxiwomenDao;
import com.entity.DiscusslianxiwomenEntity;
import com.service.DiscusslianxiwomenService;
import com.entity.vo.DiscusslianxiwomenVO;
import com.entity.view.DiscusslianxiwomenView;

@Service("discusslianxiwomenService")
public class DiscusslianxiwomenServiceImpl extends ServiceImpl<DiscusslianxiwomenDao, DiscusslianxiwomenEntity> implements DiscusslianxiwomenService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscusslianxiwomenEntity> page = this.selectPage(
                new Query<DiscusslianxiwomenEntity>(params).getPage(),
                new EntityWrapper<DiscusslianxiwomenEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscusslianxiwomenEntity> wrapper) {
		  Page<DiscusslianxiwomenView> page =new Query<DiscusslianxiwomenView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscusslianxiwomenVO> selectListVO(Wrapper<DiscusslianxiwomenEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscusslianxiwomenVO selectVO(Wrapper<DiscusslianxiwomenEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscusslianxiwomenView> selectListView(Wrapper<DiscusslianxiwomenEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscusslianxiwomenView selectView(Wrapper<DiscusslianxiwomenEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
