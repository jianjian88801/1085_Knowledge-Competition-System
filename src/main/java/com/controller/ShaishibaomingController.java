
package com.controller;

import java.io.File;
import java.math.BigDecimal;
import java.net.URL;
import java.text.SimpleDateFormat;
import com.alibaba.fastjson.JSONObject;
import java.util.*;
import org.springframework.beans.BeanUtils;
import javax.servlet.http.HttpServletRequest;
import org.springframework.web.context.ContextLoader;
import javax.servlet.ServletContext;
import com.service.TokenService;
import com.utils.*;
import java.lang.reflect.InvocationTargetException;

import com.service.DictionaryService;
import org.apache.commons.lang3.StringUtils;
import com.annotation.IgnoreAuth;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.entity.*;
import com.entity.view.*;
import com.service.*;
import com.utils.PageUtils;
import com.utils.R;
import com.alibaba.fastjson.*;

/**
 * 赛事报名信息
 * 后端接口
 * @author
 * @email
*/
@RestController
@Controller
@RequestMapping("/shaishibaoming")
public class ShaishibaomingController {
    private static final Logger logger = LoggerFactory.getLogger(ShaishibaomingController.class);

    @Autowired
    private ShaishibaomingService shaishibaomingService;


    @Autowired
    private TokenService tokenService;
    @Autowired
    private DictionaryService dictionaryService;

    //级联表service
    @Autowired
    private ShaishiService shaishiService;
    @Autowired
    private YonghuService yonghuService;



    /**
    * 后端列表
    */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params, HttpServletRequest request){
        logger.debug("page方法:,,Controller:{},,params:{}",this.getClass().getName(),JSONObject.toJSONString(params));
        String role = String.valueOf(request.getSession().getAttribute("role"));
        if(false)
            return R.error(511,"永不会进入");
        else if("用户".equals(role))
            params.put("yonghuId",request.getSession().getAttribute("userId"));
        if(params.get("orderBy")==null || params.get("orderBy")==""){
            params.put("orderBy","id");
        }
        PageUtils page = shaishibaomingService.queryPage(params);

        //字典表数据转换
        List<ShaishibaomingView> list =(List<ShaishibaomingView>)page.getList();
        for(ShaishibaomingView c:list){
            //修改对应字典表字段
            dictionaryService.dictionaryConvert(c, request);
        }
        return R.ok().put("data", page);
    }

    /**
    * 后端详情
    */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id, HttpServletRequest request){
        logger.debug("info方法:,,Controller:{},,id:{}",this.getClass().getName(),id);
        ShaishibaomingEntity shaishibaoming = shaishibaomingService.selectById(id);
        if(shaishibaoming !=null){
            //entity转view
            ShaishibaomingView view = new ShaishibaomingView();
            BeanUtils.copyProperties( shaishibaoming , view );//把实体数据重构到view中

                //级联表
                ShaishiEntity shaishi = shaishiService.selectById(shaishibaoming.getShaishiId());
                if(shaishi != null){
                    BeanUtils.copyProperties( shaishi , view ,new String[]{ "id", "createTime", "insertTime", "updateTime"});//把级联的数据添加到view中,并排除id和创建时间字段
                    view.setShaishiId(shaishi.getId());
                }
                //级联表
                YonghuEntity yonghu = yonghuService.selectById(shaishibaoming.getYonghuId());
                if(yonghu != null){
                    BeanUtils.copyProperties( yonghu , view ,new String[]{ "id", "createTime", "insertTime", "updateTime"});//把级联的数据添加到view中,并排除id和创建时间字段
                    view.setYonghuId(yonghu.getId());
                }
            //修改对应字典表字段
            dictionaryService.dictionaryConvert(view, request);
            return R.ok().put("data", view);
        }else {
            return R.error(511,"查不到数据");
        }

    }

    /**
    * 后端保存
    */
    @RequestMapping("/save")
    public R save(@RequestBody ShaishibaomingEntity shaishibaoming, HttpServletRequest request){
        logger.debug("save方法:,,Controller:{},,shaishibaoming:{}",this.getClass().getName(),shaishibaoming.toString());

        String role = String.valueOf(request.getSession().getAttribute("role"));
        if(false)
            return R.error(511,"永远不会进入");
        else if("用户".equals(role))
            shaishibaoming.setYonghuId(Integer.valueOf(String.valueOf(request.getSession().getAttribute("userId"))));

        Wrapper<ShaishibaomingEntity> queryWrapper = new EntityWrapper<ShaishibaomingEntity>()
            .eq("shaishi_id", shaishibaoming.getShaishiId())
            .eq("yonghu_id", shaishibaoming.getYonghuId())
            .eq("shaishibaoming_yesno_types", shaishibaoming.getShaishibaomingYesnoTypes())
            .eq("shaishibaoming_yesno_text", shaishibaoming.getShaishibaomingYesnoText())
            ;

        logger.info("sql语句:"+queryWrapper.getSqlSegment());
        ShaishibaomingEntity shaishibaomingEntity = shaishibaomingService.selectOne(queryWrapper);
        if(shaishibaomingEntity==null){
            shaishibaoming.setShaishibaomingYesnoTypes(1);
            shaishibaoming.setInsertTime(new Date());
            shaishibaoming.setCreateTime(new Date());
            shaishibaomingService.insert(shaishibaoming);
            return R.ok();
        }else {
            return R.error(511,"表中有相同数据");
        }
    }

    /**
    * 后端修改
    */
    @RequestMapping("/update")
    public R update(@RequestBody ShaishibaomingEntity shaishibaoming, HttpServletRequest request){
        logger.debug("update方法:,,Controller:{},,shaishibaoming:{}",this.getClass().getName(),shaishibaoming.toString());

        String role = String.valueOf(request.getSession().getAttribute("role"));
//        if(false)
//            return R.error(511,"永远不会进入");
//        else if("用户".equals(role))
//            shaishibaoming.setYonghuId(Integer.valueOf(String.valueOf(request.getSession().getAttribute("userId"))));
        //根据字段查询是否有相同数据
        Wrapper<ShaishibaomingEntity> queryWrapper = new EntityWrapper<ShaishibaomingEntity>()
            .notIn("id",shaishibaoming.getId())
            .andNew()
            .eq("shaishi_id", shaishibaoming.getShaishiId())
            .eq("yonghu_id", shaishibaoming.getYonghuId())
            .eq("shaishibaoming_yesno_types", shaishibaoming.getShaishibaomingYesnoTypes())
            .eq("shaishibaoming_yesno_text", shaishibaoming.getShaishibaomingYesnoText())
            .eq("insert_time", shaishibaoming.getInsertTime())
            ;

        logger.info("sql语句:"+queryWrapper.getSqlSegment());
        ShaishibaomingEntity shaishibaomingEntity = shaishibaomingService.selectOne(queryWrapper);
        if(shaishibaomingEntity==null){
            shaishibaomingService.updateById(shaishibaoming);//根据id更新
            return R.ok();
        }else {
            return R.error(511,"表中有相同数据");
        }
    }

    /**
    * 删除
    */
    @RequestMapping("/delete")
    public R delete(@RequestBody Integer[] ids){
        logger.debug("delete:,,Controller:{},,ids:{}",this.getClass().getName(),ids.toString());
        shaishibaomingService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }


    /**
     * 批量上传
     */
    @RequestMapping("/batchInsert")
    public R save( String fileName, HttpServletRequest request){
        logger.debug("batchInsert方法:,,Controller:{},,fileName:{}",this.getClass().getName(),fileName);
        Integer yonghuId = Integer.valueOf(String.valueOf(request.getSession().getAttribute("userId")));
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        try {
            List<ShaishibaomingEntity> shaishibaomingList = new ArrayList<>();//上传的东西
            Map<String, List<String>> seachFields= new HashMap<>();//要查询的字段
            Date date = new Date();
            int lastIndexOf = fileName.lastIndexOf(".");
            if(lastIndexOf == -1){
                return R.error(511,"该文件没有后缀");
            }else{
                String suffix = fileName.substring(lastIndexOf);
                if(!".xls".equals(suffix)){
                    return R.error(511,"只支持后缀为xls的excel文件");
                }else{
                    URL resource = this.getClass().getClassLoader().getResource("static/upload/" + fileName);//获取文件路径
                    File file = new File(resource.getFile());
                    if(!file.exists()){
                        return R.error(511,"找不到上传文件，请联系管理员");
                    }else{
                        List<List<String>> dataList = PoiUtil.poiImport(file.getPath());//读取xls文件
                        dataList.remove(0);//删除第一行，因为第一行是提示
                        for(List<String> data:dataList){
                            //循环
                            ShaishibaomingEntity shaishibaomingEntity = new ShaishibaomingEntity();
//                            shaishibaomingEntity.setShaishiId(Integer.valueOf(data.get(0)));   //赛事 要改的
//                            shaishibaomingEntity.setYonghuId(Integer.valueOf(data.get(0)));   //赛事 要改的
//                            shaishibaomingEntity.setShaishibaomingYesnoTypes(Integer.valueOf(data.get(0)));   //报名审核 要改的
//                            shaishibaomingEntity.setShaishibaomingYesnoText(data.get(0));                    //审核结果 要改的
//                            shaishibaomingEntity.setInsertTime(date);//时间
//                            shaishibaomingEntity.setCreateTime(date);//时间
                            shaishibaomingList.add(shaishibaomingEntity);


                            //把要查询是否重复的字段放入map中
                        }

                        //查询是否重复
                        shaishibaomingService.insertBatch(shaishibaomingList);
                        return R.ok();
                    }
                }
            }
        }catch (Exception e){
            e.printStackTrace();
            return R.error(511,"批量插入数据异常，请联系管理员");
        }
    }





    /**
    * 前端列表
    */
    @IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params, HttpServletRequest request){
        logger.debug("list方法:,,Controller:{},,params:{}",this.getClass().getName(),JSONObject.toJSONString(params));

        // 没有指定排序字段就默认id倒序
        if(StringUtil.isEmpty(String.valueOf(params.get("orderBy")))){
            params.put("orderBy","id");
        }
        PageUtils page = shaishibaomingService.queryPage(params);

        //字典表数据转换
        List<ShaishibaomingView> list =(List<ShaishibaomingView>)page.getList();
        for(ShaishibaomingView c:list)
            dictionaryService.dictionaryConvert(c, request); //修改对应字典表字段
        return R.ok().put("data", page);
    }

    /**
    * 前端详情
    */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id, HttpServletRequest request){
        logger.debug("detail方法:,,Controller:{},,id:{}",this.getClass().getName(),id);
        ShaishibaomingEntity shaishibaoming = shaishibaomingService.selectById(id);
            if(shaishibaoming !=null){


                //entity转view
                ShaishibaomingView view = new ShaishibaomingView();
                BeanUtils.copyProperties( shaishibaoming , view );//把实体数据重构到view中

                //级联表
                    ShaishiEntity shaishi = shaishiService.selectById(shaishibaoming.getShaishiId());
                if(shaishi != null){
                    BeanUtils.copyProperties( shaishi , view ,new String[]{ "id", "createDate"});//把级联的数据添加到view中,并排除id和创建时间字段
                    view.setShaishiId(shaishi.getId());
                }
                //级联表
                    YonghuEntity yonghu = yonghuService.selectById(shaishibaoming.getYonghuId());
                if(yonghu != null){
                    BeanUtils.copyProperties( yonghu , view ,new String[]{ "id", "createDate"});//把级联的数据添加到view中,并排除id和创建时间字段
                    view.setYonghuId(yonghu.getId());
                }
                //修改对应字典表字段
                dictionaryService.dictionaryConvert(view, request);
                return R.ok().put("data", view);
            }else {
                return R.error(511,"查不到数据");
            }
    }


    /**
    * 前端保存
    */
    @RequestMapping("/add")
    public R add(@RequestBody ShaishibaomingEntity shaishibaoming, HttpServletRequest request){
        logger.debug("add方法:,,Controller:{},,shaishibaoming:{}",this.getClass().getName(),shaishibaoming.toString());
        Wrapper<ShaishibaomingEntity> queryWrapper = new EntityWrapper<ShaishibaomingEntity>()
            .eq("shaishi_id", shaishibaoming.getShaishiId())
            .eq("yonghu_id", shaishibaoming.getYonghuId())
            .in("shaishibaoming_yesno_types",new Integer[]{1,2})
            ;
        logger.info("sql语句:"+queryWrapper.getSqlSegment());
        ShaishibaomingEntity shaishibaomingEntity = shaishibaomingService.selectOne(queryWrapper);
        if(shaishibaomingEntity==null){
            shaishibaoming.setShaishibaomingYesnoTypes(1);
            shaishibaoming.setInsertTime(new Date());
            shaishibaoming.setCreateTime(new Date());
        shaishibaomingService.insert(shaishibaoming);
            return R.ok();
        }else {
            return R.error(511,"请不要重复报名");
        }
    }


}
