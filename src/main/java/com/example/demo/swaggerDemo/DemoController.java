package com.example.demo.swaggerDemo;

import com.example.demo.common.dto.ResObject;
import com.example.demo.common.po.PangPangBo;
import com.example.demo.common.po.ShuaiShuaiLin;
import com.example.demo.common.po.User;
import io.swagger.annotations.*;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

/**
 * Created by Rabbit on 2018/9/13.
 */

@Api(description = "用户接口")
@RestController
@RequestMapping("/demoController")
public class DemoController {

    @ApiOperation(value = "新增用户", notes = "新增注册")
    @RequestMapping(value = "/createUser", method = RequestMethod.POST)
    public ResObject createUser(@ApiParam@RequestBody User<ShuaiShuaiLin> user) {
        System.out.println("createUser:::" + user.toString());
        ShuaiShuaiLin shuaiShuaiLin = new ShuaiShuaiLin();
        return new ResObject<>(HttpStatus.OK.value(), "新增成功.", shuaiShuaiLin);
    }

    @ApiOperation(value = "修改用户", notes = "修改用户")
    @RequestMapping(value = "/updateUser", method = RequestMethod.POST)
    public ResObject updateUser(@RequestBody User user) {
        System.out.println("updateUser:::" + user.toString());
        return new ResObject(HttpStatus.OK.value(), "修改成功.");
    }

    @ApiOperation(value = "删除用户", notes = "删除用户")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "userId", value = "用户标识", required = true, paramType = "query", dataType = "String")
    })
    @RequestMapping(value = "/deleteUser", method = RequestMethod.DELETE)
    public ResObject deleteUser(@RequestParam("userId") String userId) {
        System.out.println("deleteUser:::" + userId);
        return new ResObject(HttpStatus.OK.value(), "删除成功.");
    }

    @ApiOperation(value = "查询用户", notes = "查询用户")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "userId", value = "用户标识", required = true, paramType = "query", dataType = "String")
    })
    @RequestMapping(value = "/queryUser", method = RequestMethod.GET)
    public ResObject queryUser(@RequestParam("userId") String userId) {
        System.out.println("queryUser:::" + userId);
        PangPangBo user = new PangPangBo("张三", 35);
        return new ResObject<>(HttpStatus.OK.value(), user);
    }
}
