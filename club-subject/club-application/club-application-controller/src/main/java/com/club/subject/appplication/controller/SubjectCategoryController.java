package com.club.subject.appplication.controller;

import com.club.subject.appplication.convert.SubjectCategoryDTOConverter;
import com.club.subject.common.entity.Result;
import com.club.subject.domain.entity.SubjectCategoryBO;
import com.club.subject.domain.entity.SubjectCategoryDTO;
import com.club.subject.domain.service.SubjectCategoryDomainService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * 刷题请求
 */
@RestController
@RequestMapping("/subject/category")
@Slf4j
public class SubjectCategoryController {

    @Resource
    private SubjectCategoryDomainService subjectCategoryDomainService;

    @PostMapping("/add")
    public Result add(@RequestBody SubjectCategoryDTO dto) {
        SubjectCategoryBO subjectCateBO = SubjectCategoryDTOConverter.INSTANCE.convertDtoToCategoryBO(dto);
        subjectCategoryDomainService.add(subjectCateBO);
        return Result.success(true);
    }
}
