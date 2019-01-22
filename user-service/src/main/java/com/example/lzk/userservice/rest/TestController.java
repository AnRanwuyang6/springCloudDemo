package com.example.lzk.userservice.rest;

import entity.User;
import entity.UserExample;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import mybatis.UserMapper;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import response.AjaxResult;

import java.util.List;

@Api(value = "User接口" ,description = "User接口")
@RestController
@RequestMapping("/test")
public class TestController {
    Logger logger = LoggerFactory.getLogger(TestController.class);

    @Autowired
    private UserMapper userMapper;

    @ApiOperation(value="测试", notes="返回JSON形式数据")
    @RequestMapping(value = "/test",method = RequestMethod.POST)
    public AjaxResult test(String sn, String mm){
        AjaxResult result=new AjaxResult();
        User user=userMapper.selectByPrimaryKey((long)1);
        UserExample userExample=new UserExample();
        List<User> users=userMapper.selectByExample(userExample);
        try {
            result.setData(user);
            result.setCode(AjaxResult.RESULT_CODE_0000);
            return  result;
        }catch (Exception e){
            logger.info(e.getMessage());
            result.setCode(e.getMessage());
            return result;
        }
    }
}
