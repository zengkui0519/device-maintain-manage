package cn.com.bosi.itms.web.controller;

import cn.com.bosi.itms.model.Test;
import cn.com.bosi.itms.service.TestService;
import cn.com.bosi.itms.web.vo.Page;
import cn.com.bosi.itms.web.vo.Response;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@RequestMapping("/test")
@Api("测试接口")
public class TestController {

    @Resource
    private TestService testService;

    @ApiOperation("分页获取测试列表")
    @GetMapping("/getTestList")
    public Response<Page<Test>> getTestList(
            @RequestParam Long pageNum,
            @RequestParam Long pageSize) {
        Page<Test> result = testService.getTestsByPage(pageNum, pageSize);
        return new Response<>(result);
    }

    @ApiOperation("根据id查询测试信息")
    @GetMapping("/getTest/{testId}")
    public Response<Test> getTestById(@PathVariable Long testId) {
        Test result = testService.getTestById(testId);
        return new Response<>(result);
    }

    @ApiOperation("保存测试")
    @PostMapping("/saveTest")
    public Response saveTest(@RequestBody Test test) {
        testService.saveTest(test);
        return new Response();
    }

    @ApiOperation("更新测试")
    @PutMapping("/updateTest")
    public Response updateTest(@RequestBody Test test) {
        testService.updateTest(test);
        return new Response();
    }

    @ApiOperation("删除测试")
    @DeleteMapping("/deleteTest/{testId}")
    public Response deleteTest(@PathVariable Long testId) {
        testService.deleteTest(testId);
        return new Response();
    }
}
