package com.club.subject.infra.basic.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.club.subject.infra.basic.entity.SubjectCategory;

import java.util.List;

/**
 * 题目分类(SubjectCategory)表服务接口
 *
 * @author makejava
 * @since 2024-11-10 22:12:29
 */
public interface SubjectCategoryService extends IService<SubjectCategory> {

    /**
     * 查询岗位大类
     *
     * @return
     */
    List<SubjectCategory> queryCategory(SubjectCategory subjectCategory);

    Boolean delete(SubjectCategory subjectCategory);
}
