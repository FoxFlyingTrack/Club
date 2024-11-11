package com.club.subject.domain.entity;

import lombok.Data;
import lombok.ToString;

import java.io.Serializable;

/**
 * 题目分类(SubjectCategory)实体类
 *
 * @author makejava
 * @since 2024-11-10 22:12:28
 */
@Data
@ToString
public class SubjectCategoryBO implements Serializable {
    /**
     * 主键
     */
    private Long id;
    /**
     * 分类名称
     */
    private String categoryName;
    /**
     * 分类类型
     */
    private Integer categoryType;
    /**
     * 图标连接
     */
    private String imageUrl;
    /**
     * 父级id
     */
    private Long parentId;
}

