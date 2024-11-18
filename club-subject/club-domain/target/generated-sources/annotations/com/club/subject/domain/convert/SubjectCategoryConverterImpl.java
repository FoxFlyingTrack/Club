package com.club.subject.domain.convert;

import com.club.subject.domain.entity.SubjectCategoryBO;
import com.club.subject.infra.basic.entity.SubjectCategory;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-11-17T22:23:07+0800",
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

    @Override
    public List<SubjectCategoryBO> convertToCategoryBOList(List<SubjectCategory> subjectCategory) {
        if ( subjectCategory == null ) {
            return null;
        }

        List<SubjectCategoryBO> list = new ArrayList<SubjectCategoryBO>( subjectCategory.size() );
        for ( SubjectCategory subjectCategory1 : subjectCategory ) {
            list.add( subjectCategoryToSubjectCategoryBO( subjectCategory1 ) );
        }

        return list;
    }

    protected SubjectCategoryBO subjectCategoryToSubjectCategoryBO(SubjectCategory subjectCategory) {
        if ( subjectCategory == null ) {
            return null;
        }

        SubjectCategoryBO subjectCategoryBO = new SubjectCategoryBO();

        subjectCategoryBO.setId( subjectCategory.getId() );
        subjectCategoryBO.setCategoryName( subjectCategory.getCategoryName() );
        subjectCategoryBO.setCategoryType( subjectCategory.getCategoryType() );
        subjectCategoryBO.setImageUrl( subjectCategory.getImageUrl() );
        subjectCategoryBO.setParentId( subjectCategory.getParentId() );

        return subjectCategoryBO;
    }
}
