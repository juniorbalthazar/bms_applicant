package ht.bms.applicant.service.mapper;

import ht.bms.applicant.domain.BmsApplicantsPersonal;
import ht.bms.applicant.model.PersonalBean;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-11-05T20:28:30-0500",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 21.0.8 (Oracle Corporation)"
)
@Component
public class ApplicantMapperImpl implements ApplicantMapper {

    @Override
    public BmsApplicantsPersonal toPersonal(PersonalBean calendar) {
        if ( calendar == null ) {
            return null;
        }

        BmsApplicantsPersonal.BmsApplicantsPersonalBuilder bmsApplicantsPersonal = BmsApplicantsPersonal.builder();

        bmsApplicantsPersonal.applicantId( calendar.getApplicantId() );
        bmsApplicantsPersonal.alreadyArrestDeport( calendar.getAlreadyArrestDeport() );
        bmsApplicantsPersonal.birthOfPlace( calendar.getBirthOfPlace() );
        bmsApplicantsPersonal.dateOfBirth( calendar.getDateOfBirth() );
        bmsApplicantsPersonal.fatherFullName( calendar.getFatherFullName() );
        bmsApplicantsPersonal.firstName( calendar.getFirstName() );
        if ( calendar.getIsAlreadyArrestDeport() != null ) {
            bmsApplicantsPersonal.isAlreadyArrestDeport( String.valueOf( calendar.getIsAlreadyArrestDeport() ) );
        }
        bmsApplicantsPersonal.lastName( calendar.getLastName() );
        bmsApplicantsPersonal.motherFulName( calendar.getMotherFulName() );
        bmsApplicantsPersonal.motifDemande( calendar.getMotifDemande() );
        bmsApplicantsPersonal.nif( calendar.getNif() );
        bmsApplicantsPersonal.nin( calendar.getNin() );
        bmsApplicantsPersonal.email( calendar.getEmail() );
        bmsApplicantsPersonal.msPoids( calendar.getMsPoids() );
        bmsApplicantsPersonal.msTaille( calendar.getMsTaille() );
        bmsApplicantsPersonal.conjointFullName( calendar.getConjointFullName() );
        bmsApplicantsPersonal.maritialStatus( calendar.getMaritialStatus() );
        bmsApplicantsPersonal.youngGirlname( calendar.getYoungGirlname() );
        bmsApplicantsPersonal.gender( calendar.getGender() );
        bmsApplicantsPersonal.idDeptAdress( calendar.getIdDeptAdress() );
        bmsApplicantsPersonal.idCommuneAdress( calendar.getIdCommuneAdress() );
        bmsApplicantsPersonal.detailsAdress( calendar.getDetailsAdress() );
        bmsApplicantsPersonal.nationalite( calendar.getNationalite() );
        bmsApplicantsPersonal.passport( calendar.getPassport() );
        bmsApplicantsPersonal.bodyColor( calendar.getBodyColor() );
        bmsApplicantsPersonal.eyes( calendar.getEyes() );
        bmsApplicantsPersonal.hairs( calendar.getHairs() );
        if ( calendar.getIsCitizen() != null ) {
            bmsApplicantsPersonal.isCitizen( calendar.getIsCitizen() );
        }

        return bmsApplicantsPersonal.build();
    }
}
