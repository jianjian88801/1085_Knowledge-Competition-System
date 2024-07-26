package com.dao;

import com.entity.ChongwuxihuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.ChongwuxihuView;

/**
 * 在线学习 Dao 接口
 *
 * @author 
 */
public interface ChongwuxihuDao extends BaseMapper<ChongwuxihuEntity> {

   List<ChongwuxihuView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
