package ht.bms.applicant.service;

public class Constants {

    public static final Integer DEFAULT_INSTITUTION_ID = 100;
    public static final int CENTRAL_OFFICE = 0;
    public static final int TX_STATUS_SAISIE = 11;
    public static Integer IS_AVAILABLE = 0;
    public static Integer IS_NOT_AVAILABLE = 1;
    public static String[] HOLIDAY_TYPE= {"FIXED","MOVABLE"};
    public static boolean TYPE_CITIZEN = true; //CITIZEN1
    public static boolean TYPE_MINEUR = false; //MINEUR




    public static String MOTIDEMANTE_TRAVAIL= "Travail";
    public static String MOTIDEMANTE_RESIDENCE= "Residence";

    public static String[] SEXE= {"Masculin","Feminin"};
    public static String SEXE_MALE= "Masculin";
    public static String SEXE_FEMALE= "Feminin";

    /*TRANSATION ASSIGN TYPE*/
    public static long NATIONALITE_HAITIEN = 0;
    public static long NATIONALITE_ENTRANGER = 1;

    //0=PEUT RIEN FAIRE, 1=PEUT VISER, 2=PEUT SIGNER, 3=VISER PAR LE SYSTME

    /*TRANSATION ASSIGN TYPE*/
    public static long ASSIGN_PEUT_RIEN_FAIRE = 0;
    public static long ASSIGN_PEUT_VISER = 1;
    public static long ASSIGN_PEUT_SIGNER = 2;
    public static long ASSIGN_VISER_PAR_SYSTEM = 3;


    /*ASSIGN*/
    public static long ASSIGN_APPLICANT = 1;
    public static long ASSIGN_SUPERVISEUR = 2;
    public static long ASSIGN_EMPRUNT = 3;
    public static long ASSIGN_VERIFICATION_IDENTITE = 4;
    public static long ASSIGN_ANALYSE = 5;
    public static long ASSIGN_APPROUVER_DIRECTEUR = 6;
    public static long ASSIGN_REJECT_DIRECTEUR = 60;
    public static long ASSIGN_FICHIER_CENTRALE = 7;
    public static long ASSIGN_VERIFICATION_BRJ = 8;
    public static long ASSIGN_INTERPOLE = 9;
    public static long ASSIGN_OPERATOR = 10;
    public static long ASSIGN_APPROUVER_CABINET = 11;
    public static long ASSIGN_REJECT_CABINET = 110;


    /*TRANSATION STATUS*/
    public static long TX_STATUS_NOUVEAU = 10;
   // public static long TX_STATUS_SAISIE = 11;
    public static long TX_STATUS_PAIMENT = 12;
    public static long TX_STATUS_EMPRUNT = 13;
    public static long TX_STATUS_FINAL = 14;
    public static long TX_STATUS_CERTIFICAT = 15;

    public static Integer[] TX_PROCESS_STATUS_ALL= {1,2}; // 1=OPEN  ,  2=CLOSE

    public static Integer TX_PROCESS_STATUS_OPEN= 1; // 1=OPEN
    public static Integer TX_PROCESS_STATUS_CLOSE= 2; //   2=CLOSE

    public static Integer[] TX_STATUS_ALL= {10,11,12,13,14,15};
    public static Integer[] TX_STATUS_ACTIVE= {10,11,12,13,14};
    public static Integer[] TX_STATUS_NOT_ACTIVE= {14,15};


    public static Integer DEFAULT_SETTING = 100;//0=true 1=false
   // public static Integer CENTRAL_OFFICE = 0;//0=true 1=false
    public static Integer DEFAULT_INSTITUTION = 0;//0=true 1=false
    public static Integer DEFAULT_SERVICE = 100;//0=true 1=false

    public static Integer CURRENT_TRANSACTION = 0;//0=true 1=false
    public static Integer NO_CURRENT_TRANSACTION = 1;//0=true 1=false


    public static long ROLE_ADMIN = 1;
    public static long ROLE_OPERATOR = 2;
    public static long ROLE_APPLICANT = 3;


    public static String[] USER_ROLE= {"ADMIN","OPERATOR","APPLICANT"};

    public static long DATA_SMALL = 1;
    public static long DATA_MEDIUM = 2;
    public static long DATA_LARGE = 3;

    /*TRANSATION TYPE*/

    public static long TX_TYPE_NEW = 20;
    public static long TX_TYPE_PERSONAL = 21;
    public static long TX_TYPE_PROFESIONAL = 22;
    public static long TX_TYPE_REFERENCES = 23;
    public static long TX_TYPE_IDENTITY = 24;
    public static long TX_TYPE_SIGN_SUBMIT = 25;
    public static long TX_TYPE_PAYMENT = 26;
    public static long TX_TYPE_EMPRINT = 27;
    public static long TX_TYPE_APPROVED = 28;
    public static long TX_TYPE_REJECTED = 29;
    public static long TX_TYPE_MISSING = 30;
    public static long TX_TYPE_TRAITEMENT = 31;
    public static long TX_TYPE_CERTIFICAT = 32;

    public static Integer[] TX_TYPE_ALL= {20,21,22,23,24,25,26,27,28,29,30,31,32};
    public static Integer[] TX_TYPE_ACTIVE= {20,21,22,23,24,25,26,27,31};
    public static Integer[] TX_TYPE_ALL_NOT_ACTIVE= {28,29,30,32};


   // public static Integer IS_AVAILABLE = 0;
  //  public static Integer IS_NOT_AVAILABLE = 1;


    //public static Integer TYPE_CITIZEN = 1; //CITIZEN
   // public static Integer TYPE_MINEUR = 2; //MINEUR


    public static String[] DOC_TYPE= {"RECTO","VERSO"};

 //   public static String[] HOLIDAY_TYPE= {"FIXED","MOVABLE"};

    public static String IMAGE ="image";

    public static Integer HAVE_TRANSACTION = 0;//0=true 1=false
    public static Integer NO_HAVE_TRANSACTION = 1;//0=true 1=false


}
