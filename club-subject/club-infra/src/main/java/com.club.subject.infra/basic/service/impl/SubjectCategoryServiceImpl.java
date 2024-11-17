package com.club.subject.infra.basic.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.club.subject.infra.basic.entity.SubjectCategory;
import com.club.subject.infra.basic.mapper.SubjectCategoryDao;
import com.club.subject.infra.basic.service.SubjectCategoryService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 题目分类(SubjectCategory)表服务实现类
 *
 * @author makejava
 * @since 2023-10-01 21:50:05
 */
@Service("subjectCategoryService")
public class SubjectCategoryServiceImpl extends ServiceImpl<SubjectCategoryDao, SubjectCategory> implements SubjectCategoryService {
    @Resource
    private SubjectCategoryDao subjectCategoryDao;

    @Override
    public List<SubjectCategory> queryCategory(SubjectCategory subjectCategory) {
        LambdaQueryWrapper<SubjectCategory> subjectCategoryLambdaQueryWrapper = new LambdaQueryWrapper<>();
        subjectCategoryLambdaQueryWrapper.eq(SubjectCategory::getIsDeleted, false);
        if (subjectCategory.getParentId() != null) {
            subjectCategoryLambdaQueryWrapper.eq(SubjectCategory::getParentId, subjectCategory.getParentId());
        }
        return this.list(subjectCategoryLambdaQueryWrapper);
    }

    @Override
    public Boolean delete(SubjectCategory subjectCategory) {
        return subjectCategoryDao.deleteById(subjectCategory.getId()) > 0;
    }

}
