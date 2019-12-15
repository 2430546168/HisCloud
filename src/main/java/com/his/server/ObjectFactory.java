
package com.his.server;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.his.server package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetAssaySecondClassResponse_QNAME = new QName("http://server.his.com/", "getAssaySecondClassResponse");
    private final static QName _GetDeptClinicTotalByMonth_QNAME = new QName("http://server.his.com/", "getDeptClinicTotalByMonth");
    private final static QName _GetClinicNo_QNAME = new QName("http://server.his.com/", "getClinicNo");
    private final static QName _GetAllClinicInfoByMonthResponse_QNAME = new QName("http://server.his.com/", "getAllClinicInfoByMonthResponse");
    private final static QName _QueryDoctorInfoByCardNoResponse_QNAME = new QName("http://server.his.com/", "queryDoctorInfoByCardNoResponse");
    private final static QName _GetWesternResponse_QNAME = new QName("http://server.his.com/", "getWesternResponse");
    private final static QName _GetCardno_QNAME = new QName("http://server.his.com/", "getCardno");
    private final static QName _GetCheckResultResponse_QNAME = new QName("http://server.his.com/", "getCheckResultResponse");
    private final static QName _GetCardCount_QNAME = new QName("http://server.his.com/", "getCardCount");
    private final static QName _GetDoctorVisitStatus_QNAME = new QName("http://server.his.com/", "getDoctorVisitStatus");
    private final static QName _FindDoctor_QNAME = new QName("http://server.his.com/", "findDoctor");
    private final static QName _GetAdminListResponse_QNAME = new QName("http://server.his.com/", "getAdminListResponse");
    private final static QName _FailureDoctorResponse_QNAME = new QName("http://server.his.com/", "failureDoctorResponse");
    private final static QName _GetDoctorClinicInfoByMonth_QNAME = new QName("http://server.his.com/", "getDoctorClinicInfoByMonth");
    private final static QName _Register_QNAME = new QName("http://server.his.com/", "register");
    private final static QName _GetCheckOrChemical_QNAME = new QName("http://server.his.com/", "getCheckOrChemical");
    private final static QName _GetChineseMedicineResponse_QNAME = new QName("http://server.his.com/", "getChineseMedicineResponse");
    private final static QName _AddPrescription_QNAME = new QName("http://server.his.com/", "addPrescription");
    private final static QName _GetAllClinicTotalByYear_QNAME = new QName("http://server.his.com/", "getAllClinicTotalByYear");
    private final static QName _GetDeptClinicTotalByYearResponse_QNAME = new QName("http://server.his.com/", "getDeptClinicTotalByYearResponse");
    private final static QName _GetRecipeList_QNAME = new QName("http://server.his.com/", "getRecipeList");
    private final static QName _GetTreatChargeInfoResponse_QNAME = new QName("http://server.his.com/", "getTreatChargeInfoResponse");
    private final static QName _QueryDeptListResponse_QNAME = new QName("http://server.his.com/", "queryDeptListResponse");
    private final static QName _GetDoctorLoginResponse_QNAME = new QName("http://server.his.com/", "getDoctorLoginResponse");
    private final static QName _UpdateDoctorInfo_QNAME = new QName("http://server.his.com/", "updateDoctorInfo");
    private final static QName _GetDoctorClinicTotalByMonthResponse_QNAME = new QName("http://server.his.com/", "getDoctorClinicTotalByMonthResponse");
    private final static QName _GetAllClinicTotalByDay_QNAME = new QName("http://server.his.com/", "getAllClinicTotalByDay");
    private final static QName _GetMakeUpPrescribeResponse_QNAME = new QName("http://server.his.com/", "getMakeUpPrescribeResponse");
    private final static QName _DelCheckItemResponse_QNAME = new QName("http://server.his.com/", "delCheckItemResponse");
    private final static QName _GetAllClinicTotalByMonth_QNAME = new QName("http://server.his.com/", "getAllClinicTotalByMonth");
    private final static QName _GetCheckOrChemicalResponse_QNAME = new QName("http://server.his.com/", "getCheckOrChemicalResponse");
    private final static QName _GetDoctorLogin_QNAME = new QName("http://server.his.com/", "getDoctorLogin");
    private final static QName _GetMakeUpPrescribe_QNAME = new QName("http://server.his.com/", "getMakeUpPrescribe");
    private final static QName _DelPrescribingResponse_QNAME = new QName("http://server.his.com/", "delPrescribingResponse");
    private final static QName _BeInHospitalResponse_QNAME = new QName("http://server.his.com/", "beInHospitalResponse");
    private final static QName _GetAllClinicInfoByMonthWithSizeResponse_QNAME = new QName("http://server.his.com/", "getAllClinicInfoByMonthWithSizeResponse");
    private final static QName _AddPrescriptionResponse_QNAME = new QName("http://server.his.com/", "addPrescriptionResponse");
    private final static QName _GetTheSameDayOutpMr_QNAME = new QName("http://server.his.com/", "getTheSameDayOutpMr");
    private final static QName _GetPatientReportByDeptCodeResponse_QNAME = new QName("http://server.his.com/", "getPatientReportByDeptCodeResponse");
    private final static QName _GetTestNo_QNAME = new QName("http://server.his.com/", "getTestNo");
    private final static QName _GetAssaySecondClass_QNAME = new QName("http://server.his.com/", "getAssaySecondClass");
    private final static QName _GetDrugDosage_QNAME = new QName("http://server.his.com/", "getDrugDosage");
    private final static QName _UpdateEvaluateRegisterResponse_QNAME = new QName("http://server.his.com/", "updateEvaluateRegisterResponse");
    private final static QName _QueryDoctorInfoByDeptCodeResponse_QNAME = new QName("http://server.his.com/", "queryDoctorInfoByDeptCodeResponse");
    private final static QName _RegisterRefundWx_QNAME = new QName("http://server.his.com/", "registerRefundWx");
    private final static QName _GetDeptNameByDeptcodeResponse_QNAME = new QName("http://server.his.com/", "getDeptNameByDeptcodeResponse");
    private final static QName _GetDeptClinicInfoByYear_QNAME = new QName("http://server.his.com/", "getDeptClinicInfoByYear");
    private final static QName _GetTheSameDayOutpMrResponse_QNAME = new QName("http://server.his.com/", "getTheSameDayOutpMrResponse");
    private final static QName _GetDoctorSourceInfoResponse_QNAME = new QName("http://server.his.com/", "getDoctorSourceInfoResponse");
    private final static QName _QueryDoctorInfoByDeptCode_QNAME = new QName("http://server.his.com/", "queryDoctorInfoByDeptCode");
    private final static QName _UpdateEvaluateRegister_QNAME = new QName("http://server.his.com/", "updateEvaluateRegister");
    private final static QName _GetDoctorClinicInfoByMonthResponse_QNAME = new QName("http://server.his.com/", "getDoctorClinicInfoByMonthResponse");
    private final static QName _GetItemsSumResponse_QNAME = new QName("http://server.his.com/", "getItemsSumResponse");
    private final static QName _GetChineseMedicine_QNAME = new QName("http://server.his.com/", "getChineseMedicine");
    private final static QName _GetDoctorSourceInfo_QNAME = new QName("http://server.his.com/", "getDoctorSourceInfo");
    private final static QName _SeekedDoctorResponse_QNAME = new QName("http://server.his.com/", "seekedDoctorResponse");
    private final static QName _InsertPatientAssay_QNAME = new QName("http://server.his.com/", "insertPatientAssay");
    private final static QName _GetDoctorVisitStatusResponse_QNAME = new QName("http://server.his.com/", "getDoctorVisitStatusResponse");
    private final static QName _GetDoctorClinicInfoByMonthWithSize_QNAME = new QName("http://server.his.com/", "getDoctorClinicInfoByMonthWithSize");
    private final static QName _UpdateMedicalrecordResponse_QNAME = new QName("http://server.his.com/", "updateMedicalrecordResponse");
    private final static QName _GetPatientRegisHistoryInfo_QNAME = new QName("http://server.his.com/", "getPatientRegisHistoryInfo");
    private final static QName _EditPatientReportByDeptCode_QNAME = new QName("http://server.his.com/", "editPatientReportByDeptCode");
    private final static QName _DoctorAndPatientLoginChange_QNAME = new QName("http://server.his.com/", "doctorAndPatientLoginChange");
    private final static QName _GetAppointmentRegistInfo_QNAME = new QName("http://server.his.com/", "getAppointmentRegistInfo");
    private final static QName _DoctorVisitStatusManagerResponse_QNAME = new QName("http://server.his.com/", "doctorVisitStatusManagerResponse");
    private final static QName _FindLeft_QNAME = new QName("http://server.his.com/", "findLeft");
    private final static QName _DelAssayItemResponse_QNAME = new QName("http://server.his.com/", "delAssayItemResponse");
    private final static QName _InsertPatientAssayResponse_QNAME = new QName("http://server.his.com/", "insertPatientAssayResponse");
    private final static QName _GetAssayClass_QNAME = new QName("http://server.his.com/", "getAssayClass");
    private final static QName _GetMedicalrecordAll_QNAME = new QName("http://server.his.com/", "getMedicalrecordAll");
    private final static QName _GetRegisterCanRefundPatients_QNAME = new QName("http://server.his.com/", "getRegisterCanRefundPatients");
    private final static QName _GetExamNoSeq_QNAME = new QName("http://server.his.com/", "getExamNoSeq");
    private final static QName _GetBeforeOneDrugNoPayResponse_QNAME = new QName("http://server.his.com/", "getBeforeOneDrugNoPayResponse");
    private final static QName _EditDoctorInfoByUserName_QNAME = new QName("http://server.his.com/", "editDoctorInfoByUserName");
    private final static QName _GetValue_QNAME = new QName("http://server.his.com/", "getValue");
    private final static QName _QueryDeptList_QNAME = new QName("http://server.his.com/", "queryDeptList");
    private final static QName _QueryDoctorInfoList_QNAME = new QName("http://server.his.com/", "queryDoctorInfoList");
    private final static QName _EditPatientReportByUserNameResponse_QNAME = new QName("http://server.his.com/", "editPatientReportByUserNameResponse");
    private final static QName _EditAdminLevelByUserName_QNAME = new QName("http://server.his.com/", "editAdminLevelByUserName");
    private final static QName _GetCardCountResponse_QNAME = new QName("http://server.his.com/", "getCardCountResponse");
    private final static QName _GetOutpMrDiagDesc_QNAME = new QName("http://server.his.com/", "getOutpMrDiagDesc");
    private final static QName _GetAllClinicTotalByYearResponse_QNAME = new QName("http://server.his.com/", "getAllClinicTotalByYearResponse");
    private final static QName _GetCheckClass_QNAME = new QName("http://server.his.com/", "getCheckClass");
    private final static QName _GetAdminListByAdminLevel_QNAME = new QName("http://server.his.com/", "getAdminListByAdminLevel");
    private final static QName _DelAssayItem_QNAME = new QName("http://server.his.com/", "delAssayItem");
    private final static QName _GetTreatChargeInfo_QNAME = new QName("http://server.his.com/", "getTreatChargeInfo");
    private final static QName _GetDoctorClinicInfoByDayResponse_QNAME = new QName("http://server.his.com/", "getDoctorClinicInfoByDayResponse");
    private final static QName _GetBeforeOneCheckNoPay_QNAME = new QName("http://server.his.com/", "getBeforeOneCheckNoPay");
    private final static QName _GetAllClinicInfoByDay_QNAME = new QName("http://server.his.com/", "getAllClinicInfoByDay");
    private final static QName _GetTestNoResponse_QNAME = new QName("http://server.his.com/", "getTestNoResponse");
    private final static QName _GetAllClinicInfoByMonth_QNAME = new QName("http://server.his.com/", "getAllClinicInfoByMonth");
    private final static QName _GetMedicalrecordAllResponse_QNAME = new QName("http://server.his.com/", "getMedicalrecordAllResponse");
    private final static QName _FindfailureDoctorResponse_QNAME = new QName("http://server.his.com/", "findfailureDoctorResponse");
    private final static QName _GetWestern_QNAME = new QName("http://server.his.com/", "getWestern");
    private final static QName _GetDrugResponse_QNAME = new QName("http://server.his.com/", "getDrugResponse");
    private final static QName _GetDoctorClinicTotalByDayResponse_QNAME = new QName("http://server.his.com/", "getDoctorClinicTotalByDayResponse");
    private final static QName _UpdateMedicalrecord_QNAME = new QName("http://server.his.com/", "updateMedicalrecord");
    private final static QName _GetDeptDictResponse_QNAME = new QName("http://server.his.com/", "getDeptDictResponse");
    private final static QName _CacleRegsiter_QNAME = new QName("http://server.his.com/", "cacleRegsiter");
    private final static QName _GetDoctorInfo_QNAME = new QName("http://server.his.com/", "getDoctorInfo");
    private final static QName _GetRegisterNumberAndLastTimeAndNumberResponse_QNAME = new QName("http://server.his.com/", "getRegisterNumberAndLastTimeAndNumberResponse");
    private final static QName _GetSubclass_QNAME = new QName("http://server.his.com/", "getSubclass");
    private final static QName _GetDeptClinicInfoByYearResponse_QNAME = new QName("http://server.his.com/", "getDeptClinicInfoByYearResponse");
    private final static QName _FailureDoctor_QNAME = new QName("http://server.his.com/", "failureDoctor");
    private final static QName _GetDeptClinicInfoByDay_QNAME = new QName("http://server.his.com/", "getDeptClinicInfoByDay");
    private final static QName _QueryDeptContentByDeptCode_QNAME = new QName("http://server.his.com/", "queryDeptContentByDeptCode");
    private final static QName _EditPatientReportByUserName_QNAME = new QName("http://server.his.com/", "editPatientReportByUserName");
    private final static QName _FindfailureDoctor_QNAME = new QName("http://server.his.com/", "findfailureDoctor");
    private final static QName _EditPatientReportAll_QNAME = new QName("http://server.his.com/", "editPatientReportAll");
    private final static QName _GetDeptClinicTotalByDay_QNAME = new QName("http://server.his.com/", "getDeptClinicTotalByDay");
    private final static QName _GetDoctorClinicTotalByMonth_QNAME = new QName("http://server.his.com/", "getDoctorClinicTotalByMonth");
    private final static QName _DoctorAndPatientLoginChangeResponse_QNAME = new QName("http://server.his.com/", "doctorAndPatientLoginChangeResponse");
    private final static QName _GetAdminLevel_QNAME = new QName("http://server.his.com/", "getAdminLevel");
    private final static QName _GetBeforeOneDrugNoPay_QNAME = new QName("http://server.his.com/", "getBeforeOneDrugNoPay");
    private final static QName _GetAllClinicInfoByDayResponse_QNAME = new QName("http://server.his.com/", "getAllClinicInfoByDayResponse");
    private final static QName _QueryDeptInfoList_QNAME = new QName("http://server.his.com/", "queryDeptInfoList");
    private final static QName _FindRegisterOrders_QNAME = new QName("http://server.his.com/", "findRegisterOrders");
    private final static QName _OpenPrescriptionResponse_QNAME = new QName("http://server.his.com/", "openPrescriptionResponse");
    private final static QName _GetDeptDict_QNAME = new QName("http://server.his.com/", "getDeptDict");
    private final static QName _RegularRegisterRefund_QNAME = new QName("http://server.his.com/", "regularRegisterRefund");
    private final static QName _GetDrug_QNAME = new QName("http://server.his.com/", "getDrug");
    private final static QName _GetAssayResultTakeNotes_QNAME = new QName("http://server.his.com/", "getAssayResultTakeNotes");
    private final static QName _GetMedicalLastResponse_QNAME = new QName("http://server.his.com/", "getMedicalLastResponse");
    private final static QName _GetDeptClinicInfoByDayResponse_QNAME = new QName("http://server.his.com/", "getDeptClinicInfoByDayResponse");
    private final static QName _GetAdminList_QNAME = new QName("http://server.his.com/", "getAdminList");
    private final static QName _AddCardno_QNAME = new QName("http://server.his.com/", "addCardno");
    private final static QName _GetDoctorClinicInfoByDay_QNAME = new QName("http://server.his.com/", "getDoctorClinicInfoByDay");
    private final static QName _GetBeforeOneAssayNoPay_QNAME = new QName("http://server.his.com/", "getBeforeOneAssayNoPay");
    private final static QName _GetDeptClinicTotalByYear_QNAME = new QName("http://server.his.com/", "getDeptClinicTotalByYear");
    private final static QName _GetDrugUsage_QNAME = new QName("http://server.his.com/", "getDrugUsage");
    private final static QName _GetMedicalLast_QNAME = new QName("http://server.his.com/", "getMedicalLast");
    private final static QName _GetAssayResultTakeNotesResponse_QNAME = new QName("http://server.his.com/", "getAssayResultTakeNotesResponse");
    private final static QName _GetEntrynameResponse_QNAME = new QName("http://server.his.com/", "getEntrynameResponse");
    private final static QName _BeInHospital_QNAME = new QName("http://server.his.com/", "beInHospital");
    private final static QName _DoctorVisitStatusManager_QNAME = new QName("http://server.his.com/", "doctorVisitStatusManager");
    private final static QName _GetBeforeOneCheckNoPayResponse_QNAME = new QName("http://server.his.com/", "getBeforeOneCheckNoPayResponse");
    private final static QName _GetAssayClassResponse_QNAME = new QName("http://server.his.com/", "getAssayClassResponse");
    private final static QName _GetDeptClinicTotalByDayResponse_QNAME = new QName("http://server.his.com/", "getDeptClinicTotalByDayResponse");
    private final static QName _GetDoctorClinicInfoByYear_QNAME = new QName("http://server.his.com/", "getDoctorClinicInfoByYear");
    private final static QName _GetTheSameDayMedicalrecordAll_QNAME = new QName("http://server.his.com/", "getTheSameDayMedicalrecordAll");
    private final static QName _QueryDoctorInfoListResponse_QNAME = new QName("http://server.his.com/", "queryDoctorInfoListResponse");
    private final static QName _GetAssayResultResponse_QNAME = new QName("http://server.his.com/", "getAssayResultResponse");
    private final static QName _GetDoctorClinicTotalByYearResponse_QNAME = new QName("http://server.his.com/", "getDoctorClinicTotalByYearResponse");
    private final static QName _GetDoctorInfoResponse_QNAME = new QName("http://server.his.com/", "getDoctorInfoResponse");
    private final static QName _GetDeptClinicInfoByMonthWithSizeResponse_QNAME = new QName("http://server.his.com/", "getDeptClinicInfoByMonthWithSizeResponse");
    private final static QName _GetSubclassResponse_QNAME = new QName("http://server.his.com/", "getSubclassResponse");
    private final static QName _GetCheckResult_QNAME = new QName("http://server.his.com/", "getCheckResult");
    private final static QName _GetCardnoResponse_QNAME = new QName("http://server.his.com/", "getCardnoResponse");
    private final static QName _GetAllClinicInfoByMonthWithSize_QNAME = new QName("http://server.his.com/", "getAllClinicInfoByMonthWithSize");
    private final static QName _GetAppointmentRegistInfoResponse_QNAME = new QName("http://server.his.com/", "getAppointmentRegistInfoResponse");
    private final static QName _InsertMedicalrecord_QNAME = new QName("http://server.his.com/", "insertMedicalrecord");
    private final static QName _FindRegisterOrdersResponse_QNAME = new QName("http://server.his.com/", "findRegisterOrdersResponse");
    private final static QName _GetDeptNameResponse_QNAME = new QName("http://server.his.com/", "getDeptNameResponse");
    private final static QName _UpdateDoctorVisitStatusResponse_QNAME = new QName("http://server.his.com/", "updateDoctorVisitStatusResponse");
    private final static QName _GetAllClinicInfoByYearResponse_QNAME = new QName("http://server.his.com/", "getAllClinicInfoByYearResponse");
    private final static QName _UpdateDoctorInfoResponse_QNAME = new QName("http://server.his.com/", "updateDoctorInfoResponse");
    private final static QName _RegisterRefundWxResponse_QNAME = new QName("http://server.his.com/", "registerRefundWxResponse");
    private final static QName _GetTheSameDayMedicalrecordAllResponse_QNAME = new QName("http://server.his.com/", "getTheSameDayMedicalrecordAllResponse");
    private final static QName _GetOutpMrDiagDescResponse_QNAME = new QName("http://server.his.com/", "getOutpMrDiagDescResponse");
    private final static QName _GetDoctorClinicInfoByYearResponse_QNAME = new QName("http://server.his.com/", "getDoctorClinicInfoByYearResponse");
    private final static QName _QueryDeptContentByDeptCodeResponse_QNAME = new QName("http://server.his.com/", "queryDeptContentByDeptCodeResponse");
    private final static QName _GetBeforeOneAssayNoPayResponse_QNAME = new QName("http://server.his.com/", "getBeforeOneAssayNoPayResponse");
    private final static QName _GetRecipeListResponse_QNAME = new QName("http://server.his.com/", "getRecipeListResponse");
    private final static QName _QueryDoctorInfoByCardNo_QNAME = new QName("http://server.his.com/", "queryDoctorInfoByCardNo");
    private final static QName _AddCardnoResponse_QNAME = new QName("http://server.his.com/", "addCardnoResponse");
    private final static QName _GetDoctorClinicTotalByYear_QNAME = new QName("http://server.his.com/", "getDoctorClinicTotalByYear");
    private final static QName _GetAllClinicTotalByDayResponse_QNAME = new QName("http://server.his.com/", "getAllClinicTotalByDayResponse");
    private final static QName _GetDeptClinicInfoByMonth_QNAME = new QName("http://server.his.com/", "getDeptClinicInfoByMonth");
    private final static QName _OpenPrescription_QNAME = new QName("http://server.his.com/", "openPrescription");
    private final static QName _GetPatientRegisHistoryInfoResponse_QNAME = new QName("http://server.his.com/", "getPatientRegisHistoryInfoResponse");
    private final static QName _GetDeptClinicInfoByMonthResponse_QNAME = new QName("http://server.his.com/", "getDeptClinicInfoByMonthResponse");
    private final static QName _GetDoctorClinicInfoByMonthWithSizeResponse_QNAME = new QName("http://server.his.com/", "getDoctorClinicInfoByMonthWithSizeResponse");
    private final static QName _GetDeptClinicTotalByMonthResponse_QNAME = new QName("http://server.his.com/", "getDeptClinicTotalByMonthResponse");
    private final static QName _GetAssayResult_QNAME = new QName("http://server.his.com/", "getAssayResult");
    private final static QName _GetPatientReportByDeptCode_QNAME = new QName("http://server.his.com/", "getPatientReportByDeptCode");
    private final static QName _GetOutpOrder_QNAME = new QName("http://server.his.com/", "getOutpOrder");
    private final static QName _GetOutpOrderResponse_QNAME = new QName("http://server.his.com/", "getOutpOrderResponse");
    private final static QName _GetDeptClinicInfoByMonthWithSize_QNAME = new QName("http://server.his.com/", "getDeptClinicInfoByMonthWithSize");
    private final static QName _EditPatientReportByDeptCodeResponse_QNAME = new QName("http://server.his.com/", "editPatientReportByDeptCodeResponse");
    private final static QName _GetAdminListByAdminLevelResponse_QNAME = new QName("http://server.his.com/", "getAdminListByAdminLevelResponse");
    private final static QName _GetDeptNameByDeptcode_QNAME = new QName("http://server.his.com/", "getDeptNameByDeptcode");
    private final static QName _GetVisitNoResponse_QNAME = new QName("http://server.his.com/", "getVisitNoResponse");
    private final static QName _GetAdminLevelResponse_QNAME = new QName("http://server.his.com/", "getAdminLevelResponse");
    private final static QName _RegularRegisterRefundResponse_QNAME = new QName("http://server.his.com/", "regularRegisterRefundResponse");
    private final static QName _DelPrescribing_QNAME = new QName("http://server.his.com/", "delPrescribing");
    private final static QName _InsertMedicalrecordResponse_QNAME = new QName("http://server.his.com/", "insertMedicalrecordResponse");
    private final static QName _GetDrugDosageResponse_QNAME = new QName("http://server.his.com/", "getDrugDosageResponse");
    private final static QName _GetItemsSum_QNAME = new QName("http://server.his.com/", "getItemsSum");
    private final static QName _RegisterResponse_QNAME = new QName("http://server.his.com/", "registerResponse");
    private final static QName _GetAllClinicInfoByYear_QNAME = new QName("http://server.his.com/", "getAllClinicInfoByYear");
    private final static QName _UpdateDoctorVisitStatus_QNAME = new QName("http://server.his.com/", "updateDoctorVisitStatus");
    private final static QName _QueryDeptInfoListResponse_QNAME = new QName("http://server.his.com/", "queryDeptInfoListResponse");
    private final static QName _FindDoctorResponse_QNAME = new QName("http://server.his.com/", "findDoctorResponse");
    private final static QName _GetRegisterCanRefundPatientsResponse_QNAME = new QName("http://server.his.com/", "getRegisterCanRefundPatientsResponse");
    private final static QName _GetRegisterNumberAndLastTimeAndNumber_QNAME = new QName("http://server.his.com/", "getRegisterNumberAndLastTimeAndNumber");
    private final static QName _EditAdminLevelByUserNameResponse_QNAME = new QName("http://server.his.com/", "editAdminLevelByUserNameResponse");
    private final static QName _GetDoctorClinicTotalByDay_QNAME = new QName("http://server.his.com/", "getDoctorClinicTotalByDay");
    private final static QName _GetDrugUsageResponse_QNAME = new QName("http://server.his.com/", "getDrugUsageResponse");
    private final static QName _GetExamNoSeqResponse_QNAME = new QName("http://server.his.com/", "getExamNoSeqResponse");
    private final static QName _GetVisitNo_QNAME = new QName("http://server.his.com/", "getVisitNo");
    private final static QName _EditDoctorInfoByUserNameResponse_QNAME = new QName("http://server.his.com/", "editDoctorInfoByUserNameResponse");
    private final static QName _GetDeptName_QNAME = new QName("http://server.his.com/", "getDeptName");
    private final static QName _GetValueResponse_QNAME = new QName("http://server.his.com/", "getValueResponse");
    private final static QName _SeekedDoctor_QNAME = new QName("http://server.his.com/", "seekedDoctor");
    private final static QName _GetEntryname_QNAME = new QName("http://server.his.com/", "getEntryname");
    private final static QName _GetClinicNoResponse_QNAME = new QName("http://server.his.com/", "getClinicNoResponse");
    private final static QName _GetAllClinicTotalByMonthResponse_QNAME = new QName("http://server.his.com/", "getAllClinicTotalByMonthResponse");
    private final static QName _CacleRegsiterResponse_QNAME = new QName("http://server.his.com/", "cacleRegsiterResponse");
    private final static QName _FindLeftResponse_QNAME = new QName("http://server.his.com/", "findLeftResponse");
    private final static QName _DelCheckItem_QNAME = new QName("http://server.his.com/", "delCheckItem");
    private final static QName _EditPatientReportAllResponse_QNAME = new QName("http://server.his.com/", "editPatientReportAllResponse");
    private final static QName _GetCheckClassResponse_QNAME = new QName("http://server.his.com/", "getCheckClassResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.his.server
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link UpdateDoctorInfo }
     * 
     */
    public UpdateDoctorInfo createUpdateDoctorInfo() {
        return new UpdateDoctorInfo();
    }

    /**
     * Create an instance of {@link GetDoctorClinicTotalByMonthResponse }
     * 
     */
    public GetDoctorClinicTotalByMonthResponse createGetDoctorClinicTotalByMonthResponse() {
        return new GetDoctorClinicTotalByMonthResponse();
    }

    /**
     * Create an instance of {@link GetAllClinicTotalByDay }
     * 
     */
    public GetAllClinicTotalByDay createGetAllClinicTotalByDay() {
        return new GetAllClinicTotalByDay();
    }

    /**
     * Create an instance of {@link GetDeptClinicTotalByYearResponse }
     * 
     */
    public GetDeptClinicTotalByYearResponse createGetDeptClinicTotalByYearResponse() {
        return new GetDeptClinicTotalByYearResponse();
    }

    /**
     * Create an instance of {@link GetRecipeList }
     * 
     */
    public GetRecipeList createGetRecipeList() {
        return new GetRecipeList();
    }

    /**
     * Create an instance of {@link GetTreatChargeInfoResponse }
     * 
     */
    public GetTreatChargeInfoResponse createGetTreatChargeInfoResponse() {
        return new GetTreatChargeInfoResponse();
    }

    /**
     * Create an instance of {@link QueryDeptListResponse }
     * 
     */
    public QueryDeptListResponse createQueryDeptListResponse() {
        return new QueryDeptListResponse();
    }

    /**
     * Create an instance of {@link GetDoctorLoginResponse }
     * 
     */
    public GetDoctorLoginResponse createGetDoctorLoginResponse() {
        return new GetDoctorLoginResponse();
    }

    /**
     * Create an instance of {@link DelCheckItemResponse }
     * 
     */
    public DelCheckItemResponse createDelCheckItemResponse() {
        return new DelCheckItemResponse();
    }

    /**
     * Create an instance of {@link GetAllClinicTotalByMonth }
     * 
     */
    public GetAllClinicTotalByMonth createGetAllClinicTotalByMonth() {
        return new GetAllClinicTotalByMonth();
    }

    /**
     * Create an instance of {@link GetCheckOrChemicalResponse }
     * 
     */
    public GetCheckOrChemicalResponse createGetCheckOrChemicalResponse() {
        return new GetCheckOrChemicalResponse();
    }

    /**
     * Create an instance of {@link GetDoctorLogin }
     * 
     */
    public GetDoctorLogin createGetDoctorLogin() {
        return new GetDoctorLogin();
    }

    /**
     * Create an instance of {@link GetMakeUpPrescribeResponse }
     * 
     */
    public GetMakeUpPrescribeResponse createGetMakeUpPrescribeResponse() {
        return new GetMakeUpPrescribeResponse();
    }

    /**
     * Create an instance of {@link BeInHospitalResponse }
     * 
     */
    public BeInHospitalResponse createBeInHospitalResponse() {
        return new BeInHospitalResponse();
    }

    /**
     * Create an instance of {@link GetAllClinicInfoByMonthWithSizeResponse }
     * 
     */
    public GetAllClinicInfoByMonthWithSizeResponse createGetAllClinicInfoByMonthWithSizeResponse() {
        return new GetAllClinicInfoByMonthWithSizeResponse();
    }

    /**
     * Create an instance of {@link AddPrescriptionResponse }
     * 
     */
    public AddPrescriptionResponse createAddPrescriptionResponse() {
        return new AddPrescriptionResponse();
    }

    /**
     * Create an instance of {@link GetTheSameDayOutpMr }
     * 
     */
    public GetTheSameDayOutpMr createGetTheSameDayOutpMr() {
        return new GetTheSameDayOutpMr();
    }

    /**
     * Create an instance of {@link GetPatientReportByDeptCodeResponse }
     * 
     */
    public GetPatientReportByDeptCodeResponse createGetPatientReportByDeptCodeResponse() {
        return new GetPatientReportByDeptCodeResponse();
    }

    /**
     * Create an instance of {@link GetTestNo }
     * 
     */
    public GetTestNo createGetTestNo() {
        return new GetTestNo();
    }

    /**
     * Create an instance of {@link GetMakeUpPrescribe }
     * 
     */
    public GetMakeUpPrescribe createGetMakeUpPrescribe() {
        return new GetMakeUpPrescribe();
    }

    /**
     * Create an instance of {@link DelPrescribingResponse }
     * 
     */
    public DelPrescribingResponse createDelPrescribingResponse() {
        return new DelPrescribingResponse();
    }

    /**
     * Create an instance of {@link RegisterRefundWx }
     * 
     */
    public RegisterRefundWx createRegisterRefundWx() {
        return new RegisterRefundWx();
    }

    /**
     * Create an instance of {@link GetAssaySecondClass }
     * 
     */
    public GetAssaySecondClass createGetAssaySecondClass() {
        return new GetAssaySecondClass();
    }

    /**
     * Create an instance of {@link GetDrugDosage }
     * 
     */
    public GetDrugDosage createGetDrugDosage() {
        return new GetDrugDosage();
    }

    /**
     * Create an instance of {@link UpdateEvaluateRegisterResponse }
     * 
     */
    public UpdateEvaluateRegisterResponse createUpdateEvaluateRegisterResponse() {
        return new UpdateEvaluateRegisterResponse();
    }

    /**
     * Create an instance of {@link QueryDoctorInfoByDeptCodeResponse }
     * 
     */
    public QueryDoctorInfoByDeptCodeResponse createQueryDoctorInfoByDeptCodeResponse() {
        return new QueryDoctorInfoByDeptCodeResponse();
    }

    /**
     * Create an instance of {@link GetDeptClinicTotalByMonth }
     * 
     */
    public GetDeptClinicTotalByMonth createGetDeptClinicTotalByMonth() {
        return new GetDeptClinicTotalByMonth();
    }

    /**
     * Create an instance of {@link GetClinicNo }
     * 
     */
    public GetClinicNo createGetClinicNo() {
        return new GetClinicNo();
    }

    /**
     * Create an instance of {@link GetAssaySecondClassResponse }
     * 
     */
    public GetAssaySecondClassResponse createGetAssaySecondClassResponse() {
        return new GetAssaySecondClassResponse();
    }

    /**
     * Create an instance of {@link GetCardno }
     * 
     */
    public GetCardno createGetCardno() {
        return new GetCardno();
    }

    /**
     * Create an instance of {@link GetAllClinicInfoByMonthResponse }
     * 
     */
    public GetAllClinicInfoByMonthResponse createGetAllClinicInfoByMonthResponse() {
        return new GetAllClinicInfoByMonthResponse();
    }

    /**
     * Create an instance of {@link QueryDoctorInfoByCardNoResponse }
     * 
     */
    public QueryDoctorInfoByCardNoResponse createQueryDoctorInfoByCardNoResponse() {
        return new QueryDoctorInfoByCardNoResponse();
    }

    /**
     * Create an instance of {@link GetWesternResponse }
     * 
     */
    public GetWesternResponse createGetWesternResponse() {
        return new GetWesternResponse();
    }

    /**
     * Create an instance of {@link FindDoctor }
     * 
     */
    public FindDoctor createFindDoctor() {
        return new FindDoctor();
    }

    /**
     * Create an instance of {@link GetAdminListResponse }
     * 
     */
    public GetAdminListResponse createGetAdminListResponse() {
        return new GetAdminListResponse();
    }

    /**
     * Create an instance of {@link FailureDoctorResponse }
     * 
     */
    public FailureDoctorResponse createFailureDoctorResponse() {
        return new FailureDoctorResponse();
    }

    /**
     * Create an instance of {@link GetDoctorClinicInfoByMonth }
     * 
     */
    public GetDoctorClinicInfoByMonth createGetDoctorClinicInfoByMonth() {
        return new GetDoctorClinicInfoByMonth();
    }

    /**
     * Create an instance of {@link GetCheckResultResponse }
     * 
     */
    public GetCheckResultResponse createGetCheckResultResponse() {
        return new GetCheckResultResponse();
    }

    /**
     * Create an instance of {@link GetCardCount }
     * 
     */
    public GetCardCount createGetCardCount() {
        return new GetCardCount();
    }

    /**
     * Create an instance of {@link GetDoctorVisitStatus }
     * 
     */
    public GetDoctorVisitStatus createGetDoctorVisitStatus() {
        return new GetDoctorVisitStatus();
    }

    /**
     * Create an instance of {@link GetCheckOrChemical }
     * 
     */
    public GetCheckOrChemical createGetCheckOrChemical() {
        return new GetCheckOrChemical();
    }

    /**
     * Create an instance of {@link GetChineseMedicineResponse }
     * 
     */
    public GetChineseMedicineResponse createGetChineseMedicineResponse() {
        return new GetChineseMedicineResponse();
    }

    /**
     * Create an instance of {@link AddPrescription }
     * 
     */
    public AddPrescription createAddPrescription() {
        return new AddPrescription();
    }

    /**
     * Create an instance of {@link GetAllClinicTotalByYear }
     * 
     */
    public GetAllClinicTotalByYear createGetAllClinicTotalByYear() {
        return new GetAllClinicTotalByYear();
    }

    /**
     * Create an instance of {@link Register }
     * 
     */
    public Register createRegister() {
        return new Register();
    }

    /**
     * Create an instance of {@link DelAssayItem }
     * 
     */
    public DelAssayItem createDelAssayItem() {
        return new DelAssayItem();
    }

    /**
     * Create an instance of {@link GetTreatChargeInfo }
     * 
     */
    public GetTreatChargeInfo createGetTreatChargeInfo() {
        return new GetTreatChargeInfo();
    }

    /**
     * Create an instance of {@link GetDoctorClinicInfoByDayResponse }
     * 
     */
    public GetDoctorClinicInfoByDayResponse createGetDoctorClinicInfoByDayResponse() {
        return new GetDoctorClinicInfoByDayResponse();
    }

    /**
     * Create an instance of {@link GetBeforeOneCheckNoPay }
     * 
     */
    public GetBeforeOneCheckNoPay createGetBeforeOneCheckNoPay() {
        return new GetBeforeOneCheckNoPay();
    }

    /**
     * Create an instance of {@link GetOutpMrDiagDesc }
     * 
     */
    public GetOutpMrDiagDesc createGetOutpMrDiagDesc() {
        return new GetOutpMrDiagDesc();
    }

    /**
     * Create an instance of {@link GetAllClinicTotalByYearResponse }
     * 
     */
    public GetAllClinicTotalByYearResponse createGetAllClinicTotalByYearResponse() {
        return new GetAllClinicTotalByYearResponse();
    }

    /**
     * Create an instance of {@link GetCheckClass }
     * 
     */
    public GetCheckClass createGetCheckClass() {
        return new GetCheckClass();
    }

    /**
     * Create an instance of {@link GetAdminListByAdminLevel }
     * 
     */
    public GetAdminListByAdminLevel createGetAdminListByAdminLevel() {
        return new GetAdminListByAdminLevel();
    }

    /**
     * Create an instance of {@link GetAllClinicInfoByMonth }
     * 
     */
    public GetAllClinicInfoByMonth createGetAllClinicInfoByMonth() {
        return new GetAllClinicInfoByMonth();
    }

    /**
     * Create an instance of {@link GetMedicalrecordAllResponse }
     * 
     */
    public GetMedicalrecordAllResponse createGetMedicalrecordAllResponse() {
        return new GetMedicalrecordAllResponse();
    }

    /**
     * Create an instance of {@link GetAllClinicInfoByDay }
     * 
     */
    public GetAllClinicInfoByDay createGetAllClinicInfoByDay() {
        return new GetAllClinicInfoByDay();
    }

    /**
     * Create an instance of {@link GetTestNoResponse }
     * 
     */
    public GetTestNoResponse createGetTestNoResponse() {
        return new GetTestNoResponse();
    }

    /**
     * Create an instance of {@link GetDoctorClinicTotalByDayResponse }
     * 
     */
    public GetDoctorClinicTotalByDayResponse createGetDoctorClinicTotalByDayResponse() {
        return new GetDoctorClinicTotalByDayResponse();
    }

    /**
     * Create an instance of {@link FindfailureDoctorResponse }
     * 
     */
    public FindfailureDoctorResponse createFindfailureDoctorResponse() {
        return new FindfailureDoctorResponse();
    }

    /**
     * Create an instance of {@link GetWestern }
     * 
     */
    public GetWestern createGetWestern() {
        return new GetWestern();
    }

    /**
     * Create an instance of {@link GetDrugResponse }
     * 
     */
    public GetDrugResponse createGetDrugResponse() {
        return new GetDrugResponse();
    }

    /**
     * Create an instance of {@link GetDeptDictResponse }
     * 
     */
    public GetDeptDictResponse createGetDeptDictResponse() {
        return new GetDeptDictResponse();
    }

    /**
     * Create an instance of {@link CacleRegsiter }
     * 
     */
    public CacleRegsiter createCacleRegsiter() {
        return new CacleRegsiter();
    }

    /**
     * Create an instance of {@link GetDoctorInfo }
     * 
     */
    public GetDoctorInfo createGetDoctorInfo() {
        return new GetDoctorInfo();
    }

    /**
     * Create an instance of {@link GetRegisterNumberAndLastTimeAndNumberResponse }
     * 
     */
    public GetRegisterNumberAndLastTimeAndNumberResponse createGetRegisterNumberAndLastTimeAndNumberResponse() {
        return new GetRegisterNumberAndLastTimeAndNumberResponse();
    }

    /**
     * Create an instance of {@link GetSubclass }
     * 
     */
    public GetSubclass createGetSubclass() {
        return new GetSubclass();
    }

    /**
     * Create an instance of {@link GetDeptClinicInfoByYearResponse }
     * 
     */
    public GetDeptClinicInfoByYearResponse createGetDeptClinicInfoByYearResponse() {
        return new GetDeptClinicInfoByYearResponse();
    }

    /**
     * Create an instance of {@link UpdateMedicalrecord }
     * 
     */
    public UpdateMedicalrecord createUpdateMedicalrecord() {
        return new UpdateMedicalrecord();
    }

    /**
     * Create an instance of {@link GetDoctorClinicInfoByMonthResponse }
     * 
     */
    public GetDoctorClinicInfoByMonthResponse createGetDoctorClinicInfoByMonthResponse() {
        return new GetDoctorClinicInfoByMonthResponse();
    }

    /**
     * Create an instance of {@link GetDeptNameByDeptcodeResponse }
     * 
     */
    public GetDeptNameByDeptcodeResponse createGetDeptNameByDeptcodeResponse() {
        return new GetDeptNameByDeptcodeResponse();
    }

    /**
     * Create an instance of {@link GetDeptClinicInfoByYear }
     * 
     */
    public GetDeptClinicInfoByYear createGetDeptClinicInfoByYear() {
        return new GetDeptClinicInfoByYear();
    }

    /**
     * Create an instance of {@link GetTheSameDayOutpMrResponse }
     * 
     */
    public GetTheSameDayOutpMrResponse createGetTheSameDayOutpMrResponse() {
        return new GetTheSameDayOutpMrResponse();
    }

    /**
     * Create an instance of {@link GetDoctorSourceInfoResponse }
     * 
     */
    public GetDoctorSourceInfoResponse createGetDoctorSourceInfoResponse() {
        return new GetDoctorSourceInfoResponse();
    }

    /**
     * Create an instance of {@link QueryDoctorInfoByDeptCode }
     * 
     */
    public QueryDoctorInfoByDeptCode createQueryDoctorInfoByDeptCode() {
        return new QueryDoctorInfoByDeptCode();
    }

    /**
     * Create an instance of {@link UpdateEvaluateRegister }
     * 
     */
    public UpdateEvaluateRegister createUpdateEvaluateRegister() {
        return new UpdateEvaluateRegister();
    }

    /**
     * Create an instance of {@link GetDoctorClinicInfoByMonthWithSize }
     * 
     */
    public GetDoctorClinicInfoByMonthWithSize createGetDoctorClinicInfoByMonthWithSize() {
        return new GetDoctorClinicInfoByMonthWithSize();
    }

    /**
     * Create an instance of {@link UpdateMedicalrecordResponse }
     * 
     */
    public UpdateMedicalrecordResponse createUpdateMedicalrecordResponse() {
        return new UpdateMedicalrecordResponse();
    }

    /**
     * Create an instance of {@link GetPatientRegisHistoryInfo }
     * 
     */
    public GetPatientRegisHistoryInfo createGetPatientRegisHistoryInfo() {
        return new GetPatientRegisHistoryInfo();
    }

    /**
     * Create an instance of {@link EditPatientReportByDeptCode }
     * 
     */
    public EditPatientReportByDeptCode createEditPatientReportByDeptCode() {
        return new EditPatientReportByDeptCode();
    }

    /**
     * Create an instance of {@link GetItemsSumResponse }
     * 
     */
    public GetItemsSumResponse createGetItemsSumResponse() {
        return new GetItemsSumResponse();
    }

    /**
     * Create an instance of {@link GetChineseMedicine }
     * 
     */
    public GetChineseMedicine createGetChineseMedicine() {
        return new GetChineseMedicine();
    }

    /**
     * Create an instance of {@link GetDoctorSourceInfo }
     * 
     */
    public GetDoctorSourceInfo createGetDoctorSourceInfo() {
        return new GetDoctorSourceInfo();
    }

    /**
     * Create an instance of {@link SeekedDoctorResponse }
     * 
     */
    public SeekedDoctorResponse createSeekedDoctorResponse() {
        return new SeekedDoctorResponse();
    }

    /**
     * Create an instance of {@link InsertPatientAssay }
     * 
     */
    public InsertPatientAssay createInsertPatientAssay() {
        return new InsertPatientAssay();
    }

    /**
     * Create an instance of {@link GetDoctorVisitStatusResponse }
     * 
     */
    public GetDoctorVisitStatusResponse createGetDoctorVisitStatusResponse() {
        return new GetDoctorVisitStatusResponse();
    }

    /**
     * Create an instance of {@link FindLeft }
     * 
     */
    public FindLeft createFindLeft() {
        return new FindLeft();
    }

    /**
     * Create an instance of {@link DelAssayItemResponse }
     * 
     */
    public DelAssayItemResponse createDelAssayItemResponse() {
        return new DelAssayItemResponse();
    }

    /**
     * Create an instance of {@link InsertPatientAssayResponse }
     * 
     */
    public InsertPatientAssayResponse createInsertPatientAssayResponse() {
        return new InsertPatientAssayResponse();
    }

    /**
     * Create an instance of {@link GetAssayClass }
     * 
     */
    public GetAssayClass createGetAssayClass() {
        return new GetAssayClass();
    }

    /**
     * Create an instance of {@link GetMedicalrecordAll }
     * 
     */
    public GetMedicalrecordAll createGetMedicalrecordAll() {
        return new GetMedicalrecordAll();
    }

    /**
     * Create an instance of {@link DoctorAndPatientLoginChange }
     * 
     */
    public DoctorAndPatientLoginChange createDoctorAndPatientLoginChange() {
        return new DoctorAndPatientLoginChange();
    }

    /**
     * Create an instance of {@link GetAppointmentRegistInfo }
     * 
     */
    public GetAppointmentRegistInfo createGetAppointmentRegistInfo() {
        return new GetAppointmentRegistInfo();
    }

    /**
     * Create an instance of {@link DoctorVisitStatusManagerResponse }
     * 
     */
    public DoctorVisitStatusManagerResponse createDoctorVisitStatusManagerResponse() {
        return new DoctorVisitStatusManagerResponse();
    }

    /**
     * Create an instance of {@link EditDoctorInfoByUserName }
     * 
     */
    public EditDoctorInfoByUserName createEditDoctorInfoByUserName() {
        return new EditDoctorInfoByUserName();
    }

    /**
     * Create an instance of {@link GetValue }
     * 
     */
    public GetValue createGetValue() {
        return new GetValue();
    }

    /**
     * Create an instance of {@link QueryDeptList }
     * 
     */
    public QueryDeptList createQueryDeptList() {
        return new QueryDeptList();
    }

    /**
     * Create an instance of {@link QueryDoctorInfoList }
     * 
     */
    public QueryDoctorInfoList createQueryDoctorInfoList() {
        return new QueryDoctorInfoList();
    }

    /**
     * Create an instance of {@link EditPatientReportByUserNameResponse }
     * 
     */
    public EditPatientReportByUserNameResponse createEditPatientReportByUserNameResponse() {
        return new EditPatientReportByUserNameResponse();
    }

    /**
     * Create an instance of {@link EditAdminLevelByUserName }
     * 
     */
    public EditAdminLevelByUserName createEditAdminLevelByUserName() {
        return new EditAdminLevelByUserName();
    }

    /**
     * Create an instance of {@link GetCardCountResponse }
     * 
     */
    public GetCardCountResponse createGetCardCountResponse() {
        return new GetCardCountResponse();
    }

    /**
     * Create an instance of {@link GetRegisterCanRefundPatients }
     * 
     */
    public GetRegisterCanRefundPatients createGetRegisterCanRefundPatients() {
        return new GetRegisterCanRefundPatients();
    }

    /**
     * Create an instance of {@link GetExamNoSeq }
     * 
     */
    public GetExamNoSeq createGetExamNoSeq() {
        return new GetExamNoSeq();
    }

    /**
     * Create an instance of {@link GetBeforeOneDrugNoPayResponse }
     * 
     */
    public GetBeforeOneDrugNoPayResponse createGetBeforeOneDrugNoPayResponse() {
        return new GetBeforeOneDrugNoPayResponse();
    }

    /**
     * Create an instance of {@link GetDoctorClinicTotalByYearResponse }
     * 
     */
    public GetDoctorClinicTotalByYearResponse createGetDoctorClinicTotalByYearResponse() {
        return new GetDoctorClinicTotalByYearResponse();
    }

    /**
     * Create an instance of {@link GetDoctorInfoResponse }
     * 
     */
    public GetDoctorInfoResponse createGetDoctorInfoResponse() {
        return new GetDoctorInfoResponse();
    }

    /**
     * Create an instance of {@link GetDeptClinicTotalByDayResponse }
     * 
     */
    public GetDeptClinicTotalByDayResponse createGetDeptClinicTotalByDayResponse() {
        return new GetDeptClinicTotalByDayResponse();
    }

    /**
     * Create an instance of {@link GetDoctorClinicInfoByYear }
     * 
     */
    public GetDoctorClinicInfoByYear createGetDoctorClinicInfoByYear() {
        return new GetDoctorClinicInfoByYear();
    }

    /**
     * Create an instance of {@link GetTheSameDayMedicalrecordAll }
     * 
     */
    public GetTheSameDayMedicalrecordAll createGetTheSameDayMedicalrecordAll() {
        return new GetTheSameDayMedicalrecordAll();
    }

    /**
     * Create an instance of {@link QueryDoctorInfoListResponse }
     * 
     */
    public QueryDoctorInfoListResponse createQueryDoctorInfoListResponse() {
        return new QueryDoctorInfoListResponse();
    }

    /**
     * Create an instance of {@link GetAssayResultResponse }
     * 
     */
    public GetAssayResultResponse createGetAssayResultResponse() {
        return new GetAssayResultResponse();
    }

    /**
     * Create an instance of {@link GetSubclassResponse }
     * 
     */
    public GetSubclassResponse createGetSubclassResponse() {
        return new GetSubclassResponse();
    }

    /**
     * Create an instance of {@link GetCheckResult }
     * 
     */
    public GetCheckResult createGetCheckResult() {
        return new GetCheckResult();
    }

    /**
     * Create an instance of {@link GetCardnoResponse }
     * 
     */
    public GetCardnoResponse createGetCardnoResponse() {
        return new GetCardnoResponse();
    }

    /**
     * Create an instance of {@link GetDeptClinicInfoByMonthWithSizeResponse }
     * 
     */
    public GetDeptClinicInfoByMonthWithSizeResponse createGetDeptClinicInfoByMonthWithSizeResponse() {
        return new GetDeptClinicInfoByMonthWithSizeResponse();
    }

    /**
     * Create an instance of {@link UpdateDoctorVisitStatusResponse }
     * 
     */
    public UpdateDoctorVisitStatusResponse createUpdateDoctorVisitStatusResponse() {
        return new UpdateDoctorVisitStatusResponse();
    }

    /**
     * Create an instance of {@link GetAllClinicInfoByYearResponse }
     * 
     */
    public GetAllClinicInfoByYearResponse createGetAllClinicInfoByYearResponse() {
        return new GetAllClinicInfoByYearResponse();
    }

    /**
     * Create an instance of {@link UpdateDoctorInfoResponse }
     * 
     */
    public UpdateDoctorInfoResponse createUpdateDoctorInfoResponse() {
        return new UpdateDoctorInfoResponse();
    }

    /**
     * Create an instance of {@link RegisterRefundWxResponse }
     * 
     */
    public RegisterRefundWxResponse createRegisterRefundWxResponse() {
        return new RegisterRefundWxResponse();
    }

    /**
     * Create an instance of {@link GetAllClinicInfoByMonthWithSize }
     * 
     */
    public GetAllClinicInfoByMonthWithSize createGetAllClinicInfoByMonthWithSize() {
        return new GetAllClinicInfoByMonthWithSize();
    }

    /**
     * Create an instance of {@link GetAppointmentRegistInfoResponse }
     * 
     */
    public GetAppointmentRegistInfoResponse createGetAppointmentRegistInfoResponse() {
        return new GetAppointmentRegistInfoResponse();
    }

    /**
     * Create an instance of {@link InsertMedicalrecord }
     * 
     */
    public InsertMedicalrecord createInsertMedicalrecord() {
        return new InsertMedicalrecord();
    }

    /**
     * Create an instance of {@link FindRegisterOrdersResponse }
     * 
     */
    public FindRegisterOrdersResponse createFindRegisterOrdersResponse() {
        return new FindRegisterOrdersResponse();
    }

    /**
     * Create an instance of {@link GetDeptNameResponse }
     * 
     */
    public GetDeptNameResponse createGetDeptNameResponse() {
        return new GetDeptNameResponse();
    }

    /**
     * Create an instance of {@link QueryDeptContentByDeptCodeResponse }
     * 
     */
    public QueryDeptContentByDeptCodeResponse createQueryDeptContentByDeptCodeResponse() {
        return new QueryDeptContentByDeptCodeResponse();
    }

    /**
     * Create an instance of {@link GetBeforeOneAssayNoPayResponse }
     * 
     */
    public GetBeforeOneAssayNoPayResponse createGetBeforeOneAssayNoPayResponse() {
        return new GetBeforeOneAssayNoPayResponse();
    }

    /**
     * Create an instance of {@link GetRecipeListResponse }
     * 
     */
    public GetRecipeListResponse createGetRecipeListResponse() {
        return new GetRecipeListResponse();
    }

    /**
     * Create an instance of {@link GetTheSameDayMedicalrecordAllResponse }
     * 
     */
    public GetTheSameDayMedicalrecordAllResponse createGetTheSameDayMedicalrecordAllResponse() {
        return new GetTheSameDayMedicalrecordAllResponse();
    }

    /**
     * Create an instance of {@link GetOutpMrDiagDescResponse }
     * 
     */
    public GetOutpMrDiagDescResponse createGetOutpMrDiagDescResponse() {
        return new GetOutpMrDiagDescResponse();
    }

    /**
     * Create an instance of {@link GetDoctorClinicInfoByYearResponse }
     * 
     */
    public GetDoctorClinicInfoByYearResponse createGetDoctorClinicInfoByYearResponse() {
        return new GetDoctorClinicInfoByYearResponse();
    }

    /**
     * Create an instance of {@link EditPatientReportByUserName }
     * 
     */
    public EditPatientReportByUserName createEditPatientReportByUserName() {
        return new EditPatientReportByUserName();
    }

    /**
     * Create an instance of {@link FindfailureDoctor }
     * 
     */
    public FindfailureDoctor createFindfailureDoctor() {
        return new FindfailureDoctor();
    }

    /**
     * Create an instance of {@link EditPatientReportAll }
     * 
     */
    public EditPatientReportAll createEditPatientReportAll() {
        return new EditPatientReportAll();
    }

    /**
     * Create an instance of {@link GetDeptClinicTotalByDay }
     * 
     */
    public GetDeptClinicTotalByDay createGetDeptClinicTotalByDay() {
        return new GetDeptClinicTotalByDay();
    }

    /**
     * Create an instance of {@link GetDoctorClinicTotalByMonth }
     * 
     */
    public GetDoctorClinicTotalByMonth createGetDoctorClinicTotalByMonth() {
        return new GetDoctorClinicTotalByMonth();
    }

    /**
     * Create an instance of {@link DoctorAndPatientLoginChangeResponse }
     * 
     */
    public DoctorAndPatientLoginChangeResponse createDoctorAndPatientLoginChangeResponse() {
        return new DoctorAndPatientLoginChangeResponse();
    }

    /**
     * Create an instance of {@link FailureDoctor }
     * 
     */
    public FailureDoctor createFailureDoctor() {
        return new FailureDoctor();
    }

    /**
     * Create an instance of {@link GetDeptClinicInfoByDay }
     * 
     */
    public GetDeptClinicInfoByDay createGetDeptClinicInfoByDay() {
        return new GetDeptClinicInfoByDay();
    }

    /**
     * Create an instance of {@link QueryDeptContentByDeptCode }
     * 
     */
    public QueryDeptContentByDeptCode createQueryDeptContentByDeptCode() {
        return new QueryDeptContentByDeptCode();
    }

    /**
     * Create an instance of {@link QueryDeptInfoList }
     * 
     */
    public QueryDeptInfoList createQueryDeptInfoList() {
        return new QueryDeptInfoList();
    }

    /**
     * Create an instance of {@link FindRegisterOrders }
     * 
     */
    public FindRegisterOrders createFindRegisterOrders() {
        return new FindRegisterOrders();
    }

    /**
     * Create an instance of {@link OpenPrescriptionResponse }
     * 
     */
    public OpenPrescriptionResponse createOpenPrescriptionResponse() {
        return new OpenPrescriptionResponse();
    }

    /**
     * Create an instance of {@link GetDeptDict }
     * 
     */
    public GetDeptDict createGetDeptDict() {
        return new GetDeptDict();
    }

    /**
     * Create an instance of {@link RegularRegisterRefund }
     * 
     */
    public RegularRegisterRefund createRegularRegisterRefund() {
        return new RegularRegisterRefund();
    }

    /**
     * Create an instance of {@link GetAdminLevel }
     * 
     */
    public GetAdminLevel createGetAdminLevel() {
        return new GetAdminLevel();
    }

    /**
     * Create an instance of {@link GetBeforeOneDrugNoPay }
     * 
     */
    public GetBeforeOneDrugNoPay createGetBeforeOneDrugNoPay() {
        return new GetBeforeOneDrugNoPay();
    }

    /**
     * Create an instance of {@link GetAllClinicInfoByDayResponse }
     * 
     */
    public GetAllClinicInfoByDayResponse createGetAllClinicInfoByDayResponse() {
        return new GetAllClinicInfoByDayResponse();
    }

    /**
     * Create an instance of {@link GetAdminList }
     * 
     */
    public GetAdminList createGetAdminList() {
        return new GetAdminList();
    }

    /**
     * Create an instance of {@link AddCardno }
     * 
     */
    public AddCardno createAddCardno() {
        return new AddCardno();
    }

    /**
     * Create an instance of {@link GetDoctorClinicInfoByDay }
     * 
     */
    public GetDoctorClinicInfoByDay createGetDoctorClinicInfoByDay() {
        return new GetDoctorClinicInfoByDay();
    }

    /**
     * Create an instance of {@link GetBeforeOneAssayNoPay }
     * 
     */
    public GetBeforeOneAssayNoPay createGetBeforeOneAssayNoPay() {
        return new GetBeforeOneAssayNoPay();
    }

    /**
     * Create an instance of {@link GetDeptClinicTotalByYear }
     * 
     */
    public GetDeptClinicTotalByYear createGetDeptClinicTotalByYear() {
        return new GetDeptClinicTotalByYear();
    }

    /**
     * Create an instance of {@link GetDrugUsage }
     * 
     */
    public GetDrugUsage createGetDrugUsage() {
        return new GetDrugUsage();
    }

    /**
     * Create an instance of {@link GetDrug }
     * 
     */
    public GetDrug createGetDrug() {
        return new GetDrug();
    }

    /**
     * Create an instance of {@link GetAssayResultTakeNotes }
     * 
     */
    public GetAssayResultTakeNotes createGetAssayResultTakeNotes() {
        return new GetAssayResultTakeNotes();
    }

    /**
     * Create an instance of {@link GetMedicalLastResponse }
     * 
     */
    public GetMedicalLastResponse createGetMedicalLastResponse() {
        return new GetMedicalLastResponse();
    }

    /**
     * Create an instance of {@link GetDeptClinicInfoByDayResponse }
     * 
     */
    public GetDeptClinicInfoByDayResponse createGetDeptClinicInfoByDayResponse() {
        return new GetDeptClinicInfoByDayResponse();
    }

    /**
     * Create an instance of {@link BeInHospital }
     * 
     */
    public BeInHospital createBeInHospital() {
        return new BeInHospital();
    }

    /**
     * Create an instance of {@link DoctorVisitStatusManager }
     * 
     */
    public DoctorVisitStatusManager createDoctorVisitStatusManager() {
        return new DoctorVisitStatusManager();
    }

    /**
     * Create an instance of {@link GetBeforeOneCheckNoPayResponse }
     * 
     */
    public GetBeforeOneCheckNoPayResponse createGetBeforeOneCheckNoPayResponse() {
        return new GetBeforeOneCheckNoPayResponse();
    }

    /**
     * Create an instance of {@link GetAssayClassResponse }
     * 
     */
    public GetAssayClassResponse createGetAssayClassResponse() {
        return new GetAssayClassResponse();
    }

    /**
     * Create an instance of {@link GetMedicalLast }
     * 
     */
    public GetMedicalLast createGetMedicalLast() {
        return new GetMedicalLast();
    }

    /**
     * Create an instance of {@link GetAssayResultTakeNotesResponse }
     * 
     */
    public GetAssayResultTakeNotesResponse createGetAssayResultTakeNotesResponse() {
        return new GetAssayResultTakeNotesResponse();
    }

    /**
     * Create an instance of {@link GetEntrynameResponse }
     * 
     */
    public GetEntrynameResponse createGetEntrynameResponse() {
        return new GetEntrynameResponse();
    }

    /**
     * Create an instance of {@link UpdateDoctorVisitStatus }
     * 
     */
    public UpdateDoctorVisitStatus createUpdateDoctorVisitStatus() {
        return new UpdateDoctorVisitStatus();
    }

    /**
     * Create an instance of {@link QueryDeptInfoListResponse }
     * 
     */
    public QueryDeptInfoListResponse createQueryDeptInfoListResponse() {
        return new QueryDeptInfoListResponse();
    }

    /**
     * Create an instance of {@link FindDoctorResponse }
     * 
     */
    public FindDoctorResponse createFindDoctorResponse() {
        return new FindDoctorResponse();
    }

    /**
     * Create an instance of {@link GetRegisterCanRefundPatientsResponse }
     * 
     */
    public GetRegisterCanRefundPatientsResponse createGetRegisterCanRefundPatientsResponse() {
        return new GetRegisterCanRefundPatientsResponse();
    }

    /**
     * Create an instance of {@link GetAllClinicInfoByYear }
     * 
     */
    public GetAllClinicInfoByYear createGetAllClinicInfoByYear() {
        return new GetAllClinicInfoByYear();
    }

    /**
     * Create an instance of {@link GetDoctorClinicTotalByDay }
     * 
     */
    public GetDoctorClinicTotalByDay createGetDoctorClinicTotalByDay() {
        return new GetDoctorClinicTotalByDay();
    }

    /**
     * Create an instance of {@link GetDrugUsageResponse }
     * 
     */
    public GetDrugUsageResponse createGetDrugUsageResponse() {
        return new GetDrugUsageResponse();
    }

    /**
     * Create an instance of {@link GetRegisterNumberAndLastTimeAndNumber }
     * 
     */
    public GetRegisterNumberAndLastTimeAndNumber createGetRegisterNumberAndLastTimeAndNumber() {
        return new GetRegisterNumberAndLastTimeAndNumber();
    }

    /**
     * Create an instance of {@link EditAdminLevelByUserNameResponse }
     * 
     */
    public EditAdminLevelByUserNameResponse createEditAdminLevelByUserNameResponse() {
        return new EditAdminLevelByUserNameResponse();
    }

    /**
     * Create an instance of {@link SeekedDoctor }
     * 
     */
    public SeekedDoctor createSeekedDoctor() {
        return new SeekedDoctor();
    }

    /**
     * Create an instance of {@link GetEntryname }
     * 
     */
    public GetEntryname createGetEntryname() {
        return new GetEntryname();
    }

    /**
     * Create an instance of {@link GetClinicNoResponse }
     * 
     */
    public GetClinicNoResponse createGetClinicNoResponse() {
        return new GetClinicNoResponse();
    }

    /**
     * Create an instance of {@link GetAllClinicTotalByMonthResponse }
     * 
     */
    public GetAllClinicTotalByMonthResponse createGetAllClinicTotalByMonthResponse() {
        return new GetAllClinicTotalByMonthResponse();
    }

    /**
     * Create an instance of {@link CacleRegsiterResponse }
     * 
     */
    public CacleRegsiterResponse createCacleRegsiterResponse() {
        return new CacleRegsiterResponse();
    }

    /**
     * Create an instance of {@link FindLeftResponse }
     * 
     */
    public FindLeftResponse createFindLeftResponse() {
        return new FindLeftResponse();
    }

    /**
     * Create an instance of {@link GetExamNoSeqResponse }
     * 
     */
    public GetExamNoSeqResponse createGetExamNoSeqResponse() {
        return new GetExamNoSeqResponse();
    }

    /**
     * Create an instance of {@link GetVisitNo }
     * 
     */
    public GetVisitNo createGetVisitNo() {
        return new GetVisitNo();
    }

    /**
     * Create an instance of {@link EditDoctorInfoByUserNameResponse }
     * 
     */
    public EditDoctorInfoByUserNameResponse createEditDoctorInfoByUserNameResponse() {
        return new EditDoctorInfoByUserNameResponse();
    }

    /**
     * Create an instance of {@link GetDeptName }
     * 
     */
    public GetDeptName createGetDeptName() {
        return new GetDeptName();
    }

    /**
     * Create an instance of {@link GetValueResponse }
     * 
     */
    public GetValueResponse createGetValueResponse() {
        return new GetValueResponse();
    }

    /**
     * Create an instance of {@link EditPatientReportAllResponse }
     * 
     */
    public EditPatientReportAllResponse createEditPatientReportAllResponse() {
        return new EditPatientReportAllResponse();
    }

    /**
     * Create an instance of {@link GetCheckClassResponse }
     * 
     */
    public GetCheckClassResponse createGetCheckClassResponse() {
        return new GetCheckClassResponse();
    }

    /**
     * Create an instance of {@link DelCheckItem }
     * 
     */
    public DelCheckItem createDelCheckItem() {
        return new DelCheckItem();
    }

    /**
     * Create an instance of {@link GetAllClinicTotalByDayResponse }
     * 
     */
    public GetAllClinicTotalByDayResponse createGetAllClinicTotalByDayResponse() {
        return new GetAllClinicTotalByDayResponse();
    }

    /**
     * Create an instance of {@link GetDeptClinicInfoByMonth }
     * 
     */
    public GetDeptClinicInfoByMonth createGetDeptClinicInfoByMonth() {
        return new GetDeptClinicInfoByMonth();
    }

    /**
     * Create an instance of {@link OpenPrescription }
     * 
     */
    public OpenPrescription createOpenPrescription() {
        return new OpenPrescription();
    }

    /**
     * Create an instance of {@link GetPatientRegisHistoryInfoResponse }
     * 
     */
    public GetPatientRegisHistoryInfoResponse createGetPatientRegisHistoryInfoResponse() {
        return new GetPatientRegisHistoryInfoResponse();
    }

    /**
     * Create an instance of {@link GetDeptClinicInfoByMonthResponse }
     * 
     */
    public GetDeptClinicInfoByMonthResponse createGetDeptClinicInfoByMonthResponse() {
        return new GetDeptClinicInfoByMonthResponse();
    }

    /**
     * Create an instance of {@link QueryDoctorInfoByCardNo }
     * 
     */
    public QueryDoctorInfoByCardNo createQueryDoctorInfoByCardNo() {
        return new QueryDoctorInfoByCardNo();
    }

    /**
     * Create an instance of {@link AddCardnoResponse }
     * 
     */
    public AddCardnoResponse createAddCardnoResponse() {
        return new AddCardnoResponse();
    }

    /**
     * Create an instance of {@link GetDoctorClinicTotalByYear }
     * 
     */
    public GetDoctorClinicTotalByYear createGetDoctorClinicTotalByYear() {
        return new GetDoctorClinicTotalByYear();
    }

    /**
     * Create an instance of {@link GetAssayResult }
     * 
     */
    public GetAssayResult createGetAssayResult() {
        return new GetAssayResult();
    }

    /**
     * Create an instance of {@link GetPatientReportByDeptCode }
     * 
     */
    public GetPatientReportByDeptCode createGetPatientReportByDeptCode() {
        return new GetPatientReportByDeptCode();
    }

    /**
     * Create an instance of {@link GetOutpOrder }
     * 
     */
    public GetOutpOrder createGetOutpOrder() {
        return new GetOutpOrder();
    }

    /**
     * Create an instance of {@link GetDoctorClinicInfoByMonthWithSizeResponse }
     * 
     */
    public GetDoctorClinicInfoByMonthWithSizeResponse createGetDoctorClinicInfoByMonthWithSizeResponse() {
        return new GetDoctorClinicInfoByMonthWithSizeResponse();
    }

    /**
     * Create an instance of {@link GetDeptClinicTotalByMonthResponse }
     * 
     */
    public GetDeptClinicTotalByMonthResponse createGetDeptClinicTotalByMonthResponse() {
        return new GetDeptClinicTotalByMonthResponse();
    }

    /**
     * Create an instance of {@link GetAdminListByAdminLevelResponse }
     * 
     */
    public GetAdminListByAdminLevelResponse createGetAdminListByAdminLevelResponse() {
        return new GetAdminListByAdminLevelResponse();
    }

    /**
     * Create an instance of {@link GetDeptNameByDeptcode }
     * 
     */
    public GetDeptNameByDeptcode createGetDeptNameByDeptcode() {
        return new GetDeptNameByDeptcode();
    }

    /**
     * Create an instance of {@link GetVisitNoResponse }
     * 
     */
    public GetVisitNoResponse createGetVisitNoResponse() {
        return new GetVisitNoResponse();
    }

    /**
     * Create an instance of {@link GetOutpOrderResponse }
     * 
     */
    public GetOutpOrderResponse createGetOutpOrderResponse() {
        return new GetOutpOrderResponse();
    }

    /**
     * Create an instance of {@link GetDeptClinicInfoByMonthWithSize }
     * 
     */
    public GetDeptClinicInfoByMonthWithSize createGetDeptClinicInfoByMonthWithSize() {
        return new GetDeptClinicInfoByMonthWithSize();
    }

    /**
     * Create an instance of {@link EditPatientReportByDeptCodeResponse }
     * 
     */
    public EditPatientReportByDeptCodeResponse createEditPatientReportByDeptCodeResponse() {
        return new EditPatientReportByDeptCodeResponse();
    }

    /**
     * Create an instance of {@link InsertMedicalrecordResponse }
     * 
     */
    public InsertMedicalrecordResponse createInsertMedicalrecordResponse() {
        return new InsertMedicalrecordResponse();
    }

    /**
     * Create an instance of {@link GetDrugDosageResponse }
     * 
     */
    public GetDrugDosageResponse createGetDrugDosageResponse() {
        return new GetDrugDosageResponse();
    }

    /**
     * Create an instance of {@link GetItemsSum }
     * 
     */
    public GetItemsSum createGetItemsSum() {
        return new GetItemsSum();
    }

    /**
     * Create an instance of {@link RegisterResponse }
     * 
     */
    public RegisterResponse createRegisterResponse() {
        return new RegisterResponse();
    }

    /**
     * Create an instance of {@link GetAdminLevelResponse }
     * 
     */
    public GetAdminLevelResponse createGetAdminLevelResponse() {
        return new GetAdminLevelResponse();
    }

    /**
     * Create an instance of {@link RegularRegisterRefundResponse }
     * 
     */
    public RegularRegisterRefundResponse createRegularRegisterRefundResponse() {
        return new RegularRegisterRefundResponse();
    }

    /**
     * Create an instance of {@link DelPrescribing }
     * 
     */
    public DelPrescribing createDelPrescribing() {
        return new DelPrescribing();
    }

    /**
     * Create an instance of {@link AdminLevel }
     * 
     */
    public AdminLevel createAdminLevel() {
        return new AdminLevel();
    }

    /**
     * Create an instance of {@link DeptInfoPO }
     * 
     */
    public DeptInfoPO createDeptInfoPO() {
        return new DeptInfoPO();
    }

    /**
     * Create an instance of {@link Medicalrecord }
     * 
     */
    public Medicalrecord createMedicalrecord() {
        return new Medicalrecord();
    }

    /**
     * Create an instance of {@link DoctorInfoPO }
     * 
     */
    public DoctorInfoPO createDoctorInfoPO() {
        return new DoctorInfoPO();
    }

    /**
     * Create an instance of {@link PatientRegister }
     * 
     */
    public PatientRegister createPatientRegister() {
        return new PatientRegister();
    }

    /**
     * Create an instance of {@link Evaluate }
     * 
     */
    public Evaluate createEvaluate() {
        return new Evaluate();
    }

    /**
     * Create an instance of {@link ClinicTotal }
     * 
     */
    public ClinicTotal createClinicTotal() {
        return new ClinicTotal();
    }

    /**
     * Create an instance of {@link PatientCheck }
     * 
     */
    public PatientCheck createPatientCheck() {
        return new PatientCheck();
    }

    /**
     * Create an instance of {@link DeptPO }
     * 
     */
    public DeptPO createDeptPO() {
        return new DeptPO();
    }

    /**
     * Create an instance of {@link Prescription }
     * 
     */
    public Prescription createPrescription() {
        return new Prescription();
    }

    /**
     * Create an instance of {@link Patients }
     * 
     */
    public Patients createPatients() {
        return new Patients();
    }

    /**
     * Create an instance of {@link ClinicInfo }
     * 
     */
    public ClinicInfo createClinicInfo() {
        return new ClinicInfo();
    }

    /**
     * Create an instance of {@link Assay }
     * 
     */
    public Assay createAssay() {
        return new Assay();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAssaySecondClassResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.his.com/", name = "getAssaySecondClassResponse")
    public JAXBElement<GetAssaySecondClassResponse> createGetAssaySecondClassResponse(GetAssaySecondClassResponse value) {
        return new JAXBElement<GetAssaySecondClassResponse>(_GetAssaySecondClassResponse_QNAME, GetAssaySecondClassResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDeptClinicTotalByMonth }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.his.com/", name = "getDeptClinicTotalByMonth")
    public JAXBElement<GetDeptClinicTotalByMonth> createGetDeptClinicTotalByMonth(GetDeptClinicTotalByMonth value) {
        return new JAXBElement<GetDeptClinicTotalByMonth>(_GetDeptClinicTotalByMonth_QNAME, GetDeptClinicTotalByMonth.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetClinicNo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.his.com/", name = "getClinicNo")
    public JAXBElement<GetClinicNo> createGetClinicNo(GetClinicNo value) {
        return new JAXBElement<GetClinicNo>(_GetClinicNo_QNAME, GetClinicNo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllClinicInfoByMonthResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.his.com/", name = "getAllClinicInfoByMonthResponse")
    public JAXBElement<GetAllClinicInfoByMonthResponse> createGetAllClinicInfoByMonthResponse(GetAllClinicInfoByMonthResponse value) {
        return new JAXBElement<GetAllClinicInfoByMonthResponse>(_GetAllClinicInfoByMonthResponse_QNAME, GetAllClinicInfoByMonthResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryDoctorInfoByCardNoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.his.com/", name = "queryDoctorInfoByCardNoResponse")
    public JAXBElement<QueryDoctorInfoByCardNoResponse> createQueryDoctorInfoByCardNoResponse(QueryDoctorInfoByCardNoResponse value) {
        return new JAXBElement<QueryDoctorInfoByCardNoResponse>(_QueryDoctorInfoByCardNoResponse_QNAME, QueryDoctorInfoByCardNoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetWesternResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.his.com/", name = "getWesternResponse")
    public JAXBElement<GetWesternResponse> createGetWesternResponse(GetWesternResponse value) {
        return new JAXBElement<GetWesternResponse>(_GetWesternResponse_QNAME, GetWesternResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCardno }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.his.com/", name = "getCardno")
    public JAXBElement<GetCardno> createGetCardno(GetCardno value) {
        return new JAXBElement<GetCardno>(_GetCardno_QNAME, GetCardno.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCheckResultResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.his.com/", name = "getCheckResultResponse")
    public JAXBElement<GetCheckResultResponse> createGetCheckResultResponse(GetCheckResultResponse value) {
        return new JAXBElement<GetCheckResultResponse>(_GetCheckResultResponse_QNAME, GetCheckResultResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCardCount }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.his.com/", name = "getCardCount")
    public JAXBElement<GetCardCount> createGetCardCount(GetCardCount value) {
        return new JAXBElement<GetCardCount>(_GetCardCount_QNAME, GetCardCount.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDoctorVisitStatus }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.his.com/", name = "getDoctorVisitStatus")
    public JAXBElement<GetDoctorVisitStatus> createGetDoctorVisitStatus(GetDoctorVisitStatus value) {
        return new JAXBElement<GetDoctorVisitStatus>(_GetDoctorVisitStatus_QNAME, GetDoctorVisitStatus.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindDoctor }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.his.com/", name = "findDoctor")
    public JAXBElement<FindDoctor> createFindDoctor(FindDoctor value) {
        return new JAXBElement<FindDoctor>(_FindDoctor_QNAME, FindDoctor.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAdminListResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.his.com/", name = "getAdminListResponse")
    public JAXBElement<GetAdminListResponse> createGetAdminListResponse(GetAdminListResponse value) {
        return new JAXBElement<GetAdminListResponse>(_GetAdminListResponse_QNAME, GetAdminListResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FailureDoctorResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.his.com/", name = "failureDoctorResponse")
    public JAXBElement<FailureDoctorResponse> createFailureDoctorResponse(FailureDoctorResponse value) {
        return new JAXBElement<FailureDoctorResponse>(_FailureDoctorResponse_QNAME, FailureDoctorResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDoctorClinicInfoByMonth }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.his.com/", name = "getDoctorClinicInfoByMonth")
    public JAXBElement<GetDoctorClinicInfoByMonth> createGetDoctorClinicInfoByMonth(GetDoctorClinicInfoByMonth value) {
        return new JAXBElement<GetDoctorClinicInfoByMonth>(_GetDoctorClinicInfoByMonth_QNAME, GetDoctorClinicInfoByMonth.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Register }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.his.com/", name = "register")
    public JAXBElement<Register> createRegister(Register value) {
        return new JAXBElement<Register>(_Register_QNAME, Register.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCheckOrChemical }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.his.com/", name = "getCheckOrChemical")
    public JAXBElement<GetCheckOrChemical> createGetCheckOrChemical(GetCheckOrChemical value) {
        return new JAXBElement<GetCheckOrChemical>(_GetCheckOrChemical_QNAME, GetCheckOrChemical.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetChineseMedicineResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.his.com/", name = "getChineseMedicineResponse")
    public JAXBElement<GetChineseMedicineResponse> createGetChineseMedicineResponse(GetChineseMedicineResponse value) {
        return new JAXBElement<GetChineseMedicineResponse>(_GetChineseMedicineResponse_QNAME, GetChineseMedicineResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddPrescription }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.his.com/", name = "addPrescription")
    public JAXBElement<AddPrescription> createAddPrescription(AddPrescription value) {
        return new JAXBElement<AddPrescription>(_AddPrescription_QNAME, AddPrescription.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllClinicTotalByYear }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.his.com/", name = "getAllClinicTotalByYear")
    public JAXBElement<GetAllClinicTotalByYear> createGetAllClinicTotalByYear(GetAllClinicTotalByYear value) {
        return new JAXBElement<GetAllClinicTotalByYear>(_GetAllClinicTotalByYear_QNAME, GetAllClinicTotalByYear.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDeptClinicTotalByYearResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.his.com/", name = "getDeptClinicTotalByYearResponse")
    public JAXBElement<GetDeptClinicTotalByYearResponse> createGetDeptClinicTotalByYearResponse(GetDeptClinicTotalByYearResponse value) {
        return new JAXBElement<GetDeptClinicTotalByYearResponse>(_GetDeptClinicTotalByYearResponse_QNAME, GetDeptClinicTotalByYearResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetRecipeList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.his.com/", name = "getRecipeList")
    public JAXBElement<GetRecipeList> createGetRecipeList(GetRecipeList value) {
        return new JAXBElement<GetRecipeList>(_GetRecipeList_QNAME, GetRecipeList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetTreatChargeInfoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.his.com/", name = "getTreatChargeInfoResponse")
    public JAXBElement<GetTreatChargeInfoResponse> createGetTreatChargeInfoResponse(GetTreatChargeInfoResponse value) {
        return new JAXBElement<GetTreatChargeInfoResponse>(_GetTreatChargeInfoResponse_QNAME, GetTreatChargeInfoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryDeptListResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.his.com/", name = "queryDeptListResponse")
    public JAXBElement<QueryDeptListResponse> createQueryDeptListResponse(QueryDeptListResponse value) {
        return new JAXBElement<QueryDeptListResponse>(_QueryDeptListResponse_QNAME, QueryDeptListResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDoctorLoginResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.his.com/", name = "getDoctorLoginResponse")
    public JAXBElement<GetDoctorLoginResponse> createGetDoctorLoginResponse(GetDoctorLoginResponse value) {
        return new JAXBElement<GetDoctorLoginResponse>(_GetDoctorLoginResponse_QNAME, GetDoctorLoginResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateDoctorInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.his.com/", name = "updateDoctorInfo")
    public JAXBElement<UpdateDoctorInfo> createUpdateDoctorInfo(UpdateDoctorInfo value) {
        return new JAXBElement<UpdateDoctorInfo>(_UpdateDoctorInfo_QNAME, UpdateDoctorInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDoctorClinicTotalByMonthResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.his.com/", name = "getDoctorClinicTotalByMonthResponse")
    public JAXBElement<GetDoctorClinicTotalByMonthResponse> createGetDoctorClinicTotalByMonthResponse(GetDoctorClinicTotalByMonthResponse value) {
        return new JAXBElement<GetDoctorClinicTotalByMonthResponse>(_GetDoctorClinicTotalByMonthResponse_QNAME, GetDoctorClinicTotalByMonthResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllClinicTotalByDay }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.his.com/", name = "getAllClinicTotalByDay")
    public JAXBElement<GetAllClinicTotalByDay> createGetAllClinicTotalByDay(GetAllClinicTotalByDay value) {
        return new JAXBElement<GetAllClinicTotalByDay>(_GetAllClinicTotalByDay_QNAME, GetAllClinicTotalByDay.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMakeUpPrescribeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.his.com/", name = "getMakeUpPrescribeResponse")
    public JAXBElement<GetMakeUpPrescribeResponse> createGetMakeUpPrescribeResponse(GetMakeUpPrescribeResponse value) {
        return new JAXBElement<GetMakeUpPrescribeResponse>(_GetMakeUpPrescribeResponse_QNAME, GetMakeUpPrescribeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DelCheckItemResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.his.com/", name = "delCheckItemResponse")
    public JAXBElement<DelCheckItemResponse> createDelCheckItemResponse(DelCheckItemResponse value) {
        return new JAXBElement<DelCheckItemResponse>(_DelCheckItemResponse_QNAME, DelCheckItemResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllClinicTotalByMonth }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.his.com/", name = "getAllClinicTotalByMonth")
    public JAXBElement<GetAllClinicTotalByMonth> createGetAllClinicTotalByMonth(GetAllClinicTotalByMonth value) {
        return new JAXBElement<GetAllClinicTotalByMonth>(_GetAllClinicTotalByMonth_QNAME, GetAllClinicTotalByMonth.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCheckOrChemicalResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.his.com/", name = "getCheckOrChemicalResponse")
    public JAXBElement<GetCheckOrChemicalResponse> createGetCheckOrChemicalResponse(GetCheckOrChemicalResponse value) {
        return new JAXBElement<GetCheckOrChemicalResponse>(_GetCheckOrChemicalResponse_QNAME, GetCheckOrChemicalResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDoctorLogin }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.his.com/", name = "getDoctorLogin")
    public JAXBElement<GetDoctorLogin> createGetDoctorLogin(GetDoctorLogin value) {
        return new JAXBElement<GetDoctorLogin>(_GetDoctorLogin_QNAME, GetDoctorLogin.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMakeUpPrescribe }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.his.com/", name = "getMakeUpPrescribe")
    public JAXBElement<GetMakeUpPrescribe> createGetMakeUpPrescribe(GetMakeUpPrescribe value) {
        return new JAXBElement<GetMakeUpPrescribe>(_GetMakeUpPrescribe_QNAME, GetMakeUpPrescribe.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DelPrescribingResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.his.com/", name = "delPrescribingResponse")
    public JAXBElement<DelPrescribingResponse> createDelPrescribingResponse(DelPrescribingResponse value) {
        return new JAXBElement<DelPrescribingResponse>(_DelPrescribingResponse_QNAME, DelPrescribingResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BeInHospitalResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.his.com/", name = "beInHospitalResponse")
    public JAXBElement<BeInHospitalResponse> createBeInHospitalResponse(BeInHospitalResponse value) {
        return new JAXBElement<BeInHospitalResponse>(_BeInHospitalResponse_QNAME, BeInHospitalResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllClinicInfoByMonthWithSizeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.his.com/", name = "getAllClinicInfoByMonthWithSizeResponse")
    public JAXBElement<GetAllClinicInfoByMonthWithSizeResponse> createGetAllClinicInfoByMonthWithSizeResponse(GetAllClinicInfoByMonthWithSizeResponse value) {
        return new JAXBElement<GetAllClinicInfoByMonthWithSizeResponse>(_GetAllClinicInfoByMonthWithSizeResponse_QNAME, GetAllClinicInfoByMonthWithSizeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddPrescriptionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.his.com/", name = "addPrescriptionResponse")
    public JAXBElement<AddPrescriptionResponse> createAddPrescriptionResponse(AddPrescriptionResponse value) {
        return new JAXBElement<AddPrescriptionResponse>(_AddPrescriptionResponse_QNAME, AddPrescriptionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetTheSameDayOutpMr }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.his.com/", name = "getTheSameDayOutpMr")
    public JAXBElement<GetTheSameDayOutpMr> createGetTheSameDayOutpMr(GetTheSameDayOutpMr value) {
        return new JAXBElement<GetTheSameDayOutpMr>(_GetTheSameDayOutpMr_QNAME, GetTheSameDayOutpMr.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPatientReportByDeptCodeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.his.com/", name = "getPatientReportByDeptCodeResponse")
    public JAXBElement<GetPatientReportByDeptCodeResponse> createGetPatientReportByDeptCodeResponse(GetPatientReportByDeptCodeResponse value) {
        return new JAXBElement<GetPatientReportByDeptCodeResponse>(_GetPatientReportByDeptCodeResponse_QNAME, GetPatientReportByDeptCodeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetTestNo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.his.com/", name = "getTestNo")
    public JAXBElement<GetTestNo> createGetTestNo(GetTestNo value) {
        return new JAXBElement<GetTestNo>(_GetTestNo_QNAME, GetTestNo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAssaySecondClass }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.his.com/", name = "getAssaySecondClass")
    public JAXBElement<GetAssaySecondClass> createGetAssaySecondClass(GetAssaySecondClass value) {
        return new JAXBElement<GetAssaySecondClass>(_GetAssaySecondClass_QNAME, GetAssaySecondClass.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDrugDosage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.his.com/", name = "getDrugDosage")
    public JAXBElement<GetDrugDosage> createGetDrugDosage(GetDrugDosage value) {
        return new JAXBElement<GetDrugDosage>(_GetDrugDosage_QNAME, GetDrugDosage.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateEvaluateRegisterResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.his.com/", name = "updateEvaluateRegisterResponse")
    public JAXBElement<UpdateEvaluateRegisterResponse> createUpdateEvaluateRegisterResponse(UpdateEvaluateRegisterResponse value) {
        return new JAXBElement<UpdateEvaluateRegisterResponse>(_UpdateEvaluateRegisterResponse_QNAME, UpdateEvaluateRegisterResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryDoctorInfoByDeptCodeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.his.com/", name = "queryDoctorInfoByDeptCodeResponse")
    public JAXBElement<QueryDoctorInfoByDeptCodeResponse> createQueryDoctorInfoByDeptCodeResponse(QueryDoctorInfoByDeptCodeResponse value) {
        return new JAXBElement<QueryDoctorInfoByDeptCodeResponse>(_QueryDoctorInfoByDeptCodeResponse_QNAME, QueryDoctorInfoByDeptCodeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegisterRefundWx }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.his.com/", name = "registerRefundWx")
    public JAXBElement<RegisterRefundWx> createRegisterRefundWx(RegisterRefundWx value) {
        return new JAXBElement<RegisterRefundWx>(_RegisterRefundWx_QNAME, RegisterRefundWx.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDeptNameByDeptcodeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.his.com/", name = "getDeptNameByDeptcodeResponse")
    public JAXBElement<GetDeptNameByDeptcodeResponse> createGetDeptNameByDeptcodeResponse(GetDeptNameByDeptcodeResponse value) {
        return new JAXBElement<GetDeptNameByDeptcodeResponse>(_GetDeptNameByDeptcodeResponse_QNAME, GetDeptNameByDeptcodeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDeptClinicInfoByYear }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.his.com/", name = "getDeptClinicInfoByYear")
    public JAXBElement<GetDeptClinicInfoByYear> createGetDeptClinicInfoByYear(GetDeptClinicInfoByYear value) {
        return new JAXBElement<GetDeptClinicInfoByYear>(_GetDeptClinicInfoByYear_QNAME, GetDeptClinicInfoByYear.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetTheSameDayOutpMrResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.his.com/", name = "getTheSameDayOutpMrResponse")
    public JAXBElement<GetTheSameDayOutpMrResponse> createGetTheSameDayOutpMrResponse(GetTheSameDayOutpMrResponse value) {
        return new JAXBElement<GetTheSameDayOutpMrResponse>(_GetTheSameDayOutpMrResponse_QNAME, GetTheSameDayOutpMrResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDoctorSourceInfoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.his.com/", name = "getDoctorSourceInfoResponse")
    public JAXBElement<GetDoctorSourceInfoResponse> createGetDoctorSourceInfoResponse(GetDoctorSourceInfoResponse value) {
        return new JAXBElement<GetDoctorSourceInfoResponse>(_GetDoctorSourceInfoResponse_QNAME, GetDoctorSourceInfoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryDoctorInfoByDeptCode }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.his.com/", name = "queryDoctorInfoByDeptCode")
    public JAXBElement<QueryDoctorInfoByDeptCode> createQueryDoctorInfoByDeptCode(QueryDoctorInfoByDeptCode value) {
        return new JAXBElement<QueryDoctorInfoByDeptCode>(_QueryDoctorInfoByDeptCode_QNAME, QueryDoctorInfoByDeptCode.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateEvaluateRegister }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.his.com/", name = "updateEvaluateRegister")
    public JAXBElement<UpdateEvaluateRegister> createUpdateEvaluateRegister(UpdateEvaluateRegister value) {
        return new JAXBElement<UpdateEvaluateRegister>(_UpdateEvaluateRegister_QNAME, UpdateEvaluateRegister.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDoctorClinicInfoByMonthResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.his.com/", name = "getDoctorClinicInfoByMonthResponse")
    public JAXBElement<GetDoctorClinicInfoByMonthResponse> createGetDoctorClinicInfoByMonthResponse(GetDoctorClinicInfoByMonthResponse value) {
        return new JAXBElement<GetDoctorClinicInfoByMonthResponse>(_GetDoctorClinicInfoByMonthResponse_QNAME, GetDoctorClinicInfoByMonthResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetItemsSumResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.his.com/", name = "getItemsSumResponse")
    public JAXBElement<GetItemsSumResponse> createGetItemsSumResponse(GetItemsSumResponse value) {
        return new JAXBElement<GetItemsSumResponse>(_GetItemsSumResponse_QNAME, GetItemsSumResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetChineseMedicine }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.his.com/", name = "getChineseMedicine")
    public JAXBElement<GetChineseMedicine> createGetChineseMedicine(GetChineseMedicine value) {
        return new JAXBElement<GetChineseMedicine>(_GetChineseMedicine_QNAME, GetChineseMedicine.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDoctorSourceInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.his.com/", name = "getDoctorSourceInfo")
    public JAXBElement<GetDoctorSourceInfo> createGetDoctorSourceInfo(GetDoctorSourceInfo value) {
        return new JAXBElement<GetDoctorSourceInfo>(_GetDoctorSourceInfo_QNAME, GetDoctorSourceInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SeekedDoctorResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.his.com/", name = "seekedDoctorResponse")
    public JAXBElement<SeekedDoctorResponse> createSeekedDoctorResponse(SeekedDoctorResponse value) {
        return new JAXBElement<SeekedDoctorResponse>(_SeekedDoctorResponse_QNAME, SeekedDoctorResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertPatientAssay }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.his.com/", name = "insertPatientAssay")
    public JAXBElement<InsertPatientAssay> createInsertPatientAssay(InsertPatientAssay value) {
        return new JAXBElement<InsertPatientAssay>(_InsertPatientAssay_QNAME, InsertPatientAssay.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDoctorVisitStatusResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.his.com/", name = "getDoctorVisitStatusResponse")
    public JAXBElement<GetDoctorVisitStatusResponse> createGetDoctorVisitStatusResponse(GetDoctorVisitStatusResponse value) {
        return new JAXBElement<GetDoctorVisitStatusResponse>(_GetDoctorVisitStatusResponse_QNAME, GetDoctorVisitStatusResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDoctorClinicInfoByMonthWithSize }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.his.com/", name = "getDoctorClinicInfoByMonthWithSize")
    public JAXBElement<GetDoctorClinicInfoByMonthWithSize> createGetDoctorClinicInfoByMonthWithSize(GetDoctorClinicInfoByMonthWithSize value) {
        return new JAXBElement<GetDoctorClinicInfoByMonthWithSize>(_GetDoctorClinicInfoByMonthWithSize_QNAME, GetDoctorClinicInfoByMonthWithSize.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateMedicalrecordResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.his.com/", name = "updateMedicalrecordResponse")
    public JAXBElement<UpdateMedicalrecordResponse> createUpdateMedicalrecordResponse(UpdateMedicalrecordResponse value) {
        return new JAXBElement<UpdateMedicalrecordResponse>(_UpdateMedicalrecordResponse_QNAME, UpdateMedicalrecordResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPatientRegisHistoryInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.his.com/", name = "getPatientRegisHistoryInfo")
    public JAXBElement<GetPatientRegisHistoryInfo> createGetPatientRegisHistoryInfo(GetPatientRegisHistoryInfo value) {
        return new JAXBElement<GetPatientRegisHistoryInfo>(_GetPatientRegisHistoryInfo_QNAME, GetPatientRegisHistoryInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EditPatientReportByDeptCode }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.his.com/", name = "editPatientReportByDeptCode")
    public JAXBElement<EditPatientReportByDeptCode> createEditPatientReportByDeptCode(EditPatientReportByDeptCode value) {
        return new JAXBElement<EditPatientReportByDeptCode>(_EditPatientReportByDeptCode_QNAME, EditPatientReportByDeptCode.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DoctorAndPatientLoginChange }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.his.com/", name = "doctorAndPatientLoginChange")
    public JAXBElement<DoctorAndPatientLoginChange> createDoctorAndPatientLoginChange(DoctorAndPatientLoginChange value) {
        return new JAXBElement<DoctorAndPatientLoginChange>(_DoctorAndPatientLoginChange_QNAME, DoctorAndPatientLoginChange.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAppointmentRegistInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.his.com/", name = "getAppointmentRegistInfo")
    public JAXBElement<GetAppointmentRegistInfo> createGetAppointmentRegistInfo(GetAppointmentRegistInfo value) {
        return new JAXBElement<GetAppointmentRegistInfo>(_GetAppointmentRegistInfo_QNAME, GetAppointmentRegistInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DoctorVisitStatusManagerResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.his.com/", name = "doctorVisitStatusManagerResponse")
    public JAXBElement<DoctorVisitStatusManagerResponse> createDoctorVisitStatusManagerResponse(DoctorVisitStatusManagerResponse value) {
        return new JAXBElement<DoctorVisitStatusManagerResponse>(_DoctorVisitStatusManagerResponse_QNAME, DoctorVisitStatusManagerResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindLeft }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.his.com/", name = "findLeft")
    public JAXBElement<FindLeft> createFindLeft(FindLeft value) {
        return new JAXBElement<FindLeft>(_FindLeft_QNAME, FindLeft.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DelAssayItemResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.his.com/", name = "delAssayItemResponse")
    public JAXBElement<DelAssayItemResponse> createDelAssayItemResponse(DelAssayItemResponse value) {
        return new JAXBElement<DelAssayItemResponse>(_DelAssayItemResponse_QNAME, DelAssayItemResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertPatientAssayResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.his.com/", name = "insertPatientAssayResponse")
    public JAXBElement<InsertPatientAssayResponse> createInsertPatientAssayResponse(InsertPatientAssayResponse value) {
        return new JAXBElement<InsertPatientAssayResponse>(_InsertPatientAssayResponse_QNAME, InsertPatientAssayResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAssayClass }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.his.com/", name = "getAssayClass")
    public JAXBElement<GetAssayClass> createGetAssayClass(GetAssayClass value) {
        return new JAXBElement<GetAssayClass>(_GetAssayClass_QNAME, GetAssayClass.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMedicalrecordAll }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.his.com/", name = "getMedicalrecordAll")
    public JAXBElement<GetMedicalrecordAll> createGetMedicalrecordAll(GetMedicalrecordAll value) {
        return new JAXBElement<GetMedicalrecordAll>(_GetMedicalrecordAll_QNAME, GetMedicalrecordAll.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetRegisterCanRefundPatients }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.his.com/", name = "getRegisterCanRefundPatients")
    public JAXBElement<GetRegisterCanRefundPatients> createGetRegisterCanRefundPatients(GetRegisterCanRefundPatients value) {
        return new JAXBElement<GetRegisterCanRefundPatients>(_GetRegisterCanRefundPatients_QNAME, GetRegisterCanRefundPatients.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetExamNoSeq }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.his.com/", name = "getExamNoSeq")
    public JAXBElement<GetExamNoSeq> createGetExamNoSeq(GetExamNoSeq value) {
        return new JAXBElement<GetExamNoSeq>(_GetExamNoSeq_QNAME, GetExamNoSeq.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBeforeOneDrugNoPayResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.his.com/", name = "getBeforeOneDrugNoPayResponse")
    public JAXBElement<GetBeforeOneDrugNoPayResponse> createGetBeforeOneDrugNoPayResponse(GetBeforeOneDrugNoPayResponse value) {
        return new JAXBElement<GetBeforeOneDrugNoPayResponse>(_GetBeforeOneDrugNoPayResponse_QNAME, GetBeforeOneDrugNoPayResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EditDoctorInfoByUserName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.his.com/", name = "editDoctorInfoByUserName")
    public JAXBElement<EditDoctorInfoByUserName> createEditDoctorInfoByUserName(EditDoctorInfoByUserName value) {
        return new JAXBElement<EditDoctorInfoByUserName>(_EditDoctorInfoByUserName_QNAME, EditDoctorInfoByUserName.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetValue }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.his.com/", name = "getValue")
    public JAXBElement<GetValue> createGetValue(GetValue value) {
        return new JAXBElement<GetValue>(_GetValue_QNAME, GetValue.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryDeptList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.his.com/", name = "queryDeptList")
    public JAXBElement<QueryDeptList> createQueryDeptList(QueryDeptList value) {
        return new JAXBElement<QueryDeptList>(_QueryDeptList_QNAME, QueryDeptList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryDoctorInfoList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.his.com/", name = "queryDoctorInfoList")
    public JAXBElement<QueryDoctorInfoList> createQueryDoctorInfoList(QueryDoctorInfoList value) {
        return new JAXBElement<QueryDoctorInfoList>(_QueryDoctorInfoList_QNAME, QueryDoctorInfoList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EditPatientReportByUserNameResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.his.com/", name = "editPatientReportByUserNameResponse")
    public JAXBElement<EditPatientReportByUserNameResponse> createEditPatientReportByUserNameResponse(EditPatientReportByUserNameResponse value) {
        return new JAXBElement<EditPatientReportByUserNameResponse>(_EditPatientReportByUserNameResponse_QNAME, EditPatientReportByUserNameResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EditAdminLevelByUserName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.his.com/", name = "editAdminLevelByUserName")
    public JAXBElement<EditAdminLevelByUserName> createEditAdminLevelByUserName(EditAdminLevelByUserName value) {
        return new JAXBElement<EditAdminLevelByUserName>(_EditAdminLevelByUserName_QNAME, EditAdminLevelByUserName.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCardCountResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.his.com/", name = "getCardCountResponse")
    public JAXBElement<GetCardCountResponse> createGetCardCountResponse(GetCardCountResponse value) {
        return new JAXBElement<GetCardCountResponse>(_GetCardCountResponse_QNAME, GetCardCountResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetOutpMrDiagDesc }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.his.com/", name = "getOutpMrDiagDesc")
    public JAXBElement<GetOutpMrDiagDesc> createGetOutpMrDiagDesc(GetOutpMrDiagDesc value) {
        return new JAXBElement<GetOutpMrDiagDesc>(_GetOutpMrDiagDesc_QNAME, GetOutpMrDiagDesc.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllClinicTotalByYearResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.his.com/", name = "getAllClinicTotalByYearResponse")
    public JAXBElement<GetAllClinicTotalByYearResponse> createGetAllClinicTotalByYearResponse(GetAllClinicTotalByYearResponse value) {
        return new JAXBElement<GetAllClinicTotalByYearResponse>(_GetAllClinicTotalByYearResponse_QNAME, GetAllClinicTotalByYearResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCheckClass }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.his.com/", name = "getCheckClass")
    public JAXBElement<GetCheckClass> createGetCheckClass(GetCheckClass value) {
        return new JAXBElement<GetCheckClass>(_GetCheckClass_QNAME, GetCheckClass.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAdminListByAdminLevel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.his.com/", name = "getAdminListByAdminLevel")
    public JAXBElement<GetAdminListByAdminLevel> createGetAdminListByAdminLevel(GetAdminListByAdminLevel value) {
        return new JAXBElement<GetAdminListByAdminLevel>(_GetAdminListByAdminLevel_QNAME, GetAdminListByAdminLevel.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DelAssayItem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.his.com/", name = "delAssayItem")
    public JAXBElement<DelAssayItem> createDelAssayItem(DelAssayItem value) {
        return new JAXBElement<DelAssayItem>(_DelAssayItem_QNAME, DelAssayItem.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetTreatChargeInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.his.com/", name = "getTreatChargeInfo")
    public JAXBElement<GetTreatChargeInfo> createGetTreatChargeInfo(GetTreatChargeInfo value) {
        return new JAXBElement<GetTreatChargeInfo>(_GetTreatChargeInfo_QNAME, GetTreatChargeInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDoctorClinicInfoByDayResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.his.com/", name = "getDoctorClinicInfoByDayResponse")
    public JAXBElement<GetDoctorClinicInfoByDayResponse> createGetDoctorClinicInfoByDayResponse(GetDoctorClinicInfoByDayResponse value) {
        return new JAXBElement<GetDoctorClinicInfoByDayResponse>(_GetDoctorClinicInfoByDayResponse_QNAME, GetDoctorClinicInfoByDayResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBeforeOneCheckNoPay }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.his.com/", name = "getBeforeOneCheckNoPay")
    public JAXBElement<GetBeforeOneCheckNoPay> createGetBeforeOneCheckNoPay(GetBeforeOneCheckNoPay value) {
        return new JAXBElement<GetBeforeOneCheckNoPay>(_GetBeforeOneCheckNoPay_QNAME, GetBeforeOneCheckNoPay.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllClinicInfoByDay }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.his.com/", name = "getAllClinicInfoByDay")
    public JAXBElement<GetAllClinicInfoByDay> createGetAllClinicInfoByDay(GetAllClinicInfoByDay value) {
        return new JAXBElement<GetAllClinicInfoByDay>(_GetAllClinicInfoByDay_QNAME, GetAllClinicInfoByDay.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetTestNoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.his.com/", name = "getTestNoResponse")
    public JAXBElement<GetTestNoResponse> createGetTestNoResponse(GetTestNoResponse value) {
        return new JAXBElement<GetTestNoResponse>(_GetTestNoResponse_QNAME, GetTestNoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllClinicInfoByMonth }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.his.com/", name = "getAllClinicInfoByMonth")
    public JAXBElement<GetAllClinicInfoByMonth> createGetAllClinicInfoByMonth(GetAllClinicInfoByMonth value) {
        return new JAXBElement<GetAllClinicInfoByMonth>(_GetAllClinicInfoByMonth_QNAME, GetAllClinicInfoByMonth.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMedicalrecordAllResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.his.com/", name = "getMedicalrecordAllResponse")
    public JAXBElement<GetMedicalrecordAllResponse> createGetMedicalrecordAllResponse(GetMedicalrecordAllResponse value) {
        return new JAXBElement<GetMedicalrecordAllResponse>(_GetMedicalrecordAllResponse_QNAME, GetMedicalrecordAllResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindfailureDoctorResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.his.com/", name = "findfailureDoctorResponse")
    public JAXBElement<FindfailureDoctorResponse> createFindfailureDoctorResponse(FindfailureDoctorResponse value) {
        return new JAXBElement<FindfailureDoctorResponse>(_FindfailureDoctorResponse_QNAME, FindfailureDoctorResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetWestern }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.his.com/", name = "getWestern")
    public JAXBElement<GetWestern> createGetWestern(GetWestern value) {
        return new JAXBElement<GetWestern>(_GetWestern_QNAME, GetWestern.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDrugResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.his.com/", name = "getDrugResponse")
    public JAXBElement<GetDrugResponse> createGetDrugResponse(GetDrugResponse value) {
        return new JAXBElement<GetDrugResponse>(_GetDrugResponse_QNAME, GetDrugResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDoctorClinicTotalByDayResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.his.com/", name = "getDoctorClinicTotalByDayResponse")
    public JAXBElement<GetDoctorClinicTotalByDayResponse> createGetDoctorClinicTotalByDayResponse(GetDoctorClinicTotalByDayResponse value) {
        return new JAXBElement<GetDoctorClinicTotalByDayResponse>(_GetDoctorClinicTotalByDayResponse_QNAME, GetDoctorClinicTotalByDayResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateMedicalrecord }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.his.com/", name = "updateMedicalrecord")
    public JAXBElement<UpdateMedicalrecord> createUpdateMedicalrecord(UpdateMedicalrecord value) {
        return new JAXBElement<UpdateMedicalrecord>(_UpdateMedicalrecord_QNAME, UpdateMedicalrecord.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDeptDictResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.his.com/", name = "getDeptDictResponse")
    public JAXBElement<GetDeptDictResponse> createGetDeptDictResponse(GetDeptDictResponse value) {
        return new JAXBElement<GetDeptDictResponse>(_GetDeptDictResponse_QNAME, GetDeptDictResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CacleRegsiter }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.his.com/", name = "cacleRegsiter")
    public JAXBElement<CacleRegsiter> createCacleRegsiter(CacleRegsiter value) {
        return new JAXBElement<CacleRegsiter>(_CacleRegsiter_QNAME, CacleRegsiter.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDoctorInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.his.com/", name = "getDoctorInfo")
    public JAXBElement<GetDoctorInfo> createGetDoctorInfo(GetDoctorInfo value) {
        return new JAXBElement<GetDoctorInfo>(_GetDoctorInfo_QNAME, GetDoctorInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetRegisterNumberAndLastTimeAndNumberResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.his.com/", name = "getRegisterNumberAndLastTimeAndNumberResponse")
    public JAXBElement<GetRegisterNumberAndLastTimeAndNumberResponse> createGetRegisterNumberAndLastTimeAndNumberResponse(GetRegisterNumberAndLastTimeAndNumberResponse value) {
        return new JAXBElement<GetRegisterNumberAndLastTimeAndNumberResponse>(_GetRegisterNumberAndLastTimeAndNumberResponse_QNAME, GetRegisterNumberAndLastTimeAndNumberResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSubclass }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.his.com/", name = "getSubclass")
    public JAXBElement<GetSubclass> createGetSubclass(GetSubclass value) {
        return new JAXBElement<GetSubclass>(_GetSubclass_QNAME, GetSubclass.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDeptClinicInfoByYearResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.his.com/", name = "getDeptClinicInfoByYearResponse")
    public JAXBElement<GetDeptClinicInfoByYearResponse> createGetDeptClinicInfoByYearResponse(GetDeptClinicInfoByYearResponse value) {
        return new JAXBElement<GetDeptClinicInfoByYearResponse>(_GetDeptClinicInfoByYearResponse_QNAME, GetDeptClinicInfoByYearResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FailureDoctor }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.his.com/", name = "failureDoctor")
    public JAXBElement<FailureDoctor> createFailureDoctor(FailureDoctor value) {
        return new JAXBElement<FailureDoctor>(_FailureDoctor_QNAME, FailureDoctor.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDeptClinicInfoByDay }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.his.com/", name = "getDeptClinicInfoByDay")
    public JAXBElement<GetDeptClinicInfoByDay> createGetDeptClinicInfoByDay(GetDeptClinicInfoByDay value) {
        return new JAXBElement<GetDeptClinicInfoByDay>(_GetDeptClinicInfoByDay_QNAME, GetDeptClinicInfoByDay.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryDeptContentByDeptCode }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.his.com/", name = "queryDeptContentByDeptCode")
    public JAXBElement<QueryDeptContentByDeptCode> createQueryDeptContentByDeptCode(QueryDeptContentByDeptCode value) {
        return new JAXBElement<QueryDeptContentByDeptCode>(_QueryDeptContentByDeptCode_QNAME, QueryDeptContentByDeptCode.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EditPatientReportByUserName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.his.com/", name = "editPatientReportByUserName")
    public JAXBElement<EditPatientReportByUserName> createEditPatientReportByUserName(EditPatientReportByUserName value) {
        return new JAXBElement<EditPatientReportByUserName>(_EditPatientReportByUserName_QNAME, EditPatientReportByUserName.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindfailureDoctor }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.his.com/", name = "findfailureDoctor")
    public JAXBElement<FindfailureDoctor> createFindfailureDoctor(FindfailureDoctor value) {
        return new JAXBElement<FindfailureDoctor>(_FindfailureDoctor_QNAME, FindfailureDoctor.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EditPatientReportAll }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.his.com/", name = "editPatientReportAll")
    public JAXBElement<EditPatientReportAll> createEditPatientReportAll(EditPatientReportAll value) {
        return new JAXBElement<EditPatientReportAll>(_EditPatientReportAll_QNAME, EditPatientReportAll.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDeptClinicTotalByDay }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.his.com/", name = "getDeptClinicTotalByDay")
    public JAXBElement<GetDeptClinicTotalByDay> createGetDeptClinicTotalByDay(GetDeptClinicTotalByDay value) {
        return new JAXBElement<GetDeptClinicTotalByDay>(_GetDeptClinicTotalByDay_QNAME, GetDeptClinicTotalByDay.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDoctorClinicTotalByMonth }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.his.com/", name = "getDoctorClinicTotalByMonth")
    public JAXBElement<GetDoctorClinicTotalByMonth> createGetDoctorClinicTotalByMonth(GetDoctorClinicTotalByMonth value) {
        return new JAXBElement<GetDoctorClinicTotalByMonth>(_GetDoctorClinicTotalByMonth_QNAME, GetDoctorClinicTotalByMonth.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DoctorAndPatientLoginChangeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.his.com/", name = "doctorAndPatientLoginChangeResponse")
    public JAXBElement<DoctorAndPatientLoginChangeResponse> createDoctorAndPatientLoginChangeResponse(DoctorAndPatientLoginChangeResponse value) {
        return new JAXBElement<DoctorAndPatientLoginChangeResponse>(_DoctorAndPatientLoginChangeResponse_QNAME, DoctorAndPatientLoginChangeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAdminLevel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.his.com/", name = "getAdminLevel")
    public JAXBElement<GetAdminLevel> createGetAdminLevel(GetAdminLevel value) {
        return new JAXBElement<GetAdminLevel>(_GetAdminLevel_QNAME, GetAdminLevel.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBeforeOneDrugNoPay }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.his.com/", name = "getBeforeOneDrugNoPay")
    public JAXBElement<GetBeforeOneDrugNoPay> createGetBeforeOneDrugNoPay(GetBeforeOneDrugNoPay value) {
        return new JAXBElement<GetBeforeOneDrugNoPay>(_GetBeforeOneDrugNoPay_QNAME, GetBeforeOneDrugNoPay.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllClinicInfoByDayResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.his.com/", name = "getAllClinicInfoByDayResponse")
    public JAXBElement<GetAllClinicInfoByDayResponse> createGetAllClinicInfoByDayResponse(GetAllClinicInfoByDayResponse value) {
        return new JAXBElement<GetAllClinicInfoByDayResponse>(_GetAllClinicInfoByDayResponse_QNAME, GetAllClinicInfoByDayResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryDeptInfoList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.his.com/", name = "queryDeptInfoList")
    public JAXBElement<QueryDeptInfoList> createQueryDeptInfoList(QueryDeptInfoList value) {
        return new JAXBElement<QueryDeptInfoList>(_QueryDeptInfoList_QNAME, QueryDeptInfoList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindRegisterOrders }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.his.com/", name = "findRegisterOrders")
    public JAXBElement<FindRegisterOrders> createFindRegisterOrders(FindRegisterOrders value) {
        return new JAXBElement<FindRegisterOrders>(_FindRegisterOrders_QNAME, FindRegisterOrders.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OpenPrescriptionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.his.com/", name = "openPrescriptionResponse")
    public JAXBElement<OpenPrescriptionResponse> createOpenPrescriptionResponse(OpenPrescriptionResponse value) {
        return new JAXBElement<OpenPrescriptionResponse>(_OpenPrescriptionResponse_QNAME, OpenPrescriptionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDeptDict }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.his.com/", name = "getDeptDict")
    public JAXBElement<GetDeptDict> createGetDeptDict(GetDeptDict value) {
        return new JAXBElement<GetDeptDict>(_GetDeptDict_QNAME, GetDeptDict.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegularRegisterRefund }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.his.com/", name = "regularRegisterRefund")
    public JAXBElement<RegularRegisterRefund> createRegularRegisterRefund(RegularRegisterRefund value) {
        return new JAXBElement<RegularRegisterRefund>(_RegularRegisterRefund_QNAME, RegularRegisterRefund.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDrug }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.his.com/", name = "getDrug")
    public JAXBElement<GetDrug> createGetDrug(GetDrug value) {
        return new JAXBElement<GetDrug>(_GetDrug_QNAME, GetDrug.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAssayResultTakeNotes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.his.com/", name = "getAssayResultTakeNotes")
    public JAXBElement<GetAssayResultTakeNotes> createGetAssayResultTakeNotes(GetAssayResultTakeNotes value) {
        return new JAXBElement<GetAssayResultTakeNotes>(_GetAssayResultTakeNotes_QNAME, GetAssayResultTakeNotes.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMedicalLastResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.his.com/", name = "getMedicalLastResponse")
    public JAXBElement<GetMedicalLastResponse> createGetMedicalLastResponse(GetMedicalLastResponse value) {
        return new JAXBElement<GetMedicalLastResponse>(_GetMedicalLastResponse_QNAME, GetMedicalLastResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDeptClinicInfoByDayResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.his.com/", name = "getDeptClinicInfoByDayResponse")
    public JAXBElement<GetDeptClinicInfoByDayResponse> createGetDeptClinicInfoByDayResponse(GetDeptClinicInfoByDayResponse value) {
        return new JAXBElement<GetDeptClinicInfoByDayResponse>(_GetDeptClinicInfoByDayResponse_QNAME, GetDeptClinicInfoByDayResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAdminList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.his.com/", name = "getAdminList")
    public JAXBElement<GetAdminList> createGetAdminList(GetAdminList value) {
        return new JAXBElement<GetAdminList>(_GetAdminList_QNAME, GetAdminList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddCardno }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.his.com/", name = "addCardno")
    public JAXBElement<AddCardno> createAddCardno(AddCardno value) {
        return new JAXBElement<AddCardno>(_AddCardno_QNAME, AddCardno.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDoctorClinicInfoByDay }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.his.com/", name = "getDoctorClinicInfoByDay")
    public JAXBElement<GetDoctorClinicInfoByDay> createGetDoctorClinicInfoByDay(GetDoctorClinicInfoByDay value) {
        return new JAXBElement<GetDoctorClinicInfoByDay>(_GetDoctorClinicInfoByDay_QNAME, GetDoctorClinicInfoByDay.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBeforeOneAssayNoPay }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.his.com/", name = "getBeforeOneAssayNoPay")
    public JAXBElement<GetBeforeOneAssayNoPay> createGetBeforeOneAssayNoPay(GetBeforeOneAssayNoPay value) {
        return new JAXBElement<GetBeforeOneAssayNoPay>(_GetBeforeOneAssayNoPay_QNAME, GetBeforeOneAssayNoPay.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDeptClinicTotalByYear }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.his.com/", name = "getDeptClinicTotalByYear")
    public JAXBElement<GetDeptClinicTotalByYear> createGetDeptClinicTotalByYear(GetDeptClinicTotalByYear value) {
        return new JAXBElement<GetDeptClinicTotalByYear>(_GetDeptClinicTotalByYear_QNAME, GetDeptClinicTotalByYear.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDrugUsage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.his.com/", name = "getDrugUsage")
    public JAXBElement<GetDrugUsage> createGetDrugUsage(GetDrugUsage value) {
        return new JAXBElement<GetDrugUsage>(_GetDrugUsage_QNAME, GetDrugUsage.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMedicalLast }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.his.com/", name = "getMedicalLast")
    public JAXBElement<GetMedicalLast> createGetMedicalLast(GetMedicalLast value) {
        return new JAXBElement<GetMedicalLast>(_GetMedicalLast_QNAME, GetMedicalLast.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAssayResultTakeNotesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.his.com/", name = "getAssayResultTakeNotesResponse")
    public JAXBElement<GetAssayResultTakeNotesResponse> createGetAssayResultTakeNotesResponse(GetAssayResultTakeNotesResponse value) {
        return new JAXBElement<GetAssayResultTakeNotesResponse>(_GetAssayResultTakeNotesResponse_QNAME, GetAssayResultTakeNotesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetEntrynameResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.his.com/", name = "getEntrynameResponse")
    public JAXBElement<GetEntrynameResponse> createGetEntrynameResponse(GetEntrynameResponse value) {
        return new JAXBElement<GetEntrynameResponse>(_GetEntrynameResponse_QNAME, GetEntrynameResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BeInHospital }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.his.com/", name = "beInHospital")
    public JAXBElement<BeInHospital> createBeInHospital(BeInHospital value) {
        return new JAXBElement<BeInHospital>(_BeInHospital_QNAME, BeInHospital.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DoctorVisitStatusManager }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.his.com/", name = "doctorVisitStatusManager")
    public JAXBElement<DoctorVisitStatusManager> createDoctorVisitStatusManager(DoctorVisitStatusManager value) {
        return new JAXBElement<DoctorVisitStatusManager>(_DoctorVisitStatusManager_QNAME, DoctorVisitStatusManager.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBeforeOneCheckNoPayResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.his.com/", name = "getBeforeOneCheckNoPayResponse")
    public JAXBElement<GetBeforeOneCheckNoPayResponse> createGetBeforeOneCheckNoPayResponse(GetBeforeOneCheckNoPayResponse value) {
        return new JAXBElement<GetBeforeOneCheckNoPayResponse>(_GetBeforeOneCheckNoPayResponse_QNAME, GetBeforeOneCheckNoPayResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAssayClassResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.his.com/", name = "getAssayClassResponse")
    public JAXBElement<GetAssayClassResponse> createGetAssayClassResponse(GetAssayClassResponse value) {
        return new JAXBElement<GetAssayClassResponse>(_GetAssayClassResponse_QNAME, GetAssayClassResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDeptClinicTotalByDayResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.his.com/", name = "getDeptClinicTotalByDayResponse")
    public JAXBElement<GetDeptClinicTotalByDayResponse> createGetDeptClinicTotalByDayResponse(GetDeptClinicTotalByDayResponse value) {
        return new JAXBElement<GetDeptClinicTotalByDayResponse>(_GetDeptClinicTotalByDayResponse_QNAME, GetDeptClinicTotalByDayResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDoctorClinicInfoByYear }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.his.com/", name = "getDoctorClinicInfoByYear")
    public JAXBElement<GetDoctorClinicInfoByYear> createGetDoctorClinicInfoByYear(GetDoctorClinicInfoByYear value) {
        return new JAXBElement<GetDoctorClinicInfoByYear>(_GetDoctorClinicInfoByYear_QNAME, GetDoctorClinicInfoByYear.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetTheSameDayMedicalrecordAll }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.his.com/", name = "getTheSameDayMedicalrecordAll")
    public JAXBElement<GetTheSameDayMedicalrecordAll> createGetTheSameDayMedicalrecordAll(GetTheSameDayMedicalrecordAll value) {
        return new JAXBElement<GetTheSameDayMedicalrecordAll>(_GetTheSameDayMedicalrecordAll_QNAME, GetTheSameDayMedicalrecordAll.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryDoctorInfoListResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.his.com/", name = "queryDoctorInfoListResponse")
    public JAXBElement<QueryDoctorInfoListResponse> createQueryDoctorInfoListResponse(QueryDoctorInfoListResponse value) {
        return new JAXBElement<QueryDoctorInfoListResponse>(_QueryDoctorInfoListResponse_QNAME, QueryDoctorInfoListResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAssayResultResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.his.com/", name = "getAssayResultResponse")
    public JAXBElement<GetAssayResultResponse> createGetAssayResultResponse(GetAssayResultResponse value) {
        return new JAXBElement<GetAssayResultResponse>(_GetAssayResultResponse_QNAME, GetAssayResultResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDoctorClinicTotalByYearResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.his.com/", name = "getDoctorClinicTotalByYearResponse")
    public JAXBElement<GetDoctorClinicTotalByYearResponse> createGetDoctorClinicTotalByYearResponse(GetDoctorClinicTotalByYearResponse value) {
        return new JAXBElement<GetDoctorClinicTotalByYearResponse>(_GetDoctorClinicTotalByYearResponse_QNAME, GetDoctorClinicTotalByYearResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDoctorInfoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.his.com/", name = "getDoctorInfoResponse")
    public JAXBElement<GetDoctorInfoResponse> createGetDoctorInfoResponse(GetDoctorInfoResponse value) {
        return new JAXBElement<GetDoctorInfoResponse>(_GetDoctorInfoResponse_QNAME, GetDoctorInfoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDeptClinicInfoByMonthWithSizeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.his.com/", name = "getDeptClinicInfoByMonthWithSizeResponse")
    public JAXBElement<GetDeptClinicInfoByMonthWithSizeResponse> createGetDeptClinicInfoByMonthWithSizeResponse(GetDeptClinicInfoByMonthWithSizeResponse value) {
        return new JAXBElement<GetDeptClinicInfoByMonthWithSizeResponse>(_GetDeptClinicInfoByMonthWithSizeResponse_QNAME, GetDeptClinicInfoByMonthWithSizeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSubclassResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.his.com/", name = "getSubclassResponse")
    public JAXBElement<GetSubclassResponse> createGetSubclassResponse(GetSubclassResponse value) {
        return new JAXBElement<GetSubclassResponse>(_GetSubclassResponse_QNAME, GetSubclassResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCheckResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.his.com/", name = "getCheckResult")
    public JAXBElement<GetCheckResult> createGetCheckResult(GetCheckResult value) {
        return new JAXBElement<GetCheckResult>(_GetCheckResult_QNAME, GetCheckResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCardnoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.his.com/", name = "getCardnoResponse")
    public JAXBElement<GetCardnoResponse> createGetCardnoResponse(GetCardnoResponse value) {
        return new JAXBElement<GetCardnoResponse>(_GetCardnoResponse_QNAME, GetCardnoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllClinicInfoByMonthWithSize }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.his.com/", name = "getAllClinicInfoByMonthWithSize")
    public JAXBElement<GetAllClinicInfoByMonthWithSize> createGetAllClinicInfoByMonthWithSize(GetAllClinicInfoByMonthWithSize value) {
        return new JAXBElement<GetAllClinicInfoByMonthWithSize>(_GetAllClinicInfoByMonthWithSize_QNAME, GetAllClinicInfoByMonthWithSize.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAppointmentRegistInfoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.his.com/", name = "getAppointmentRegistInfoResponse")
    public JAXBElement<GetAppointmentRegistInfoResponse> createGetAppointmentRegistInfoResponse(GetAppointmentRegistInfoResponse value) {
        return new JAXBElement<GetAppointmentRegistInfoResponse>(_GetAppointmentRegistInfoResponse_QNAME, GetAppointmentRegistInfoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertMedicalrecord }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.his.com/", name = "insertMedicalrecord")
    public JAXBElement<InsertMedicalrecord> createInsertMedicalrecord(InsertMedicalrecord value) {
        return new JAXBElement<InsertMedicalrecord>(_InsertMedicalrecord_QNAME, InsertMedicalrecord.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindRegisterOrdersResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.his.com/", name = "findRegisterOrdersResponse")
    public JAXBElement<FindRegisterOrdersResponse> createFindRegisterOrdersResponse(FindRegisterOrdersResponse value) {
        return new JAXBElement<FindRegisterOrdersResponse>(_FindRegisterOrdersResponse_QNAME, FindRegisterOrdersResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDeptNameResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.his.com/", name = "getDeptNameResponse")
    public JAXBElement<GetDeptNameResponse> createGetDeptNameResponse(GetDeptNameResponse value) {
        return new JAXBElement<GetDeptNameResponse>(_GetDeptNameResponse_QNAME, GetDeptNameResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateDoctorVisitStatusResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.his.com/", name = "updateDoctorVisitStatusResponse")
    public JAXBElement<UpdateDoctorVisitStatusResponse> createUpdateDoctorVisitStatusResponse(UpdateDoctorVisitStatusResponse value) {
        return new JAXBElement<UpdateDoctorVisitStatusResponse>(_UpdateDoctorVisitStatusResponse_QNAME, UpdateDoctorVisitStatusResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllClinicInfoByYearResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.his.com/", name = "getAllClinicInfoByYearResponse")
    public JAXBElement<GetAllClinicInfoByYearResponse> createGetAllClinicInfoByYearResponse(GetAllClinicInfoByYearResponse value) {
        return new JAXBElement<GetAllClinicInfoByYearResponse>(_GetAllClinicInfoByYearResponse_QNAME, GetAllClinicInfoByYearResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateDoctorInfoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.his.com/", name = "updateDoctorInfoResponse")
    public JAXBElement<UpdateDoctorInfoResponse> createUpdateDoctorInfoResponse(UpdateDoctorInfoResponse value) {
        return new JAXBElement<UpdateDoctorInfoResponse>(_UpdateDoctorInfoResponse_QNAME, UpdateDoctorInfoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegisterRefundWxResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.his.com/", name = "registerRefundWxResponse")
    public JAXBElement<RegisterRefundWxResponse> createRegisterRefundWxResponse(RegisterRefundWxResponse value) {
        return new JAXBElement<RegisterRefundWxResponse>(_RegisterRefundWxResponse_QNAME, RegisterRefundWxResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetTheSameDayMedicalrecordAllResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.his.com/", name = "getTheSameDayMedicalrecordAllResponse")
    public JAXBElement<GetTheSameDayMedicalrecordAllResponse> createGetTheSameDayMedicalrecordAllResponse(GetTheSameDayMedicalrecordAllResponse value) {
        return new JAXBElement<GetTheSameDayMedicalrecordAllResponse>(_GetTheSameDayMedicalrecordAllResponse_QNAME, GetTheSameDayMedicalrecordAllResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetOutpMrDiagDescResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.his.com/", name = "getOutpMrDiagDescResponse")
    public JAXBElement<GetOutpMrDiagDescResponse> createGetOutpMrDiagDescResponse(GetOutpMrDiagDescResponse value) {
        return new JAXBElement<GetOutpMrDiagDescResponse>(_GetOutpMrDiagDescResponse_QNAME, GetOutpMrDiagDescResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDoctorClinicInfoByYearResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.his.com/", name = "getDoctorClinicInfoByYearResponse")
    public JAXBElement<GetDoctorClinicInfoByYearResponse> createGetDoctorClinicInfoByYearResponse(GetDoctorClinicInfoByYearResponse value) {
        return new JAXBElement<GetDoctorClinicInfoByYearResponse>(_GetDoctorClinicInfoByYearResponse_QNAME, GetDoctorClinicInfoByYearResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryDeptContentByDeptCodeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.his.com/", name = "queryDeptContentByDeptCodeResponse")
    public JAXBElement<QueryDeptContentByDeptCodeResponse> createQueryDeptContentByDeptCodeResponse(QueryDeptContentByDeptCodeResponse value) {
        return new JAXBElement<QueryDeptContentByDeptCodeResponse>(_QueryDeptContentByDeptCodeResponse_QNAME, QueryDeptContentByDeptCodeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBeforeOneAssayNoPayResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.his.com/", name = "getBeforeOneAssayNoPayResponse")
    public JAXBElement<GetBeforeOneAssayNoPayResponse> createGetBeforeOneAssayNoPayResponse(GetBeforeOneAssayNoPayResponse value) {
        return new JAXBElement<GetBeforeOneAssayNoPayResponse>(_GetBeforeOneAssayNoPayResponse_QNAME, GetBeforeOneAssayNoPayResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetRecipeListResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.his.com/", name = "getRecipeListResponse")
    public JAXBElement<GetRecipeListResponse> createGetRecipeListResponse(GetRecipeListResponse value) {
        return new JAXBElement<GetRecipeListResponse>(_GetRecipeListResponse_QNAME, GetRecipeListResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryDoctorInfoByCardNo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.his.com/", name = "queryDoctorInfoByCardNo")
    public JAXBElement<QueryDoctorInfoByCardNo> createQueryDoctorInfoByCardNo(QueryDoctorInfoByCardNo value) {
        return new JAXBElement<QueryDoctorInfoByCardNo>(_QueryDoctorInfoByCardNo_QNAME, QueryDoctorInfoByCardNo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddCardnoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.his.com/", name = "addCardnoResponse")
    public JAXBElement<AddCardnoResponse> createAddCardnoResponse(AddCardnoResponse value) {
        return new JAXBElement<AddCardnoResponse>(_AddCardnoResponse_QNAME, AddCardnoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDoctorClinicTotalByYear }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.his.com/", name = "getDoctorClinicTotalByYear")
    public JAXBElement<GetDoctorClinicTotalByYear> createGetDoctorClinicTotalByYear(GetDoctorClinicTotalByYear value) {
        return new JAXBElement<GetDoctorClinicTotalByYear>(_GetDoctorClinicTotalByYear_QNAME, GetDoctorClinicTotalByYear.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllClinicTotalByDayResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.his.com/", name = "getAllClinicTotalByDayResponse")
    public JAXBElement<GetAllClinicTotalByDayResponse> createGetAllClinicTotalByDayResponse(GetAllClinicTotalByDayResponse value) {
        return new JAXBElement<GetAllClinicTotalByDayResponse>(_GetAllClinicTotalByDayResponse_QNAME, GetAllClinicTotalByDayResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDeptClinicInfoByMonth }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.his.com/", name = "getDeptClinicInfoByMonth")
    public JAXBElement<GetDeptClinicInfoByMonth> createGetDeptClinicInfoByMonth(GetDeptClinicInfoByMonth value) {
        return new JAXBElement<GetDeptClinicInfoByMonth>(_GetDeptClinicInfoByMonth_QNAME, GetDeptClinicInfoByMonth.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OpenPrescription }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.his.com/", name = "openPrescription")
    public JAXBElement<OpenPrescription> createOpenPrescription(OpenPrescription value) {
        return new JAXBElement<OpenPrescription>(_OpenPrescription_QNAME, OpenPrescription.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPatientRegisHistoryInfoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.his.com/", name = "getPatientRegisHistoryInfoResponse")
    public JAXBElement<GetPatientRegisHistoryInfoResponse> createGetPatientRegisHistoryInfoResponse(GetPatientRegisHistoryInfoResponse value) {
        return new JAXBElement<GetPatientRegisHistoryInfoResponse>(_GetPatientRegisHistoryInfoResponse_QNAME, GetPatientRegisHistoryInfoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDeptClinicInfoByMonthResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.his.com/", name = "getDeptClinicInfoByMonthResponse")
    public JAXBElement<GetDeptClinicInfoByMonthResponse> createGetDeptClinicInfoByMonthResponse(GetDeptClinicInfoByMonthResponse value) {
        return new JAXBElement<GetDeptClinicInfoByMonthResponse>(_GetDeptClinicInfoByMonthResponse_QNAME, GetDeptClinicInfoByMonthResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDoctorClinicInfoByMonthWithSizeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.his.com/", name = "getDoctorClinicInfoByMonthWithSizeResponse")
    public JAXBElement<GetDoctorClinicInfoByMonthWithSizeResponse> createGetDoctorClinicInfoByMonthWithSizeResponse(GetDoctorClinicInfoByMonthWithSizeResponse value) {
        return new JAXBElement<GetDoctorClinicInfoByMonthWithSizeResponse>(_GetDoctorClinicInfoByMonthWithSizeResponse_QNAME, GetDoctorClinicInfoByMonthWithSizeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDeptClinicTotalByMonthResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.his.com/", name = "getDeptClinicTotalByMonthResponse")
    public JAXBElement<GetDeptClinicTotalByMonthResponse> createGetDeptClinicTotalByMonthResponse(GetDeptClinicTotalByMonthResponse value) {
        return new JAXBElement<GetDeptClinicTotalByMonthResponse>(_GetDeptClinicTotalByMonthResponse_QNAME, GetDeptClinicTotalByMonthResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAssayResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.his.com/", name = "getAssayResult")
    public JAXBElement<GetAssayResult> createGetAssayResult(GetAssayResult value) {
        return new JAXBElement<GetAssayResult>(_GetAssayResult_QNAME, GetAssayResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPatientReportByDeptCode }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.his.com/", name = "getPatientReportByDeptCode")
    public JAXBElement<GetPatientReportByDeptCode> createGetPatientReportByDeptCode(GetPatientReportByDeptCode value) {
        return new JAXBElement<GetPatientReportByDeptCode>(_GetPatientReportByDeptCode_QNAME, GetPatientReportByDeptCode.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetOutpOrder }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.his.com/", name = "getOutpOrder")
    public JAXBElement<GetOutpOrder> createGetOutpOrder(GetOutpOrder value) {
        return new JAXBElement<GetOutpOrder>(_GetOutpOrder_QNAME, GetOutpOrder.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetOutpOrderResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.his.com/", name = "getOutpOrderResponse")
    public JAXBElement<GetOutpOrderResponse> createGetOutpOrderResponse(GetOutpOrderResponse value) {
        return new JAXBElement<GetOutpOrderResponse>(_GetOutpOrderResponse_QNAME, GetOutpOrderResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDeptClinicInfoByMonthWithSize }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.his.com/", name = "getDeptClinicInfoByMonthWithSize")
    public JAXBElement<GetDeptClinicInfoByMonthWithSize> createGetDeptClinicInfoByMonthWithSize(GetDeptClinicInfoByMonthWithSize value) {
        return new JAXBElement<GetDeptClinicInfoByMonthWithSize>(_GetDeptClinicInfoByMonthWithSize_QNAME, GetDeptClinicInfoByMonthWithSize.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EditPatientReportByDeptCodeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.his.com/", name = "editPatientReportByDeptCodeResponse")
    public JAXBElement<EditPatientReportByDeptCodeResponse> createEditPatientReportByDeptCodeResponse(EditPatientReportByDeptCodeResponse value) {
        return new JAXBElement<EditPatientReportByDeptCodeResponse>(_EditPatientReportByDeptCodeResponse_QNAME, EditPatientReportByDeptCodeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAdminListByAdminLevelResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.his.com/", name = "getAdminListByAdminLevelResponse")
    public JAXBElement<GetAdminListByAdminLevelResponse> createGetAdminListByAdminLevelResponse(GetAdminListByAdminLevelResponse value) {
        return new JAXBElement<GetAdminListByAdminLevelResponse>(_GetAdminListByAdminLevelResponse_QNAME, GetAdminListByAdminLevelResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDeptNameByDeptcode }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.his.com/", name = "getDeptNameByDeptcode")
    public JAXBElement<GetDeptNameByDeptcode> createGetDeptNameByDeptcode(GetDeptNameByDeptcode value) {
        return new JAXBElement<GetDeptNameByDeptcode>(_GetDeptNameByDeptcode_QNAME, GetDeptNameByDeptcode.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetVisitNoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.his.com/", name = "getVisitNoResponse")
    public JAXBElement<GetVisitNoResponse> createGetVisitNoResponse(GetVisitNoResponse value) {
        return new JAXBElement<GetVisitNoResponse>(_GetVisitNoResponse_QNAME, GetVisitNoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAdminLevelResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.his.com/", name = "getAdminLevelResponse")
    public JAXBElement<GetAdminLevelResponse> createGetAdminLevelResponse(GetAdminLevelResponse value) {
        return new JAXBElement<GetAdminLevelResponse>(_GetAdminLevelResponse_QNAME, GetAdminLevelResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegularRegisterRefundResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.his.com/", name = "regularRegisterRefundResponse")
    public JAXBElement<RegularRegisterRefundResponse> createRegularRegisterRefundResponse(RegularRegisterRefundResponse value) {
        return new JAXBElement<RegularRegisterRefundResponse>(_RegularRegisterRefundResponse_QNAME, RegularRegisterRefundResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DelPrescribing }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.his.com/", name = "delPrescribing")
    public JAXBElement<DelPrescribing> createDelPrescribing(DelPrescribing value) {
        return new JAXBElement<DelPrescribing>(_DelPrescribing_QNAME, DelPrescribing.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertMedicalrecordResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.his.com/", name = "insertMedicalrecordResponse")
    public JAXBElement<InsertMedicalrecordResponse> createInsertMedicalrecordResponse(InsertMedicalrecordResponse value) {
        return new JAXBElement<InsertMedicalrecordResponse>(_InsertMedicalrecordResponse_QNAME, InsertMedicalrecordResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDrugDosageResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.his.com/", name = "getDrugDosageResponse")
    public JAXBElement<GetDrugDosageResponse> createGetDrugDosageResponse(GetDrugDosageResponse value) {
        return new JAXBElement<GetDrugDosageResponse>(_GetDrugDosageResponse_QNAME, GetDrugDosageResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetItemsSum }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.his.com/", name = "getItemsSum")
    public JAXBElement<GetItemsSum> createGetItemsSum(GetItemsSum value) {
        return new JAXBElement<GetItemsSum>(_GetItemsSum_QNAME, GetItemsSum.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegisterResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.his.com/", name = "registerResponse")
    public JAXBElement<RegisterResponse> createRegisterResponse(RegisterResponse value) {
        return new JAXBElement<RegisterResponse>(_RegisterResponse_QNAME, RegisterResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllClinicInfoByYear }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.his.com/", name = "getAllClinicInfoByYear")
    public JAXBElement<GetAllClinicInfoByYear> createGetAllClinicInfoByYear(GetAllClinicInfoByYear value) {
        return new JAXBElement<GetAllClinicInfoByYear>(_GetAllClinicInfoByYear_QNAME, GetAllClinicInfoByYear.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateDoctorVisitStatus }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.his.com/", name = "updateDoctorVisitStatus")
    public JAXBElement<UpdateDoctorVisitStatus> createUpdateDoctorVisitStatus(UpdateDoctorVisitStatus value) {
        return new JAXBElement<UpdateDoctorVisitStatus>(_UpdateDoctorVisitStatus_QNAME, UpdateDoctorVisitStatus.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryDeptInfoListResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.his.com/", name = "queryDeptInfoListResponse")
    public JAXBElement<QueryDeptInfoListResponse> createQueryDeptInfoListResponse(QueryDeptInfoListResponse value) {
        return new JAXBElement<QueryDeptInfoListResponse>(_QueryDeptInfoListResponse_QNAME, QueryDeptInfoListResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindDoctorResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.his.com/", name = "findDoctorResponse")
    public JAXBElement<FindDoctorResponse> createFindDoctorResponse(FindDoctorResponse value) {
        return new JAXBElement<FindDoctorResponse>(_FindDoctorResponse_QNAME, FindDoctorResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetRegisterCanRefundPatientsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.his.com/", name = "getRegisterCanRefundPatientsResponse")
    public JAXBElement<GetRegisterCanRefundPatientsResponse> createGetRegisterCanRefundPatientsResponse(GetRegisterCanRefundPatientsResponse value) {
        return new JAXBElement<GetRegisterCanRefundPatientsResponse>(_GetRegisterCanRefundPatientsResponse_QNAME, GetRegisterCanRefundPatientsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetRegisterNumberAndLastTimeAndNumber }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.his.com/", name = "getRegisterNumberAndLastTimeAndNumber")
    public JAXBElement<GetRegisterNumberAndLastTimeAndNumber> createGetRegisterNumberAndLastTimeAndNumber(GetRegisterNumberAndLastTimeAndNumber value) {
        return new JAXBElement<GetRegisterNumberAndLastTimeAndNumber>(_GetRegisterNumberAndLastTimeAndNumber_QNAME, GetRegisterNumberAndLastTimeAndNumber.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EditAdminLevelByUserNameResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.his.com/", name = "editAdminLevelByUserNameResponse")
    public JAXBElement<EditAdminLevelByUserNameResponse> createEditAdminLevelByUserNameResponse(EditAdminLevelByUserNameResponse value) {
        return new JAXBElement<EditAdminLevelByUserNameResponse>(_EditAdminLevelByUserNameResponse_QNAME, EditAdminLevelByUserNameResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDoctorClinicTotalByDay }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.his.com/", name = "getDoctorClinicTotalByDay")
    public JAXBElement<GetDoctorClinicTotalByDay> createGetDoctorClinicTotalByDay(GetDoctorClinicTotalByDay value) {
        return new JAXBElement<GetDoctorClinicTotalByDay>(_GetDoctorClinicTotalByDay_QNAME, GetDoctorClinicTotalByDay.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDrugUsageResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.his.com/", name = "getDrugUsageResponse")
    public JAXBElement<GetDrugUsageResponse> createGetDrugUsageResponse(GetDrugUsageResponse value) {
        return new JAXBElement<GetDrugUsageResponse>(_GetDrugUsageResponse_QNAME, GetDrugUsageResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetExamNoSeqResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.his.com/", name = "getExamNoSeqResponse")
    public JAXBElement<GetExamNoSeqResponse> createGetExamNoSeqResponse(GetExamNoSeqResponse value) {
        return new JAXBElement<GetExamNoSeqResponse>(_GetExamNoSeqResponse_QNAME, GetExamNoSeqResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetVisitNo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.his.com/", name = "getVisitNo")
    public JAXBElement<GetVisitNo> createGetVisitNo(GetVisitNo value) {
        return new JAXBElement<GetVisitNo>(_GetVisitNo_QNAME, GetVisitNo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EditDoctorInfoByUserNameResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.his.com/", name = "editDoctorInfoByUserNameResponse")
    public JAXBElement<EditDoctorInfoByUserNameResponse> createEditDoctorInfoByUserNameResponse(EditDoctorInfoByUserNameResponse value) {
        return new JAXBElement<EditDoctorInfoByUserNameResponse>(_EditDoctorInfoByUserNameResponse_QNAME, EditDoctorInfoByUserNameResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDeptName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.his.com/", name = "getDeptName")
    public JAXBElement<GetDeptName> createGetDeptName(GetDeptName value) {
        return new JAXBElement<GetDeptName>(_GetDeptName_QNAME, GetDeptName.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetValueResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.his.com/", name = "getValueResponse")
    public JAXBElement<GetValueResponse> createGetValueResponse(GetValueResponse value) {
        return new JAXBElement<GetValueResponse>(_GetValueResponse_QNAME, GetValueResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SeekedDoctor }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.his.com/", name = "seekedDoctor")
    public JAXBElement<SeekedDoctor> createSeekedDoctor(SeekedDoctor value) {
        return new JAXBElement<SeekedDoctor>(_SeekedDoctor_QNAME, SeekedDoctor.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetEntryname }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.his.com/", name = "getEntryname")
    public JAXBElement<GetEntryname> createGetEntryname(GetEntryname value) {
        return new JAXBElement<GetEntryname>(_GetEntryname_QNAME, GetEntryname.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetClinicNoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.his.com/", name = "getClinicNoResponse")
    public JAXBElement<GetClinicNoResponse> createGetClinicNoResponse(GetClinicNoResponse value) {
        return new JAXBElement<GetClinicNoResponse>(_GetClinicNoResponse_QNAME, GetClinicNoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllClinicTotalByMonthResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.his.com/", name = "getAllClinicTotalByMonthResponse")
    public JAXBElement<GetAllClinicTotalByMonthResponse> createGetAllClinicTotalByMonthResponse(GetAllClinicTotalByMonthResponse value) {
        return new JAXBElement<GetAllClinicTotalByMonthResponse>(_GetAllClinicTotalByMonthResponse_QNAME, GetAllClinicTotalByMonthResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CacleRegsiterResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.his.com/", name = "cacleRegsiterResponse")
    public JAXBElement<CacleRegsiterResponse> createCacleRegsiterResponse(CacleRegsiterResponse value) {
        return new JAXBElement<CacleRegsiterResponse>(_CacleRegsiterResponse_QNAME, CacleRegsiterResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindLeftResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.his.com/", name = "findLeftResponse")
    public JAXBElement<FindLeftResponse> createFindLeftResponse(FindLeftResponse value) {
        return new JAXBElement<FindLeftResponse>(_FindLeftResponse_QNAME, FindLeftResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DelCheckItem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.his.com/", name = "delCheckItem")
    public JAXBElement<DelCheckItem> createDelCheckItem(DelCheckItem value) {
        return new JAXBElement<DelCheckItem>(_DelCheckItem_QNAME, DelCheckItem.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EditPatientReportAllResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.his.com/", name = "editPatientReportAllResponse")
    public JAXBElement<EditPatientReportAllResponse> createEditPatientReportAllResponse(EditPatientReportAllResponse value) {
        return new JAXBElement<EditPatientReportAllResponse>(_EditPatientReportAllResponse_QNAME, EditPatientReportAllResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCheckClassResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.his.com/", name = "getCheckClassResponse")
    public JAXBElement<GetCheckClassResponse> createGetCheckClassResponse(GetCheckClassResponse value) {
        return new JAXBElement<GetCheckClassResponse>(_GetCheckClassResponse_QNAME, GetCheckClassResponse.class, null, value);
    }

}
