package com.club.subject.infra.basic.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.club.subject.infra.basic.entity.SubjectCategory;
import com.club.subject.infra.basic.mapper.SubjectCategoryDao;
import com.club.subject.infra.basic.service.SubjectCategoryService;
import org.springframework.stereotype.Service;

/**
 * 题目分类(SubjectCategory)表服务实现类
 *
 * @author makejava
 * @since 2023-10-01 21:50:05
 */
@Service("subjectCategoryService")
public class SubjectCategoryServiceImpl extends ServiceImpl<SubjectCategoryDao, SubjectCategory> implements SubjectCategoryService {


}
