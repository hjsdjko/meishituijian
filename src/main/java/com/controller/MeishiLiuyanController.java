package com.controller;


import java.text.SimpleDateFormat;
import com.alibaba.fastjson.JSONObject;
import java.util.*;
import org.springframework.beans.BeanUtils;
import javax.servlet.http.HttpServletRequest;
import org.springframework.web.context.ContextLoader;
import javax.servlet.ServletContext;
import com.service.TokenService;
import com.utils.StringUtil;
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

import com.entity.MeishiLiuyanEntity;

import com.service.MeishiLiuyanService;
import com.entity.view.MeishiLiuyanView;
import com.service.MeishiService;
import com.entity.MeishiEntity;
import com.service.YonghuService;
import com.entity.YonghuEntity;

import com.utils.PageUtils;
import com.utils.R;

/**
 * 美食留言
 * 后端接口
 * @author
 * @email
 * @date 2021-04-19
*/
@RestController
@Controller
@RequestMapping("/meishiLiuyan")
public class MeishiLiuyanController {
    private static final Logger logger = LoggerFactory.getLogger(MeishiLiuyanController.class);

    @Autowired
    private MeishiLiuyanService meishiLiuyanService;


    @Autowired
    private TokenService tokenService;
    @Autowired
    private DictionaryService dictionaryService;



    //级联表service
    @Autowired
    private MeishiService meishiService;
    @Autowired
    private YonghuService yonghuService;


    /**
    * 后端列表
    */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params, HttpServletRequest request){
        logger.debug("page方法:,,Controller:{},,params:{}",this.getClass().getName(),JSONObject.toJSONString(params));
        String role = String.valueOf(request.getSession().getAttribute("role"));
        if(StringUtil.isNotEmpty(role) && "用户".equals(role)){
            params.put("yonghuId",request.getSession().getAttribute("userId"));
        }
        params.put("orderBy","id");
        PageUtils page = meishiLiuyanService.queryPage(params);

        //字典表数据转换
        List<MeishiLiuyanView> list =(List<MeishiLiuyanView>)page.getList();
        for(MeishiLiuyanView c:list){
            //修改对应字典表字段
            dictionaryService.dictionaryConvert(c);
        }
        return R.ok().put("data", page);
    }

    /**
    * 后端详情
    */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        logger.debug("info方法:,,Controller:{},,id:{}",this.getClass().getName(),id);
        MeishiLiuyanEntity meishiLiuyan = meishiLiuyanService.selectById(id);
        if(meishiLiuyan !=null){
            //entity转view
            MeishiLiuyanView view = new MeishiLiuyanView();
            BeanUtils.copyProperties( meishiLiuyan , view );//把实体数据重构到view中

            //级联表
            MeishiEntity meishi = meishiService.selectById(meishiLiuyan.getMeishiId());
            if(meishi != null){
                BeanUtils.copyProperties( meishi , view ,new String[]{ "id", "createDate"});//把级联的数据添加到view中,并排除id和创建时间字段
                view.setMeishiId(meishi.getId());
            }
            //级联表
            YonghuEntity yonghu = yonghuService.selectById(meishiLiuyan.getYonghuId());
            if(yonghu != null){
                BeanUtils.copyProperties( yonghu , view ,new String[]{ "id", "createDate"});//把级联的数据添加到view中,并排除id和创建时间字段
                view.setYonghuId(yonghu.getId());
            }
            //修改对应字典表字段
            dictionaryService.dictionaryConvert(view);
            return R.ok().put("data", view);
        }else {
            return R.error(511,"查不到数据");
        }

    }

    /**
    * 后端保存
    */
    @RequestMapping("/save")
    public R save(@RequestBody MeishiLiuyanEntity meishiLiuyan, HttpServletRequest request){
        logger.debug("save方法:,,Controller:{},,meishiLiuyan:{}",this.getClass().getName(),meishiLiuyan.toString());
        meishiLiuyan.setInsertTime(new Date());
        meishiLiuyan.setCreateTime(new Date());
        meishiLiuyanService.insert(meishiLiuyan);
        return R.ok();
    }

    /**
    * 后端修改
    */
    @RequestMapping("/update")
    public R update(@RequestBody MeishiLiuyanEntity meishiLiuyan, HttpServletRequest request){
        logger.debug("update方法:,,Controller:{},,meishiLiuyan:{}",this.getClass().getName(),meishiLiuyan.toString());
        meishiLiuyanService.updateById(meishiLiuyan);//根据id更新
        return R.ok();
    }



    /**
    * 删除
    */
    @RequestMapping("/delete")
    public R delete(@RequestBody Integer[] ids){
        logger.debug("delete:,,Controller:{},,ids:{}",this.getClass().getName(),ids.toString());
        meishiLiuyanService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }



    /**
    * 前端列表
    */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params, HttpServletRequest request){
        logger.debug("list方法:,,Controller:{},,params:{}",this.getClass().getName(),JSONObject.toJSONString(params));
        // 没有指定排序字段就默认id倒序
        if(StringUtil.isEmpty(String.valueOf(params.get("orderBy")))){
            params.put("orderBy","id");
        }
        PageUtils page = meishiLiuyanService.queryPage(params);

        //字典表数据转换
        List<MeishiLiuyanView> list =(List<MeishiLiuyanView>)page.getList();
        for(MeishiLiuyanView c:list){
            //修改对应字典表字段
            dictionaryService.dictionaryConvert(c);
        }
        return R.ok().put("data", page);
    }

    /**
    * 前端详情
    */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        logger.debug("detail方法:,,Controller:{},,id:{}",this.getClass().getName(),id);
        MeishiLiuyanEntity meishiLiuyan = meishiLiuyanService.selectById(id);
            if(meishiLiuyan !=null){
                //entity转view
        MeishiLiuyanView view = new MeishiLiuyanView();
                BeanUtils.copyProperties( meishiLiuyan , view );//把实体数据重构到view中

                //级联表
                    MeishiEntity meishi = meishiService.selectById(meishiLiuyan.getMeishiId());
                if(meishi != null){
                    BeanUtils.copyProperties( meishi , view ,new String[]{ "id", "createDate"});//把级联的数据添加到view中,并排除id和创建时间字段
                    view.setMeishiId(meishi.getId());
                }
                //级联表
                    YonghuEntity yonghu = yonghuService.selectById(meishiLiuyan.getYonghuId());
                if(yonghu != null){
                    BeanUtils.copyProperties( yonghu , view ,new String[]{ "id", "createDate"});//把级联的数据添加到view中,并排除id和创建时间字段
                    view.setYonghuId(yonghu.getId());
                }
                //修改对应字典表字段
                dictionaryService.dictionaryConvert(view);
                return R.ok().put("data", view);
            }else {
                return R.error(511,"查不到数据");
            }
    }


    /**
    * 前端保存
    */
    @RequestMapping("/add")
    public R add(@RequestBody MeishiLiuyanEntity meishiLiuyan, HttpServletRequest request){
        logger.debug("add方法:,,Controller:{},,meishiLiuyan:{}",this.getClass().getName(),meishiLiuyan.toString());
        meishiLiuyan.setInsertTime(new Date());
        meishiLiuyan.setCreateTime(new Date());
        meishiLiuyanService.insert(meishiLiuyan);
        return R.ok();
    }


}

