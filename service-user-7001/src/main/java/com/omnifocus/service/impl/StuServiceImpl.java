package com.omnifocus.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.omnifocus.mapper.StuMapper;
import com.omnifocus.pojo.Stu;
import com.omnifocus.service.StuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author omnifocus
 * @since 2025-07-01
 */
@Service
public class StuServiceImpl  implements StuService {

    @Autowired
    private StuMapper stuMapper;

    @Override
    @Transactional
    public void save(Stu stu) {
        stuMapper.insert(stu);
    }
}
