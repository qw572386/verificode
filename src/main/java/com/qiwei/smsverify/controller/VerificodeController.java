package com.qiwei.smsverify.controller;


import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.qiwei.smsverify.common.ServerResponse;
import com.qiwei.smsverify.entity.Verificode;
import com.qiwei.smsverify.service.IVerificodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author qiwei
 * @since 2018-09-06
 */
@RestController
@RequestMapping("/code")
public class VerificodeController {
    @Autowired
    private IVerificodeService verificodeService;

    @PostMapping("/add")
    public ServerResponse<String> saveCode(@RequestBody Verificode verificode){

        boolean isSuccess = verificodeService.insert(verificode);
        if (isSuccess) {
            return ServerResponse.createBySucess("添加成功");
        }
        return ServerResponse.createByError("添加失败");
    }
    @GetMapping("/get")
    public ServerResponse<List<Verificode>> getCode(@RequestParam("phoneNumber") String phoneNumber, @RequestParam("tId") String tId){
        List<Verificode> codeList = verificodeService.selectList(
                new EntityWrapper<Verificode>().eq("phoneNumber", phoneNumber).eq("tId", tId)
        );
        return ServerResponse.createBySucess("获取验证码成功", codeList);
    }

}

