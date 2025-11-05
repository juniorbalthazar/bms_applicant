package ht.bms.applicant.service.mapper;

import ht.bms.applicant.domain.BmsApplicantsPersonal;
import ht.bms.applicant.model.PersonalBean;
import org.mapstruct.*;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface ApplicantMapper {

    ApplicantMapper INSTANCE = Mappers.getMapper( ApplicantMapper.class );
/*    @Mapping(source = "dayofmonth",target = "dayOfMonth",defaultValue ="")
    @Mapping(source = "isbusinessday",target = "isBusinessDay",defaultValue ="")
    @Mapping(source = "isdavailable",target = "isDateAvailable",defaultValue ="")
    @Mapping(source = "ishalfday",target = "isHalfDay",defaultValue ="")
    @Mapping(source = "isholiday",target = "isHolyDay",defaultValue ="")*/
    BmsApplicantsPersonal toPersonal(PersonalBean calendar);



}

