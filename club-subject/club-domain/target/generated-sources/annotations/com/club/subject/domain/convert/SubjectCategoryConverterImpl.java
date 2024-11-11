package com.club.subject.domain.convert;

import com.club.subject.domain.entity.SubjectCategoryBO;
import com.club.subject.infra.basic.entity.SubjectCategory;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-11-11T23:31:13+0800",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 1.8.0_422 (Amazon.com Inc.)"
)
public class SubjectCategoryConverterImpl implements SubjectCategoryConverter {

    @Override
    public SubjectCategory convertBoToCategory(SubjectCategoryBO subjectCateBO) {
        if ( subjectCateBO == null ) {
            return null;
        }

        SubjectCategory subjectCategory = new SubjectCategory();

        subjectCategory.setId( subjectCateBO.getId() );
        subjectCategory.setCategoryName( subjectCateBO.getCategoryName() );
        subjectCategory.setCategoryType( subjectCateBO.getCategoryType() );
        subjectCategory.setImageUrl( subjectCateBO.getImageUrl() );
        subjectCategory.setParentId( subjectCateBO.getParentId() );

        return subjectCategory;
    }
}
