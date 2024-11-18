package com.club.subject.application.convert;

import com.club.subject.domain.entity.SubjectCategoryBO;
import com.club.subject.domain.entity.SubjectCategoryDTO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface SubjectCategoryDTOConverter {

    SubjectCategoryDTOConverter INSTANCE = Mappers.getMapper(SubjectCategoryDTOConverter.class);


    SubjectCategoryBO convertDtoToCategoryBO(SubjectCategoryDTO subjectCategoryDTO);

    List<SubjectCategoryDTO> convertBOListToCategoryDTOList(List<SubjectCategoryBO> boList);

}
