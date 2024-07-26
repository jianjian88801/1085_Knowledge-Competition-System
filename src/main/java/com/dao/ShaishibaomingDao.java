package com.dao;

import com.entity.ShaishibaomingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.ShaishibaomingView;

/**
 * 赛事报名信息 Dao 接口
 *
 * @author 
 */
public interface ShaishibaomingDao extends BaseMapper<ShaishibaomingEntity> {

   List<ShaishibaomingView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
