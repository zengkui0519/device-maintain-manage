package cn.com.bosi.itms.service;

import cn.com.bosi.itms.mapper.TestMapper;
import cn.com.bosi.itms.model.Test;
import cn.com.bosi.itms.web.vo.Page;
import lombok.extern.slf4j.Slf4j;
import org.beetl.sql.core.engine.PageQuery;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
@Slf4j
public class TestService {

    @Resource
    private TestMapper testMapper;

    public Page<Test> getTestsByPage(long pageNum, long pageSize) {
        PageQuery<Test> query = new PageQuery<>(pageNum, pageSize);
        testMapper.templatePage(query);
        return new Page<>(query.getList(), query.getTotalRow());
    }

    public Test getTestById(Long testId) {
        return testMapper.single(testId);
    }

    public void saveTest(Test test) {
        testMapper.insertTemplate(test, true);
    }

    public void updateTest(Test test) {
        testMapper.updateTemplateById(test);
    }

    public void deleteTest(Long testId) {
        testMapper.deleteById(testId);
    }

}
